package l;

/* JADX INFO: renamed from: l.ܿܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X9WX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17426 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f55441;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f55442;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f55443;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f55440 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17426 f55444 = this;

    public C17426(byte[] bArr, int i) {
        this.f55441 = bArr;
        this.f55443 = i;
        this.f55442 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17426 m40629(int i) {
        C17426 c17426 = new C17426(this.f55441, this.f55442);
        c17426.f55443 = i;
        c17426.f55444 = this.f55444;
        return c17426;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40624(int i) {
        int i2 = this.f55443 + i;
        this.f55443 = i2;
        int i3 = this.f55442;
        int i4 = i2 - i3;
        C17426 c17426 = this.f55444;
        if (i4 > c17426.f55440) {
            c17426.f55440 = i2 - i3;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40631(int i) {
        int i2 = i - 1;
        int i3 = this.f55443 - this.f55442;
        m40624(((~i2) & (i3 + i2)) - i3);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m40632(int i) {
        this.f55441[this.f55443] = (byte) (i & 255);
        m40624(1);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m40628() {
        int i = this.f55441[this.f55443] & 255;
        m40624(1);
        return i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m40627(int i) {
        m40631(2);
        short s = (short) i;
        int i2 = this.f55443;
        byte[] bArr = this.f55441;
        bArr[i2] = (byte) (s & 255);
        bArr[i2 + 1] = (byte) ((s >> 8) & 255);
        m40624(2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m40630() {
        m40631(2);
        short sM30667 = C12344.m30667(this.f55443, this.f55441);
        m40624(2);
        return sM30667;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m40622(int i) {
        m40631(4);
        C12344.m30668(i, this.f55443, this.f55441);
        m40624(4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40623() {
        m40631(4);
        int iM30662 = C12344.m30662(this.f55443, this.f55441);
        m40624(4);
        return iM30662;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40626(String str) {
        m40631(4);
        int i = this.f55443;
        int length = str.length();
        int i2 = length + 1;
        byte[] bArr = this.f55441;
        C12344.m30668(i2, i, bArr);
        C12344.m30668(0, i + 4, bArr);
        C12344.m30668(i2, i + 8, bArr);
        int i3 = i + 12;
        int i4 = length * 2;
        System.arraycopy(C10933.m27421(str), 0, bArr, i3, i4);
        int i5 = i3 + i4;
        bArr[i5] = 0;
        bArr[i5 + 1] = 0;
        m40624((i5 + 2) - this.f55443);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m40621() throws C6137 {
        String strM27419;
        m40631(4);
        int i = this.f55443;
        byte[] bArr = this.f55441;
        int iM30662 = C12344.m30662(i, bArr);
        int i2 = i + 12;
        if (iM30662 != 0) {
            int i3 = (iM30662 - 1) * 2;
            if (i3 < 0 || i3 > 65535) {
                throw new C6137("invalid array conformance");
            }
            strM27419 = C10933.m27419(i2, i3, bArr);
            i2 += i3 + 2;
        } else {
            strM27419 = null;
        }
        m40624(i2 - this.f55443);
        return strM27419;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40625(Object obj) {
        if (obj == null) {
            m40622(0);
        } else {
            m40622(System.identityHashCode(obj));
        }
    }

    public final String toString() {
        return "start=" + this.f55442 + ",index=" + this.f55443 + ",length=" + this.f55444.f55440;
    }
}
