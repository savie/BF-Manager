package l;

/* JADX INFO: renamed from: l.᩵֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5C3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20238 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f64941;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f64942;

    public C20238(byte[] bArr) {
        this.f64941 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m46508() {
        int i = this.f64942;
        byte[] bArr = this.f64941;
        int i2 = (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f64942 = i + 4;
        return i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final short m46510() {
        int i = this.f64942;
        byte[] bArr = this.f64941;
        short s = (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
        this.f64942 = i + 2;
        return s;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m46509(int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.f64941, this.f64942, bArr, 0, i);
        this.f64942 += i;
        return bArr;
    }
}
