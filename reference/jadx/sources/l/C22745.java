package l;

/* JADX INFO: renamed from: l.᩺ۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28JD */
/* JADX INFO: loaded from: classes.dex */
public class C22745 implements InterfaceC6599 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f74083;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f74084;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f74085;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f74086;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f74087;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f74088;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f74089;

    public C22745(int i, int i2, long j, long j2, boolean z) {
        this.f74083 = j;
        this.f74086 = j2;
        this.f74089 = i2 == -1 ? 1 : i2;
        this.f74088 = i;
        this.f74085 = z;
        if (j == -1) {
            this.f74087 = -1L;
            this.f74084 = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f74087 = j3;
            this.f74084 = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long m50409(long j) {
        return m50408(j);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo5382() {
        return this.f74087 != -1 || this.f74085;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۙ */
    public final C12950 mo5381(long j) {
        long j2 = this.f74086;
        long j3 = this.f74087;
        if (j3 == -1 && !this.f74085) {
            C22828 c22828 = new C22828(0L, j2);
            return new C12950(c22828, c22828);
        }
        long j4 = (((long) this.f74088) * j) / 8000000;
        int i = this.f74089;
        long j5 = i;
        long jMin = (j4 / j5) * j5;
        if (j3 != -1) {
            jMin = Math.min(jMin, j3 - j5);
        }
        long jMax = j2 + Math.max(jMin, 0L);
        long jM50408 = m50408(jMax);
        C22828 c22829 = new C22828(jM50408, jMax);
        if (j3 == -1 || jM50408 >= j || ((long) i) + jMax >= this.f74083) {
            return new C12950(c22829, c22829);
        }
        long j6 = jMax + ((long) i);
        return new C12950(c22829, new C22828(m50408(j6), j6));
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۬ */
    public final long mo5383() {
        return this.f74084;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m50408(long j) {
        return (Math.max(0L, j - this.f74086) * 8000000) / ((long) this.f74088);
    }
}
