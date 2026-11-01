package l;

/* JADX INFO: renamed from: l.ܳۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBEZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14508 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17432 f47530;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17432 f47531;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17432 f47532;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f47533;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f47534;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f47535;

    public C14508(int i, int i2, C17432 c17432, C17432 c17433, C17432 c17434, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        if (c17432 == null) {
            throw new NullPointerException("name == null");
        }
        if (c17433 == null && c17434 == null) {
            throw new NullPointerException("(descriptor == null) && (signature == null)");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        this.f47535 = i;
        this.f47533 = i2;
        this.f47530 = c17432;
        this.f47531 = c17433;
        this.f47532 = c17434;
        this.f47534 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19073 m34926() {
        return C19073.m43845(this.f47530, this.f47532);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17432 m34924(C14508 c14508) {
        return c14508.f47532;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3320 m34929() {
        return C3320.m9826(this.f47531.getString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14508 m34925(C17432 c17432) {
        return new C14508(this.f47535, this.f47533, this.f47530, this.f47531, c17432, this.f47534);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34927(int i, int i2) {
        int i3;
        return i2 == this.f47534 && i >= (i3 = this.f47535) && i < i3 + this.f47533;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34928(C14508 c14508) {
        return this.f47535 == c14508.f47535 && this.f47533 == c14508.f47533 && this.f47534 == c14508.f47534 && this.f47530.equals(c14508.f47530);
    }
}
