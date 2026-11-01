package l;

/* JADX INFO: renamed from: l.ܿ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: PALD */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC17611 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f55967;

    public RunnableC17611(C0572 c0572, String str) {
        super(c0572);
        this.f55967 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM38120 = AbstractRunnableC16096.m38120(this.f55967);
        C0572 c0572 = this.f52046;
        AbstractC20745 abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, strM38120);
        if (m38128(abstractC20745M38126)) {
            c0572.m2708("550 Invalid name or chroot violation\r\n");
            return;
        }
        if (abstractC20745M38126.mo33975()) {
            c0572.m2708("213 " + AbstractC12568.m31287(abstractC20745M38126.mo33991()) + "\r\n");
            return;
        }
        c0572.m2708("550 file does not exist\r\n");
    }
}
