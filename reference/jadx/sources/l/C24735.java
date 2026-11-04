package l;

/* JADX INFO: renamed from: l.᩻ۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9BO */
/* JADX INFO: loaded from: classes.dex */
public final class C24735 extends AbstractC11308 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f80080;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C20455 f80081;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f80082;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f80083;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C20455 f80084;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C20455 f80085;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C20455 f80086;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C24185 f80087;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C23243 f80088;

    @Override // l.AbstractC11308
    /* JADX INFO: renamed from: ۙ */
    public final void mo28579() {
    }

    public C24735(C23243 c23243, String str, String str2, String str3) {
        super(589824, null);
        this.f80088 = c23243;
        this.f80080 = c23243.m52265(str);
        this.f80082 = c23243.m52265(str2);
        if (str3 != null) {
            this.f80083 = c23243.m52265(str3);
        }
    }

    @Override // l.AbstractC11308
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo28578(String str, boolean z) {
        C23243 c23243 = this.f80088;
        if (z) {
            C20455 c20455M46878 = C20455.m46878(c23243, str, this.f80084);
            this.f80084 = c20455M46878;
            return c20455M46878;
        }
        C20455 c20455M46879 = C20455.m46878(c23243, str, this.f80086);
        this.f80086 = c20455M46879;
        return c20455M46879;
    }

    @Override // l.AbstractC11308
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3301 mo28577(int i, C20259 c20259, String str, boolean z) {
        C23243 c23243 = this.f80088;
        if (z) {
            C20455 c20455M46877 = C20455.m46877(c23243, i, c20259, str, this.f80081);
            this.f80081 = c20455M46877;
            return c20455M46877;
        }
        C20455 c20455M46878 = C20455.m46877(c23243, i, c20259, str, this.f80085);
        this.f80085 = c20455M46878;
        return c20455M46878;
    }

    @Override // l.AbstractC11308
    /* JADX INFO: renamed from: ۙ */
    public final void mo28580(C24185 c24185) {
        c24185.f78328 = this.f80087;
        this.f80087 = c24185;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m55231() {
        int i = this.f80083;
        C23243 c23243 = this.f80088;
        int iM54158 = C24185.m54158(c23243, 0, i) + 6 + C20455.m46876(this.f80084, this.f80086, this.f80081, this.f80085);
        C24185 c24185 = this.f80087;
        return c24185 != null ? iM54158 + c24185.m54160(c23243) : iM54158;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55229(C4047 c4047) {
        c4047.m13021(this.f80080);
        c4047.m13021(this.f80082);
        int i = this.f80083;
        int i2 = i != 0 ? 1 : 0;
        if (this.f80084 != null) {
            i2++;
        }
        if (this.f80086 != null) {
            i2++;
        }
        if (this.f80081 != null) {
            i2++;
        }
        if (this.f80085 != null) {
            i2++;
        }
        C24185 c24185 = this.f80087;
        if (c24185 != null) {
            int i3 = 0;
            while (c24185 != null) {
                i3++;
                c24185 = c24185.f78328;
            }
            i2 += i3;
        }
        c4047.m13021(i2);
        C23243 c23243 = this.f80088;
        C24185.m54159(c23243, 0, i, c4047);
        C20455.m46880(this.f80088, this.f80084, this.f80086, this.f80081, this.f80085, c4047);
        C24185 c24186 = this.f80087;
        if (c24186 != null) {
            c24186.m54163(c23243, c4047);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55230(C6285 c6285) {
        c6285.m17968(this.f80087);
    }
}
