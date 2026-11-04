package l;

import org.bouncycastle.asn1.ASN1RelativeOID;

/* JADX INFO: renamed from: l.ܰۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8HF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14573 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45923;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f45924;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f45925;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f45926;

    public C14573() {
        this.f45926 = C7116.f23453;
    }

    public C14573(byte[] bArr, int i) {
        this.f45926 = bArr;
        this.f45925 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35155(C21287 c21287) {
        m35158(c21287.m48509(), c21287.m48497());
        m35167(c21287.m48516() * 8);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m35158(int i, byte[] bArr) {
        this.f45926 = bArr;
        this.f45924 = 0;
        this.f45923 = 0;
        this.f45925 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35152() {
        return ((this.f45925 - this.f45924) * 8) - this.f45923;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m35166() {
        return (this.f45924 * 8) + this.f45923;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m35156() {
        C20782.m47568(this.f45923 == 0);
        return this.f45924;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m35167(int i) {
        int i2 = i / 8;
        this.f45924 = i2;
        this.f45923 = i - (i2 * 8);
        m35151();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m35159() {
        int i = this.f45923 + 1;
        this.f45923 = i;
        if (i == 8) {
            this.f45923 = 0;
            this.f45924++;
        }
        m35151();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m35161(int i) {
        int i2 = i / 8;
        int i3 = this.f45924 + i2;
        this.f45924 = i3;
        int i4 = (i - (i2 * 8)) + this.f45923;
        this.f45923 = i4;
        if (i4 > 7) {
            this.f45924 = i3 + 1;
            this.f45923 = i4 - 8;
        }
        m35151();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m35162() {
        boolean z = (this.f45926[this.f45924] & (128 >> this.f45923)) != 0;
        m35159();
        return z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m35163(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f45923 += i;
        int i3 = 0;
        while (true) {
            i2 = this.f45923;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f45923 = i4;
            byte[] bArr = this.f45926;
            int i5 = this.f45924;
            this.f45924 = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f45926;
        int i6 = this.f45924;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f45923 = 0;
            this.f45924 = i6 + 1;
        }
        m35151();
        return i7;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m35157(int i) {
        if (i <= 32) {
            int iM35163 = m35163(i);
            String str = C7116.f23455;
            return 4294967295L & ((long) iM35163);
        }
        int iM35164 = m35163(i - 32);
        int iM35165 = m35163(32);
        String str2 = C7116.f23455;
        return (4294967295L & ((long) iM35165)) | ((((long) iM35164) & 4294967295L) << 32);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35154(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f45926;
            int i4 = this.f45924;
            int i5 = i4 + 1;
            this.f45924 = i5;
            byte b = bArr2[i4];
            int i6 = this.f45923;
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
        int i8 = this.f45923;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f45926;
            int i9 = this.f45924;
            this.f45924 = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.f45923 = i8 - 8;
        }
        int i10 = this.f45923 + i7;
        this.f45923 = i10;
        byte[] bArr4 = this.f45926;
        int i11 = this.f45924;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.f45923 = 0;
            this.f45924 = i11 + 1;
        }
        m35151();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35164() {
        if (this.f45923 == 0) {
            return;
        }
        this.f45923 = 0;
        this.f45924++;
        m35151();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m35165(int i, byte[] bArr) {
        C20782.m47568(this.f45923 == 0);
        System.arraycopy(this.f45926, this.f45924, bArr, 0, i);
        this.f45924 += i;
        m35151();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m35160(int i) {
        C20782.m47568(this.f45923 == 0);
        this.f45924 += i;
        m35151();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35153(int i) {
        int i2 = i & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;
        int iMin = Math.min(8 - this.f45923, 14);
        int i3 = this.f45923;
        int i4 = (8 - i3) - iMin;
        byte[] bArr = this.f45926;
        int i5 = this.f45924;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = 14 - iMin;
        bArr[i5] = (byte) (b | ((i2 >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f45926[i7] = (byte) (i2 >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f45926;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i2 & ((1 << i6) - 1)) << i8) | b2);
        m35161(14);
        m35151();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m35151() {
        int i;
        int i2 = this.f45924;
        C20782.m47568(i2 >= 0 && (i2 < (i = this.f45925) || (i2 == i && this.f45923 == 0)));
    }
}
