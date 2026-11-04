package l;

/* JADX INFO: renamed from: l.ۘܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4253 extends AbstractC19169 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC19169 f15480;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC19169 f15481;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4253(AbstractC19169 abstractC19169, AbstractC19169 abstractC191610) {
        long j = ((long) abstractC19169.f62019) + ((long) abstractC191610.f62019);
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        long j2 = ((long) abstractC19169.f62021) + ((long) abstractC191610.f62021);
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        boolean z = true;
        int iMax = Math.max(abstractC19169.f62020, abstractC191610.f62020) + 1;
        if (!abstractC19169.f62018 && !abstractC191610.f62018) {
            z = false;
        }
        super(i, i2, iMax, z);
        this.f15481 = abstractC19169;
        this.f15480 = abstractC191610;
    }
}
