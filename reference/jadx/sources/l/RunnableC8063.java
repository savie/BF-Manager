package l;

/* JADX INFO: renamed from: l.۟ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: NANA */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC8063 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f26689;

    public RunnableC8063(C5563 c5563, String str) {
        super(c5563);
        this.f26689 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5563 c5563 = this.f49894;
        try {
            long j = Long.parseLong(AbstractRunnableC15257.m36601(this.f26689));
            if (j < 0) {
                c5563.m16486("550 Restart position must be non-negative\r\n");
                return;
            }
            if (c5563.m16491()) {
                c5563.f19317 = j;
                c5563.f19314 = -1L;
                c5563.m16486("350 Restart position accepted (" + j + ")\r\n");
                return;
            }
            c5563.m16486("550 Restart position not accepted in ASCII mode\r\n");
        } catch (NumberFormatException unused) {
            c5563.m16486("550 No valid restart position\r\n");
        }
    }
}
