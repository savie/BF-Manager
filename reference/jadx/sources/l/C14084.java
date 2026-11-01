package l;

/* JADX INFO: renamed from: l.ܰ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14084 extends AbstractC13378 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC13378 f46248;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC13378 f46249;

    /* JADX WARN: Illegal instructions before constructor call */
    public C14084(AbstractC13378 abstractC13378, AbstractC13378 abstractC13379) {
        long j = ((long) abstractC13378.f44317) + ((long) abstractC13379.f44317);
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        long j2 = ((long) abstractC13378.f44315) + ((long) abstractC13379.f44315);
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        boolean z = true;
        int iMax = Math.max(abstractC13378.f44318, abstractC13379.f44318) + 1;
        if (!abstractC13378.f44316 && !abstractC13379.f44316) {
            z = false;
        }
        super(i, i2, iMax, z);
        this.f46248 = abstractC13378;
        this.f46249 = abstractC13379;
    }
}
