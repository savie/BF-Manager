package l;

/* JADX INFO: renamed from: l.ᩳۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18885 extends AbstractC10919 {
    @Override // l.AbstractC10919
    /* JADX INFO: renamed from: ۙ */
    public final long[] mo15749(Object obj) {
        return new long[]{((C13781) obj).getValue()};
    }

    @Override // l.AbstractC10919
    /* JADX INFO: renamed from: ۙ */
    public final Object mo15748(long[] jArr) {
        long j = jArr[0];
        int i = (int) j;
        if (j == i) {
            return C13781.of(i);
        }
        throw new ArithmeticException();
    }
}
