package l;

/* JADX INFO: renamed from: l.ۜ᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7035 implements InterfaceC1390 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f23634;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f23635;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f23636;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f23637;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f23638;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f23639;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long[] f23640;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7035 m18872(C4212 c4212, long j) {
        long jM11878 = c4212.m11878();
        if (jM11878 == -9223372036854775807L) {
            return null;
        }
        C5188 c5188 = c4212.f15291;
        return new C7035(j, c5188.f17994, jM11878, c5188.f17992, c4212.f15290, c4212.f15294);
    }

    public C7035(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.f23635 = j;
        this.f23634 = i;
        this.f23637 = j2;
        this.f23636 = i2;
        this.f23638 = j3;
        this.f23640 = jArr;
        this.f23639 = j3 != -1 ? j + j3 : -1L;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return this.f23640 != null;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        double d;
        double d2;
        double d3;
        boolean zMo5382 = mo5382();
        int i = this.f23634;
        long j2 = this.f23635;
        if (!zMo5382) {
            C22828 c22828 = new C22828(0L, j2 + ((long) i));
            return new C12950(c22828, c22828);
        }
        long jM41829 = C17983.m41829(j, 0L, this.f23637);
        double d4 = (jM41829 * 100.0d) / this.f23637;
        double d5 = 0.0d;
        if (d4 <= 0.0d) {
            d3 = 256.0d;
        } else if (d4 >= 100.0d) {
            d3 = 256.0d;
            d5 = 256.0d;
        } else {
            int i2 = (int) d4;
            long[] jArr = this.f23640;
            C2023.m6508(jArr);
            double d6 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = jArr[i2 + 1];
                d2 = 256.0d;
            }
            d5 = ((d - d6) * (d4 - ((double) i2))) + d6;
            d3 = d2;
        }
        double d7 = d5 / d3;
        long j3 = this.f23638;
        C22828 c22829 = new C22828(jM41829, j2 + C17983.m41829(Math.round(d7 * j3), i, j3 - 1));
        return new C12950(c22829, c22829);
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ܰ */
    public final long mo4878(long j) {
        long j2 = j - this.f23635;
        if (!mo5382() || j2 <= this.f23634) {
            return 0L;
        }
        long[] jArr = this.f23640;
        C2023.m6508(jArr);
        double d = (j2 * 256.0d) / this.f23638;
        int iM41855 = C17983.m41855(jArr, (long) d, true);
        long j3 = this.f23637;
        long j4 = (((long) iM41855) * j3) / 100;
        long j5 = jArr[iM41855];
        int i = iM41855 + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iM41855 == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        return this.f23637;
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ܰ */
    public final long mo4877() {
        return this.f23635 + ((long) this.f23634);
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ۖ */
    public final long mo4876() {
        return this.f23639;
    }

    @Override // l.InterfaceC1390
    /* JADX INFO: renamed from: ֨ */
    public final int mo4875() {
        return this.f23636;
    }
}
