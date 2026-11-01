package l;

/* JADX INFO: renamed from: l.᩺ۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 76MD */
/* JADX INFO: loaded from: classes.dex */
public final class C22910 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f74471;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f74472;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f74473;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f74474;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f74475;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f74476;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f74477;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f74478;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f74479;

    public C22910(int i, int i2, int i3, long j, long j2, long j3, long j4) {
        this.f74477 = i3;
        this.f74476 = (int) j;
        this.f74475 = (int) j2;
        long j5 = i;
        this.f74472 = (int) Math.min(j5, j3);
        long j6 = i2;
        this.f74478 = (int) Math.min(j6, j4);
        long j7 = i3;
        this.f74479 = (int) Math.max(0L, j - j7);
        this.f74473 = (int) Math.max(0L, j2 - j7);
        this.f74471 = (int) Math.min(j5, j3 + j7);
        this.f74474 = (int) Math.min(j6, j4 + j7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22910)) {
            return false;
        }
        C22910 c22910 = (C22910) obj;
        return this.f74477 == c22910.f74477 && this.f74479 == c22910.f74479 && this.f74473 == c22910.f74473 && this.f74471 == c22910.f74471 && this.f74474 == c22910.f74474 && this.f74476 == c22910.f74476 && this.f74475 == c22910.f74475 && this.f74472 == c22910.f74472 && this.f74478 == c22910.f74478;
    }

    public final int hashCode() {
        return (((((((((((((((this.f74477 * 31) + this.f74479) * 31) + this.f74473) * 31) + this.f74471) * 31) + this.f74474) * 31) + this.f74476) * 31) + this.f74475) * 31) + this.f74472) * 31) + this.f74478;
    }
}
