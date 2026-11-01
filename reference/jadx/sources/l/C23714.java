package l;

/* JADX INFO: renamed from: l.᩻۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes.dex */
public final class C23714 extends AbstractC4393 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f76745;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f76746;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579[] f76747;

    public C23714(int i, int i2, AbstractC16579[] abstractC16579Arr) {
        this.f76745 = i;
        this.f76746 = i2;
        this.f76747 = abstractC16579Arr;
    }

    @Override // l.AbstractC4393
    /* JADX INFO: renamed from: ۙ */
    public final int mo5986() {
        return this.f76745;
    }

    @Override // l.AbstractC4393
    /* JADX INFO: renamed from: ۙ */
    public final void mo5987(C11450 c11450) {
        super.mo5987(c11450);
        C20809 c20809 = c11450.f38541;
        int i = this.f76746;
        c20809.m46798(i);
        if (c11450.f38532) {
            System.out.print(" offset_delta=" + i);
        }
        int i2 = 0;
        while (true) {
            AbstractC16579[] abstractC16579Arr = this.f76747;
            if (i2 >= abstractC16579Arr.length) {
                return;
            }
            if (c11450.f38532) {
                System.out.print(" locals[" + i2 + "]=");
            }
            c11450.m28588(abstractC16579Arr[i2]);
            i2++;
        }
    }
}
