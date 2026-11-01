package l;

/* JADX INFO: renamed from: l.֫۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1840 extends AbstractC4393 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579[] f7037;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579[] f7038;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f7039;

    @Override // l.AbstractC4393
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo5986() {
        return 255;
    }

    public C1840(int i, AbstractC16579[] abstractC16579Arr, AbstractC16579[] abstractC16579Arr2) {
        this.f7039 = i;
        this.f7037 = abstractC16579Arr;
        this.f7038 = abstractC16579Arr2;
    }

    @Override // l.AbstractC4393
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5987(C11450 c11450) {
        super.mo5987(c11450);
        C20809 c20809 = c11450.f38541;
        int i = this.f7039;
        c20809.m46798(i);
        AbstractC16579[] abstractC16579Arr = this.f7037;
        c20809.m46798(abstractC16579Arr.length);
        if (c11450.f38532) {
            System.out.print(" offset_delta=" + i);
            System.out.print(" nlocals=" + abstractC16579Arr.length);
        }
        for (int i2 = 0; i2 < abstractC16579Arr.length; i2++) {
            if (c11450.f38532) {
                System.out.print(" locals[" + i2 + "]=");
            }
            c11450.m28588(abstractC16579Arr[i2]);
        }
        AbstractC16579[] abstractC16579Arr2 = this.f7038;
        c20809.m46798(abstractC16579Arr2.length);
        if (c11450.f38532) {
            System.out.print(" nstack=" + abstractC16579Arr2.length);
        }
        for (int i3 = 0; i3 < abstractC16579Arr2.length; i3++) {
            if (c11450.f38532) {
                System.out.print(" stack[" + i3 + "]=");
            }
            c11450.m28588(abstractC16579Arr2[i3]);
        }
    }
}
