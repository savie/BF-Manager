package l;

/* JADX INFO: renamed from: l.ܽᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 156M */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC17758 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f58315;

    public RunnableC17758(C5563 c5563, String str) {
        super(c5563);
        this.f58315 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM36601 = AbstractRunnableC15257.m36601(this.f58315);
        int length = strM36601.length();
        C5563 c5563 = this.f49894;
        if (length < 1) {
            str = "550 Invalid name\r\n";
        } else {
            AbstractC22044 abstractC22044M36607 = AbstractRunnableC15257.m36607(c5563, strM36601);
            if (m36609(abstractC22044M36607)) {
                str = "550 Invalid name or chroot violation\r\n";
            } else if (abstractC22044M36607.mo2934()) {
                str = "550 Already exists\r\n";
            } else {
                str = !abstractC22044M36607.mo4274() ? "550 Error making directory (permissions?)\r\n" : null;
            }
        }
        if (str != null) {
            c5563.m16486(str);
        } else {
            c5563.m16486("250 Directory created\r\n");
        }
    }
}
