package l;

/* JADX INFO: renamed from: l.֡۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41SC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0432 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f1994;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f1995;

    public C0432(int i) {
        if (i < 1 || i > 256) {
            throw new IllegalArgumentException(C8479.m22141(i, "Invalid distance: "));
        }
        this.f1994 = i;
        this.f1995 = new byte[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2253(int i, int i2, byte[] bArr) {
        byte[] bArr2;
        int i3 = this.f1994;
        int iMin = Math.min(i2, i3);
        int i4 = 0;
        while (true) {
            bArr2 = this.f1995;
            if (i4 >= iMin) {
                break;
            }
            int i5 = i + i4;
            bArr[i5] = (byte) (bArr[i5] + bArr2[i4]);
            i4++;
        }
        while (i4 < i2) {
            int i6 = i + i4;
            bArr[i6] = (byte) (bArr[i6] + bArr[i6 - i3]);
            i4++;
        }
        if (i2 >= i3) {
            System.arraycopy(bArr, (i + i2) - i3, bArr2, 0, i3);
        } else {
            System.arraycopy(bArr2, i4, bArr2, 0, i3 - i4);
            System.arraycopy(bArr, i, bArr2, i3 - i4, i2);
        }
    }
}
