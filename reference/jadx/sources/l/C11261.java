package l;

/* JADX INFO: renamed from: l.ۧ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11261 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C7027 f38068;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11967 f38069;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15682 f38070;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f38071;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f38072;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2793 f38073 = new C2793();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f38074;

    public C11261(C7027 c7027, C15682 c15682, int i) {
        this.f38068 = c7027;
        this.f38070 = c15682;
        this.f38072 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28226(int i, int i2, C15682 c15682) {
        int i3;
        int i4 = this.f38072;
        int iMax = Math.max(i, i4) - i4;
        int iMin = Math.min(i2 - i4, this.f38068.m18860());
        if (iMax >= iMin) {
            return;
        }
        if (this.f38069 != null && iMax < this.f38071) {
            m28224();
        }
        if (this.f38069 != null && iMax > (i3 = this.f38071)) {
            C7027 c7027 = this.f38068;
            C2793 c2793 = this.f38073;
            c2793.m8488(c7027);
            c2793.m8489(i3);
            if (c2793.m8487() < iMax) {
                m28224();
            } else {
                this.f38069.m29779(iMax - this.f38071, c2793.m8491(), c2793.m8486() && c2793.m8492() == this.f38071);
            }
            c2793.m8488(C7027.m18855());
        }
        if (this.f38069 == null) {
            this.f38069 = new C11967();
            this.f38074 = iMax;
        }
        this.f38069.m29779(iMin - iMax, c15682, iMax + i4 == i);
        this.f38071 = iMin;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17610 m28225(C23961 c23961) {
        boolean zIsEmpty = c23961.f77697.isEmpty();
        C15682 c15682 = this.f38070;
        if (zIsEmpty) {
            m28226(c23961.f77696, c23961.f77695, c15682);
            return null;
        }
        if (c23961.f77697.size() == 1) {
            C6321 c6321 = (C6321) c23961.f77697.get(0);
            if (c6321.f21355 == c23961.f77696 && c6321.f21353 == c23961.f77695) {
                m28226(c23961.f77696, c23961.f77695, c15682.m37372(c6321.f21354));
                return null;
            }
        }
        return new C17610(c23961, m28224(), c15682, this.f38072);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28227(C17610 c17610) {
        this.f38068 = c17610.m40937();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7027 m28224() {
        C11967 c11967 = this.f38069;
        if (c11967 != null) {
            this.f38068 = this.f38068.m18861(this.f38074, this.f38071, c11967.m29778());
            this.f38069 = null;
        }
        return this.f38068;
    }
}
