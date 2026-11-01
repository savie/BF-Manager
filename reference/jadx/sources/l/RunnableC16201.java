package l;

/* JADX INFO: renamed from: l.ܺ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5N1 */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC16201 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f52301;

    public RunnableC16201(C0572 c0572, String str) {
        super(c0572);
        this.f52301 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM38120 = AbstractRunnableC16096.m38120(this.f52301);
        C0572 c0572 = this.f52046;
        AbstractC20745 abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, strM38120);
        if (m38128(abstractC20745M38126)) {
            c0572.m2708("550 Invalid name or chroot violation\r\n");
            return;
        }
        if (!abstractC20745M38126.mo33974()) {
            c0572.m2708("550 Can't CWD to invalid directory\r\n");
        } else if (abstractC20745M38126.mo8449()) {
            c0572.m2712(abstractC20745M38126);
            c0572.m2708("250 CWD successful\r\n");
        } else {
            c0572.m2708("550 That path is inaccessible\r\n");
        }
    }
}
