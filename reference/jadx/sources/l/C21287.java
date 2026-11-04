package l;

import com.umeng.analytics.pro.bo;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.᩶ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SP */
/* JADX INFO: loaded from: classes5.dex */
public final class C21287 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC8639 f67877;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f67880;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f67881;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f67882;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final char[] f67879 = {'\r', '\n'};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final char[] f67878 = {'\n'};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48479(byte b) {
        return (b & 192) == 128;
    }

    static {
        Charset charset = StandardCharsets.US_ASCII;
        Charset charset2 = StandardCharsets.UTF_8;
        Charset charset3 = StandardCharsets.UTF_16;
        Charset charset4 = StandardCharsets.UTF_16BE;
        Charset charset5 = StandardCharsets.UTF_16LE;
        f67877 = AbstractC8639.m23274();
    }

    public C21287() {
        this.f67880 = C7116.f23453;
    }

    public C21287(int i) {
        this.f67880 = new byte[i];
        this.f67882 = i;
    }

    public C21287(byte[] bArr) {
        this.f67880 = bArr;
        this.f67882 = bArr.length;
    }

    public C21287(byte[] bArr, int i) {
        this.f67880 = bArr;
        this.f67882 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48491(int i, byte[] bArr) {
        this.f67880 = bArr;
        this.f67882 = i;
        this.f67881 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48486() {
        return Math.max(this.f67882 - this.f67881, 0);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m48509() {
        return this.f67882;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m48517(int i) {
        C20782.m47565(i >= 0 && i <= this.f67880.length);
        this.f67882 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m48516() {
        return this.f67881;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m48510(int i) {
        C20782.m47565(i >= 0 && i <= this.f67882);
        this.f67881 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] m48497() {
        return this.f67880;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48489(int i) {
        byte[] bArr = this.f67880;
        if (i > bArr.length) {
            this.f67880 = Arrays.copyOf(bArr, i);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m48496(int i) {
        byte[] bArr = this.f67880;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m48491(i, bArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m48513() {
        return this.f67880.length;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m48503(int i) {
        m48510(this.f67881 + i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48490(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f67880, this.f67881, bArr, i, i2);
        this.f67881 += i2;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m48502() {
        return this.f67880[this.f67881] & 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private char m48476(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f67880;
            int i2 = this.f67881 + i;
            b = bArr[i2];
            b2 = bArr[i2 + 1];
        } else {
            byte[] bArr2 = this.f67880;
            int i3 = this.f67881 + i;
            b = bArr2[i3 + 1];
            b2 = bArr2[i3];
        }
        return (char) ((b << 8) | (b2 & 255));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48487(Charset charset) {
        int iM48481 = m48481(charset);
        if (iM48481 != 0) {
            return C18444.m42970(iM48481 >>> 8);
        }
        return 1114112;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m48493() {
        byte[] bArr = this.f67880;
        int i = this.f67881;
        this.f67881 = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m48494() {
        byte[] bArr = this.f67880;
        int i = this.f67881;
        int i2 = i + 1;
        this.f67881 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f67881 = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m48504() {
        byte[] bArr = this.f67880;
        int i = this.f67881;
        int i2 = i + 1;
        this.f67881 = i2;
        int i3 = bArr[i] & 255;
        this.f67881 = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final short m48511() {
        byte[] bArr = this.f67880;
        int i = this.f67881;
        int i2 = i + 1;
        this.f67881 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f67881 = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final short m48520() {
        byte[] bArr = this.f67880;
        int i = this.f67881;
        int i2 = i + 1;
        this.f67881 = i2;
        int i3 = bArr[i] & 255;
        this.f67881 = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m48501() {
        byte[] bArr = this.f67880;
        int i = this.f67881;
        int i2 = i + 1;
        this.f67881 = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.f67881 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f67881 = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m48492() {
        byte[] bArr = this.f67880;
        int i = this.f67881;
        int i2 = i + 1;
        this.f67881 = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i + 2;
        this.f67881 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f67881 = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m48485() {
        byte[] bArr = this.f67880;
        int i = this.f67881;
        int i2 = i + 1;
        this.f67881 = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.f67881 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.f67881 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f67881 = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long m48505() {
        byte[] bArr = this.f67880;
        int i = this.f67881;
        int i2 = i + 1;
        this.f67881 = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f67881 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f67881 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f67881 = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m48500() {
        byte[] bArr = this.f67880;
        int i = this.f67881;
        int i2 = i + 1;
        this.f67881 = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f67881 = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f67881 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f67881 = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m48483() {
        byte[] bArr = this.f67880;
        int i = this.f67881;
        int i2 = i + 1;
        this.f67881 = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f67881 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f67881 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f67881 = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m48518() {
        byte[] bArr = this.f67880;
        int i = this.f67881;
        int i2 = i + 1;
        this.f67881 = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.f67881 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.f67881 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.f67881 = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.f67881 = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.f67881 = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.f67881 = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f67881 = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m48498() {
        byte[] bArr = this.f67880;
        int i = this.f67881;
        int i2 = i + 1;
        this.f67881 = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f67881 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f67881 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.f67881 = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.f67881 = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.f67881 = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.f67881 = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f67881 = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m48519() {
        byte[] bArr = this.f67880;
        int i = this.f67881;
        int i2 = i + 1;
        this.f67881 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f67881 = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.f67881 = i + 4;
        return i4;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m48499() {
        return (m48493() << 21) | (m48493() << 14) | (m48493() << 7) | m48493();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m48512() {
        int iM48500 = m48500();
        if (iM48500 >= 0) {
            return iM48500;
        }
        throw new IllegalStateException(C13645.m33382(iM48500, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m48506() {
        int iM48483 = m48483();
        if (iM48483 >= 0) {
            return iM48483;
        }
        throw new IllegalStateException(C13645.m33382(iM48483, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long m48482() {
        long jM48518 = m48518();
        if (jM48518 >= 0) {
            return jM48518;
        }
        throw new IllegalStateException(C24770.m55292(jM48518, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m48488(int i, Charset charset) {
        String str = new String(this.f67880, this.f67881, i, charset);
        this.f67881 += i;
        return str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m48514(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f67881;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.f67882 || this.f67880[i3] != 0) ? i : i - 1;
        byte[] bArr = this.f67880;
        String str = C7116.f23455;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.f67881 += i;
        return str2;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m48484() {
        if (m48486() == 0) {
            return null;
        }
        int i = this.f67881;
        while (i < this.f67882 && this.f67880[i] != 0) {
            i++;
        }
        byte[] bArr = this.f67880;
        int i2 = this.f67881;
        String str = C7116.f23455;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.f67881 = i;
        if (i < this.f67882) {
            this.f67881 = i + 1;
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m48515(Charset charset) {
        int i;
        byte[] bArr;
        C20782.m47564("Unsupported charset: " + charset, f67877.contains(charset));
        if (m48486() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            m48495();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.f67881;
        while (true) {
            int i3 = this.f67882;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && C7116.m19456(this.f67880[i2])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.f67880;
                if (bArr2[i2] == 0 && C7116.m19456(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f67880;
                    if (bArr[i2 + 1] == 0 && C7116.m19456(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f67880;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        String strM48488 = m48488(i2 - this.f67881, charset);
        if (this.f67881 != this.f67882 && m48477(charset, f67879) == '\r') {
            m48477(charset, f67878);
        }
        return strM48488;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m48508() {
        int i;
        int i2;
        long j = this.f67880[this.f67881];
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
            throw new NumberFormatException(C24770.m55292(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i2; i++) {
            byte b = this.f67880[this.f67881 + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException(C24770.m55292(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.f67881 += i2;
        return j;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m48507() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.f67881 == this.f67882) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jM48493 = m48493();
            j |= (127 & jM48493) << (i * 7);
            if ((jM48493 & 128) == 0) {
                break;
            }
        }
        return C18444.m42970(j);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Charset m48495() {
        if (m48486() >= 3) {
            byte[] bArr = this.f67880;
            int i = this.f67881;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f67881 = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (m48486() < 2) {
            return null;
        }
        byte[] bArr2 = this.f67880;
        int i2 = this.f67881;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f67881 = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f67881 = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private char m48477(Charset charset, char[] cArr) {
        int iM48481;
        if (m48486() >= m48480(charset) && (iM48481 = m48481(charset)) != 0) {
            long j = iM48481 >>> 8;
            C12128.m30304(j, "out of range: %s", (j >> 32) == 0);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                C12128.m30304(j2, "Out of range: %s", ((long) c) == j2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.f67881 = C18444.m42970(iM48481 & 255) + this.f67881;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m48481(Charset charset) {
        int i;
        int codePoint;
        int i2;
        int iM48478;
        C20782.m47564("Unsupported charset: " + charset, f67877.contains(charset));
        if (m48486() < m48480(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f67881 + ", limit=" + this.f67882);
        }
        int i3 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.f67880[this.f67881];
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                codePoint = b & 255;
                return (codePoint << 8) | i3;
            }
            return 0;
        }
        if (!charset.equals(StandardCharsets.UTF_8)) {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cM48476 = m48476(0, byteOrder);
            if (!Character.isHighSurrogate(cM48476) || m48486() < 4) {
                i3 = 2;
                i = cM48476;
            } else {
                i3 = 4;
                codePoint = Character.toCodePoint(cM48476, m48476(2, byteOrder));
            }
            return (codePoint << 8) | i3;
        }
        byte b2 = this.f67880[this.f67881];
        if ((b2 & GCMSIVBlockCipher.MASK) == 0) {
            i2 = 1;
        } else if ((b2 & bo.k) == 192 && m48486() >= 2 && m48479(this.f67880[this.f67881 + 1])) {
            i2 = 2;
        } else if ((this.f67880[this.f67881] & 240) == 224 && m48486() >= 3 && m48479(this.f67880[this.f67881 + 1]) && m48479(this.f67880[this.f67881 + 2])) {
            i2 = 3;
        } else {
            i2 = ((this.f67880[this.f67881] & 248) == 240 && m48486() >= 4 && m48479(this.f67880[this.f67881 + 1]) && m48479(this.f67880[this.f67881 + 2]) && m48479(this.f67880[this.f67881 + 3])) ? 4 : 0;
        }
        if (i2 == 1) {
            iM48478 = this.f67880[this.f67881] & 255;
        } else if (i2 == 2) {
            byte[] bArr = this.f67880;
            int i4 = this.f67881;
            iM48478 = m48478(0, 0, bArr[i4], bArr[i4 + 1]);
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    byte[] bArr2 = this.f67880;
                    int i5 = this.f67881;
                    iM48478 = m48478(bArr2[i5], bArr2[i5 + 1], bArr2[i5 + 2], bArr2[i5 + 3]);
                }
                return 0;
            }
            byte[] bArr3 = this.f67880;
            int i6 = this.f67881;
            iM48478 = m48478(0, bArr3[i6] & 15, bArr3[i6 + 1], bArr3[i6 + 2]);
        }
        i3 = i2;
        i = iM48478;
        codePoint = i;
        return (codePoint << 8) | i3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m48480(Charset charset) {
        C20782.m47564("Unsupported charset: " + charset, f67877.contains(charset));
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48478(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return C18444.m42968((byte) 0, C10239.m26373(((i & 7) << 2) | ((i2 & 48) >> 4)), C10239.m26373(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), C10239.m26373(((b & 3) << 6) | (((byte) i4) & 63)));
    }
}
