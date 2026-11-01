package l;

/* JADX INFO: renamed from: l.۠֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E2OW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7867 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m20766(double d) {
        C18304.m42516("not a normal value", m20767(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m20767(double d) {
        return Math.getExponent(d) <= 1023;
    }
}
