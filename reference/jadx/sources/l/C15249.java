package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ܶ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q58K */
/* JADX INFO: loaded from: classes4.dex */
public final class C15249 extends BufferedOutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f49717;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f49718;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f49719;

    public C15249(OutputStream outputStream, int i) {
        this(outputStream, i, 262144);
    }

    public C15249(OutputStream outputStream, int i, int i2) {
        super(outputStream, i2);
        this.f49719 = new byte[8];
        this.f49717 = new byte[3];
        this.f49718 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36518(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i);
        outputStream.write(i >> 8);
        outputStream.write(i >> 16);
        outputStream.write(i >> 24);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m36519(OutputStream outputStream, int i) throws IOException {
        while ((((long) i) & 4294967295L) > 127) {
            outputStream.write((i & 127) | 128);
            i >>>= 7;
        }
        outputStream.write(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m36520(OutputStream outputStream, int i) throws IOException {
        if (i >= 0) {
            while (i > 63) {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
            outputStream.write(i & 127);
            return;
        }
        while (i < -64) {
            outputStream.write((i & 127) | 128);
            i >>= 7;
        }
        outputStream.write(i & 127);
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f49718++;
        super.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f49718 += i2;
        super.write(bArr, i, i2);
    }

    public final void writeShort(int i) throws IOException {
        if (i < -32768 || i > 32767) {
            throw new C20749(null, "Short value out of range: %d", Integer.valueOf(i));
        }
        write(i);
        write(i >> 8);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36528(int i) throws IOException {
        if (i < 0 || i > 65535) {
            throw new C20749(null, "Unsigned short value out of range: %d", Integer.valueOf(i));
        }
        write(i);
        write(i >> 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36524(int i) throws IOException {
        if (i < 0 || i > 255) {
            throw new C20749(null, "Unsigned byte value out of range: %d", Integer.valueOf(i));
        }
        write(i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m36527(int i, int i2) throws IOException {
        write(i | (i2 << 5));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36525(int i, int i2) throws IOException {
        int i3 = 0;
        if (i2 >= 0) {
            while (i2 > 127) {
                this.f49719[i3] = (byte) i2;
                i2 >>= 8;
                i3++;
            }
        } else {
            while (i2 < -128) {
                this.f49719[i3] = (byte) i2;
                i2 >>= 8;
                i3++;
            }
        }
        this.f49719[i3] = (byte) i2;
        m36527(i, i3);
        write(this.f49719, 0, i3 + 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36530(long j) throws IOException {
        int i = 0;
        if (j >= 0) {
            while (j > 127) {
                this.f49719[i] = (byte) j;
                j >>= 8;
                i++;
            }
        } else {
            while (j < -128) {
                this.f49719[i] = (byte) j;
                j >>= 8;
                i++;
            }
        }
        this.f49719[i] = (byte) j;
        m36527(6, i);
        write(this.f49719, 0, i + 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36529(int i, int i2) throws IOException {
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            this.f49719[i3] = (byte) i2;
            i2 >>>= 8;
            if (i2 == 0) {
                m36527(i, i3);
                write(this.f49719, 0, i4);
                return;
            }
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36523(float f) throws IOException {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i = 3;
        while (true) {
            int i2 = i - 1;
            this.f49719[i] = (byte) (((-16777216) & iFloatToRawIntBits) >>> 24);
            iFloatToRawIntBits <<= 8;
            if (iFloatToRawIntBits == 0) {
                m36527(16, 3 - i);
                write(this.f49719, i, 4 - i);
                return;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36522(double d) throws IOException {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i = 7;
        while (true) {
            int i2 = i - 1;
            this.f49719[i] = (byte) (((-72057594037927936L) & jDoubleToRawLongBits) >>> 56);
            jDoubleToRawLongBits <<= 8;
            if (jDoubleToRawLongBits == 0) {
                m36527(17, 7 - i);
                write(this.f49719, i, 8 - i);
                return;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36526(String str) throws IOException {
        int length = str.length();
        if (this.f49719.length <= str.length() * 3) {
            this.f49719 = new byte[str.length() * 3];
        }
        byte[] bArr = this.f49719;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != 0 && cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt < 2048) {
                int i3 = i + 1;
                bArr[i] = (byte) (((cCharAt >> 6) & 31) | 192);
                i += 2;
                bArr[i3] = (byte) ((cCharAt & '?') | 128);
            } else {
                bArr[i] = (byte) (((cCharAt >> '\f') & 15) | BERTags.FLAGS);
                int i4 = i + 2;
                bArr[i + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                i += 3;
                bArr[i4] = (byte) ((cCharAt & '?') | 128);
            }
        }
        write(bArr, 0, i);
    }

    public final int getPosition() {
        return this.f49718;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36521() throws IOException {
        int i = (-this.f49718) & 3;
        if (i > 0) {
            write(this.f49717, 0, i);
        }
    }
}
