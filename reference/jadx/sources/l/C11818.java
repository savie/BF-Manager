package l;

/* JADX INFO: renamed from: l.ۨܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06RI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11818 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f39697;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f39699;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C6899 f39701;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C4761 f39702;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13935 f39703;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C21695 f39704;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f39705;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f39706;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C23128 f39707;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15346 f39700 = new C15346();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22401 f39698 = new C22401();

    public C11818(C21695 c21695, boolean z, boolean z2) {
        C23128 c23128M18519;
        this.f39704 = c21695;
        this.f39699 = z2;
        if (z) {
            C15346 c15346 = c21695.f70379.f23227;
            c23128M18519 = !c15346.isEmpty() ? (C23128) c15346.last() : null;
        } else {
            c23128M18519 = c21695.f70379.m18519();
        }
        this.f39707 = c23128M18519;
        this.f39706 = c21695.f70376;
        this.f39697 = c21695.f70375;
        this.f39701 = c21695.f70379;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29490(C1233 c1233, C21695 c21695) {
        C15346 c15346M36739 = this.f39700.m36739(c1233.m4431());
        boolean zIsEmpty = c15346M36739.isEmpty();
        C21695 c21696 = this.f39704;
        this.f39702 = new C4761(c15346M36739, (zIsEmpty ? c21696.f70379 : c21696.f70379.m18516(c15346M36739, System.currentTimeMillis())).m18517(this.f39698, c21695.f70378, this.f39699), c1233.m4434(), c1233.m4433());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29491() {
        this.f39700 = this.f39702.f16773;
        this.f39701 = this.f39702.f16775;
        this.f39706 = this.f39702.f16774;
        this.f39697 = this.f39702.f16772;
        this.f39702 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29489() {
        this.f39702 = null;
        this.f39698.m49683();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21695 m29488(C21695 c21695) {
        long j = this.f39700.isEmpty() ? this.f39704.f70376 : this.f39706;
        long jMax = Math.max(c21695.f70375, this.f39697);
        C6899 c6899 = this.f39701;
        return new C21695(new C6899(c6899.f23225, c6899.f23227, Math.max(c6899.f23228, c21695.f70379.f23228), this.f39701.f23226), c21695.f70377, j, jMax, c21695.f70378);
    }
}
