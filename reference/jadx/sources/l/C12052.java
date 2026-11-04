package l;

/* JADX INFO: renamed from: l.ۨۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47NE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12052 implements InterfaceC4848 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38820 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f38821;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7578 f38822;

    public C12052(C7578 c7578, int i) {
        this.f38822 = c7578;
        this.f38821 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30231() {
        C20782.m47565(this.f38820 == -1);
        this.f38820 = this.f38822.m20733(this.f38821);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m30230() {
        if (this.f38820 != -1) {
            this.f38822.m20754(this.f38821);
            this.f38820 = -1;
        }
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo14092() {
        if (this.f38820 != -3) {
            return m30229() && this.f38822.m20751(this.f38820);
        }
        return true;
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public final void mo14091() throws C0866 {
        int i = this.f38820;
        C7578 c7578 = this.f38822;
        if (i == -2) {
            throw new C0866(C14442.m34865("Unable to bind a sample queue to TrackGroup with MIME type ", c7578.m20746().m11056(this.f38821).m39194(0).f50848, "."));
        }
        if (i == -1) {
            c7578.m20748();
        } else if (i != -3) {
            c7578.m20743(i);
        }
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public final int mo14090(C16461 c16461, C5690 c5690, int i) {
        if (this.f38820 == -3) {
            c5690.m33309(4);
            return -4;
        }
        if (m30229()) {
            return this.f38822.m20735(this.f38820, c16461, c5690, i);
        }
        return -3;
    }

    @Override // l.InterfaceC4848
    /* JADX INFO: renamed from: ۙ */
    public final int mo14089(long j) {
        if (m30229()) {
            return this.f38822.m20734(this.f38820, j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m30229() {
        int i = this.f38820;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }
}
