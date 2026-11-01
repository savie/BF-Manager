package l;

/* JADX INFO: renamed from: l.ۛ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6NE */
/* JADX INFO: loaded from: classes3.dex */
public final class C5739 implements InterfaceC1988 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14690 f19518;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f19519;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3329 f19520;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f19521 = new int[2];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f19522;

    public C5739(C3329 c3329, C14690 c14690, Runnable runnable) {
        this.f19520 = c3329;
        this.f19518 = c14690;
        this.f19519 = runnable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15790(C6222 c6222, boolean z) {
        int iGroupCount = z ? c6222.groupCount() : 0;
        this.f19522 = iGroupCount;
        int i = (iGroupCount + 1) * 2;
        if (this.f19521.length < i) {
            this.f19521 = new int[i];
        }
        for (int i2 = 0; i2 <= this.f19522; i2++) {
            int i3 = i2 * 2;
            this.f19521[i3] = c6222.start(i2);
            this.f19521[i3 + 1] = c6222.end(i2);
        }
    }

    @Override // l.InterfaceC1988
    public final CharSequence getText() {
        return this.f19520;
    }

    @Override // l.InterfaceC1988
    public final C14690 pattern() {
        return this.f19518;
    }

    @Override // l.InterfaceC1988
    public final int groupCount() {
        return this.f19522;
    }

    @Override // l.InterfaceC1988
    public final int start(int i) {
        return this.f19521[i * 2];
    }

    @Override // l.InterfaceC1988
    public final int end(int i) {
        return this.f19521[(i * 2) + 1];
    }

    @Override // l.InterfaceC1988
    public final String group(int i) {
        if (i >= 0 && i <= this.f19522) {
            int iStart = start(i);
            int iEnd = end(i);
            if (iStart >= 0 && iEnd >= 0) {
                return this.f19520.subSequence(iStart, iEnd);
            }
        }
        return "";
    }

    @Override // l.InterfaceC1988
    /* JADX INFO: renamed from: ۙ */
    public final void mo6401() {
        this.f19519.run();
    }
}
