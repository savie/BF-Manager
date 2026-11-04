package l;

/* JADX INFO: renamed from: l.ۙۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C52M */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC4817 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f16856;

    public RunnableC4817(C5563 c5563, String str) {
        super(c5563);
        this.f16856 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM36601 = AbstractRunnableC15257.m36601(this.f16856);
        boolean zEquals = strM36601.equals("I");
        C5563 c5563 = this.f49894;
        if (zEquals || strM36601.equals("L 8")) {
            c5563.m16497(true);
            str = "200 Binary type set\r\n";
        } else if (strM36601.equals("A") || strM36601.equals("A N")) {
            c5563.m16497(false);
            str = "200 ASCII type set\r\n";
        } else {
            str = "503 Malformed TYPE command\r\n";
        }
        c5563.m16486(str);
    }
}
