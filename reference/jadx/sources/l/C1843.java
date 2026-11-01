package l;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1SX */
/* JADX INFO: loaded from: classes2.dex */
public final class C1843 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f7043;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f7047;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f7046 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f7041 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f7045 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f7042 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f7048 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f7044 = 0;

    public C1843(int i, C17720 c17720) {
        this.f7047 = i;
        byte[] bArrMo25183 = c17720.mo25183(i);
        this.f7043 = bArrMo25183;
        bArrMo25183[i - 1] = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6003(C17720 c17720) {
        c17720.mo25181(this.f7043);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m6004() {
        this.f7046 = 0;
        this.f7041 = 0;
        this.f7045 = 0;
        this.f7042 = 0;
        this.f7043[this.f7047 - 1] = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m6006(int i) {
        int i2 = this.f7041;
        int i3 = this.f7047;
        if (i3 - i2 <= i) {
            this.f7042 = i3;
        } else {
            this.f7042 = i2 + i;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m6005() {
        return this.f7041 < this.f7042;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m6007() {
        return this.f7048 > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m5997() {
        return this.f7041;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m5998(int i) {
        int i2 = this.f7041;
        int i3 = (i2 - i) - 1;
        if (i >= i2) {
            i3 += this.f7047;
        }
        return this.f7043[i3] & 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6000(byte b) {
        int i = this.f7041;
        int i2 = i + 1;
        this.f7041 = i2;
        this.f7043[i] = b;
        if (this.f7045 < i2) {
            this.f7045 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6001(int i, int i2) throws C19838 {
        int i3;
        if (i < 0 || i >= this.f7045) {
            throw new C19838();
        }
        int iMin = Math.min(this.f7042 - this.f7041, i2);
        this.f7048 = i2 - iMin;
        this.f7044 = i;
        int i4 = (this.f7041 - i) - 1;
        byte[] bArr = this.f7043;
        if (i4 < 0) {
            int i5 = this.f7047;
            int i6 = i4 + i5;
            int iMin2 = Math.min(i5 - i6, iMin);
            System.arraycopy(bArr, i6, bArr, this.f7041, iMin2);
            this.f7041 += iMin2;
            iMin -= iMin2;
            if (iMin == 0) {
                return;
            } else {
                i4 = 0;
            }
        }
        do {
            int iMin3 = Math.min(iMin, this.f7041 - i4);
            System.arraycopy(bArr, i4, bArr, this.f7041, iMin3);
            i3 = this.f7041 + iMin3;
            this.f7041 = i3;
            iMin -= iMin3;
        } while (iMin > 0);
        if (this.f7045 < i3) {
            this.f7045 = i3;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m5996() throws C19838 {
        int i = this.f7048;
        if (i > 0) {
            m6001(this.f7044, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6002(int i, DataInputStream dataInputStream) throws IOException {
        int iMin = Math.min(this.f7047 - this.f7041, i);
        dataInputStream.readFully(this.f7043, this.f7041, iMin);
        int i2 = this.f7041 + iMin;
        this.f7041 = i2;
        if (this.f7045 < i2) {
            this.f7045 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m5999(int i, byte[] bArr) {
        int i2 = this.f7041;
        int i3 = this.f7046;
        int i4 = i2 - i3;
        if (i2 == this.f7047) {
            this.f7041 = 0;
        }
        System.arraycopy(this.f7043, i3, bArr, i, i4);
        this.f7046 = this.f7041;
        return i4;
    }
}
