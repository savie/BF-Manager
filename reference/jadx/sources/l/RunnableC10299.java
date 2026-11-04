package l;

/* JADX INFO: renamed from: l.ۢᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W62A */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC10299 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f32877;

    public RunnableC10299(C5563 c5563, String str) {
        super(c5563);
        this.f32877 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM36601 = AbstractRunnableC15257.m36601(this.f32877);
        int length = strM36601.length();
        C5563 c5563 = this.f49894;
        if (length < 1) {
            str = "550 Invalid argument\r\n";
        } else {
            AbstractC22044 abstractC22044M36607 = AbstractRunnableC15257.m36607(c5563, strM36601);
            if (m36609(abstractC22044M36607)) {
                str = "550 Invalid name or chroot violation\r\n";
            } else if (!abstractC22044M36607.mo4281()) {
                str = "550 Can't RMD a non-directory\r\n";
            } else if (AbstractRunnableC15257.m36608(abstractC22044M36607, c5563.m16488())) {
                str = "550 Won't RMD the root directory\r\n";
            } else {
                str = !abstractC22044M36607.mo4296() ? "550 Deletion error, possibly incomplete\r\n" : null;
            }
        }
        if (str != null) {
            c5563.m16486(str);
        } else {
            c5563.m16486("250 Removed directory\r\n");
        }
    }
}
