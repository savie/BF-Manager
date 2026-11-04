package l;

/* JADX INFO: renamed from: l.ۢۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C9934 extends AbstractC10919 {
    @Override // l.AbstractC10919
    /* JADX INFO: renamed from: ۙ */
    public final long[] mo15749(Object obj) {
        C5184 c5184 = (C5184) obj;
        return new long[]{c5184.getYear(), c5184.getMonthValue()};
    }

    @Override // l.AbstractC10919
    /* JADX INFO: renamed from: ۙ */
    public final Object mo15748(long[] jArr) {
        long j = jArr[0];
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        long j2 = jArr[1];
        int i2 = (int) j2;
        if (j2 == i2) {
            return C5184.of(i, i2);
        }
        throw new ArithmeticException();
    }
}
