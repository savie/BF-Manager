package l;

/* JADX INFO: renamed from: l.֨۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7T6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1019 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C1019 f3686 = new C1019(new C9967());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f3687;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f3688;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f3689;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC8639 f3690;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f3691;

    public C1019(C9967 c9967) {
        this.f3690 = c9967.f32036;
        this.f3691 = c9967.f32037;
        this.f3687 = c9967.f32033;
        this.f3688 = c9967.f32034;
        this.f3689 = c9967.f32035;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1019)) {
            return false;
        }
        C1019 c1019 = (C1019) obj;
        return this.f3690.equals(c1019.f3690) && this.f3687 == c1019.f3687 && this.f3691 == c1019.f3691 && this.f3688 == c1019.f3688 && this.f3689 == c1019.f3689;
    }

    public final int hashCode() {
        return C17359.hash(this.f3690, null, null, Boolean.valueOf(this.f3691), Boolean.valueOf(this.f3687), Boolean.valueOf(this.f3688), Boolean.valueOf(this.f3689));
    }
}
