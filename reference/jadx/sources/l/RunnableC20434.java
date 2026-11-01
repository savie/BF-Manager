package l;

/* JADX INFO: renamed from: l.᩶᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5DO */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC20434 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f66260;

    public RunnableC20434(C0572 c0572, String str) {
        super(c0572);
        this.f66260 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM38120 = AbstractRunnableC16096.m38120(this.f66260);
        C0572 c0572 = this.f52046;
        AbstractC20745 abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, strM38120);
        if (m38128(abstractC20745M38126)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC20745M38126.mo33974()) {
            str = "550 Can't DELE a directory\r\n";
        } else {
            str = !abstractC20745M38126.mo24647() ? "450 Error deleting file\r\n" : null;
        }
        if (str != null) {
            c0572.m2708(str);
            return;
        }
        c0572.m2708("250 File successfully deleted\r\n");
        int i = C22252.f72742;
        C22252.m49404(abstractC20745M38126.mo33986());
    }
}
