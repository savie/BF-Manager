package l;

import org.bouncycastle.asn1.ASN1RelativeOID;

/* JADX INFO: renamed from: l.ۨۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8HF */
/* JADX INFO: loaded from: classes3.dex */
public final class C11634 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f39082;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f39083;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f39084;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f39085;

    public C11634() {
        this.f39082 = C17983.f57507;
    }

    public C11634(byte[] bArr, int i) {
        this.f39082 = bArr;
        this.f39085 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29033(C2460 c2460) {
        m29038(c2460.m7509(), c2460.m7518());
        m29029(c2460.m7500() * 8);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m29038(int i, byte[] bArr) {
        this.f39082 = bArr;
        this.f39084 = 0;
        this.f39083 = 0;
        this.f39085 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29030() {
        return ((this.f39085 - this.f39084) * 8) - this.f39083;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m29028() {
        return (this.f39084 * 8) + this.f39083;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m29036() {
        C2023.m6510(this.f39083 == 0);
        return this.f39084;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m29029(int i) {
        int i2 = i / 8;
        this.f39084 = i2;
        this.f39083 = i - (i2 * 8);
        m29027();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m29042() {
        int i = this.f39083 + 1;
        this.f39083 = i;
        if (i == 8) {
            this.f39083 = 0;
            this.f39084++;
        }
        m29027();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m29034(int i) {
        int i2 = i / 8;
        int i3 = this.f39084 + i2;
        this.f39084 = i3;
        int i4 = (i - (i2 * 8)) + this.f39083;
        this.f39083 = i4;
        if (i4 > 7) {
            this.f39084 = i3 + 1;
            this.f39083 = i4 - 8;
        }
        m29027();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m29035() {
        boolean z = (this.f39082[this.f39084] & (128 >> this.f39083)) != 0;
        m29042();
        return z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m29039(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f39083 += i;
        int i3 = 0;
        while (true) {
            i2 = this.f39083;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f39083 = i4;
            byte[] bArr = this.f39082;
            int i5 = this.f39084;
            this.f39084 = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f39082;
        int i6 = this.f39084;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f39083 = 0;
            this.f39084 = i6 + 1;
        }
        m29027();
        return i7;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m29037(int i) {
        if (i <= 32) {
            int iM29039 = m29039(i);
            String str = C17983.f57504;
            return 4294967295L & ((long) iM29039);
        }
        int iM290310 = m29039(i - 32);
        int iM290311 = m29039(32);
        String str2 = C17983.f57504;
        return (4294967295L & ((long) iM290311)) | ((((long) iM290310) & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29032(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f39082;
            int i4 = this.f39084;
            int i5 = i4 + 1;
            this.f39084 = i5;
            byte b = bArr2[i4];
            int i6 = this.f39083;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.f39083;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f39082;
            int i9 = this.f39084;
            this.f39084 = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f39083 = i8 - 8;
        }
        int i10 = this.f39083 + i7;
        this.f39083 = i10;
        byte[] bArr4 = this.f39082;
        int i11 = this.f39084;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.f39083 = 0;
            this.f39084 = i11 + 1;
        }
        m29027();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29040() {
        if (this.f39083 == 0) {
            return;
        }
        this.f39083 = 0;
        this.f39084++;
        m29027();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29041(int i, byte[] bArr) {
        C2023.m6510(this.f39083 == 0);
        System.arraycopy(this.f39082, this.f39084, bArr, 0, i);
        this.f39084 += i;
        m29027();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m29043(int i) {
        C2023.m6510(this.f39083 == 0);
        this.f39084 += i;
        m29027();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29031(int i) {
        int i2 = i & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;
        int iMin = Math.min(8 - this.f39083, 14);
        int i3 = this.f39083;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.f39082;
        int i5 = this.f39084;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = 14 - iMin;
        bArr[i5] = (byte) (b | ((i2 >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f39082[i7] = (byte) (i2 >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f39082;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i2 & ((1 << i6) - 1)) << i8) | b2);
        m29034(14);
        m29027();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m29027() {
        int i;
        int i2 = this.f39084;
        C2023.m6510(i2 >= 0 && (i2 < (i = this.f39085) || (i2 == i && this.f39083 == 0)));
    }
}
