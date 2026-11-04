package l;

/* JADX INFO: renamed from: l.᩻ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: PALD */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC25218 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f81469;

    public RunnableC25218(C5563 c5563, String str) {
        super(c5563);
        this.f81469 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM36601 = AbstractRunnableC15257.m36601(this.f81469);
        C5563 c5563 = this.f49894;
        AbstractC22044 abstractC22044M36607 = AbstractRunnableC15257.m36607(c5563, strM36601);
        if (m36609(abstractC22044M36607)) {
            c5563.m16486("550 Invalid name or chroot violation\r\n");
            return;
        }
        if (abstractC22044M36607.mo2934()) {
            c5563.m16486("213 " + AbstractC11528.m29027(abstractC22044M36607.mo4286()) + "\r\n");
            return;
        }
        c5563.m16486("550 file does not exist\r\n");
    }
}
