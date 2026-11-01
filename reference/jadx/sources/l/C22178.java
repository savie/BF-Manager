package l;

import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.᩹ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7AP */
/* JADX INFO: loaded from: classes.dex */
public final class C22178 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CharSequence f72538;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f72539;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f72540;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] f72541;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f72542 = new byte[8192];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f72543;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f72544;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C22178(byte[] bArr, CharSequence charSequence) {
        this.f72541 = bArr;
        this.f72538 = charSequence;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int iMin;
        int codePoint;
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = 0;
        while (i2 > 0) {
            int i4 = this.f72544;
            byte[] bArr2 = this.f72541;
            if (i4 < bArr2.length) {
                iMin = Math.min(i2, bArr2.length - i4);
                System.arraycopy(bArr2, this.f72544, bArr, i, iMin);
                this.f72544 += iMin;
            } else {
                int i5 = this.f72543;
                int i6 = this.f72540;
                byte[] bArr3 = this.f72542;
                if (i5 >= i6) {
                    this.f72543 = 0;
                    this.f72540 = 0;
                    while (true) {
                        int i7 = this.f72539;
                        CharSequence charSequence = this.f72538;
                        if (i7 >= charSequence.length() || this.f72540 > bArr3.length - 4) {
                            break;
                        }
                        int i8 = this.f72539;
                        this.f72539 = i8 + 1;
                        char cCharAt = charSequence.charAt(i8);
                        if (cCharAt < 128) {
                            int i9 = this.f72540;
                            this.f72540 = i9 + 1;
                            bArr3[i9] = (byte) cCharAt;
                        } else if (cCharAt < 2048) {
                            int i10 = this.f72540;
                            int i11 = i10 + 1;
                            this.f72540 = i11;
                            bArr3[i10] = (byte) (((cCharAt >> 6) & 31) | 192);
                            this.f72540 = i10 + 2;
                            bArr3[i11] = (byte) ((cCharAt & '?') | 128);
                        } else if (Character.isSurrogate(cCharAt)) {
                            if (this.f72539 < charSequence.length()) {
                                char cCharAt2 = charSequence.charAt(this.f72539);
                                if (Character.isHighSurrogate(cCharAt) && Character.isLowSurrogate(cCharAt2)) {
                                    codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                                } else {
                                    codePoint = -1;
                                }
                            } else {
                                codePoint = -1;
                            }
                            if (codePoint < 0) {
                                int i12 = this.f72540;
                                this.f72540 = i12 + 1;
                                bArr3[i12] = 63;
                            } else {
                                int i13 = this.f72540;
                                int i14 = i13 + 1;
                                this.f72540 = i14;
                                bArr3[i13] = (byte) ((codePoint >> 18) | 240);
                                int i15 = i13 + 2;
                                this.f72540 = i15;
                                bArr3[i14] = (byte) (((codePoint >> 12) & 63) | 128);
                                int i16 = i13 + 3;
                                this.f72540 = i16;
                                bArr3[i15] = (byte) ((63 & (codePoint >> 6)) | 128);
                                this.f72540 = i13 + 4;
                                bArr3[i16] = (byte) ((codePoint & 63) | 128);
                                this.f72539++;
                            }
                        } else {
                            int i17 = this.f72540;
                            int i18 = i17 + 1;
                            this.f72540 = i18;
                            bArr3[i17] = (byte) (((cCharAt >> '\f') & 15) | BERTags.FLAGS);
                            int i19 = i17 + 2;
                            this.f72540 = i19;
                            bArr3[i18] = (byte) ((63 & (cCharAt >> 6)) | 128);
                            this.f72540 = i17 + 3;
                            bArr3[i19] = (byte) ((cCharAt & '?') | 128);
                        }
                    }
                    if (this.f72540 <= 0) {
                        break;
                    }
                }
                iMin = Math.min(i2, this.f72540 - this.f72543);
                System.arraycopy(bArr3, this.f72543, bArr, i, iMin);
                this.f72543 += iMin;
            }
            i += iMin;
            i2 -= iMin;
            i3 += iMin;
        }
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }
}
