package l;

/* JADX INFO: renamed from: l.᩵ܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8SS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19548 extends AbstractC8965 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f62824;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f62825;

    public C19548(long j, long j2) {
        this.f62825 = j2;
        this.f62824 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19548 m44639(C2460 c2460, int i, long j) {
        long jM7532 = c2460.m7532();
        int i2 = i - 4;
        c2460.m7507(0, i2, new byte[i2]);
        return new C19548(jM7532, j);
    }

    @Override // l.AbstractC8965
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f62825);
        sb.append(", identifier= ");
        return C15037.m36023(sb, this.f62824, " }");
    }
}
