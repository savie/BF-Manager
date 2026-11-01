package l;

/* JADX INFO: renamed from: l.ۡ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8574 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f29651 = new byte[0];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m22350(int i, int i2, byte[] bArr) {
        if (i <= bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) Math.max(Math.min(((long) bArr.length) + ((long) (bArr.length >> 1)), 2147483639L), i)];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }
}
