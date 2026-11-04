package l;

/* JADX INFO: renamed from: l.ܳ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C15680 extends AbstractC10919 {
    @Override // l.AbstractC10919
    /* JADX INFO: renamed from: ۙ */
    public final long[] mo15749(Object obj) {
        C8561 c8561 = (C8561) obj;
        return new long[]{c8561.getYears(), c8561.getMonths(), c8561.getDays()};
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
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        long j3 = jArr[2];
        int i3 = (int) j3;
        if (j3 == i3) {
            return C8561.of(i, i2, i3);
        }
        throw new ArithmeticException();
    }
}
