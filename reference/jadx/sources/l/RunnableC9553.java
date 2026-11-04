package l;

/* JADX INFO: renamed from: l.ۡᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q64Y */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC9553 extends AbstractRunnableC15257 implements Runnable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f30938;

    public RunnableC9553(C5563 c5563, String str) {
        super(c5563);
        this.f30938 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String strM36601 = AbstractRunnableC15257.m36601(this.f30938);
        C5563 c5563 = this.f49894;
        AbstractC22044 abstractC22044M36607 = AbstractRunnableC15257.m36607(c5563, strM36601);
        if (m36609(abstractC22044M36607)) {
            str = "550 Invalid name or chroot violation\r\n";
        } else {
            AbstractC22044 abstractC22044M16489 = c5563.m16489();
            if (abstractC22044M16489 == null) {
                str = "550 Rename error, maybe RNFR not sent\r\n";
            } else {
                str = !abstractC22044M16489.mo4301(abstractC22044M36607) ? "550 Error during rename operation\r\n" : null;
            }
        }
        if (str != null) {
            c5563.m16486(str);
        } else {
            c5563.m16486("250 rename successful\r\n");
        }
        c5563.m16480((AbstractC22044) null);
    }
}
