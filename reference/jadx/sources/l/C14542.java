package l;

/* JADX INFO: renamed from: l.ܳ۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14542 extends AbstractC4393 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f47616;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f47617;

    public C14542(int i, int i2) {
        this.f47616 = i;
        this.f47617 = i2;
    }

    @Override // l.AbstractC4393
    /* JADX INFO: renamed from: ۙ */
    public final int mo5986() {
        return this.f47616;
    }

    @Override // l.AbstractC4393
    /* JADX INFO: renamed from: ۙ */
    public final void mo5987(C11450 c11450) {
        super.mo5987(c11450);
        C20809 c20809 = c11450.f38541;
        int i = this.f47617;
        c20809.m46798(i);
        if (c11450.f38532) {
            System.out.print(" offset_delta=" + i);
        }
    }
}
