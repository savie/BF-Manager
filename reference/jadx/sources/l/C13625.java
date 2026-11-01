package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܰۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6UH */
/* JADX INFO: loaded from: classes3.dex */
public final class C13625 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f44943;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f44944;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f44945;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f44946;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f44947;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char[] f44948;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f44949;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m33302(int i, int i2, boolean z) {
        return (((((long) i) * (z ? 1L : 2L)) + 23) & (-8)) + 64 + (((((long) i2) * 4) + 23) & (-8));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m33305() {
        return this.f44946;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m33311() {
        return this.f44943;
    }

    public C13625(int i, char[] cArr, int i2, int i3, int i4, boolean z) {
        int i5;
        this.f44949 = new int[i4];
        int i6 = 0;
        if (z) {
            this.f44945 = new byte[i];
            i5 = 0;
            while (i6 < i3) {
                char c = cArr[i2 + i6];
                if (c > 255) {
                    throw new IllegalArgumentException("Invalid page character representation");
                }
                this.f44945[i6] = (byte) c;
                if (c == '\n') {
                    this.f44949[i5] = i6;
                    i5++;
                }
                i6++;
            }
        } else {
            char[] cArr2 = new char[i];
            this.f44948 = cArr2;
            System.arraycopy(cArr, i2, cArr2, 0, i3);
            i5 = 0;
            while (i6 < i3) {
                if (cArr[i2 + i6] == '\n') {
                    this.f44949[i5] = i6;
                    i5++;
                }
                i6++;
            }
        }
        if (i5 != i4) {
            throw new IllegalArgumentException("Invalid page newline count");
        }
        this.f44946 = i3;
        this.f44943 = i4;
        this.f44944 = i3;
        this.f44947 = i;
    }

    public C13625(int i, int i2, int i3, boolean z) {
        this.f44946 = i2;
        this.f44943 = i3;
        this.f44944 = i2;
        this.f44947 = i;
        if (z) {
            this.f44945 = new byte[i];
        } else {
            this.f44948 = new char[i];
        }
        this.f44949 = new int[i3];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33307(byte[] bArr, int i, int i2, int i3, int i4) throws IOException {
        int i5 = i + i2;
        byte[] bArr2 = this.f44945;
        if (bArr2 != null) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            while (i < i5) {
                if (bArr[i] == 10) {
                    if (i4 >= this.f44943) {
                        throw new IOException("Invalid page newline count");
                    }
                    this.f44949[i4] = i3;
                    i4++;
                }
                i++;
                i3++;
            }
            return i4;
        }
        while (i < i5) {
            int i6 = i + 1;
            int i7 = bArr[i] & 255;
            i += 2;
            char c = (char) (((bArr[i6] & 255) << 8) | i7);
            this.f44948[i3] = c;
            if (c == '\n') {
                if (i4 >= this.f44943) {
                    throw new IOException("Invalid page newline count");
                }
                this.f44949[i4] = i3;
                i4++;
            }
            i3++;
        }
        return i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33310(boolean z, int i, byte[] bArr, int i2, int i3) {
        int iMax = Math.max(0, Math.min(i2, this.f44944) - i);
        m33304(z, i, bArr, iMax, i3);
        int iMax2 = Math.max(i, this.f44944);
        if (i2 > iMax2) {
            m33304(z, (this.f44947 + iMax2) - this.f44944, bArr, i2 - iMax2, (iMax * (z ? 1 : 2)) + i3);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m33304(boolean z, int i, byte[] bArr, int i2, int i3) {
        if (i2 == 0) {
            return;
        }
        int i4 = i + i2;
        if (z) {
            byte[] bArr2 = this.f44945;
            if (bArr2 != null) {
                System.arraycopy(bArr2, i, bArr, i3, i2);
                return;
            }
            while (i < i4) {
                bArr[i3] = (byte) this.f44948[i];
                i++;
                i3++;
            }
            return;
        }
        if (this.f44948 == null) {
            while (i < i4) {
                int i5 = i3 + 1;
                bArr[i3] = this.f44945[i];
                i3 += 2;
                bArr[i5] = 0;
                i++;
            }
            return;
        }
        while (i < i4) {
            char c = this.f44948[i];
            int i6 = i3 + 1;
            bArr[i3] = (byte) c;
            i3 += 2;
            bArr[i6] = (byte) (c >>> '\b');
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m33308() {
        return m33302(m33314(), this.f44943, m33313());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m33314() {
        byte[] bArr = this.f44945;
        return bArr != null ? bArr.length : this.f44948.length;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m33313() {
        return this.f44945 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m33306(int i) {
        int i2 = this.f44944;
        if (i >= i2) {
            i = (i + this.f44947) - i2;
        }
        byte[] bArr = this.f44945;
        return bArr != null ? (char) (bArr[i] & 255) : this.f44948[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33309(int i, int i2, char[] cArr, int i3) {
        int iMax = Math.max(0, Math.min(i2, this.f44944) - i);
        m33303(i, iMax, cArr, i3);
        int iMax2 = Math.max(i, this.f44944);
        int i4 = i2 - iMax2;
        if (i4 > 0) {
            m33303((iMax2 + this.f44947) - this.f44944, i4, cArr, i3 + iMax);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m33303(int i, int i2, char[] cArr, int i3) {
        if (this.f44945 == null) {
            System.arraycopy(this.f44948, i, cArr, i3, i2);
            return;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i3 + i4] = (char) (this.f44945[i + i4] & 255);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13625 m33316(int i, int i2, char[] cArr, int i3) {
        boolean z;
        if (this.f44945 == null) {
            z = false;
            break;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                z = false;
                break;
            }
            if (cArr[i4] > 255) {
                z = true;
                break;
            }
            i4++;
        }
        C13625 c13625 = new C13625();
        c13625.f44946 = this.f44946;
        c13625.f44944 = this.f44944;
        c13625.f44947 = this.f44947;
        if (z || this.f44948 != null) {
            char[] cArr2 = new char[m33314()];
            c13625.f44948 = cArr2;
            m33309(0, c13625.f44944, cArr2, 0);
            m33309(c13625.f44944, c13625.f44946, c13625.f44948, c13625.f44947);
        } else {
            c13625.f44945 = (byte[]) this.f44945.clone();
        }
        c13625.f44943 = this.f44943;
        c13625.f44949 = this.f44949;
        int iM33315 = c13625.m33315(i);
        int iM33316 = c13625.m33315(i2);
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (cArr[i6] == '\n') {
                i5++;
            }
        }
        int i7 = (c13625.f44943 - (iM33316 - iM33315)) + i5;
        int[] iArr = new int[i7];
        System.arraycopy(c13625.f44949, 0, iArr, 0, iM33315);
        int i8 = iM33315;
        for (int i9 = 0; i9 < i3; i9++) {
            if (cArr[i9] == '\n') {
                iArr[i8] = i + i9;
                i8++;
            }
        }
        int i10 = i2 - i;
        int i11 = i3 - i10;
        int i12 = iM33315 + i5;
        while (iM33316 < c13625.f44943) {
            iArr[i12] = c13625.f44949[iM33316] + i11;
            iM33316++;
            i12++;
        }
        char[] cArr3 = c13625.f44945;
        if (cArr3 == null) {
            cArr3 = c13625.f44948;
        }
        int i13 = c13625.f44944;
        if (i < i13) {
            int i14 = i13 - i;
            System.arraycopy(cArr3, i, cArr3, c13625.f44947 - i14, i14);
            c13625.f44947 -= i14;
        } else if (i > i13) {
            int i15 = i - i13;
            System.arraycopy(cArr3, c13625.f44947, cArr3, i13, i15);
            c13625.f44947 += i15;
        }
        c13625.f44944 = i;
        c13625.f44947 += i10;
        if (c13625.f44945 != null) {
            for (int i16 = 0; i16 < i3; i16++) {
                c13625.f44945[c13625.f44944 + i16] = (byte) cArr[i16];
            }
        } else {
            System.arraycopy(cArr, 0, c13625.f44948, i, i3);
        }
        c13625.f44944 += i3;
        c13625.f44946 += i11;
        c13625.f44949 = iArr;
        c13625.f44943 = i7;
        return c13625;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m33315(int i) {
        int i2 = this.f44943;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (i3 + i2) >>> 1;
            if (this.f44949[i4] < i) {
                i3 = i4 + 1;
            } else {
                i2 = i4;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m33312(int i) {
        return this.f44949[i];
    }
}
