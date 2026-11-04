package l;

/* JADX INFO: renamed from: l.ۗۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9WX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3399 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f11054;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f11055;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f11056;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f11058 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3399 f11057 = this;

    public C3399(byte[] bArr, int i) {
        this.f11054 = bArr;
        this.f11055 = i;
        this.f11056 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3399 m11132(int i) {
        C3399 c3399 = new C3399(this.f11054, this.f11056);
        c3399.f11055 = i;
        c3399.f11057 = this.f11057;
        return c3399;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11128(int i) {
        int i2 = this.f11055 + i;
        this.f11055 = i2;
        int i3 = this.f11056;
        int i4 = i2 - i3;
        C3399 c3399 = this.f11057;
        if (i4 > c3399.f11058) {
            c3399.f11058 = i2 - i3;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11136(int i) {
        int i2 = i - 1;
        int i3 = this.f11055 - this.f11056;
        m11128(((~i2) & (i3 + i2)) - i3);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m11133(int i) {
        this.f11054[this.f11055] = (byte) (i & 255);
        m11128(1);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m11131() {
        int i = this.f11054[this.f11055] & 255;
        m11128(1);
        return i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m11134(int i) {
        m11136(2);
        short s = (short) i;
        int i2 = this.f11055;
        byte[] bArr = this.f11054;
        bArr[i2] = (byte) (s & 255);
        bArr[i2 + 1] = (byte) ((s >> 8) & 255);
        m11128(2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m11135() {
        m11136(2);
        short sM46472 = C20203.m46472(this.f11055, this.f11054);
        m11128(2);
        return sM46472;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m11138(int i) {
        m11136(4);
        C20203.m46473(i, this.f11055, this.f11054);
        m11128(4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11127() {
        m11136(4);
        int iM46474 = C20203.m46474(this.f11055, this.f11054);
        m11128(4);
        return iM46474;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11130(String str) {
        m11136(4);
        int i = this.f11055;
        int length = str.length();
        int i2 = length + 1;
        byte[] bArr = this.f11054;
        C20203.m46473(i2, i, bArr);
        C20203.m46473(0, i + 4, bArr);
        C20203.m46473(i2, i + 8, bArr);
        int i3 = i + 12;
        int i4 = length * 2;
        System.arraycopy(C23933.m53455(str), 0, bArr, i3, i4);
        int i5 = i3 + i4;
        bArr[i5] = 0;
        bArr[i5 + 1] = 0;
        m11128((i5 + 2) - this.f11055);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m11137() throws C20553 {
        String strM53453;
        m11136(4);
        int i = this.f11055;
        byte[] bArr = this.f11054;
        int iM46474 = C20203.m46474(i, bArr);
        int i2 = i + 12;
        if (iM46474 != 0) {
            int i3 = (iM46474 - 1) * 2;
            if (i3 < 0 || i3 > 65535) {
                throw new C20553("invalid array conformance");
            }
            strM53453 = C23933.m53453(i2, i3, bArr);
            i2 += i3 + 2;
        } else {
            strM53453 = null;
        }
        m11128(i2 - this.f11055);
        return strM53453;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11129(Object obj) {
        if (obj == null) {
            m11138(0);
        } else {
            m11138(System.identityHashCode(obj));
        }
    }

    public final String toString() {
        return "start=" + this.f11056 + ",index=" + this.f11055 + ",length=" + this.f11057.f11058;
    }
}
