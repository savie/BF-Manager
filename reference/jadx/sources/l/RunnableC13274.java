package l;

/* JADX INFO: renamed from: l.۬ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: NANA */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC13274 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f44084;

    public RunnableC13274(C0572 c0572, String str) {
        super(c0572);
        this.f44084 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0572 c0572 = this.f52046;
        try {
            long j = Long.parseLong(AbstractRunnableC16096.m38120(this.f44084));
            if (j < 0) {
                c0572.m2708("550 Restart position must be non-negative\r\n");
                return;
            }
            if (c0572.m2714()) {
                c0572.f2371 = j;
                c0572.f2372 = -1L;
                c0572.m2708("350 Restart position accepted (" + j + ")\r\n");
                return;
            }
            c0572.m2708("550 Restart position not accepted in ASCII mode\r\n");
        } catch (NumberFormatException unused) {
            c0572.m2708("550 No valid restart position\r\n");
        }
    }
}
