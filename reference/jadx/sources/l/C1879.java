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

/* JADX INFO: renamed from: l.֫ۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes3.dex */
public final class C1879 implements InterfaceC25000, InterfaceC11573, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f6312 = {UTF8.S_P3A, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9335 f6313;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f6314;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, l.InterfaceC7099
    public final void close() {
    }

    @Override // l.InterfaceC11573, l.InterfaceC7099, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ֫ */
    public final C1879 mo4172() {
        return this;
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11573 mo6431() {
        return this;
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۙ */
    public final long mo4175(InterfaceC7099 interfaceC7099) {
        throw null;
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public final OutputStream mo6445() {
        throw null;
    }

    @Override // l.InterfaceC11573
    public final /* bridge */ /* synthetic */ InterfaceC11573 writeByte(int i) {
        m6455writeByte(i);
        return this;
    }

    @Override // l.InterfaceC11573
    public final /* bridge */ /* synthetic */ InterfaceC11573 writeInt(int i) {
        m6456writeInt(i);
        return this;
    }

    @Override // l.InterfaceC11573
    public final /* bridge */ /* synthetic */ InterfaceC11573 writeShort(int i) {
        m6457writeShort(i);
        return this;
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC11573 mo6435(C16794 c16794) {
        m6441(c16794);
        return this;
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC11573 mo6447(long j) {
        m6448(j);
        return this;
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC11573 mo6452(int i, int i2, byte[] bArr) {
        write(bArr, i, i2);
        return this;
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ InterfaceC11573 mo6453(long j) {
        m6454(j);
        return this;
    }

    public final long size() {
        return this.f6314;
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۧ᩷ */
    public final boolean mo4182() {
        return this.f6314 == 0;
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4184(long j) throws EOFException {
        if (this.f6314 < j) {
            throw new EOFException();
        }
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ܺۤ */
    public final InputStream mo4183() {
        return new C5608(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6439(C1879 c1879, long j, long j2) {
        if (c1879 == null) {
            throw new IllegalArgumentException("out == null");
        }
        C11222.m28280(this.f6314, j, j2);
        if (j2 == 0) {
            return;
        }
        c1879.f6314 += j2;
        C9335 c9335 = this.f6313;
        while (true) {
            long j3 = c9335.f30348 - c9335.f30347;
            if (j < j3) {
                break;
            }
            j -= j3;
            c9335 = c9335.f30344;
        }
        while (j2 > 0) {
            C9335 c9335M24588 = c9335.m24588();
            int i = (int) (((long) c9335M24588.f30347) + j);
            c9335M24588.f30347 = i;
            c9335M24588.f30348 = Math.min(i + ((int) j2), c9335M24588.f30348);
            C9335 c9336 = c1879.f6313;
            if (c9336 == null) {
                c9335M24588.f30346 = c9335M24588;
                c9335M24588.f30344 = c9335M24588;
                c1879.f6313 = c9335M24588;
            } else {
                c9336.f30346.m24586(c9335M24588);
            }
            j2 -= (long) (c9335M24588.f30348 - c9335M24588.f30347);
            c9335 = c9335.f30344;
            j = 0;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m6450() {
        long j = this.f6314;
        if (j == 0) {
            return 0L;
        }
        C9335 c9335 = this.f6313.f30346;
        int i = c9335.f30348;
        return (i >= 8192 || !c9335.f30349) ? j : j - ((long) (i - c9335.f30347));
    }

    @Override // l.InterfaceC25000
    public final byte readByte() {
        long j = this.f6314;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        C9335 c9335 = this.f6313;
        int i = c9335.f30347;
        int i2 = c9335.f30348;
        int i3 = i + 1;
        byte b = c9335.f30343[i];
        this.f6314 = j - 1;
        if (i3 == i2) {
            this.f6313 = c9335.m24585();
            C2624.m8766(c9335);
            return b;
        }
        c9335.f30347 = i3;
        return b;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte m6449(long j) {
        int i;
        C11222.m28280(this.f6314, j, 1L);
        long j2 = this.f6314;
        if (j2 - j > j) {
            C9335 c9335 = this.f6313;
            while (true) {
                int i2 = c9335.f30348;
                int i3 = c9335.f30347;
                long j3 = i2 - i3;
                if (j >= j3) {
                    j -= j3;
                    c9335 = c9335.f30344;
                } else {
                    return c9335.f30343[i3 + ((int) j)];
                }
            }
        } else {
            long j4 = j - j2;
            C9335 c9336 = this.f6313;
            do {
                c9336 = c9336.f30346;
                int i4 = c9336.f30348;
                i = c9336.f30347;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return c9336.f30343[i + ((int) j4)];
        }
    }

    @Override // l.InterfaceC25000
    public final short readShort() {
        long j = this.f6314;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f6314);
        }
        C9335 c9335 = this.f6313;
        int i = c9335.f30347;
        int i2 = c9335.f30348;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c9335.f30343;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f6314 = j - 2;
        if (i5 == i2) {
            this.f6313 = c9335.m24585();
            C2624.m8766(c9335);
        } else {
            c9335.f30347 = i5;
        }
        return (short) i6;
    }

    @Override // l.InterfaceC25000
    public final int readInt() {
        long j = this.f6314;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f6314);
        }
        C9335 c9335 = this.f6313;
        int i = c9335.f30347;
        int i2 = c9335.f30348;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c9335.f30343;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f6314 = j - 4;
        if (i5 == i2) {
            this.f6313 = c9335.m24585();
            C2624.m8766(c9335);
            return i6;
        }
        c9335.f30347 = i5;
        return i6;
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۗ᩷ */
    public final long mo4173() {
        long j = 0;
        if (this.f6314 == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i = 0;
        long j2 = -7;
        boolean z = false;
        boolean z2 = false;
        do {
            C9335 c9335 = this.f6313;
            byte[] bArr = c9335.f30343;
            int i2 = c9335.f30347;
            int i3 = c9335.f30348;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        C1879 c1879 = new C1879();
                        c1879.m6448(j);
                        c1879.m6455writeByte((int) b);
                        if (!z) {
                            c1879.readByte();
                        }
                        throw new NumberFormatException("Number too large: ".concat(c1879.m6446()));
                    }
                    j = (j * 10) + ((long) i4);
                } else {
                    if (b != 45 || i != 0) {
                        if (i == 0) {
                            throw new NumberFormatException(C4791.m14766(new StringBuilder("Expected leading [0-9] or '-' character but was 0x"), b));
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
                this.f6313 = c9335.m24585();
                C2624.m8766(c9335);
            } else {
                c9335.f30347 = i2;
            }
            if (z2) {
                break;
            }
        } while (this.f6313 != null);
        this.f6314 -= (long) i;
        return z ? j : -j;
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ᩻ۤ */
    public final long mo4189() {
        int i;
        if (this.f6314 == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C9335 c9335 = this.f6313;
            byte[] bArr = c9335.f30343;
            int i3 = c9335.f30347;
            int i4 = c9335.f30348;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException(C4791.m14766(new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x"), b));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C1879 c1879 = new C1879();
                    c1879.m6454(j);
                    c1879.m6455writeByte((int) b);
                    throw new NumberFormatException("Number too large: ".concat(c1879.m6446()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f6313 = c9335.m24585();
                C2624.m8766(c9335);
            } else {
                c9335.f30347 = i3;
            }
            if (z) {
                break;
            }
        } while (this.f6313 != null);
        this.f6314 -= (long) i2;
        return j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16794 m6443() {
        return new C16794(mo4179());
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۚ */
    public final C16794 mo4178(long j) {
        return new C16794(mo4180(j));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m6446() {
        try {
            return m6433(this.f6314, C11222.f35388);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۙ */
    public final String mo4177(Charset charset) {
        try {
            return m6433(this.f6314, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m6433(long j, Charset charset) {
        C11222.m28280(this.f6314, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException(C24770.m55292(j, "byteCount > Integer.MAX_VALUE: "));
        }
        if (j == 0) {
            return "";
        }
        C9335 c9335 = this.f6313;
        int i = c9335.f30347;
        if (((long) i) + j > c9335.f30348) {
            return new String(mo4180(j), charset);
        }
        String str = new String(c9335.f30343, i, (int) j, charset);
        int i2 = (int) (((long) c9335.f30347) + j);
        c9335.f30347 = i2;
        this.f6314 -= j;
        if (i2 == c9335.f30348) {
            this.f6313 = c9335.m24585();
            C2624.m8766(c9335);
        }
        return str;
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ᩵ۙ */
    public final String mo4185() {
        return mo4176(C25227.FOREVER_NS);
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۙ */
    public final String mo4176(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(C24770.m55292(j, "limit < 0: "));
        }
        long j2 = C25227.FOREVER_NS;
        if (j != C25227.FOREVER_NS) {
            j2 = j + 1;
        }
        long jM6432 = m6432((byte) 10, 0L, j2);
        if (jM6432 != -1) {
            return m6451(jM6432);
        }
        if (j2 < this.f6314 && m6449(j2 - 1) == 13 && m6449(j2) == 10) {
            return m6451(j2);
        }
        C1879 c1879 = new C1879();
        m6439(c1879, 0L, Math.min(32L, this.f6314));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f6314, j) + " content=" + c1879.m6443().mo23091() + (char) 8230);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m6451(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (m6449(j2) == 13) {
                String strM6433 = m6433(j2, C11222.f35388);
                skip(2L);
                return strM6433;
            }
        }
        String strM6434 = m6433(j, C11222.f35388);
        skip(1L);
        return strM6434;
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۚ᩷ */
    public final byte[] mo4179() {
        try {
            return mo4180(this.f6314);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۤ */
    public final byte[] mo4180(long j) throws EOFException {
        C11222.m28280(this.f6314, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException(C24770.m55292(j, "byteCount > Integer.MAX_VALUE: "));
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // l.InterfaceC25000
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
        C11222.m28280(bArr.length, i, i2);
        C9335 c9335 = this.f6313;
        if (c9335 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c9335.f30348 - c9335.f30347);
        System.arraycopy(c9335.f30343, c9335.f30347, bArr, i, iMin);
        int i3 = c9335.f30347 + iMin;
        c9335.f30347 = i3;
        this.f6314 -= (long) iMin;
        if (i3 == c9335.f30348) {
            this.f6313 = c9335.m24585();
            C2624.m8766(c9335);
        }
        return iMin;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C9335 c9335 = this.f6313;
        if (c9335 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c9335.f30348 - c9335.f30347);
        byteBuffer.put(c9335.f30343, c9335.f30347, iMin);
        int i = c9335.f30347 + iMin;
        c9335.f30347 = i;
        this.f6314 -= (long) iMin;
        if (i == c9335.f30348) {
            this.f6313 = c9335.m24585();
            C2624.m8766(c9335);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6436() {
        try {
            skip(this.f6314);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC25000
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C9335 c9335 = this.f6313;
            if (c9335 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c9335.f30348 - c9335.f30347);
            long j2 = iMin;
            this.f6314 -= j2;
            j -= j2;
            C9335 c9336 = this.f6313;
            int i = c9336.f30347 + iMin;
            c9336.f30347 = i;
            if (i == c9336.f30348) {
                this.f6313 = c9336.m24585();
                C2624.m8766(c9336);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6441(C16794 c16794) {
        if (c16794 == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c16794.mo23084(this);
    }

    @Override // l.InterfaceC11573
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11573 mo6442(String str) {
        m6437(0, str.length(), str);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6437(int i, int i2, String str) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(C13645.m33382(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C6934.m19217("endIndex < beginIndex: ", i2, i, " < "));
        }
        if (i2 > str.length()) {
            StringBuilder sbM12235 = C3769.m12235(i2, "endIndex > string.length: ", " > ");
            sbM12235.append(str.length());
            throw new IllegalArgumentException(sbM12235.toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C9335 c9335M6434 = m6434(1);
                byte[] bArr = c9335M6434.f30343;
                int i3 = c9335M6434.f30348 - i;
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
                int i5 = c9335M6434.f30348;
                int i6 = (i3 + i) - i5;
                c9335M6434.f30348 = i5 + i6;
                this.f6314 += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    m6455writeByte((cCharAt2 >> 6) | 192);
                    m6455writeByte((cCharAt2 & '?') | 128);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    m6455writeByte((cCharAt2 >> '\f') | BERTags.FLAGS);
                    m6455writeByte(((cCharAt2 >> 6) & 63) | 128);
                    m6455writeByte((cCharAt2 & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char cCharAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        m6455writeByte(63);
                        i = i7;
                    } else {
                        int i8 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        m6455writeByte((i8 >> 18) | 240);
                        m6455writeByte(((i8 >> 12) & 63) | 128);
                        m6455writeByte(((i8 >> 6) & 63) | 128);
                        m6455writeByte((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m6444(int i) {
        if (i < 128) {
            m6455writeByte(i);
            return;
        }
        if (i < 2048) {
            m6455writeByte((i >> 6) | 192);
            m6455writeByte((i & 63) | 128);
            return;
        }
        if (i >= 65536) {
            if (i > 1114111) {
                throw new IllegalArgumentException(C4791.m14766(new StringBuilder("Unexpected code point: "), i));
            }
            m6455writeByte((i >> 18) | 240);
            m6455writeByte(((i >> 12) & 63) | 128);
            m6455writeByte(((i >> 6) & 63) | 128);
            m6455writeByte((i & 63) | 128);
            return;
        }
        if (i >= 55296 && i <= 57343) {
            m6455writeByte(63);
            return;
        }
        m6455writeByte((i >> 12) | BERTags.FLAGS);
        m6455writeByte(((i >> 6) & 63) | 128);
        m6455writeByte((i & 63) | 128);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6438(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError(C13645.m33382(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C6934.m19217("endIndex < beginIndex: ", i2, i, " < "));
        }
        if (i2 > str.length()) {
            StringBuilder sbM12235 = C3769.m12235(i2, "endIndex > string.length: ", " > ");
            sbM12235.append(str.length());
            throw new IllegalArgumentException(sbM12235.toString());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(C11222.f35388)) {
            m6437(i, i2, str);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            write(bytes, 0, bytes.length);
        }
    }

    @Override // l.InterfaceC11573
    public final InterfaceC11573 write(byte[] bArr) {
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
        C11222.m28280(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C9335 c9335M6434 = m6434(1);
            int iMin = Math.min(i3 - i, 8192 - c9335M6434.f30348);
            System.arraycopy(bArr, i, c9335M6434.f30343, c9335M6434.f30348, iMin);
            i += iMin;
            c9335M6434.f30348 += iMin;
        }
        this.f6314 += j;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C9335 c9335M6434 = m6434(1);
            int iMin = Math.min(i, 8192 - c9335M6434.f30348);
            byteBuffer.get(c9335M6434.f30343, c9335M6434.f30348, iMin);
            i -= iMin;
            c9335M6434.f30348 += iMin;
        }
        this.f6314 += (long) iRemaining;
        return iRemaining;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6440(InterfaceC13810 interfaceC13810) {
        if (interfaceC13810 == null) {
            throw new IllegalArgumentException("source == null");
        }
        while (interfaceC13810.mo4186(this, 8192L) != -1) {
        }
    }

    /* JADX INFO: renamed from: writeByte, reason: collision with other method in class */
    public final void m6455writeByte(int i) {
        C9335 c9335M6434 = m6434(1);
        byte[] bArr = c9335M6434.f30343;
        int i2 = c9335M6434.f30348;
        c9335M6434.f30348 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f6314++;
    }

    /* JADX INFO: renamed from: writeShort, reason: collision with other method in class */
    public final void m6457writeShort(int i) {
        C9335 c9335M6434 = m6434(2);
        byte[] bArr = c9335M6434.f30343;
        int i2 = c9335M6434.f30348;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c9335M6434.f30348 = i2 + 2;
        this.f6314 += 2;
    }

    /* JADX INFO: renamed from: writeInt, reason: collision with other method in class */
    public final void m6456writeInt(int i) {
        C9335 c9335M6434 = m6434(4);
        byte[] bArr = c9335M6434.f30343;
        int i2 = c9335M6434.f30348;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c9335M6434.f30348 = i2 + 4;
        this.f6314 += 4;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m6448(long j) {
        if (j == 0) {
            m6455writeByte(48);
            return;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m6437(0, 20, "-9223372036854775808");
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
        C9335 c9335M6434 = m6434(i);
        byte[] bArr = c9335M6434.f30343;
        int i2 = c9335M6434.f30348 + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f6312[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c9335M6434.f30348 += i;
        this.f6314 += (long) i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m6454(long j) {
        if (j == 0) {
            m6455writeByte(48);
            return;
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C9335 c9335M6434 = m6434(iNumberOfTrailingZeros);
        byte[] bArr = c9335M6434.f30343;
        int i = c9335M6434.f30348;
        int i2 = i + iNumberOfTrailingZeros;
        while (true) {
            i2--;
            if (i2 >= i) {
                bArr[i2] = f6312[(int) (15 & j)];
                j >>>= 4;
            } else {
                c9335M6434.f30348 += iNumberOfTrailingZeros;
                this.f6314 += (long) iNumberOfTrailingZeros;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9335 m6434(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C9335 c9335 = this.f6313;
        if (c9335 == null) {
            C9335 c9335M8765 = C2624.m8765();
            this.f6313 = c9335M8765;
            c9335M8765.f30346 = c9335M8765;
            c9335M8765.f30344 = c9335M8765;
            return c9335M8765;
        }
        C9335 c9336 = c9335.f30346;
        if (c9336.f30348 + i <= 8192 && c9336.f30349) {
            return c9336;
        }
        C9335 c9335M8766 = C2624.m8765();
        c9336.m24586(c9335M8766);
        return c9335M8766;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۙ */
    public final void mo6066(C1879 c1879, long j) {
        C9335 c9335M8765;
        if (c1879 == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c1879 == this) {
            throw new IllegalArgumentException("source == this");
        }
        C11222.m28280(c1879.f6314, 0L, j);
        while (j > 0) {
            C9335 c9335 = c1879.f6313;
            int i = c9335.f30348 - c9335.f30347;
            if (j < i) {
                C9335 c9336 = this.f6313;
                C9335 c9337 = c9336 != null ? c9336.f30346 : null;
                if (c9337 != null && c9337.f30349) {
                    if ((((long) c9337.f30348) + j) - ((long) (c9337.f30345 ? 0 : c9337.f30347)) <= 8192) {
                        c9335.m24587(c9337, (int) j);
                        c1879.f6314 -= j;
                        this.f6314 += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    throw new IllegalArgumentException();
                }
                if (i2 >= 1024) {
                    c9335M8765 = c9335.m24588();
                } else {
                    c9335M8765 = C2624.m8765();
                    System.arraycopy(c9335.f30343, c9335.f30347, c9335M8765.f30343, 0, i2);
                }
                c9335M8765.f30348 = c9335M8765.f30347 + i2;
                c9335.f30347 += i2;
                c9335.f30346.m24586(c9335M8765);
                c1879.f6313 = c9335M8765;
            }
            C9335 c9338 = c1879.f6313;
            long j2 = c9338.f30348 - c9338.f30347;
            c1879.f6313 = c9338.m24585();
            C9335 c9339 = this.f6313;
            if (c9339 == null) {
                this.f6313 = c9338;
                c9338.f30346 = c9338;
                c9338.f30344 = c9338;
            } else {
                c9339.f30346.m24586(c9338);
                C9335 c93310 = c9338.f30346;
                if (c93310 == c9338) {
                    throw new IllegalStateException();
                }
                if (c93310.f30349) {
                    int i3 = c9338.f30348 - c9338.f30347;
                    if (i3 <= (8192 - c93310.f30348) + (c93310.f30345 ? 0 : c93310.f30347)) {
                        c9338.m24587(c93310, i3);
                        c9338.m24585();
                        C2624.m8766(c9338);
                    }
                }
            }
            c1879.f6314 -= j2;
            this.f6314 += j2;
            j -= j2;
        }
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    public final long mo4186(C1879 c1879, long j) {
        if (c1879 == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException(C24770.m55292(j, "byteCount < 0: "));
        }
        long j2 = this.f6314;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c1879.mo6066(this, j);
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m6432(byte b, long j, long j2) {
        C9335 c9335;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            StringBuilder sbM8289 = C2458.m8289("size=", " fromIndex=", this.f6314);
            sbM8289.append(j);
            sbM8289.append(" toIndex=");
            sbM8289.append(j2);
            throw new IllegalArgumentException(sbM8289.toString());
        }
        long j4 = this.f6314;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c9335 = this.f6313) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c9335 = c9335.f30346;
                j4 -= (long) (c9335.f30348 - c9335.f30347);
            }
        } else {
            while (true) {
                long j5 = ((long) (c9335.f30348 - c9335.f30347)) + j3;
                if (j5 >= j) {
                    break;
                }
                c9335 = c9335.f30344;
                j3 = j5;
            }
            j4 = j3;
        }
        while (j4 < j2) {
            byte[] bArr = c9335.f30343;
            int iMin = (int) Math.min(c9335.f30348, (((long) c9335.f30347) + j2) - j4);
            for (int i = (int) ((((long) c9335.f30347) + j) - j4); i < iMin; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - c9335.f30347)) + j4;
                }
            }
            j4 += (long) (c9335.f30348 - c9335.f30347);
            c9335 = c9335.f30344;
            j = j4;
        }
        return -1L;
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo4188(C16794 c16794) {
        int iMo23081 = c16794.mo23081();
        if (iMo23081 >= 0 && this.f6314 >= iMo23081 && c16794.mo23081() >= iMo23081) {
            for (int i = 0; i < iMo23081; i++) {
                if (m6449(i) == c16794.mo23082(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo4181() {
        return C22411.f72586;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1879)) {
            return false;
        }
        C1879 c1879 = (C1879) obj;
        long j = this.f6314;
        if (j != c1879.f6314) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C9335 c9335 = this.f6313;
        C9335 c9336 = c1879.f6313;
        int i = c9335.f30347;
        int i2 = c9336.f30347;
        while (j2 < this.f6314) {
            long jMin = Math.min(c9335.f30348 - i, c9336.f30348 - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c9335.f30343[i] != c9336.f30343[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c9335.f30348) {
                c9335 = c9335.f30344;
                i = c9335.f30347;
            }
            if (i2 == c9336.f30348) {
                c9336 = c9336.f30344;
                i2 = c9336.f30347;
            }
            j2 += jMin;
        }
        return true;
    }

    public final int hashCode() {
        C9335 c9335 = this.f6313;
        if (c9335 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c9335.f30348;
            for (int i3 = c9335.f30347; i3 < i2; i3++) {
                i = (i * 31) + c9335.f30343[i3];
            }
            c9335 = c9335.f30344;
        } while (c9335 != this.f6313);
        return i;
    }

    public final Object clone() {
        C1879 c1879 = new C1879();
        if (this.f6314 == 0) {
            return c1879;
        }
        C9335 c9335M24588 = this.f6313.m24588();
        c1879.f6313 = c9335M24588;
        c9335M24588.f30346 = c9335M24588;
        c9335M24588.f30344 = c9335M24588;
        C9335 c9335 = this.f6313;
        while (true) {
            c9335 = c9335.f30344;
            if (c9335 != this.f6313) {
                c1879.f6313.f30346.m24586(c9335.m24588());
            } else {
                c1879.f6314 = this.f6314;
                return c1879;
            }
        }
    }

    public final String toString() {
        C16794 c8590;
        long j = this.f6314;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                c8590 = C16794.f54179;
            } else {
                c8590 = new C8590(this, i);
            }
            return c8590.toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f6314);
    }
}
