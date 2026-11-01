package l;

/* JADX INFO: renamed from: l.ۢ۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9603 extends AbstractC4393 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f32351;

    public C9603(int i) {
        this.f32351 = i;
    }

    @Override // l.AbstractC4393
    /* JADX INFO: renamed from: ۙ */
    public final int mo5986() {
        int i = this.f32351;
        if (i < 64) {
            return i;
        }
        return 251;
    }

    @Override // l.AbstractC4393
    /* JADX INFO: renamed from: ۙ */
    public final void mo5987(C11450 c11450) {
        super.mo5987(c11450);
        if (mo5986() == 251) {
            C20809 c20809 = c11450.f38541;
            int i = this.f32351;
            c20809.m46798(i);
            if (c11450.f38532) {
                System.out.print(" offset_delta=" + i);
            }
        }
    }
}
