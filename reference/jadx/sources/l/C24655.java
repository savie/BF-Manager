package l;

/* JADX INFO: renamed from: l.᩺᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6VI */
/* JADX INFO: loaded from: classes.dex */
public final class C24655 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f79808;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f79809;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f79810;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f79811;

    public C24655(int i, int i2) {
        if (i < 0 || i2 < 1 || i2 > 4) {
            throw new IllegalArgumentException("Invalid syntax chunk plan");
        }
        this.f79811 = i;
        this.f79809 = i2;
        long j = i;
        long j2 = i2 * 2;
        int iMax = (int) Math.max(8192L, Math.min(65536L, ((j + j2) - 1) / j2));
        this.f79810 = iMax;
        this.f79808 = Math.max(1, (int) (((j + ((long) iMax)) - 1) / ((long) iMax)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m55013(int i) {
        C17359.checkIndex(i, this.f79808);
        return (int) Math.min(this.f79811, (((long) i) + 1) * ((long) this.f79810));
    }
}
