package l;

/* JADX INFO: renamed from: l.᩸ܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: H8SS */
/* JADX INFO: loaded from: classes.dex */
public final class C22923 extends AbstractC19939 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f74495;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f74496;

    public C22923(long j, long j2) {
        this.f74496 = j2;
        this.f74495 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22923 m51681(C21287 c21287, int i, long j) {
        long jM48485 = c21287.m48485();
        int i2 = i - 4;
        c21287.m48490(0, i2, new byte[i2]);
        return new C22923(jM48485, j);
    }

    @Override // l.AbstractC19939
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f74496);
        sb.append(", identifier= ");
        return C2764.m9137(sb, this.f74495, " }");
    }
}
