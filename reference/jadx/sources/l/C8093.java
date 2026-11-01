package l;

/* JADX INFO: renamed from: l.۠ۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8093 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f28351;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f28352;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f28353;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f28354;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21303(int i, float f, long j) {
        this.f28352 = i;
        this.f28354 = j;
        this.f28351 = Math.abs(f);
        this.f28353 = -1.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m21302(int i, int i2, float f, float f2, float f3, long j) {
        if (f == f2) {
            return f;
        }
        int iRound = Math.round(f);
        int iRound2 = Math.round(f2);
        if (this.f28353 < 0.0f) {
            if (i2 < iRound || i2 > iRound2 || i < iRound || i > iRound2) {
                float f4 = this.f28351;
                this.f28353 = f4 / ((f3 * 1000.0f) + f4);
            } else {
                long j2 = this.f28354;
                if (j > j2) {
                    this.f28351 = (float) Math.abs(((((double) i) - ((double) this.f28352)) * 1000.0d) / (j - j2));
                    this.f28352 = i;
                    this.f28354 = j;
                }
            }
        }
        int iMax = Math.max(iRound, Math.min(iRound2, i));
        return Math.max(f, Math.min(f2, iMax)) + ((float) ((((double) i) - ((double) iMax)) * ((double) Math.max(0.0f, this.f28353))));
    }
}
