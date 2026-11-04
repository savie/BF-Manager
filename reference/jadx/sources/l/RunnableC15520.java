package l;

/* JADX INFO: renamed from: l.ܳᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5N1 */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC15520 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f50508;

    public RunnableC15520(C5563 c5563, String str) {
        super(c5563);
        this.f50508 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM36601 = AbstractRunnableC15257.m36601(this.f50508);
        C5563 c5563 = this.f49894;
        AbstractC22044 abstractC22044M36607 = AbstractRunnableC15257.m36607(c5563, strM36601);
        if (m36609(abstractC22044M36607)) {
            c5563.m16486("550 Invalid name or chroot violation\r\n");
            return;
        }
        if (!abstractC22044M36607.mo4281()) {
            c5563.m16486("550 Can't CWD to invalid directory\r\n");
        } else if (abstractC22044M36607.mo4302()) {
            c5563.m16496(abstractC22044M36607);
            c5563.m16486("250 CWD successful\r\n");
        } else {
            c5563.m16486("550 That path is inaccessible\r\n");
        }
    }
}
