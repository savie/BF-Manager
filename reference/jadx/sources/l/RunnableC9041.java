package l;

/* JADX INFO: renamed from: l.ۡᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4YV */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC9041 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f30852;

    public RunnableC9041(C0572 c0572, String str) {
        super(c0572);
        this.f30852 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM38120 = AbstractRunnableC16096.m38120(this.f30852);
        C0572 c0572 = this.f52046;
        c0572.m2708("331 Send password\r\n");
        c0572.m2711(strM38120);
    }
}
