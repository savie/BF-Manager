package l;

/* JADX INFO: renamed from: l.ۗ֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29H7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3089 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23227 m10063(C25134 c25134) {
        return new C23227(c25134.m56012() | (c25134.m56012() << 32));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10064(C23227 c23227, C25134 c25134) {
        long jM52143 = c23227.m52143();
        c25134.m56025(jM52143 & 4294967295L);
        c25134.m56025((jM52143 >> 32) & 4294967295L);
    }
}
