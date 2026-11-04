package l;

/* JADX INFO: renamed from: l.ۜۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58K */
/* JADX INFO: loaded from: classes3.dex */
public final class C7030 extends AbstractC8521 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20455 f23186;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C20455 f23187;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f23188;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C20455 f23189;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C20455 f23190;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C24185 f23191;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f23192;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23243 f23193;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f23194;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f23195;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f23196;

    @Override // l.AbstractC8521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19350() {
    }

    public C7030(C23243 c23243, int i, String str, String str2, String str3, Object obj) {
        super(589824, null);
        this.f23193 = c23243;
        this.f23188 = i;
        this.f23196 = c23243.m52265(str);
        this.f23194 = c23243.m52265(str2);
        if (str3 != null) {
            this.f23192 = c23243.m52265(str3);
        }
        if (obj != null) {
            this.f23195 = c23243.m52247(obj).f53507;
        }
    }

    @Override // l.AbstractC8521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 mo19349(String str, boolean z) {
        C23243 c23243 = this.f23193;
        if (z) {
            C20455 c20455M46878 = C20455.m46878(c23243, str, this.f23186);
            this.f23186 = c20455M46878;
            return c20455M46878;
        }
        C20455 c20455M46879 = C20455.m46878(c23243, str, this.f23190);
        this.f23190 = c20455M46879;
        return c20455M46879;
    }

    @Override // l.AbstractC8521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3301 mo19348(int i, C20259 c20259, String str, boolean z) {
        C23243 c23243 = this.f23193;
        if (z) {
            C20455 c20455M46877 = C20455.m46877(c23243, i, c20259, str, this.f23189);
            this.f23189 = c20455M46877;
            return c20455M46877;
        }
        C20455 c20455M46878 = C20455.m46877(c23243, i, c20259, str, this.f23187);
        this.f23187 = c20455M46878;
        return c20455M46878;
    }

    @Override // l.AbstractC8521
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19353(C24185 c24185) {
        c24185.f78328 = this.f23191;
        this.f23191 = c24185;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m19354() {
        int i;
        int i2 = this.f23195;
        C23243 c23243 = this.f23193;
        if (i2 != 0) {
            c23243.m52265("ConstantValue");
            i = 16;
        } else {
            i = 8;
        }
        int iM54158 = i + C24185.m54158(c23243, this.f23188, this.f23192) + C20455.m46876(this.f23186, this.f23190, this.f23189, this.f23187);
        C24185 c24185 = this.f23191;
        return c24185 != null ? iM54158 + c24185.m54160(c23243) : iM54158;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19351(C4047 c4047) {
        C23243 c23243 = this.f23193;
        int i = 0;
        boolean z = c23243.m52257() < 49;
        int i2 = ~(z ? 4096 : 0);
        int i3 = this.f23188;
        c4047.m13021(i2 & i3);
        c4047.m13021(this.f23196);
        c4047.m13021(this.f23194);
        int i4 = this.f23195;
        int i5 = i4 == 0 ? 0 : 1;
        if ((i3 & 4096) != 0 && z) {
            i5++;
        }
        int i6 = this.f23192;
        if (i6 != 0) {
            i5++;
        }
        if ((131072 & i3) != 0) {
            i5++;
        }
        if (this.f23186 != null) {
            i5++;
        }
        if (this.f23190 != null) {
            i5++;
        }
        if (this.f23189 != null) {
            i5++;
        }
        if (this.f23187 != null) {
            i5++;
        }
        C24185 c24185 = this.f23191;
        if (c24185 != null) {
            while (c24185 != null) {
                i++;
                c24185 = c24185.f78328;
            }
            i5 += i;
        }
        c4047.m13021(i5);
        if (i4 != 0) {
            c4047.m13021(c23243.m52265("ConstantValue"));
            c4047.m13023(2);
            c4047.m13021(i4);
        }
        C24185.m54159(c23243, i3, i6, c4047);
        C20455.m46880(this.f23193, this.f23186, this.f23190, this.f23189, this.f23187, c4047);
        C24185 c24186 = this.f23191;
        if (c24186 != null) {
            c24186.m54163(c23243, c4047);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19352(C6285 c6285) {
        c6285.m17968(this.f23191);
    }
}
