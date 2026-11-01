package l;

/* JADX INFO: renamed from: l.᩵ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C52M */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC19624 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f62987;

    public RunnableC19624(C0572 c0572, String str) {
        super(c0572);
        this.f62987 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM38120 = AbstractRunnableC16096.m38120(this.f62987);
        boolean zEquals = strM38120.equals("I");
        C0572 c0572 = this.f52046;
        if (zEquals || strM38120.equals("L 8")) {
            c0572.m2713(true);
            str = "200 Binary type set\r\n";
        } else if (strM38120.equals("A") || strM38120.equals("A N")) {
            c0572.m2713(false);
            str = "200 ASCII type set\r\n";
        } else {
            str = "503 Malformed TYPE command\r\n";
        }
        c0572.m2708(str);
    }
}
