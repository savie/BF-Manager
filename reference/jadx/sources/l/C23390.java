package l;

/* JADX INFO: renamed from: l.᩻֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 365A */
/* JADX INFO: loaded from: classes.dex */
public final class C23390 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m51532(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long[] m51533(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        C18304.m42512(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i));
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }
}
