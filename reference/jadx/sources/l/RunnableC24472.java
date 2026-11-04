package l;

/* JADX INFO: renamed from: l.᩺ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57T */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC24472 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f79420;

    public RunnableC24472(C5563 c5563, String str) {
        super(c5563);
        this.f79420 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM36601 = AbstractRunnableC15257.m36601(this.f79420);
        C5563 c5563 = this.f49894;
        String strM16475 = c5563.m16475();
        if (strM16475 == null) {
            c5563.m16486("503 Must send USER first\r\n");
            return;
        }
        if (strM16475.equals("anonymous") && C19733.m45434()) {
            c5563.m16486("230 Guest login ok, read only access.\r\n");
            return;
        }
        if (C19733.m45435(strM16475, strM36601)) {
            c5563.m16486("230 Access granted\r\n");
            c5563.m16481(true);
        } else {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
            c5563.m16486("530 Login incorrect.\r\n");
            c5563.m16481(false);
        }
    }
}
