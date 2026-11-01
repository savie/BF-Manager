package l;

/* JADX INFO: renamed from: l.ۧ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 156M */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC11262 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f38075;

    public RunnableC11262(C0572 c0572, String str) {
        super(c0572);
        this.f38075 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM38120 = AbstractRunnableC16096.m38120(this.f38075);
        int length = strM38120.length();
        C0572 c0572 = this.f52046;
        if (length < 1) {
            str = "550 Invalid name\r\n";
        } else {
            AbstractC20745 abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, strM38120);
            if (m38128(abstractC20745M38126)) {
                str = "550 Invalid name or chroot violation\r\n";
            } else if (abstractC20745M38126.mo33975()) {
                str = "550 Already exists\r\n";
            } else {
                str = !abstractC20745M38126.mo33987() ? "550 Error making directory (permissions?)\r\n" : null;
            }
        }
        if (str != null) {
            c0572.m2708(str);
        } else {
            c0572.m2708("250 Directory created\r\n");
        }
    }
}
