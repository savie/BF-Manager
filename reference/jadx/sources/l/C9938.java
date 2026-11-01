package l;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۤ֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U58U */
/* JADX INFO: loaded from: classes3.dex */
public final class C9938 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C9938 f33923 = new C9938();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public short f33924;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C7821 f33925;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C9938 f33926;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f33927;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C20291 f33928;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f33929;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f33930;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C9938 f33931;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public short f33932;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public short f33933;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public short f33934;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public short f33935;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public short f33936;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C21226 f33937;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9938 m25139() {
        C7821 c7821 = this.f33925;
        return c7821 == null ? this : c7821.f25745;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25140(int i) {
        short s = this.f33932;
        if ((s & 128) == 0) {
            this.f33932 = (short) (s | 128);
            this.f33924 = (short) i;
            return;
        }
        if (this.f33929 == null) {
            this.f33929 = new int[4];
        }
        int[] iArr = this.f33929;
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        if (i2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f33929 = iArr2;
        }
        this.f33929[i2] = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25144(AbstractC20521 abstractC20521, boolean z) {
        abstractC20521.mo35164(this);
        if (!z || (this.f33932 & 128) == 0) {
            return;
        }
        abstractC20521.mo35174(this.f33924 & HPKE.aead_EXPORT_ONLY, this);
        if (this.f33929 == null) {
            return;
        }
        int i = 1;
        while (true) {
            int[] iArr = this.f33929;
            if (i > iArr[0]) {
                return;
            }
            abstractC20521.mo35174(iArr[i], this);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25142(C2175 c2175, int i, boolean z) {
        if ((this.f33932 & 4) != 0) {
            if (z) {
                c2175.m6773(this.f33927 - i);
                return;
            } else {
                c2175.m6771(this.f33927 - i);
                return;
            }
        }
        if (z) {
            m25137(i, 536870912, c2175.f7888);
            c2175.m6773(-1);
        } else {
            m25137(i, 268435456, c2175.f7888);
            c2175.m6771(-1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25141(C2175 c2175) {
        if ((this.f33932 & 4) == 0) {
            m25137(0, 805306368, c2175.f7888);
        }
        c2175.m6771(this.f33927);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25137(int i, int i2, int i3) {
        if (this.f33930 == null) {
            this.f33930 = new int[6];
        }
        int[] iArr = this.f33930;
        int i4 = iArr[0];
        int i5 = i4 + 2;
        if (i5 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f33930 = iArr2;
        }
        int[] iArr3 = this.f33930;
        iArr3[i4 + 1] = i;
        iArr3[i5] = i2 | i3;
        iArr3[0] = i5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25146(byte[] bArr, C2175 c2175, int i) {
        this.f33932 = (short) (this.f33932 | 4);
        this.f33927 = i;
        int[] iArr = this.f33930;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.f33930;
            int i3 = iArr2[i2 - 1];
            int i4 = iArr2[i2];
            int i5 = i - i3;
            int i6 = 268435455 & i4;
            int i7 = i4 & (-268435456);
            if (i7 == 268435456) {
                if (i5 < -32768 || i5 > 32767) {
                    int i8 = bArr[i3] & 255;
                    if (i8 < 198) {
                        bArr[i3] = (byte) (i8 + 49);
                    } else {
                        bArr[i3] = (byte) (i8 + 20);
                    }
                    z = true;
                }
                bArr[i6] = (byte) (i5 >>> 8);
                bArr[i6 + 1] = (byte) i5;
            } else if (i7 == 536870912) {
                bArr[i6] = (byte) (i5 >>> 24);
                bArr[i6 + 1] = (byte) (i5 >>> 16);
                bArr[i6 + 2] = (byte) (i5 >>> 8);
                bArr[i6 + 3] = (byte) i5;
            } else {
                byte[] bArr2 = c2175.f7887;
                bArr2[i6] = (byte) (i >>> 8);
                bArr2[i6 + 1] = (byte) i;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25145(short s) {
        C9938 c9938 = f33923;
        this.f33926 = c9938;
        C9938 c9938M25138 = this;
        while (c9938M25138 != c9938) {
            C9938 c9939 = c9938M25138.f33926;
            c9938M25138.f33926 = null;
            if (c9938M25138.f33934 == 0) {
                c9938M25138.f33934 = s;
                c9938M25138 = c9938M25138.m25138(c9939);
            } else {
                c9938M25138 = c9939;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25143(C9938 c9938) {
        C9938 c9939 = f33923;
        this.f33926 = c9939;
        C9938 c9938M25138 = this;
        C9938 c99310 = c9939;
        while (c9938M25138 != c9939) {
            C9938 c99311 = c9938M25138.f33926;
            c9938M25138.f33926 = c99310;
            if ((c9938M25138.f33932 & 64) != 0 && c9938M25138.f33934 != c9938.f33934) {
                c9938M25138.f33937 = new C21226(c9938M25138.f33935, c9938.f33937.f69143, c9938M25138.f33937);
            }
            c99310 = c9938M25138;
            c9938M25138 = c9938M25138.m25138(c99311);
        }
        while (c99310 != c9939) {
            C9938 c99312 = c99310.f33926;
            c99310.f33926 = null;
            c99310 = c99312;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C9938 m25138(C9938 c9938) {
        for (C21226 c21226 = this.f33937; c21226 != null; c21226 = c21226.f69144) {
            if ((this.f33932 & 16) == 0 || c21226 != this.f33937.f69144) {
                C9938 c9939 = c21226.f69143;
                if (c9939.f33926 == null) {
                    c9939.f33926 = c9938;
                    c9938 = c9939;
                }
            }
        }
        return c9938;
    }

    public final String toString() {
        return C8479.m22141(System.identityHashCode(this), "L");
    }
}
