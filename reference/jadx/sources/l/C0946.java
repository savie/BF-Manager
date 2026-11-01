package l;

/* JADX INFO: renamed from: l.֨ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7704 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0946 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C12942 f3754;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f3755;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f3756;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f3757;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f3758;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f3759;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f3760;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3710(C12942 c12942, int i, int i2) {
        c12942.m32059(i, i2);
        if (i == i2) {
            throw new IllegalArgumentException("Empty syntax context cursor range");
        }
        this.f3754 = c12942;
        this.f3755 = i2;
        this.f3757 = c12942.f43020.m7173(i - c12942.f43022);
        m3707(i);
        this.f3756 = true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m3708() {
        if (!this.f3756 || this.f3759 >= this.f3755) {
            this.f3756 = false;
            return false;
        }
        this.f3757++;
        m3707(this.f3754.f43022 + this.f3754.f43020.m7171(this.f3757));
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m3711() {
        this.f3754 = null;
        this.f3756 = false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m3712() {
        return this.f3760;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3709() {
        return this.f3759;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m3713() {
        return this.f3758;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3707(int i) {
        this.f3760 = i;
        this.f3759 = Math.min(this.f3755, this.f3754.f43022 + this.f3754.f43020.m7163(this.f3757));
        this.f3758 = this.f3754.f43020.m7165(this.f3757);
    }
}
