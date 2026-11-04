package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ܳۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TB */
/* JADX INFO: loaded from: classes5.dex */
public final class C15288 extends AbstractC24755 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Object f49974 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f49975;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f49976;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f49977;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f49978;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14902 f49979;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f49980;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f49981;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f49982;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f49983;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C3716 f49984;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f49985 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f49986;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f49987;

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ۙ */
    public final int mo16021() {
        return 1;
    }

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ᩷ */
    public final int mo16022() {
        return 1;
    }

    static {
        C2225 c2225 = new C2225();
        c2225.m7573("SinglePeriodTimeline");
        c2225.m7571(Uri.EMPTY);
        c2225.m7570();
    }

    public C15288(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, C11306 c11306, C14902 c14902, C3716 c3716) {
        this.f49975 = j;
        this.f49981 = j2;
        this.f49976 = j3;
        this.f49982 = j4;
        this.f49983 = j5;
        this.f49987 = j6;
        this.f49986 = z;
        this.f49977 = z2;
        this.f49978 = z3;
        this.f49980 = c11306;
        c14902.getClass();
        this.f49979 = c14902;
        this.f49984 = c3716;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[PHI: r1
      0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ۙ */
    public final C11328 mo1592(int i, C11328 c11328, long j) {
        long j2;
        C20782.m47561(i, 1);
        long j3 = this.f49987;
        boolean z = this.f49977;
        if (!z || this.f49978 || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.f49982;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        Object obj = C11328.f35682;
        c11328.m28619(this.f49979, this.f49980, this.f49975, this.f49981, this.f49985, this.f49986, z, this.f49984, j2, this.f49982, this.f49983);
        return c11328;
    }

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ۙ */
    public final C1634 mo1591(int i, C1634 c1634, boolean z) {
        C20782.m47561(i, 1);
        Object obj = z ? f49974 : null;
        long j = -this.f49983;
        c1634.getClass();
        c1634.m5789(null, obj, 0, this.f49976, j, C24380.f79095, false);
        return c1634;
    }

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ۙ */
    public final int mo1588(Object obj) {
        return f49974.equals(obj) ? 0 : -1;
    }

    @Override // l.AbstractC24755
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1589(int i) {
        C20782.m47561(i, 1);
        return f49974;
    }
}
