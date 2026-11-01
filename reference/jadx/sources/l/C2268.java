package l;

/* JADX INFO: renamed from: l.ۖۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AR8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2268 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m6950(int i, long j) {
        int i2 = (int) j;
        if (i2 != j) {
            throw new ArithmeticException("integer overflow");
        }
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) >= 0) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }
}
