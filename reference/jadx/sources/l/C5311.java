package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۚ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6UH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5311 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f18688;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f18689;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f18690;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f18691;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f18692;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public char[] f18693;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f18694;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m15947(int i, int i2, boolean z) {
        return (((((long) i) * (z ? 1L : 2L)) + 23) & (-8)) + 64 + (((((long) i2) * 4) + 23) & (-8));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m15961() {
        return this.f18692;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m15957() {
        return this.f18690;
    }

    public C5311(int i, char[] cArr, int i2, int i3, int i4, boolean z) {
        int i5;
        this.f18691 = new int[i4];
        int i6 = 0;
        if (z) {
            this.f18688 = new byte[i];
            i5 = 0;
            while (i6 < i3) {
                char c = cArr[i2 + i6];
                if (c > 255) {
                    throw new IllegalArgumentException("Invalid page character representation");
                }
                this.f18688[i6] = (byte) c;
                if (c == '\n') {
                    this.f18691[i5] = i6;
                    i5++;
                }
                i6++;
            }
        } else {
            char[] cArr2 = new char[i];
            this.f18693 = cArr2;
            System.arraycopy(cArr, i2, cArr2, 0, i3);
            i5 = 0;
            while (i6 < i3) {
                if (cArr[i2 + i6] == '\n') {
                    this.f18691[i5] = i6;
                    i5++;
                }
                i6++;
            }
        }
        if (i5 != i4) {
            throw new IllegalArgumentException("Invalid page newline count");
        }
        this.f18692 = i3;
        this.f18690 = i4;
        this.f18694 = i3;
        this.f18689 = i;
    }

    public C5311(int i, int i2, int i3, boolean z) {
        this.f18692 = i2;
        this.f18690 = i3;
        this.f18694 = i2;
        this.f18689 = i;
        if (z) {
            this.f18688 = new byte[i];
        } else {
            this.f18693 = new char[i];
        }
        this.f18691 = new int[i3];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15951(byte[] bArr, int i, int i2, int i3, int i4) throws IOException {
        int i5 = i + i2;
        byte[] bArr2 = this.f18688;
        if (bArr2 != null) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            while (i < i5) {
                if (bArr[i] == 10) {
                    if (i4 >= this.f18690) {
                        throw new IOException("Invalid page newline count");
                    }
                    this.f18691[i4] = i3;
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
            this.f18693[i3] = c;
            if (c == '\n') {
                if (i4 >= this.f18690) {
                    throw new IOException("Invalid page newline count");
                }
                this.f18691[i4] = i3;
                i4++;
            }
            i3++;
        }
        return i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15954(boolean z, int i, byte[] bArr, int i2, int i3) {
        int iMax = Math.max(0, Math.min(i2, this.f18694) - i);
        m15949(z, i, bArr, iMax, i3);
        int iMax2 = Math.max(i, this.f18694);
        if (i2 > iMax2) {
            m15949(z, (this.f18689 + iMax2) - this.f18694, bArr, i2 - iMax2, (iMax * (z ? 1 : 2)) + i3);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m15949(boolean z, int i, byte[] bArr, int i2, int i3) {
        if (i2 == 0) {
            return;
        }
        int i4 = i + i2;
        if (z) {
            byte[] bArr2 = this.f18688;
            if (bArr2 != null) {
                System.arraycopy(bArr2, i, bArr, i3, i2);
                return;
            }
            while (i < i4) {
                bArr[i3] = (byte) this.f18693[i];
                i++;
                i3++;
            }
            return;
        }
        if (this.f18693 == null) {
            while (i < i4) {
                int i5 = i3 + 1;
                bArr[i3] = this.f18688[i];
                i3 += 2;
                bArr[i5] = 0;
                i++;
            }
            return;
        }
        while (i < i4) {
            char c = this.f18693[i];
            int i6 = i3 + 1;
            bArr[i3] = (byte) c;
            i3 += 2;
            bArr[i6] = (byte) (c >>> '\b');
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m15952() {
        return m15947(m15958(), this.f18690, m15956());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m15958() {
        byte[] bArr = this.f18688;
        return bArr != null ? bArr.length : this.f18693.length;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m15956() {
        return this.f18688 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m15950(int i) {
        int i2 = this.f18694;
        if (i >= i2) {
            i = (i + this.f18689) - i2;
        }
        byte[] bArr = this.f18688;
        return bArr != null ? (char) (bArr[i] & 255) : this.f18693[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15953(int i, int i2, char[] cArr, int i3) {
        int iMax = Math.max(0, Math.min(i2, this.f18694) - i);
        m15948(i, iMax, cArr, i3);
        int iMax2 = Math.max(i, this.f18694);
        int i4 = i2 - iMax2;
        if (i4 > 0) {
            m15948((iMax2 + this.f18689) - this.f18694, i4, cArr, i3 + iMax);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m15948(int i, int i2, char[] cArr, int i3) {
        if (this.f18688 == null) {
            System.arraycopy(this.f18693, i, cArr, i3, i2);
            return;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i3 + i4] = (char) (this.f18688[i + i4] & 255);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5311 m15960(int i, int i2, char[] cArr, int i3) {
        boolean z;
        if (this.f18688 == null) {
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
        C5311 c5311 = new C5311();
        c5311.f18692 = this.f18692;
        c5311.f18694 = this.f18694;
        c5311.f18689 = this.f18689;
        if (z || this.f18693 != null) {
            char[] cArr2 = new char[m15958()];
            c5311.f18693 = cArr2;
            m15953(0, c5311.f18694, cArr2, 0);
            m15953(c5311.f18694, c5311.f18692, c5311.f18693, c5311.f18689);
        } else {
            c5311.f18688 = (byte[]) this.f18688.clone();
        }
        c5311.f18690 = this.f18690;
        c5311.f18691 = this.f18691;
        int iM15959 = c5311.m15959(i);
        int iM159510 = c5311.m15959(i2);
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (cArr[i6] == '\n') {
                i5++;
            }
        }
        int i7 = (c5311.f18690 - (iM159510 - iM15959)) + i5;
        int[] iArr = new int[i7];
        System.arraycopy(c5311.f18691, 0, iArr, 0, iM15959);
        int i8 = iM15959;
        for (int i9 = 0; i9 < i3; i9++) {
            if (cArr[i9] == '\n') {
                iArr[i8] = i + i9;
                i8++;
            }
        }
        int i10 = i2 - i;
        int i11 = i3 - i10;
        int i12 = iM15959 + i5;
        while (iM159510 < c5311.f18690) {
            iArr[i12] = c5311.f18691[iM159510] + i11;
            iM159510++;
            i12++;
        }
        char[] cArr3 = c5311.f18688;
        if (cArr3 == null) {
            cArr3 = c5311.f18693;
        }
        int i13 = c5311.f18694;
        if (i < i13) {
            int i14 = i13 - i;
            System.arraycopy(cArr3, i, cArr3, c5311.f18689 - i14, i14);
            c5311.f18689 -= i14;
        } else if (i > i13) {
            int i15 = i - i13;
            System.arraycopy(cArr3, c5311.f18689, cArr3, i13, i15);
            c5311.f18689 += i15;
        }
        c5311.f18694 = i;
        c5311.f18689 += i10;
        if (c5311.f18688 != null) {
            for (int i16 = 0; i16 < i3; i16++) {
                c5311.f18688[c5311.f18694 + i16] = (byte) cArr[i16];
            }
        } else {
            System.arraycopy(cArr, 0, c5311.f18693, i, i3);
        }
        c5311.f18694 += i3;
        c5311.f18692 += i11;
        c5311.f18691 = iArr;
        c5311.f18690 = i7;
        return c5311;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m15959(int i) {
        int i2 = this.f18690;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (i3 + i2) >>> 1;
            if (this.f18691[i4] < i) {
                i3 = i4 + 1;
            } else {
                i2 = i4;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m15955(int i) {
        return this.f18691[i];
    }
}
