package l;

/* JADX INFO: renamed from: l.᩺ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6652 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC23152 extends AbstractRunnableC16096 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f75154;

    public RunnableC23152(C0572 c0572, String str) {
        super(c0572);
        this.f75154 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM38120 = AbstractRunnableC16096.m38120(this.f75154);
        C0572 c0572 = this.f52046;
        AbstractC20745 abstractC20745M38126 = AbstractRunnableC16096.m38126(c0572, strM38120);
        if (m38128(abstractC20745M38126)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else {
            str = !abstractC20745M38126.mo33975() ? "450 Cannot rename nonexistent file\r\n" : null;
        }
        if (str != null) {
            c0572.m2708(str);
            c0572.m2701((AbstractC20745) null);
        } else {
            c0572.m2708("350 Filename noted, now send RNTO\r\n");
            c0572.m2701(abstractC20745M38126);
        }
    }
}
