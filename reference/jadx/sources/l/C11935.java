package l;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G1SX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11935 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f38435;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f38441;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f38436 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f38438 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f38437 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f38442 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f38439 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f38440 = 0;

    public C11935(int i, C0573 c0573) {
        this.f38441 = i;
        byte[] bArrMo2594 = c0573.mo2594(i);
        this.f38435 = bArrMo2594;
        bArrMo2594[i - 1] = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29900(C0573 c0573) {
        c0573.mo2592(this.f38435);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m29902() {
        this.f38436 = 0;
        this.f38438 = 0;
        this.f38437 = 0;
        this.f38442 = 0;
        this.f38435[this.f38441 - 1] = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29903(int i) {
        int i2 = this.f38438;
        int i3 = this.f38441;
        if (i3 - i2 <= i) {
            this.f38442 = i3;
        } else {
            this.f38442 = i2 + i;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m29901() {
        return this.f38438 < this.f38442;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m29904() {
        return this.f38439 > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29894() {
        return this.f38438;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29895(int i) {
        int i2 = this.f38438;
        int i3 = (i2 - i) - 1;
        if (i >= i2) {
            i3 += this.f38441;
        }
        return this.f38435[i3] & 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29897(byte b) {
        int i = this.f38438;
        int i2 = i + 1;
        this.f38438 = i2;
        this.f38435[i] = b;
        if (this.f38437 < i2) {
            this.f38437 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29898(int i, int i2) throws C13996 {
        int i3;
        if (i < 0 || i >= this.f38437) {
            throw new C13996();
        }
        int iMin = Math.min(this.f38442 - this.f38438, i2);
        this.f38439 = i2 - iMin;
        this.f38440 = i;
        int i4 = (this.f38438 - i) - 1;
        byte[] bArr = this.f38435;
        if (i4 < 0) {
            int i5 = this.f38441;
            int i6 = i4 + i5;
            int iMin2 = Math.min(i5 - i6, iMin);
            System.arraycopy(bArr, i6, bArr, this.f38438, iMin2);
            this.f38438 += iMin2;
            iMin -= iMin2;
            if (iMin == 0) {
                return;
            } else {
                i4 = 0;
            }
        }
        do {
            int iMin3 = Math.min(iMin, this.f38438 - i4);
            System.arraycopy(bArr, i4, bArr, this.f38438, iMin3);
            i3 = this.f38438 + iMin3;
            this.f38438 = i3;
            iMin -= iMin3;
        } while (iMin > 0);
        if (this.f38437 < i3) {
            this.f38437 = i3;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m29905() throws C13996 {
        int i = this.f38439;
        if (i > 0) {
            m29898(this.f38440, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29899(int i, DataInputStream dataInputStream) throws IOException {
        int iMin = Math.min(this.f38441 - this.f38438, i);
        dataInputStream.readFully(this.f38435, this.f38438, iMin);
        int i2 = this.f38438 + iMin;
        this.f38438 = i2;
        if (this.f38437 < i2) {
            this.f38437 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29896(int i, byte[] bArr) {
        int i2 = this.f38438;
        int i3 = this.f38436;
        int i4 = i2 - i3;
        if (i2 == this.f38441) {
            this.f38438 = 0;
        }
        System.arraycopy(this.f38435, i3, bArr, i, i4);
        this.f38436 = this.f38438;
        return i4;
    }
}
