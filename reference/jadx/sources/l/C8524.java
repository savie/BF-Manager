package l;

/* JADX INFO: renamed from: l.۠ۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes3.dex */
public final class C8524 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9269 f27851;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f27852;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f27853;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22836(C8524 c8524, C24166 c24166) {
        c8524.getClass();
        c24166.m54134(c8524.f27853);
        c24166.m54139(c8524.f27852);
        c24166.m54139(C9269.m24457(c8524.f27851));
    }

    public C8524(int i, int i2, C9269 c9269) {
        this.f27853 = i;
        this.f27852 = i2;
        this.f27851 = c9269;
    }

    public C8524(C4028 c4028, C7757 c7757) {
        this.f27853 = c4028.m12995();
        this.f27852 = c4028.m13002();
        C9269 c9269 = (C9269) c7757.m21127(c4028.m13002());
        this.f27851 = c9269;
        if (c9269 == null) {
            throw new RuntimeException("Could not find the EncodedCatchHandler referenced by this TryItem");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22837() {
        return this.f27853;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m22838() {
        return this.f27852;
    }
}
