package l;

/* JADX INFO: renamed from: l.۟֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8T9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7512 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f24818;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f24819;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f24820;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8402 f24821;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f24822;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f24823;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f24824;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f24825;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f24826;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f24827;

    public C7512(C8402 c8402, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        C20782.m47565(!z5 || z3);
        C20782.m47565(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        C20782.m47565(z6);
        this.f24821 = c8402;
        this.f24822 = j;
        this.f24818 = j2;
        this.f24826 = j3;
        this.f24819 = j4;
        this.f24820 = z;
        this.f24825 = z2;
        this.f24824 = z3;
        this.f24823 = z4;
        this.f24827 = z5;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7512 m20570(long j) {
        if (j == this.f24822) {
            return this;
        }
        return new C7512(this.f24821, j, this.f24818, this.f24826, this.f24819, this.f24820, this.f24825, this.f24824, this.f24823, this.f24827);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7512 m20569(long j) {
        if (j == this.f24818) {
            return this;
        }
        return new C7512(this.f24821, this.f24822, j, this.f24826, this.f24819, this.f24820, this.f24825, this.f24824, this.f24823, this.f24827);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7512.class == obj.getClass()) {
            C7512 c7512 = (C7512) obj;
            if (this.f24822 == c7512.f24822 && this.f24818 == c7512.f24818 && this.f24826 == c7512.f24826 && this.f24819 == c7512.f24819 && this.f24820 == c7512.f24820 && this.f24825 == c7512.f24825 && this.f24824 == c7512.f24824 && this.f24823 == c7512.f24823 && this.f24827 == c7512.f24827 && C17359.equals(this.f24821, c7512.f24821)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f24821.hashCode() + 527) * 31) + ((int) this.f24822)) * 31) + ((int) this.f24818)) * 31) + ((int) this.f24826)) * 31) + ((int) this.f24819)) * 31) + (this.f24820 ? 1 : 0)) * 31) + (this.f24825 ? 1 : 0)) * 31) + (this.f24824 ? 1 : 0)) * 31) + (this.f24823 ? 1 : 0)) * 31) + (this.f24827 ? 1 : 0);
    }
}
