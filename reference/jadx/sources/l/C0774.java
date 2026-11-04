package l;

/* JADX INFO: renamed from: l.֡᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 76MD */
/* JADX INFO: loaded from: classes2.dex */
public final class C0774 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f2793;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f2794;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f2795;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f2796;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f2797;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f2798;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f2799;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f2800;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f2801;

    public C0774(int i, int i2, int i3, long j, long j2, long j3, long j4) {
        this.f2795 = i3;
        this.f2796 = (int) j;
        this.f2799 = (int) j2;
        long j5 = i;
        this.f2801 = (int) Math.min(j5, j3);
        long j6 = i2;
        this.f2800 = (int) Math.min(j6, j4);
        long j7 = i3;
        this.f2798 = ((int) Math.max(0L, j - j7)) & (-2);
        this.f2793 = ((int) Math.max(0L, j2 - j7)) & (-2);
        this.f2797 = (int) Math.min(j5, j3 + j7);
        this.f2794 = (int) Math.min(j6, j4 + j7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0774)) {
            return false;
        }
        C0774 c0774 = (C0774) obj;
        return this.f2795 == c0774.f2795 && this.f2798 == c0774.f2798 && this.f2793 == c0774.f2793 && this.f2797 == c0774.f2797 && this.f2794 == c0774.f2794 && this.f2796 == c0774.f2796 && this.f2799 == c0774.f2799 && this.f2801 == c0774.f2801 && this.f2800 == c0774.f2800;
    }

    public final int hashCode() {
        return (((((((((((((((this.f2795 * 31) + this.f2798) * 31) + this.f2793) * 31) + this.f2797) * 31) + this.f2794) * 31) + this.f2796) * 31) + this.f2799) * 31) + this.f2801) * 31) + this.f2800;
    }
}
