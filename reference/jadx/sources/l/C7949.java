package l;

/* JADX INFO: renamed from: l.۠ۙܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8SG */
/* JADX INFO: loaded from: classes4.dex */
public final class C7949 extends AbstractC9361 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f26111;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f26112;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f26113;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f26114;

    public C7949(AbstractC16511 abstractC16511, long j, long j2, boolean z) throws C19238 {
        super(abstractC16511);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new C19238(j, 2, j2);
        }
        boolean z2 = false;
        if (abstractC16511.mo19928() != 1) {
            throw new C19238(0);
        }
        C0282 c0282Mo14810 = abstractC16511.mo14810(0, new C0282(), 0L);
        long jMax = Math.max(0L, j);
        if (!z && !c0282Mo14810.f1593 && jMax != 0 && !c0282Mo14810.f1579) {
            throw new C19238(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? c0282Mo14810.f1588 : Math.max(0L, j2);
        long j3 = c0282Mo14810.f1588;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f26114 = jMax;
        this.f26111 = jMax2;
        this.f26113 = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (c0282Mo14810.f1583 && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z2 = true;
        }
        this.f26112 = z2;
    }

    @Override // l.AbstractC9361, l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final C0282 mo14810(int i, C0282 c0282, long j) {
        this.f31719.mo14810(0, c0282, 0L);
        long j2 = c0282.f1589;
        long j3 = this.f26114;
        c0282.f1589 = j2 + j3;
        c0282.f1588 = this.f26113;
        c0282.f1583 = this.f26112;
        long j4 = c0282.f1582;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            c0282.f1582 = jMax;
            long j5 = this.f26111;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            c0282.f1582 = jMax - j3;
        }
        long jM41856 = C17983.m41856(j3);
        long j6 = c0282.f1592;
        if (j6 != -9223372036854775807L) {
            c0282.f1592 = j6 + jM41856;
        }
        long j7 = c0282.f1585;
        if (j7 != -9223372036854775807L) {
            c0282.f1585 = j7 + jM41856;
        }
        return c0282;
    }

    @Override // l.AbstractC9361, l.AbstractC16511
    /* JADX INFO: renamed from: ۙ */
    public final C20039 mo5920(int i, C20039 c20039, boolean z) {
        this.f31719.mo5920(0, c20039, z);
        long j = c20039.f64171 - this.f26114;
        long j2 = this.f26113;
        c20039.m45388(c20039.f64172, c20039.f64174, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, C3392.f12527, false);
        return c20039;
    }
}
