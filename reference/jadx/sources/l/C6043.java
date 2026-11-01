package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۛۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes3.dex */
public final class C6043 implements InterfaceC23683, InterfaceC10983, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final byte[] f20520 = {UTF8.S_P3A, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18474 f20521;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f20522;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, l.InterfaceC8597
    public final void close() {
    }

    @Override // l.InterfaceC10983, l.InterfaceC8597, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // l.InterfaceC23683, l.InterfaceC10983
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C6043 mo16399() {
        return this;
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo16401(InterfaceC8597 interfaceC8597) {
        throw null;
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10983 mo16425() {
        return this;
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ᩹ۨ, reason: not valid java name and contains not printable characters */
    public final OutputStream mo16430() {
        throw null;
    }

    @Override // l.InterfaceC10983
    public final /* bridge */ /* synthetic */ InterfaceC10983 writeByte(int i) {
        m16434writeByte(i);
        return this;
    }

    @Override // l.InterfaceC10983
    public final /* bridge */ /* synthetic */ InterfaceC10983 writeInt(int i) {
        m16435writeInt(i);
        return this;
    }

    @Override // l.InterfaceC10983
    public final /* bridge */ /* synthetic */ InterfaceC10983 writeShort(int i) {
        m16436writeShort(i);
        return this;
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC10983 mo16397(int i, int i2, byte[] bArr) {
        write(bArr, i, i2);
        return this;
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC10983 mo16405(C14511 c14511) {
        m16412(c14511);
        return this;
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC10983 mo16428(long j) {
        m16429(j);
        return this;
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC10983 mo16431(long j) {
        m16432(j);
        return this;
    }

    public final long size() {
        return this.f20522;
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo16415() {
        return this.f20522 == 0;
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo16413(long j) throws EOFException {
        if (this.f20522 < j) {
            throw new EOFException();
        }
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ᩺ۨ, reason: not valid java name and contains not printable characters */
    public final InputStream mo16433() {
        return new C17332(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16410(C6043 c6043, long j, long j2) {
        if (c6043 == null) {
            throw new IllegalArgumentException("out == null");
        }
        C15653.m37329(this.f20522, j, j2);
        if (j2 == 0) {
            return;
        }
        c6043.f20522 += j2;
        C18474 c18474 = this.f20521;
        while (true) {
            long j3 = c18474.f58877 - c18474.f58875;
            if (j < j3) {
                break;
            }
            j -= j3;
            c18474 = c18474.f58876;
        }
        while (j2 > 0) {
            C18474 c18474M42847 = c18474.m42847();
            int i = (int) (((long) c18474M42847.f58875) + j);
            c18474M42847.f58875 = i;
            c18474M42847.f58877 = Math.min(i + ((int) j2), c18474M42847.f58877);
            C18474 c18475 = c6043.f20521;
            if (c18475 == null) {
                c18474M42847.f58878 = c18474M42847;
                c18474M42847.f58876 = c18474M42847;
                c6043.f20521 = c18474M42847;
            } else {
                c18475.f58878.m42845(c18474M42847);
            }
            j2 -= (long) (c18474M42847.f58877 - c18474M42847.f58875);
            c18474 = c18474.f58876;
            j = 0;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m16417() {
        long j = this.f20522;
        if (j == 0) {
            return 0L;
        }
        C18474 c18474 = this.f20521.f58878;
        int i = c18474.f58877;
        return (i >= 8192 || !c18474.f58873) ? j : j - ((long) (i - c18474.f58875));
    }

    @Override // l.InterfaceC23683
    public final byte readByte() {
        long j = this.f20522;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        C18474 c18474 = this.f20521;
        int i = c18474.f58875;
        int i2 = c18474.f58877;
        int i3 = i + 1;
        byte b = c18474.f58874[i];
        this.f20522 = j - 1;
        if (i3 == i2) {
            this.f20521 = c18474.m42844();
            C7891.m20825(c18474);
            return b;
        }
        c18474.f58875 = i3;
        return b;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte m16423(long j) {
        int i;
        C15653.m37329(this.f20522, j, 1L);
        long j2 = this.f20522;
        if (j2 - j > j) {
            C18474 c18474 = this.f20521;
            while (true) {
                int i2 = c18474.f58877;
                int i3 = c18474.f58875;
                long j3 = i2 - i3;
                if (j >= j3) {
                    j -= j3;
                    c18474 = c18474.f58876;
                } else {
                    return c18474.f58874[i3 + ((int) j)];
                }
            }
        } else {
            long j4 = j - j2;
            C18474 c18475 = this.f20521;
            do {
                c18475 = c18475.f58878;
                int i4 = c18475.f58877;
                i = c18475.f58875;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return c18475.f58874[i + ((int) j4)];
        }
    }

    @Override // l.InterfaceC23683
    public final short readShort() {
        long j = this.f20522;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f20522);
        }
        C18474 c18474 = this.f20521;
        int i = c18474.f58875;
        int i2 = c18474.f58877;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c18474.f58874;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f20522 = j - 2;
        if (i5 == i2) {
            this.f20521 = c18474.m42844();
            C7891.m20825(c18474);
        } else {
            c18474.f58875 = i5;
        }
        return (short) i6;
    }

    @Override // l.InterfaceC23683
    public final int readInt() {
        long j = this.f20522;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f20522);
        }
        C18474 c18474 = this.f20521;
        int i = c18474.f58875;
        int i2 = c18474.f58877;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c18474.f58874;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f20522 = j - 4;
        if (i5 == i2) {
            this.f20521 = c18474.m42844();
            C7891.m20825(c18474);
            return i6;
        }
        c18474.f58875 = i5;
        return i6;
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public final long mo16416() {
        long j = 0;
        if (this.f20522 == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i = 0;
        long j2 = -7;
        boolean z = false;
        boolean z2 = false;
        do {
            C18474 c18474 = this.f20521;
            byte[] bArr = c18474.f58874;
            int i2 = c18474.f58875;
            int i3 = c18474.f58877;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        C6043 c6043 = new C6043();
                        c6043.m16429(j);
                        c6043.m16434writeByte((int) b);
                        if (!z) {
                            c6043.readByte();
                        }
                        throw new NumberFormatException("Number too large: ".concat(c6043.m16427()));
                    }
                    j = (j * 10) + ((long) i4);
                } else {
                    if (b != 45 || i != 0) {
                        if (i == 0) {
                            throw new NumberFormatException(C9576.m24440(new StringBuilder("Expected leading [0-9] or '-' character but was 0x"), b));
                        }
                        z2 = true;
                        break;
                    }
                    j2--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.f20521 = c18474.m42844();
                C7891.m20825(c18474);
            } else {
                c18474.f58875 = i2;
            }
            if (z2) {
                break;
            }
        } while (this.f20521 != null);
        this.f20522 -= (long) i;
        return z ? j : -j;
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۜۨ, reason: not valid java name and contains not printable characters */
    public final long mo16414() {
        int i;
        if (this.f20522 == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C18474 c18474 = this.f20521;
            byte[] bArr = c18474.f58874;
            int i3 = c18474.f58875;
            int i4 = c18474.f58877;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException(C9576.m24440(new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x"), b));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C6043 c6043 = new C6043();
                    c6043.m16432(j);
                    c6043.m16434writeByte((int) b);
                    throw new NumberFormatException("Number too large: ".concat(c6043.m16427()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f20521 = c18474.m42844();
                C7891.m20825(c18474);
            } else {
                c18474.f58875 = i3;
            }
            if (z) {
                break;
            }
        } while (this.f20521 != null);
        this.f20522 -= (long) i2;
        return j;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14511 m16398() {
        return new C14511(mo16422());
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C14511 mo16421(long j) {
        return new C14511(mo16420(j));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m16427() {
        try {
            return m16403(this.f20522, C15653.f50852);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo16404(Charset charset) {
        try {
            return m16403(this.f20522, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m16403(long j, Charset charset) {
        C15653.m37329(this.f20522, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException(C15489.m37074(j, "byteCount > Integer.MAX_VALUE: "));
        }
        if (j == 0) {
            return "";
        }
        C18474 c18474 = this.f20521;
        int i = c18474.f58875;
        if (((long) i) + j > c18474.f58877) {
            return new String(mo16420(j), charset);
        }
        String str = new String(c18474.f58874, i, (int) j, charset);
        int i2 = (int) (((long) c18474.f58875) + j);
        c18474.f58875 = i2;
        this.f20522 -= j;
        if (i2 == c18474.f58877) {
            this.f20521 = c18474.m42844();
            C7891.m20825(c18474);
        }
        return str;
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final String mo16426() {
        return mo16402(C17492.FOREVER_NS);
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo16402(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(C15489.m37074(j, "limit < 0: "));
        }
        long j2 = C17492.FOREVER_NS;
        if (j != C17492.FOREVER_NS) {
            j2 = j + 1;
        }
        long jM16400 = m16400((byte) 10, 0L, j2);
        if (jM16400 != -1) {
            return m16396(jM16400);
        }
        if (j2 < this.f20522 && m16423(j2 - 1) == 13 && m16423(j2) == 10) {
            return m16396(j2);
        }
        C6043 c6043 = new C6043();
        m16410(c6043, 0L, Math.min(32L, this.f20522));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f20522, j) + " content=" + c6043.m16398().mo34946() + (char) 8230);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m16396(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (m16423(j2) == 13) {
                String strM16403 = m16403(j2, C15653.f50852);
                skip(2L);
                return strM16403;
            }
        }
        String strM16404 = m16403(j, C15653.f50852);
        skip(1L);
        return strM16404;
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] mo16422() {
        try {
            return mo16420(this.f20522);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] mo16420(long j) throws EOFException {
        C15653.m37329(this.f20522, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException(C15489.m37074(j, "byteCount > Integer.MAX_VALUE: "));
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // l.InterfaceC23683
    public final void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        C15653.m37329(bArr.length, i, i2);
        C18474 c18474 = this.f20521;
        if (c18474 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c18474.f58877 - c18474.f58875);
        System.arraycopy(c18474.f58874, c18474.f58875, bArr, i, iMin);
        int i3 = c18474.f58875 + iMin;
        c18474.f58875 = i3;
        this.f20522 -= (long) iMin;
        if (i3 == c18474.f58877) {
            this.f20521 = c18474.m42844();
            C7891.m20825(c18474);
        }
        return iMin;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C18474 c18474 = this.f20521;
        if (c18474 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c18474.f58877 - c18474.f58875);
        byteBuffer.put(c18474.f58874, c18474.f58875, iMin);
        int i = c18474.f58875 + iMin;
        c18474.f58875 = i;
        this.f20522 -= (long) iMin;
        if (i == c18474.f58877) {
            this.f20521 = c18474.m42844();
            C7891.m20825(c18474);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16407() {
        try {
            skip(this.f20522);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC23683
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C18474 c18474 = this.f20521;
            if (c18474 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c18474.f58877 - c18474.f58875);
            long j2 = iMin;
            this.f20522 -= j2;
            j -= j2;
            C18474 c18475 = this.f20521;
            int i = c18475.f58875 + iMin;
            c18475.f58875 = i;
            if (i == c18475.f58877) {
                this.f20521 = c18475.m42844();
                C7891.m20825(c18475);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16412(C14511 c14511) {
        if (c14511 == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c14511.mo34941(this);
    }

    @Override // l.InterfaceC10983
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10983 mo16418(String str) {
        m16408(0, str.length(), str);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16408(int i, int i2, String str) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(C8479.m22141(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C2271.m6967("endIndex < beginIndex: ", i2, i, " < "));
        }
        if (i2 > str.length()) {
            StringBuilder sbM40153 = C17214.m40153(i2, "endIndex > string.length: ", " > ");
            sbM40153.append(str.length());
            throw new IllegalArgumentException(sbM40153.toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C18474 c18474M16406 = m16406(1);
                byte[] bArr = c18474M16406.f58874;
                int i3 = c18474M16406.f58877 - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c18474M16406.f58877;
                int i6 = (i3 + i) - i5;
                c18474M16406.f58877 = i5 + i6;
                this.f20522 += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    m16434writeByte((cCharAt2 >> 6) | 192);
                    m16434writeByte((cCharAt2 & '?') | 128);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    m16434writeByte((cCharAt2 >> '\f') | BERTags.FLAGS);
                    m16434writeByte(((cCharAt2 >> 6) & 63) | 128);
                    m16434writeByte((cCharAt2 & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char cCharAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        m16434writeByte(63);
                        i = i7;
                    } else {
                        int i8 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        m16434writeByte((i8 >> 18) | 240);
                        m16434writeByte(((i8 >> 12) & 63) | 128);
                        m16434writeByte(((i8 >> 6) & 63) | 128);
                        m16434writeByte((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m16419(int i) {
        if (i < 128) {
            m16434writeByte(i);
            return;
        }
        if (i < 2048) {
            m16434writeByte((i >> 6) | 192);
            m16434writeByte((i & 63) | 128);
            return;
        }
        if (i >= 65536) {
            if (i > 1114111) {
                throw new IllegalArgumentException(C9576.m24440(new StringBuilder("Unexpected code point: "), i));
            }
            m16434writeByte((i >> 18) | 240);
            m16434writeByte(((i >> 12) & 63) | 128);
            m16434writeByte(((i >> 6) & 63) | 128);
            m16434writeByte((i & 63) | 128);
            return;
        }
        if (i >= 55296 && i <= 57343) {
            m16434writeByte(63);
            return;
        }
        m16434writeByte((i >> 12) | BERTags.FLAGS);
        m16434writeByte(((i >> 6) & 63) | 128);
        m16434writeByte((i & 63) | 128);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16409(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError(C8479.m22141(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C2271.m6967("endIndex < beginIndex: ", i2, i, " < "));
        }
        if (i2 > str.length()) {
            StringBuilder sbM40153 = C17214.m40153(i2, "endIndex > string.length: ", " > ");
            sbM40153.append(str.length());
            throw new IllegalArgumentException(sbM40153.toString());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(C15653.f50852)) {
            m16408(i, i2, str);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            write(bytes, 0, bytes.length);
        }
    }

    @Override // l.InterfaceC10983
    public final InterfaceC10983 write(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        write(bArr, 0, bArr.length);
        return this;
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        C15653.m37329(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C18474 c18474M16406 = m16406(1);
            int iMin = Math.min(i3 - i, 8192 - c18474M16406.f58877);
            System.arraycopy(bArr, i, c18474M16406.f58874, c18474M16406.f58877, iMin);
            i += iMin;
            c18474M16406.f58877 += iMin;
        }
        this.f20522 += j;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C18474 c18474M16406 = m16406(1);
            int iMin = Math.min(i, 8192 - c18474M16406.f58877);
            byteBuffer.get(c18474M16406.f58874, c18474M16406.f58877, iMin);
            i -= iMin;
            c18474M16406.f58877 += iMin;
        }
        this.f20522 += (long) iRemaining;
        return iRemaining;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16411(InterfaceC10008 interfaceC10008) {
        if (interfaceC10008 == null) {
            throw new IllegalArgumentException("source == null");
        }
        while (interfaceC10008.mo2293(this, 8192L) != -1) {
        }
    }

    /* JADX INFO: renamed from: writeByte, reason: collision with other method in class */
    public final void m16434writeByte(int i) {
        C18474 c18474M16406 = m16406(1);
        byte[] bArr = c18474M16406.f58874;
        int i2 = c18474M16406.f58877;
        c18474M16406.f58877 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f20522++;
    }

    /* JADX INFO: renamed from: writeShort, reason: collision with other method in class */
    public final void m16436writeShort(int i) {
        C18474 c18474M16406 = m16406(2);
        byte[] bArr = c18474M16406.f58874;
        int i2 = c18474M16406.f58877;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c18474M16406.f58877 = i2 + 2;
        this.f20522 += 2;
    }

    /* JADX INFO: renamed from: writeInt, reason: collision with other method in class */
    public final void m16435writeInt(int i) {
        C18474 c18474M16406 = m16406(4);
        byte[] bArr = c18474M16406.f58874;
        int i2 = c18474M16406.f58877;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c18474M16406.f58877 = i2 + 4;
        this.f20522 += 4;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m16429(long j) {
        if (j == 0) {
            m16434writeByte(48);
            return;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m16408(0, 20, "-9223372036854775808");
                return;
            }
            z = true;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i = 2;
                }
            } else if (j < 1000000) {
                i = j < 100000 ? 5 : 6;
            } else {
                i = j < 10000000 ? 7 : 8;
            }
        } else if (j < BasicLabelFormatter.TRILLION) {
            if (j < 10000000000L) {
                i = j < 1000000000 ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else {
                i = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i = j < 10000000000000000L ? 16 : 17;
        } else {
            i = j < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        C18474 c18474M16406 = m16406(i);
        byte[] bArr = c18474M16406.f58874;
        int i2 = c18474M16406.f58877 + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f20520[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c18474M16406.f58877 += i;
        this.f20522 += (long) i;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m16432(long j) {
        if (j == 0) {
            m16434writeByte(48);
            return;
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C18474 c18474M16406 = m16406(iNumberOfTrailingZeros);
        byte[] bArr = c18474M16406.f58874;
        int i = c18474M16406.f58877;
        int i2 = i + iNumberOfTrailingZeros;
        while (true) {
            i2--;
            if (i2 >= i) {
                bArr[i2] = f20520[(int) (15 & j)];
                j >>>= 4;
            } else {
                c18474M16406.f58877 += iNumberOfTrailingZeros;
                this.f20522 += (long) iNumberOfTrailingZeros;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18474 m16406(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C18474 c18474 = this.f20521;
        if (c18474 == null) {
            C18474 c18474M20824 = C7891.m20824();
            this.f20521 = c18474M20824;
            c18474M20824.f58878 = c18474M20824;
            c18474M20824.f58876 = c18474M20824;
            return c18474M20824;
        }
        C18474 c18475 = c18474.f58878;
        if (c18475.f58877 + i <= 8192 && c18475.f58873) {
            return c18475;
        }
        C18474 c18474M20825 = C7891.m20824();
        c18475.m42845(c18474M20825);
        return c18474M20825;
    }

    @Override // l.InterfaceC8597
    /* JADX INFO: renamed from: ۙ */
    public final void mo5901(C6043 c6043, long j) {
        C18474 c18474M20824;
        if (c6043 == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c6043 == this) {
            throw new IllegalArgumentException("source == this");
        }
        C15653.m37329(c6043.f20522, 0L, j);
        while (j > 0) {
            C18474 c18474 = c6043.f20521;
            int i = c18474.f58877 - c18474.f58875;
            if (j < i) {
                C18474 c18475 = this.f20521;
                C18474 c18476 = c18475 != null ? c18475.f58878 : null;
                if (c18476 != null && c18476.f58873) {
                    if ((((long) c18476.f58877) + j) - ((long) (c18476.f58872 ? 0 : c18476.f58875)) <= 8192) {
                        c18474.m42846(c18476, (int) j);
                        c6043.f20522 -= j;
                        this.f20522 += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    throw new IllegalArgumentException();
                }
                if (i2 >= 1024) {
                    c18474M20824 = c18474.m42847();
                } else {
                    c18474M20824 = C7891.m20824();
                    System.arraycopy(c18474.f58874, c18474.f58875, c18474M20824.f58874, 0, i2);
                }
                c18474M20824.f58877 = c18474M20824.f58875 + i2;
                c18474.f58875 += i2;
                c18474.f58878.m42845(c18474M20824);
                c6043.f20521 = c18474M20824;
            }
            C18474 c18477 = c6043.f20521;
            long j2 = c18477.f58877 - c18477.f58875;
            c6043.f20521 = c18477.m42844();
            C18474 c18478 = this.f20521;
            if (c18478 == null) {
                this.f20521 = c18477;
                c18477.f58878 = c18477;
                c18477.f58876 = c18477;
            } else {
                c18478.f58878.m42845(c18477);
                C18474 c18479 = c18477.f58878;
                if (c18479 == c18477) {
                    throw new IllegalStateException();
                }
                if (c18479.f58873) {
                    int i3 = c18477.f58877 - c18477.f58875;
                    if (i3 <= (8192 - c18479.f58877) + (c18479.f58872 ? 0 : c18479.f58875)) {
                        c18477.m42846(c18479, i3);
                        c18477.m42844();
                        C7891.m20825(c18477);
                    }
                }
            }
            c6043.f20522 -= j2;
            this.f20522 += j2;
            j -= j2;
        }
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ */
    public final long mo2293(C6043 c6043, long j) {
        if (c6043 == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException(C15489.m37074(j, "byteCount < 0: "));
        }
        long j2 = this.f20522;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c6043.mo5901(this, j);
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m16400(byte b, long j, long j2) {
        C18474 c18474;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            StringBuilder sbM39970 = C17114.m39970("size=", " fromIndex=", this.f20522);
            sbM39970.append(j);
            sbM39970.append(" toIndex=");
            sbM39970.append(j2);
            throw new IllegalArgumentException(sbM39970.toString());
        }
        long j4 = this.f20522;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c18474 = this.f20521) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c18474 = c18474.f58878;
                j4 -= (long) (c18474.f58877 - c18474.f58875);
            }
        } else {
            while (true) {
                long j5 = ((long) (c18474.f58877 - c18474.f58875)) + j3;
                if (j5 >= j) {
                    break;
                }
                c18474 = c18474.f58876;
                j3 = j5;
            }
            j4 = j3;
        }
        while (j4 < j2) {
            byte[] bArr = c18474.f58874;
            int iMin = (int) Math.min(c18474.f58877, (((long) c18474.f58875) + j2) - j4);
            for (int i = (int) ((((long) c18474.f58875) + j) - j4); i < iMin; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - c18474.f58875)) + j4;
                }
            }
            j4 += (long) (c18474.f58877 - c18474.f58875);
            c18474 = c18474.f58876;
            j = j4;
        }
        return -1L;
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo16424(C14511 c14511) {
        int iMo34938 = c14511.mo34938();
        if (iMo34938 >= 0 && this.f20522 >= iMo34938 && c14511.mo34938() >= iMo34938) {
            for (int i = 0; i < iMo34938; i++) {
                if (m16423(i) == c14511.mo34939(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo2292() {
        return C20591.f67091;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6043)) {
            return false;
        }
        C6043 c6043 = (C6043) obj;
        long j = this.f20522;
        if (j != c6043.f20522) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C18474 c18474 = this.f20521;
        C18474 c18475 = c6043.f20521;
        int i = c18474.f58875;
        int i2 = c18475.f58875;
        while (j2 < this.f20522) {
            long jMin = Math.min(c18474.f58877 - i, c18475.f58877 - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c18474.f58874[i] != c18475.f58874[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c18474.f58877) {
                c18474 = c18474.f58876;
                i = c18474.f58875;
            }
            if (i2 == c18475.f58877) {
                c18475 = c18475.f58876;
                i2 = c18475.f58875;
            }
            j2 += jMin;
        }
        return true;
    }

    public final int hashCode() {
        C18474 c18474 = this.f20521;
        if (c18474 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c18474.f58877;
            for (int i3 = c18474.f58875; i3 < i2; i3++) {
                i = (i * 31) + c18474.f58874[i3];
            }
            c18474 = c18474.f58876;
        } while (c18474 != this.f20521);
        return i;
    }

    public final Object clone() {
        C6043 c6043 = new C6043();
        if (this.f20522 == 0) {
            return c6043;
        }
        C18474 c18474M42847 = this.f20521.m42847();
        c6043.f20521 = c18474M42847;
        c18474M42847.f58878 = c18474M42847;
        c18474M42847.f58876 = c18474M42847;
        C18474 c18474 = this.f20521;
        while (true) {
            c18474 = c18474.f58876;
            if (c18474 != this.f20521) {
                c6043.f20521.f58878.m42845(c18474.m42847());
            } else {
                c6043.f20522 = this.f20522;
                return c6043;
            }
        }
    }

    public final String toString() {
        C14511 c19180;
        long j = this.f20522;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                c19180 = C14511.f47541;
            } else {
                c19180 = new C19180(this, i);
            }
            return c19180.toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f20522);
    }
}
