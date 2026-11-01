package l;

/* JADX INFO: renamed from: l.ᩴ֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58K */
/* JADX INFO: loaded from: classes5.dex */
public final class C18404 extends AbstractC17698 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C3460 f58651;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f58652;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C3460 f58653;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f58654;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C3460 f58655;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f58656;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C3460 f58657;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f58658;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23344 f58659;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11349 f58660;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f58661;

    @Override // l.AbstractC17698
    /* JADX INFO: renamed from: ۙ */
    public final void mo41226() {
    }

    public C18404(C23344 c23344, int i, String str, String str2, String str3, Object obj) {
        super(589824, null);
        this.f58659 = c23344;
        this.f58656 = i;
        this.f58661 = c23344.m51441(str);
        this.f58654 = c23344.m51441(str2);
        if (str3 != null) {
            this.f58658 = c23344.m51441(str3);
        }
        if (obj != null) {
            this.f58652 = c23344.m51452(obj).f54335;
        }
    }

    @Override // l.AbstractC17698
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo13234(String str, boolean z) {
        C23344 c23344 = this.f58659;
        if (z) {
            C3460 c3460M10172 = C3460.m10172(c23344, str, this.f58653);
            this.f58653 = c3460M10172;
            return c3460M10172;
        }
        C3460 c3460M10173 = C3460.m10172(c23344, str, this.f58651);
        this.f58651 = c3460M10173;
        return c3460M10173;
    }

    @Override // l.AbstractC17698
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9812 mo13233(int i, C1470 c1470, String str, boolean z) {
        C23344 c23344 = this.f58659;
        if (z) {
            C3460 c3460M10171 = C3460.m10171(c23344, i, c1470, str, this.f58655);
            this.f58655 = c3460M10171;
            return c3460M10171;
        }
        C3460 c3460M10172 = C3460.m10171(c23344, i, c1470, str, this.f58657);
        this.f58657 = c3460M10172;
        return c3460M10172;
    }

    @Override // l.AbstractC17698
    /* JADX INFO: renamed from: ۙ */
    public final void mo41227(C11349 c11349) {
        c11349.f38290 = this.f58660;
        this.f58660 = c11349;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m42690() {
        int i;
        int i2 = this.f58652;
        C23344 c23344 = this.f58659;
        if (i2 != 0) {
            c23344.m51441("ConstantValue");
            i = 16;
        } else {
            i = 8;
        }
        int iM28425 = i + C11349.m28425(c23344, this.f58656, this.f58658) + C3460.m10170(this.f58653, this.f58651, this.f58655, this.f58657);
        C11349 c11349 = this.f58660;
        return c11349 != null ? iM28425 + c11349.m28427(c23344) : iM28425;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42688(C2175 c2175) {
        C23344 c23344 = this.f58659;
        int i = 0;
        boolean z = c23344.m51459() < 49;
        int i2 = ~(z ? 4096 : 0);
        int i3 = this.f58656;
        c2175.m6771(i2 & i3);
        c2175.m6771(this.f58661);
        c2175.m6771(this.f58654);
        int i4 = this.f58652;
        int i5 = i4 == 0 ? 0 : 1;
        if ((i3 & 4096) != 0 && z) {
            i5++;
        }
        int i6 = this.f58658;
        if (i6 != 0) {
            i5++;
        }
        if ((131072 & i3) != 0) {
            i5++;
        }
        if (this.f58653 != null) {
            i5++;
        }
        if (this.f58651 != null) {
            i5++;
        }
        if (this.f58655 != null) {
            i5++;
        }
        if (this.f58657 != null) {
            i5++;
        }
        C11349 c11349 = this.f58660;
        if (c11349 != null) {
            while (c11349 != null) {
                i++;
                c11349 = c11349.f38290;
            }
            i5 += i;
        }
        c2175.m6771(i5);
        if (i4 != 0) {
            c2175.m6771(c23344.m51441("ConstantValue"));
            c2175.m6773(2);
            c2175.m6771(i4);
        }
        C11349.m28426(c23344, i3, i6, c2175);
        C3460.m10174(this.f58659, this.f58653, this.f58651, this.f58655, this.f58657, c2175);
        C11349 c113410 = this.f58660;
        if (c113410 != null) {
            c113410.m28430(c23344, c2175);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42689(C13466 c13466) {
        c13466.m32969(this.f58660);
    }
}
