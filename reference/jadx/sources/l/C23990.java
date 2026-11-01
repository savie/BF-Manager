package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻᩹ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8MT */
/* JADX INFO: loaded from: classes.dex */
public final class C23990 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f77750;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f77751;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f77752;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f77753;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f77754;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean[] f77755 = new boolean[15];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f77756;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f77757;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m52826() {
        this.f77754 = 0L;
        this.f77753 = 0L;
        this.f77757 = 0L;
        this.f77750 = 0;
        Arrays.fill(this.f77755, false);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m52823() {
        return this.f77754 > 15 && this.f77750 == 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m52827() {
        long j = this.f77754;
        if (j == 0) {
            return false;
        }
        return this.f77755[(int) ((j - 1) % 15)];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m52828() {
        return this.f77757;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m52824() {
        long j = this.f77753;
        if (j == 0) {
            return 0L;
        }
        return this.f77757 / j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52825(long j) {
        long j2 = this.f77754;
        if (j2 == 0) {
            this.f77756 = j;
        } else if (j2 == 1) {
            long j3 = j - this.f77756;
            this.f77752 = j3;
            this.f77757 = j3;
            this.f77753 = 1L;
        } else {
            long j4 = j - this.f77751;
            int i = (int) (j2 % 15);
            long jAbs = Math.abs(j4 - this.f77752);
            boolean[] zArr = this.f77755;
            if (jAbs <= 1000000) {
                this.f77753++;
                this.f77757 += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f77750--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f77750++;
            }
        }
        this.f77754++;
        this.f77751 = j;
    }
}
