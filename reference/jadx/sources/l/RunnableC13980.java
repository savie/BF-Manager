package l;

/* JADX INFO: renamed from: l.ܰᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57T */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC13980 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f45972;

    public RunnableC13980(C0572 c0572, String str) {
        super(c0572);
        this.f45972 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM38120 = AbstractRunnableC16096.m38120(this.f45972);
        C0572 c0572 = this.f52046;
        String strM2696 = c0572.m2696();
        if (strM2696 == null) {
            c0572.m2708("503 Must send USER first\r\n");
            return;
        }
        if (strM2696.equals("anonymous") && C21034.m47433()) {
            c0572.m2708("230 Guest login ok, read only access.\r\n");
            return;
        }
        if (C21034.m47434(strM2696, strM38120)) {
            c0572.m2708("230 Access granted\r\n");
            c0572.m2702(true);
        } else {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
            c0572.m2708("530 Login incorrect.\r\n");
            c0572.m2702(false);
        }
    }
}
