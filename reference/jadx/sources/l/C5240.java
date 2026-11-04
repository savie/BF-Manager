package l;

/* JADX INFO: renamed from: l.ۙ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C5240 extends AbstractC10919 {
    @Override // l.AbstractC10919
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] mo15749(Object obj) {
        C10052 c10052 = (C10052) obj;
        return new long[]{c10052.getHour(), c10052.getMinute(), c10052.getSecond(), c10052.getNano()};
    }

    @Override // l.AbstractC10919
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo15748(long[] jArr) {
        long j = jArr[0];
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        long j2 = jArr[1];
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        long j3 = jArr[2];
        int i3 = (int) j3;
        if (j3 != i3) {
            throw new ArithmeticException();
        }
        long j4 = jArr[3];
        int i4 = (int) j4;
        if (j4 == i4) {
            return C10052.of(i, i2, i3, i4);
        }
        throw new ArithmeticException();
    }
}
