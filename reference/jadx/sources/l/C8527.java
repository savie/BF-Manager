package l;

/* JADX INFO: renamed from: l.ۡ֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X598 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8527 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9938 f29517;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29518;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C8527 f29519;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9938 f29520;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f29521;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C9938 f29522;

    public C8527(C9938 c9938, C9938 c9939, C9938 c99310, int i, String str) {
        this.f29522 = c9938;
        this.f29520 = c9939;
        this.f29517 = c99310;
        this.f29518 = i;
        this.f29521 = str;
    }

    public C8527(C8527 c8527, C9938 c9938, C9938 c9939) {
        this(c9938, c9939, c8527.f29517, c8527.f29518, c8527.f29521);
        this.f29519 = c8527.f29519;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8527 m22267(C8527 c8527, C9938 c9938, C9938 c9939) {
        if (c8527 == null) {
            return null;
        }
        C9938 c99310 = c8527.f29522;
        C8527 c8527M22267 = m22267(c8527.f29519, c9938, c9939);
        c8527.f29519 = c8527M22267;
        int i = c99310.f33927;
        C9938 c99311 = c8527.f29520;
        int i2 = c99311.f33927;
        int i3 = c9938.f33927;
        int i4 = c9939 == null ? Integer.MAX_VALUE : c9939.f33927;
        if (i3 >= i2 || i4 <= i) {
            return c8527;
        }
        if (i3 <= i) {
            return i4 >= i2 ? c8527M22267 : new C8527(c8527, c9939, c99311);
        }
        if (i4 >= i2) {
            return new C8527(c8527, c99310, c9938);
        }
        c8527.f29519 = new C8527(c8527, c9939, c99311);
        return new C8527(c8527, c99310, c9938);
    }
}
