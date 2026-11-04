package l;

/* JADX INFO: renamed from: l.ۖܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 78KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C2785 implements InterfaceC10242 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f9175;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f9176;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f9177;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long[] f9178;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f9179;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f9180;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f9181;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2785 m9252(C9496 c9496, long j) {
        long jM24875 = c9496.m24875();
        if (jM24875 == -9223372036854775807L) {
            return null;
        }
        C18010 c18010 = c9496.f30772;
        return new C2785(j, c18010.f58964, jM24875, c18010.f58963, c9496.f30769, c9496.f30771);
    }

    public C2785(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.f9181 = j;
        this.f9177 = i;
        this.f9179 = j2;
        this.f9175 = i2;
        this.f9176 = j3;
        this.f9178 = jArr;
        this.f9180 = j3 != -1 ? j + j3 : -1L;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2298() {
        return this.f9178 != null;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        double d;
        double d2;
        double d3;
        boolean zMo2298 = mo2298();
        int i = this.f9177;
        long j2 = this.f9181;
        if (!zMo2298) {
            C2349 c2349 = new C2349(0L, j2 + ((long) i));
            return new C9805(c2349, c2349);
        }
        long jM19476 = C7116.m19476(j, 0L, this.f9179);
        double d4 = (jM19476 * 100.0d) / this.f9179;
        double d5 = 0.0d;
        if (d4 <= 0.0d) {
            d3 = 256.0d;
        } else if (d4 >= 100.0d) {
            d3 = 256.0d;
            d5 = 256.0d;
        } else {
            int i2 = (int) d4;
            long[] jArr = this.f9178;
            C20782.m47566(jArr);
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
        long j3 = this.f9176;
        C2349 c23410 = new C2349(jM19476, j2 + C7116.m19476(Math.round(d7 * j3), i, j3 - 1));
        return new C9805(c23410, c23410);
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2549(long j) {
        long j2 = j - this.f9181;
        if (!mo2298() || j2 <= this.f9177) {
            return 0L;
        }
        long[] jArr = this.f9178;
        C20782.m47566(jArr);
        double d = (j2 * 256.0d) / this.f9176;
        int iM19505 = C7116.m19505(jArr, (long) d, true);
        long j3 = this.f9179;
        long j4 = (((long) iM19505) * j3) / 100;
        long j5 = jArr[iM19505];
        int i = iM19505 + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iM19505 == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ */
    public final long mo2295() {
        return this.f9179;
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2548() {
        return this.f9181 + ((long) this.f9177);
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ᩸ */
    public final long mo2550() {
        return this.f9180;
    }

    @Override // l.InterfaceC10242
    /* JADX INFO: renamed from: ۫ */
    public final int mo2547() {
        return this.f9175;
    }
}
