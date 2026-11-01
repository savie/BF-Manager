package l;

/* JADX INFO: renamed from: l.֡֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9BT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0059 extends AbstractC19816 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f924;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f925;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f926;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f927;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f928;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C23344 f929;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C2175 f930;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f931;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2175 f932;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2175 f933;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C2175 f934;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2175 f935;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f936;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f937;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f938;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f939;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C2175 f940;

    @Override // l.AbstractC19816
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo958() {
    }

    public C0059(C23344 c23344, int i, int i2, int i3) {
        super(589824, null);
        this.f929 = c23344;
        this.f939 = i;
        this.f927 = i2;
        this.f924 = i3;
        this.f935 = new C2175();
        this.f933 = new C2175();
        this.f932 = new C2175();
        this.f930 = new C2175();
        this.f934 = new C2175();
        this.f940 = new C2175();
    }

    @Override // l.AbstractC19816
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo960(String str) {
        this.f925 = this.f929.m51453(str).f54335;
    }

    @Override // l.AbstractC19816
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo967(String str) {
        this.f940.m6771(this.f929.m51463(str).f54335);
        this.f928++;
    }

    @Override // l.AbstractC19816
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo959(int i, String str, String str2) {
        C23344 c23344 = this.f929;
        int i2 = c23344.m51466(str).f54335;
        C2175 c2175 = this.f935;
        c2175.m6771(i2);
        c2175.m6771(i);
        c2175.m6771(str2 == null ? 0 : c23344.m51441(str2));
        this.f936++;
    }

    @Override // l.AbstractC19816
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo961(String str, int i, String... strArr) {
        C23344 c23344 = this.f929;
        int i2 = c23344.m51463(str).f54335;
        C2175 c2175 = this.f933;
        c2175.m6771(i2);
        c2175.m6771(i);
        if (strArr == null) {
            c2175.m6771(0);
        } else {
            c2175.m6771(strArr.length);
            for (String str2 : strArr) {
                c2175.m6771(c23344.m51466(str2).f54335);
            }
        }
        this.f931++;
    }

    @Override // l.AbstractC19816
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo968(String str, int i, String... strArr) {
        C23344 c23344 = this.f929;
        int i2 = c23344.m51463(str).f54335;
        C2175 c2175 = this.f932;
        c2175.m6771(i2);
        c2175.m6771(i);
        if (strArr == null) {
            c2175.m6771(0);
        } else {
            c2175.m6771(strArr.length);
            for (String str2 : strArr) {
                c2175.m6771(c23344.m51466(str2).f54335);
            }
        }
        this.f926++;
    }

    @Override // l.AbstractC19816
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo965(String str) {
        this.f930.m6771(this.f929.m51453(str).f54335);
        this.f937++;
    }

    @Override // l.AbstractC19816
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo962(String str, String... strArr) {
        C23344 c23344 = this.f929;
        int i = c23344.m51453(str).f54335;
        C2175 c2175 = this.f934;
        c2175.m6771(i);
        c2175.m6771(strArr.length);
        for (String str2 : strArr) {
            c2175.m6771(c23344.m51453(str2).f54335);
        }
        this.f938++;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m964() {
        return (this.f928 > 0 ? 1 : 0) + 1 + (this.f925 > 0 ? 1 : 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m966() {
        C23344 c23344 = this.f929;
        c23344.m51441("Module");
        int i = this.f935.f7888 + 22 + this.f933.f7888 + this.f932.f7888 + this.f930.f7888 + this.f934.f7888;
        if (this.f928 > 0) {
            c23344.m51441("ModulePackages");
            i += this.f940.f7888 + 8;
        }
        if (this.f925 <= 0) {
            return i;
        }
        c23344.m51441("ModuleMainClass");
        return i + 8;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m963(C2175 c2175) {
        C2175 c2176 = this.f935;
        int i = c2176.f7888 + 16;
        C2175 c2177 = this.f933;
        int i2 = i + c2177.f7888;
        C2175 c2178 = this.f932;
        int i3 = i2 + c2178.f7888;
        C2175 c2179 = this.f930;
        int i4 = i3 + c2179.f7888;
        C2175 c21710 = this.f934;
        int i5 = i4 + c21710.f7888;
        C23344 c23344 = this.f929;
        c2175.m6771(c23344.m51441("Module"));
        c2175.m6773(i5);
        c2175.m6771(this.f939);
        c2175.m6771(this.f927);
        c2175.m6771(this.f924);
        c2175.m6771(this.f936);
        c2175.m6768(0, c2176.f7888, c2176.f7887);
        c2175.m6771(this.f931);
        c2175.m6768(0, c2177.f7888, c2177.f7887);
        c2175.m6771(this.f926);
        c2175.m6768(0, c2178.f7888, c2178.f7887);
        c2175.m6771(this.f937);
        c2175.m6768(0, c2179.f7888, c2179.f7887);
        c2175.m6771(this.f938);
        c2175.m6768(0, c21710.f7888, c21710.f7887);
        if (this.f928 > 0) {
            c2175.m6771(c23344.m51441("ModulePackages"));
            C2175 c21711 = this.f940;
            c2175.m6773(c21711.f7888 + 2);
            c2175.m6771(this.f928);
            c2175.m6768(0, c21711.f7888, c21711.f7887);
        }
        if (this.f925 > 0) {
            c2175.m6771(c23344.m51441("ModuleMainClass"));
            c2175.m6773(2);
            c2175.m6771(this.f925);
        }
    }
}
