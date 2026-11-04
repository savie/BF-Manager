package l;

/* JADX INFO: renamed from: l.ۘۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 88UO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f13471;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f13472;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f13473;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f13474;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f13475;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f13476;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f13477;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f13478;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m12660(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return C7116.m19476(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }

    public C3950(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f13474 = j;
        this.f13472 = j2;
        this.f13476 = j3;
        this.f13473 = j4;
        this.f13478 = j5;
        this.f13477 = j6;
        this.f13471 = j7;
        this.f13475 = m12660(j2, j3, j4, j5, j6, j7);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m12665(C3950 c3950) {
        return c3950.f13478;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m12661(C3950 c3950) {
        return c3950.f13477;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static long m12664(C3950 c3950) {
        return c3950.f13472;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static long m12667(C3950 c3950) {
        return c3950.f13474;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m12666(C3950 c3950, long j, long j2) {
        c3950.f13476 = j;
        c3950.f13478 = j2;
        c3950.f13475 = m12660(c3950.f13472, j, c3950.f13473, j2, c3950.f13477, c3950.f13471);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12662(C3950 c3950, long j, long j2) {
        c3950.f13473 = j;
        c3950.f13477 = j2;
        c3950.f13475 = m12660(c3950.f13472, c3950.f13476, j, c3950.f13478, j2, c3950.f13471);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static long m12663(C3950 c3950) {
        return c3950.f13475;
    }
}
