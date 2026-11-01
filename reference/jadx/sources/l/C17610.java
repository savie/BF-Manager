package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܿ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17610 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C11967 f55958;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f55959 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23961 f55960;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6321 f55961;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f55962;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15682 f55963;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7027 f55964;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2793 f55965;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f55966;

    public C17610(C23961 c23961, C7027 c7027, C15682 c15682, int i) {
        this.f55960 = c23961;
        this.f55964 = c7027;
        this.f55963 = c15682;
        this.f55962 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40936() {
        int i = this.f55959;
        C23961 c23961 = this.f55960;
        int i2 = this.f55962;
        if (i < 0) {
            int iMax = Math.max(c23961.f77696, i2) - i2;
            int iMin = Math.min(c23961.f77695 - i2, this.f55964.m18860());
            if (iMax < iMin) {
                this.f55964 = this.f55964.m18861(iMax, iMin, C7027.m18851(iMin - iMax, this.f55963, c23961.f77696 == i2 + iMax));
            }
            this.f55959 = 0;
            return false;
        }
        C6321 c6321 = this.f55961;
        if (c6321 == null) {
            if (i == c23961.f77697.size()) {
                return true;
            }
            List list = c23961.f77697;
            int i3 = this.f55959;
            this.f55959 = i3 + 1;
            C6321 c6322 = (C6321) list.get(i3);
            int iMax2 = Math.max(c6322.f21355, i2) - i2;
            int iMin2 = Math.min(c6322.f21353 - i2, this.f55964.m18860());
            if (iMax2 >= iMin2 || c6322.f21354 == C15682.f50915) {
                this.f55961 = null;
                return false;
            }
            C6321 c6323 = new C6321(iMax2, iMin2, c6322.f21354);
            this.f55961 = c6323;
            C7027 c7027 = this.f55964;
            int i4 = c6323.f21355;
            c7027.getClass();
            C2793 c2793 = new C2793();
            c2793.m8488(c7027);
            c2793.m8489(i4);
            this.f55965 = c2793;
            this.f55958 = new C11967();
            this.f55966 = this.f55961.f21355;
            return false;
        }
        int iMin3 = Math.min(c6321.f21353, this.f55965.m8487());
        this.f55958.m29779(iMin3 - this.f55966, this.f55965.m8491().m37372(this.f55961.f21354), this.f55965.m8486() && this.f55966 == this.f55965.m8492());
        this.f55966 = iMin3;
        if (iMin3 == this.f55961.f21353) {
            this.f55964 = this.f55964.m18861(this.f55961.f21355, this.f55961.f21353, this.f55958.m29778());
            this.f55961 = null;
            this.f55965 = null;
            this.f55958 = null;
            return false;
        }
        if (this.f55965.m8490()) {
            return false;
        }
        throw new IllegalStateException("Incomplete syntax style transaction coverage");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7027 m40937() {
        return this.f55964;
    }
}
