package l;

/* JADX INFO: renamed from: l.۬᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14197 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f44876;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f44877;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f44878;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f44879;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34488(int i, float f, long j) {
        this.f44876 = i;
        this.f44878 = j;
        this.f44879 = Math.abs(f);
        this.f44877 = -1.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m34487(int i, int i2, float f, float f2, float f3, long j) {
        if (f == f2) {
            return f;
        }
        int iRound = Math.round(f);
        int iRound2 = Math.round(f2);
        if (this.f44877 < 0.0f) {
            if (i2 < iRound || i2 > iRound2 || i < iRound || i > iRound2) {
                float f4 = this.f44879;
                this.f44877 = f4 / ((f3 * 1000.0f) + f4);
            } else {
                long j2 = this.f44878;
                if (j > j2) {
                    this.f44879 = (float) Math.abs(((((double) i) - ((double) this.f44876)) * 1000.0d) / (j - j2));
                    this.f44876 = i;
                    this.f44878 = j;
                }
            }
        }
        int iMax = Math.max(iRound, Math.min(iRound2, i));
        return Math.max(f, Math.min(f2, iMax)) + ((float) ((((double) i) - ((double) iMax)) * ((double) Math.max(0.0f, this.f44877))));
    }
}
