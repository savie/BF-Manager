package l;

import com.umeng.analytics.pro.bo;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۖۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2460 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final char[] f9797 = {'\r', '\n'};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final char[] f9798 = {'\n'};

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final AbstractC23844 f9799;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f9800;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f9801;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f9802;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m7496(byte b) {
        return (b & 192) == 128;
    }

    static {
        Charset charset = StandardCharsets.US_ASCII;
        Charset charset2 = StandardCharsets.UTF_8;
        Charset charset3 = StandardCharsets.UTF_16;
        Charset charset4 = StandardCharsets.UTF_16BE;
        Charset charset5 = StandardCharsets.UTF_16LE;
        f9799 = AbstractC23844.m52565();
    }

    public C2460() {
        this.f9800 = C17983.f57507;
    }

    public C2460(int i) {
        this.f9800 = new byte[i];
        this.f9802 = i;
    }

    public C2460(byte[] bArr) {
        this.f9800 = bArr;
        this.f9802 = bArr.length;
    }

    public C2460(byte[] bArr, int i) {
        this.f9800 = bArr;
        this.f9802 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7508(int i, byte[] bArr) {
        this.f9800 = bArr;
        this.f9802 = i;
        this.f9801 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7503() {
        return Math.max(this.f9802 - this.f9801, 0);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m7509() {
        return this.f9802;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m7501(int i) {
        C2023.m6507(i >= 0 && i <= this.f9800.length);
        this.f9802 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m7500() {
        return this.f9801;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m7510(int i) {
        C2023.m6507(i >= 0 && i <= this.f9802);
        this.f9801 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m7518() {
        return this.f9800;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7506(int i) {
        byte[] bArr = this.f9800;
        if (i > bArr.length) {
            this.f9800 = Arrays.copyOf(bArr, i);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m7517(int i) {
        byte[] bArr = this.f9800;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m7508(i, bArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m7521() {
        return this.f9800.length;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m7535(int i) {
        m7510(this.f9801 + i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7507(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f9800, this.f9801, bArr, i, i2);
        this.f9801 += i2;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m7534() {
        return this.f9800[this.f9801] & 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private char m7493(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f9800;
            int i2 = this.f9801 + i;
            b = bArr[i2];
            b2 = bArr[i2 + 1];
        } else {
            byte[] bArr2 = this.f9800;
            int i3 = this.f9801 + i;
            b = bArr2[i3 + 1];
            b2 = bArr2[i3];
        }
        return (char) ((b << 8) | (b2 & 255));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7504(Charset charset) {
        int iM7492 = m7492(charset);
        if (iM7492 != 0) {
            return C17039.m39818(iM7492 >>> 8);
        }
        return 1114112;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m7516() {
        byte[] bArr = this.f9800;
        int i = this.f9801;
        this.f9801 = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m7519() {
        byte[] bArr = this.f9800;
        int i = this.f9801;
        int i2 = i + 1;
        this.f9801 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f9801 = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m7528() {
        byte[] bArr = this.f9800;
        int i = this.f9801;
        int i2 = i + 1;
        this.f9801 = i2;
        int i3 = bArr[i] & 255;
        this.f9801 = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final short m7530() {
        byte[] bArr = this.f9800;
        int i = this.f9801;
        int i2 = i + 1;
        this.f9801 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f9801 = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final short m7536() {
        byte[] bArr = this.f9800;
        int i = this.f9801;
        int i2 = i + 1;
        this.f9801 = i2;
        int i3 = bArr[i] & 255;
        this.f9801 = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m7525() {
        byte[] bArr = this.f9800;
        int i = this.f9801;
        int i2 = i + 1;
        this.f9801 = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.f9801 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f9801 = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m7520() {
        byte[] bArr = this.f9800;
        int i = this.f9801;
        int i2 = i + 1;
        this.f9801 = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i + 2;
        this.f9801 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f9801 = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m7532() {
        byte[] bArr = this.f9800;
        int i = this.f9801;
        int i2 = i + 1;
        this.f9801 = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.f9801 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.f9801 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f9801 = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long m7524() {
        byte[] bArr = this.f9800;
        int i = this.f9801;
        int i2 = i + 1;
        this.f9801 = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f9801 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f9801 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f9801 = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m7499() {
        byte[] bArr = this.f9800;
        int i = this.f9801;
        int i2 = i + 1;
        this.f9801 = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f9801 = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f9801 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f9801 = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m7502() {
        byte[] bArr = this.f9800;
        int i = this.f9801;
        int i2 = i + 1;
        this.f9801 = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f9801 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f9801 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f9801 = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m7529() {
        byte[] bArr = this.f9800;
        int i = this.f9801;
        int i2 = i + 1;
        this.f9801 = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.f9801 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.f9801 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.f9801 = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.f9801 = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.f9801 = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.f9801 = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f9801 = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m7512() {
        byte[] bArr = this.f9800;
        int i = this.f9801;
        int i2 = i + 1;
        this.f9801 = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f9801 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f9801 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.f9801 = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.f9801 = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.f9801 = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.f9801 = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f9801 = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m7513() {
        byte[] bArr = this.f9800;
        int i = this.f9801;
        int i2 = i + 1;
        this.f9801 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f9801 = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.f9801 = i + 4;
        return i4;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m7515() {
        return (m7516() << 21) | (m7516() << 14) | (m7516() << 7) | m7516();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m7531() {
        int iM7499 = m7499();
        if (iM7499 >= 0) {
            return iM7499;
        }
        throw new IllegalStateException(C8479.m22141(iM7499, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m7533() {
        int iM7502 = m7502();
        if (iM7502 >= 0) {
            return iM7502;
        }
        throw new IllegalStateException(C8479.m22141(iM7502, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m7526() {
        long jM7529 = m7529();
        if (jM7529 >= 0) {
            return jM7529;
        }
        throw new IllegalStateException(C15489.m37074(jM7529, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m7505(int i, Charset charset) {
        String str = new String(this.f9800, this.f9801, i, charset);
        this.f9801 += i;
        return str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m7522(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f9801;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.f9802 || this.f9800[i3] != 0) ? i : i - 1;
        byte[] bArr = this.f9800;
        String str = C17983.f57504;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.f9801 += i;
        return str2;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m7514() {
        if (m7503() == 0) {
            return null;
        }
        int i = this.f9801;
        while (i < this.f9802 && this.f9800[i] != 0) {
            i++;
        }
        byte[] bArr = this.f9800;
        int i2 = this.f9801;
        String str = C17983.f57504;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.f9801 = i;
        if (i < this.f9802) {
            this.f9801 = i + 1;
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m7523(Charset charset) {
        int i;
        byte[] bArr;
        C2023.m6506("Unsupported charset: " + charset, f9799.contains(charset));
        if (m7503() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            m7511();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.f9801;
        while (true) {
            int i3 = this.f9802;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && C17983.m41809(this.f9800[i2])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.f9800;
                if (bArr2[i2] == 0 && C17983.m41809(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f9800;
                    if (bArr[i2 + 1] == 0 && C17983.m41809(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f9800;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        String strM7505 = m7505(i2 - this.f9801, charset);
        if (this.f9801 != this.f9802 && m7494(charset, f9797) == '\r') {
            m7494(charset, f9798);
        }
        return strM7505;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m7527() {
        int i;
        int i2;
        long j = this.f9800[this.f9801];
        int i3 = 7;
        while (true) {
            if (i3 >= 0) {
                int i4 = 1 << i3;
                if ((((long) i4) & j) == 0) {
                    if (i3 < 6) {
                        j &= (long) (i4 - 1);
                        i2 = 7 - i3;
                        break;
                    }
                    if (i3 == 7) {
                        i2 = 1;
                        break;
                    }
                } else {
                    i3--;
                }
            }
            i2 = 0;
            break;
        }
        if (i2 == 0) {
            throw new NumberFormatException(C15489.m37074(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i2; i++) {
            byte b = this.f9800[this.f9801 + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException(C15489.m37074(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.f9801 += i2;
        return j;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m7498() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.f9801 == this.f9802) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jM7516 = m7516();
            j |= (127 & jM7516) << (i * 7);
            if ((jM7516 & 128) == 0) {
                break;
            }
        }
        return C17039.m39818(j);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Charset m7511() {
        if (m7503() >= 3) {
            byte[] bArr = this.f9800;
            int i = this.f9801;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f9801 = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (m7503() < 2) {
            return null;
        }
        byte[] bArr2 = this.f9800;
        int i2 = this.f9801;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f9801 = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f9801 = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private char m7494(Charset charset, char[] cArr) {
        int iM7492;
        if (m7503() >= m7497(charset) && (iM7492 = m7492(charset)) != 0) {
            long j = iM7492 >>> 8;
            C18304.m42512(j, "out of range: %s", (j >> 32) == 0);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                C18304.m42512(j2, "Out of range: %s", ((long) c) == j2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.f9801 = C17039.m39818(iM7492 & 255) + this.f9801;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m7492(Charset charset) {
        int i;
        int codePoint;
        int i2;
        int iM7495;
        C2023.m6506("Unsupported charset: " + charset, f9799.contains(charset));
        if (m7503() < m7497(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f9801 + ", limit=" + this.f9802);
        }
        int i3 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.f9800[this.f9801];
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                codePoint = b & 255;
                return (codePoint << 8) | i3;
            }
            return 0;
        }
        if (!charset.equals(StandardCharsets.UTF_8)) {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cM7493 = m7493(0, byteOrder);
            if (!Character.isHighSurrogate(cM7493) || m7503() < 4) {
                i3 = 2;
                i = cM7493;
            } else {
                i3 = 4;
                codePoint = Character.toCodePoint(cM7493, m7493(2, byteOrder));
            }
            return (codePoint << 8) | i3;
        }
        byte b2 = this.f9800[this.f9801];
        if ((b2 & GCMSIVBlockCipher.MASK) == 0) {
            i2 = 1;
        } else if ((b2 & bo.k) == 192 && m7503() >= 2 && m7496(this.f9800[this.f9801 + 1])) {
            i2 = 2;
        } else if ((this.f9800[this.f9801] & 240) == 224 && m7503() >= 3 && m7496(this.f9800[this.f9801 + 1]) && m7496(this.f9800[this.f9801 + 2])) {
            i2 = 3;
        } else {
            i2 = ((this.f9800[this.f9801] & 248) == 240 && m7503() >= 4 && m7496(this.f9800[this.f9801 + 1]) && m7496(this.f9800[this.f9801 + 2]) && m7496(this.f9800[this.f9801 + 3])) ? 4 : 0;
        }
        if (i2 == 1) {
            iM7495 = this.f9800[this.f9801] & 255;
        } else if (i2 == 2) {
            byte[] bArr = this.f9800;
            int i4 = this.f9801;
            iM7495 = m7495(0, 0, bArr[i4], bArr[i4 + 1]);
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    byte[] bArr2 = this.f9800;
                    int i5 = this.f9801;
                    iM7495 = m7495(bArr2[i5], bArr2[i5 + 1], bArr2[i5 + 2], bArr2[i5 + 3]);
                }
                return 0;
            }
            byte[] bArr3 = this.f9800;
            int i6 = this.f9801;
            iM7495 = m7495(0, bArr3[i6] & 15, bArr3[i6 + 1], bArr3[i6 + 2]);
        }
        i3 = i2;
        i = iM7495;
        codePoint = i;
        return (codePoint << 8) | i3;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m7497(Charset charset) {
        C2023.m6506("Unsupported charset: " + charset, f9799.contains(charset));
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m7495(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return C17039.m39816((byte) 0, C14218.m34325(((i & 7) << 2) | ((i2 & 48) >> 4)), C14218.m34325(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), C14218.m34325(((b & 3) << 6) | (((byte) i4) & 63)));
    }
}
