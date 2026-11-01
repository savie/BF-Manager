package l;

/* JADX INFO: renamed from: l.᩹۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8T9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22279 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f72809;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f72810;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f72811;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f72812;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f72813;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f72814;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15274 f72815;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f72816;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f72817;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f72818;

    public C22279(C15274 c15274, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        C2023.m6507(!z5 || z3);
        C2023.m6507(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        C2023.m6507(z6);
        this.f72815 = c15274;
        this.f72814 = j;
        this.f72811 = j2;
        this.f72817 = j3;
        this.f72812 = j4;
        this.f72816 = z;
        this.f72813 = z2;
        this.f72818 = z3;
        this.f72809 = z4;
        this.f72810 = z5;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22279 m49453(long j) {
        if (j == this.f72814) {
            return this;
        }
        return new C22279(this.f72815, j, this.f72811, this.f72817, this.f72812, this.f72816, this.f72813, this.f72818, this.f72809, this.f72810);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22279 m49452(long j) {
        if (j == this.f72811) {
            return this;
        }
        return new C22279(this.f72815, this.f72814, j, this.f72817, this.f72812, this.f72816, this.f72813, this.f72818, this.f72809, this.f72810);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22279.class == obj.getClass()) {
            C22279 c22279 = (C22279) obj;
            if (this.f72814 == c22279.f72814 && this.f72811 == c22279.f72811 && this.f72817 == c22279.f72817 && this.f72812 == c22279.f72812 && this.f72816 == c22279.f72816 && this.f72813 == c22279.f72813 && this.f72818 == c22279.f72818 && this.f72809 == c22279.f72809 && this.f72810 == c22279.f72810 && C13638.equals(this.f72815, c22279.f72815)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f72815.hashCode() + 527) * 31) + ((int) this.f72814)) * 31) + ((int) this.f72811)) * 31) + ((int) this.f72817)) * 31) + ((int) this.f72812)) * 31) + (this.f72816 ? 1 : 0)) * 31) + (this.f72813 ? 1 : 0)) * 31) + (this.f72818 ? 1 : 0)) * 31) + (this.f72809 ? 1 : 0)) * 31) + (this.f72810 ? 1 : 0);
    }
}
