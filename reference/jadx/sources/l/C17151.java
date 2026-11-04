package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17151 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23865 f55904;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17897 f55905;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C1270 f55906;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11974 f55907;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14693 f55908;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f55909;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f55910;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C21407 f55911;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f55912 = -1;

    public C17151(C23865 c23865, C1270 c1270, C11974 c11974, int i) {
        this.f55904 = c23865;
        this.f55906 = c1270;
        this.f55907 = c11974;
        this.f55910 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40293() {
        int i = this.f55912;
        C23865 c23865 = this.f55904;
        int i2 = this.f55910;
        if (i < 0) {
            int iMax = Math.max(c23865.f77264, i2) - i2;
            int iMin = Math.min(c23865.f77263 - i2, this.f55906.m4628());
            if (iMax < iMin) {
                this.f55906 = this.f55906.m4629(iMax, iMin, C1270.m4615(iMin - iMax, this.f55907, c23865.f77264 == i2 + iMax));
            }
            this.f55912 = 0;
            return false;
        }
        C17897 c17897 = this.f55905;
        if (c17897 == null) {
            if (i == c23865.f77265.size()) {
                return true;
            }
            List list = c23865.f77265;
            int i3 = this.f55912;
            this.f55912 = i3 + 1;
            C17897 c17898 = (C17897) list.get(i3);
            int iMax2 = Math.max(c17898.f58632, i2) - i2;
            int iMin2 = Math.min(c17898.f58630 - i2, this.f55906.m4628());
            if (iMax2 >= iMin2 || c17898.f58631 == C11974.f38541) {
                this.f55905 = null;
                return false;
            }
            C17897 c17899 = new C17897(iMax2, iMin2, c17898.f58631);
            this.f55905 = c17899;
            C1270 c1270 = this.f55906;
            int i4 = c17899.f58632;
            c1270.getClass();
            C21407 c21407 = new C21407();
            c21407.m48710(c1270);
            c21407.m48711(i4);
            this.f55911 = c21407;
            this.f55908 = new C14693();
            this.f55909 = this.f55905.f58632;
            return false;
        }
        int iMin3 = Math.min(c17897.f58630, this.f55911.m48709());
        this.f55908.m35347(iMin3 - this.f55909, this.f55911.m48712().m30038(this.f55905.f58631), this.f55911.m48716() && this.f55909 == this.f55911.m48715());
        this.f55909 = iMin3;
        if (iMin3 == this.f55905.f58630) {
            this.f55906 = this.f55906.m4629(this.f55905.f58632, this.f55905.f58630, this.f55908.m35346());
            this.f55905 = null;
            this.f55911 = null;
            this.f55908 = null;
            return false;
        }
        if (this.f55911.m48714()) {
            return false;
        }
        throw new IllegalStateException("Incomplete syntax style transaction coverage");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1270 m40294() {
        return this.f55906;
    }
}
