package l;

/* JADX INFO: renamed from: l.ܶᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q64Y */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC15391 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f50094;

    public RunnableC15391(C0572 c0572, String str) {
        super(c0572);
        this.f50094 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM38120 = AbstractRunnableC16096.m38120(this.f50094);
        C0572 c0572 = this.f52046;
        AbstractC20745 abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, strM38120);
        if (m38128(abstractC20745M38126)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else {
            AbstractC20745 abstractC20745M2718 = c0572.m2718();
            if (abstractC20745M2718 == null) {
                str = "550 Rename error, maybe RNFR not sent\r\n";
            } else {
                str = !abstractC20745M2718.mo24646(abstractC20745M38126) ? "550 Error during rename operation\r\n" : null;
            }
        }
        if (str != null) {
            c0572.m2708(str);
        } else {
            c0572.m2708("250 rename successful\r\n");
        }
        c0572.m2701((AbstractC20745) null);
    }
}
