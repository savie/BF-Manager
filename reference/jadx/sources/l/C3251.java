package l;

/* JADX INFO: renamed from: l.ۗ۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3251 extends AbstractC4393 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f12089;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f12090;

    public C3251(int i, AbstractC16579 abstractC16579) {
        this.f12089 = i;
        this.f12090 = abstractC16579;
    }

    @Override // l.AbstractC4393
    /* JADX INFO: renamed from: ۙ */
    public final int mo5986() {
        int i = this.f12089;
        if (i < 64) {
            return i + 64;
        }
        return 247;
    }

    @Override // l.AbstractC4393
    /* JADX INFO: renamed from: ۙ */
    public final void mo5987(C11450 c11450) {
        super.mo5987(c11450);
        if (mo5986() == 247) {
            C20809 c20809 = c11450.f38541;
            int i = this.f12089;
            c20809.m46798(i);
            if (c11450.f38532) {
                System.out.print(" offset_delta=" + i);
            }
        }
        if (c11450.f38532) {
            System.out.print(" stack[0]=");
        }
        c11450.m28588(this.f12090);
    }
}
