package l;

/* JADX INFO: renamed from: l.ۜᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W62A */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC6923 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f23292;

    public RunnableC6923(C0572 c0572, String str) {
        super(c0572);
        this.f23292 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM38120 = AbstractRunnableC16096.m38120(this.f23292);
        int length = strM38120.length();
        C0572 c0572 = this.f52046;
        if (length < 1) {
            str = "550 Invalid argument\r\n";
        } else {
            AbstractC20745 abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, strM38120);
            if (m38128(abstractC20745M38126)) {
                str = "550 Invalid name or chroot violation\r\n";
            } else if (!abstractC20745M38126.mo33974()) {
                str = "550 Can't RMD a non-directory\r\n";
            } else if (AbstractRunnableC16096.m38127(abstractC20745M38126, c0572.m2694())) {
                str = "550 Won't RMD the root directory\r\n";
            } else {
                str = !abstractC20745M38126.mo24647() ? "550 Deletion error, possibly incomplete\r\n" : null;
            }
        }
        if (str != null) {
            c0572.m2708(str);
        } else {
            c0572.m2708("250 Removed directory\r\n");
        }
    }
}
