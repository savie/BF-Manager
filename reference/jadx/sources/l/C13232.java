package l;

/* JADX INFO: renamed from: l.۫ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R790 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13232 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f42291;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5775 f42292;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f42293;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f42294;

    public /* synthetic */ C13232(C5775 c5775, long j, int i) {
        this(c5775, j);
    }

    public C13232(C5775 c5775, long j) {
        this.f42291 = -9223372036854775807L;
        this.f42294 = Long.MIN_VALUE;
        this.f42292 = c5775;
        this.f42293 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13232 m32779(C5775 c5775, long j) {
        C13232 c13232 = new C13232(c5775, C25227.FOREVER_NS);
        c13232.f42291 = j;
        return c13232;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m32782(C13232 c13232) {
        return c13232.f42291 == -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static long m32784(C13232 c13232) {
        long j = c13232.f42291;
        return j == -9223372036854775807L ? C16961.m40007(c13232.f42294, c13232.f42292.f19841) : j;
    }
}
