package l;

/* JADX INFO: renamed from: l.֨ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6652 */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC1351 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f4827;

    public RunnableC1351(C5563 c5563, String str) {
        super(c5563);
        this.f4827 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM36601 = AbstractRunnableC15257.m36601(this.f4827);
        C5563 c5563 = this.f49894;
        AbstractC22044 abstractC22044M36607 = AbstractRunnableC15257.m36607(c5563, strM36601);
        if (m36609(abstractC22044M36607)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else {
            str = !abstractC22044M36607.mo2934() ? "450 Cannot rename nonexistent file\r\n" : null;
        }
        if (str != null) {
            c5563.m16486(str);
            c5563.m16480((AbstractC22044) null);
        } else {
            c5563.m16486("350 Filename noted, now send RNTO\r\n");
            c5563.m16480(abstractC22044M36607);
        }
    }
}
