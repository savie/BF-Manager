package l;

/* JADX INFO: renamed from: l.֫ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6VI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1569 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f6311;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f6312;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f6313;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f6314;

    public C1569(int i, int i2) {
        if (i < 0 || i2 < 1 || i2 > 4) {
            throw new IllegalArgumentException("Invalid syntax chunk plan");
        }
        this.f6311 = i;
        this.f6313 = i2;
        long j = i;
        long j2 = i2 * 2;
        int iMax = (int) Math.max(8192L, Math.min(65536L, ((j + j2) - 1) / j2));
        this.f6314 = iMax;
        this.f6312 = Math.max(1, (int) (((j + ((long) iMax)) - 1) / ((long) iMax)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m5370(int i) {
        C13638.checkIndex(i, this.f6312);
        return (int) Math.min(this.f6311, (((long) i) + 1) * ((long) this.f6314));
    }
}
