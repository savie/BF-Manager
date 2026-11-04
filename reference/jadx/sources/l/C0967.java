package l;

/* JADX INFO: renamed from: l.֨ۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 28JD */
/* JADX INFO: loaded from: classes3.dex */
public class C0967 implements InterfaceC9060 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f3530;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f3531;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f3532;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f3533;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f3534;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f3535;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f3536;

    public C0967(int i, int i2, long j, long j2, boolean z) {
        this.f3532 = j;
        this.f3534 = j2;
        this.f3533 = i2 == -1 ? 1 : i2;
        this.f3535 = i;
        this.f3530 = z;
        if (j == -1) {
            this.f3531 = -1L;
            this.f3536 = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f3531 = j3;
            this.f3536 = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long m3841(long j) {
        return m3840(j);
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2298() {
        return this.f3531 != -1 || this.f3530;
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۙ */
    public final C9805 mo2290(long j) {
        long j2 = this.f3534;
        long j3 = this.f3531;
        if (j3 == -1 && !this.f3530) {
            C2349 c2349 = new C2349(0L, j2);
            return new C9805(c2349, c2349);
        }
        long j4 = (((long) this.f3535) * j) / 8000000;
        int i = this.f3533;
        long j5 = i;
        long jMin = (j4 / j5) * j5;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j5);
        }
        long jMax = j2 + Math.max(jMin, 0L);
        long jM3840 = m3840(jMax);
        C2349 c23410 = new C2349(jM3840, jMax);
        if (j3 == -1 || jM3840 >= j || ((long) i) + jMax >= this.f3532) {
            return new C9805(c23410, c23410);
        }
        long j6 = jMax + ((long) i);
        return new C9805(c23410, new C2349(m3840(j6), j6));
    }

    @Override // l.InterfaceC9060
    /* JADX INFO: renamed from: ۚ */
    public final long mo2295() {
        return this.f3536;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m3840(long j) {
        return (Math.max(0L, j - this.f3534) * 8000000) / ((long) this.f3535);
    }
}
