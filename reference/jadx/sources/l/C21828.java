package l;

/* JADX INFO: renamed from: l.᩷ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U8SG */
/* JADX INFO: loaded from: classes.dex */
public final class C21828 extends AbstractC6166 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f69571;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f69572;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f69573;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f69574;

    public C21828(AbstractC24755 abstractC24755, long j, long j2, boolean z) throws C10639 {
        super(abstractC24755);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new C10639(j, 2, j2);
        }
        boolean z2 = false;
        if (abstractC24755.mo16021() != 1) {
            throw new C10639(0);
        }
        C11328 c11328Mo1592 = abstractC24755.mo1592(0, new C11328(), 0L);
        long jMax = Math.max(0L, j);
        if (!z && !c11328Mo1592.f35691 && jMax != 0 && !c11328Mo1592.f35690) {
            throw new C10639(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? c11328Mo1592.f35696 : Math.max(0L, j2);
        long j3 = c11328Mo1592.f35696;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f69572 = jMax;
        this.f69574 = jMax2;
        this.f69571 = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (c11328Mo1592.f35695 && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z2 = true;
        }
        this.f69573 = z2;
    }

    @Override // l.AbstractC6166, l.AbstractC24755
    /* JADX INFO: renamed from: ۙ */
    public final C11328 mo1592(int i, C11328 c11328, long j) {
        this.f21004.mo1592(0, c11328, 0L);
        long j2 = c11328.f35693;
        long j3 = this.f69572;
        c11328.f35693 = j2 + j3;
        c11328.f35696 = this.f69571;
        c11328.f35695 = this.f69573;
        long j4 = c11328.f35686;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            c11328.f35686 = jMax;
            long j5 = this.f69574;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            c11328.f35686 = jMax - j3;
        }
        long jM19506 = C7116.m19506(j3);
        long j6 = c11328.f35694;
        if (j6 != -9223372036854775807L) {
            c11328.f35694 = j6 + jM19506;
        }
        long j7 = c11328.f35685;
        if (j7 != -9223372036854775807L) {
            c11328.f35685 = j7 + jM19506;
        }
        return c11328;
    }

    @Override // l.AbstractC6166, l.AbstractC24755
    /* JADX INFO: renamed from: ۙ */
    public final C1634 mo1591(int i, C1634 c1634, boolean z) {
        this.f21004.mo1591(0, c1634, z);
        long j = c1634.f5659 - this.f69572;
        long j2 = this.f69571;
        c1634.m5789(c1634.f5656, c1634.f5658, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, C24380.f79095, false);
        return c1634;
    }
}
