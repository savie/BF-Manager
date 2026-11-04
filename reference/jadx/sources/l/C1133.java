package l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.֨ۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34CP */
/* JADX INFO: loaded from: classes3.dex */
public final class C1133 implements InterfaceC25000 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1879 f4207 = new C1879();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13810 f4208;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f4209;

    public C1133(InterfaceC13810 interfaceC13810) {
        if (interfaceC13810 == null) {
            throw new NullPointerException("source == null");
        }
        this.f4208 = interfaceC13810;
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1879 mo4172() {
        return this.f4207;
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long mo4186(C1879 c1879, long j) {
        if (c1879 == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException(C24770.m55292(j, "byteCount < 0: "));
        }
        if (this.f4209) {
            throw new IllegalStateException("closed");
        }
        C1879 c18710 = this.f4207;
        if (c18710.f6314 == 0 && this.f4208.mo4186(c18710, 8192L) == -1) {
            return -1L;
        }
        return c18710.mo4186(c1879, Math.min(j, c18710.f6314));
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo4182() {
        if (this.f4209) {
            throw new IllegalStateException("closed");
        }
        C1879 c1879 = this.f4207;
        return c1879.mo4182() && this.f4208.mo4186(c1879, 8192L) == -1;
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo4184(long j) throws EOFException {
        if (!m4187(j)) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m4187(long j) {
        C1879 c1879;
        if (j < 0) {
            throw new IllegalArgumentException(C24770.m55292(j, "byteCount < 0: "));
        }
        if (this.f4209) {
            throw new IllegalStateException("closed");
        }
        do {
            c1879 = this.f4207;
            if (c1879.f6314 >= j) {
                return true;
            }
        } while (this.f4208.mo4186(c1879, 8192L) != -1);
        return false;
    }

    @Override // l.InterfaceC25000
    public final byte readByte() throws EOFException {
        mo4184(1L);
        return this.f4207.readByte();
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16794 mo4178(long j) throws EOFException {
        mo4184(j);
        return this.f4207.mo4178(j);
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] mo4179() {
        InterfaceC13810 interfaceC13810 = this.f4208;
        C1879 c1879 = this.f4207;
        c1879.m6440(interfaceC13810);
        return c1879.mo4179();
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] mo4180(long j) throws EOFException {
        mo4184(j);
        return this.f4207.mo4180(j);
    }

    @Override // l.InterfaceC25000
    public final void readFully(byte[] bArr) throws EOFException {
        C1879 c1879 = this.f4207;
        try {
            mo4184(bArr.length);
            c1879.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = c1879.f6314;
                if (j > 0) {
                    int i2 = c1879.read(bArr, i, (int) j);
                    if (i2 == -1) {
                        throw new AssertionError();
                    }
                    i += i2;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C1879 c1879 = this.f4207;
        if (c1879.f6314 == 0 && this.f4208.mo4186(c1879, 8192L) == -1) {
            return -1;
        }
        return c1879.read(byteBuffer);
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo4175(InterfaceC7099 interfaceC7099) {
        C1879 c1879;
        long j = 0;
        while (true) {
            InterfaceC13810 interfaceC13810 = this.f4208;
            c1879 = this.f4207;
            if (interfaceC13810.mo4186(c1879, 8192L) == -1) {
                break;
            }
            long jM6450 = c1879.m6450();
            if (jM6450 > 0) {
                j += jM6450;
                interfaceC7099.mo6066(c1879, jM6450);
            }
        }
        long j2 = c1879.f6314;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        interfaceC7099.mo6066(c1879, j2);
        return j3;
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo4177(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        InterfaceC13810 interfaceC13810 = this.f4208;
        C1879 c1879 = this.f4207;
        c1879.m6440(interfaceC13810);
        return c1879.mo4177(charset);
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final String mo4185() {
        return mo4176(C25227.FOREVER_NS);
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo4176(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(C24770.m55292(j, "limit < 0: "));
        }
        long j2 = j == C25227.FOREVER_NS ? Long.MAX_VALUE : j + 1;
        long jM4174 = m4174((byte) 10, 0L, j2);
        C1879 c1879 = this.f4207;
        if (jM4174 != -1) {
            return c1879.m6451(jM4174);
        }
        if (j2 < C25227.FOREVER_NS && m4187(j2) && c1879.m6449(j2 - 1) == 13 && m4187(1 + j2) && c1879.m6449(j2) == 10) {
            return c1879.m6451(j2);
        }
        C1879 c18710 = new C1879();
        c1879.m6439(c18710, 0L, Math.min(32L, c1879.f6314));
        throw new EOFException("\\n not found: limit=" + Math.min(c1879.f6314, j) + " content=" + c18710.m6443().mo23091() + (char) 8230);
    }

    @Override // l.InterfaceC25000
    public final short readShort() throws EOFException {
        mo4184(2L);
        return this.f4207.readShort();
    }

    @Override // l.InterfaceC25000
    public final int readInt() throws EOFException {
        mo4184(4L);
        return this.f4207.readInt();
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public final long mo4173() throws EOFException {
        C1879 c1879;
        mo4184(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zM4187 = m4187(i2);
            c1879 = this.f4207;
            if (!zM4187) {
                break;
            }
            byte bM6449 = c1879.m6449(i);
            if ((bM6449 < 48 || bM6449 > 57) && !(i == 0 && bM6449 == 45)) {
                if (i != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(bM6449)));
            }
            i = i2;
        }
        return c1879.mo4173();
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ᩻ۤ, reason: not valid java name and contains not printable characters */
    public final long mo4189() throws EOFException {
        C1879 c1879;
        mo4184(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zM4187 = m4187(i2);
            c1879 = this.f4207;
            if (!zM4187) {
                break;
            }
            byte bM6449 = c1879.m6449(i);
            if ((bM6449 < 48 || bM6449 > 57) && ((bM6449 < 97 || bM6449 > 102) && (bM6449 < 65 || bM6449 > 70))) {
                if (i != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bM6449)));
            }
            i = i2;
        }
        return c1879.mo4189();
    }

    @Override // l.InterfaceC25000
    public final void skip(long j) throws EOFException {
        if (this.f4209) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C1879 c1879 = this.f4207;
            if (c1879.f6314 == 0 && this.f4208.mo4186(c1879, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c1879.f6314);
            c1879.skip(jMin);
            j -= jMin;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m4174(byte b, long j, long j2) {
        if (this.f4209) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(C24770.m55292(j2, "fromIndex=0 toIndex="));
        }
        while (jMax < j2) {
            long jM6432 = this.f4207.m6432(b, jMax, j2);
            if (jM6432 != -1) {
                return jM6432;
            }
            C1879 c1879 = this.f4207;
            long j3 = c1879.f6314;
            if (j3 >= j2 || this.f4208.mo4186(c1879, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo4188(C16794 c16794) {
        int iMo23081 = c16794.mo23081();
        if (this.f4209) {
            throw new IllegalStateException("closed");
        }
        if (iMo23081 >= 0 && c16794.mo23081() >= iMo23081) {
            for (int i = 0; i < iMo23081; i++) {
                long j = i;
                if (m4187(1 + j) && this.f4207.m6449(j) == c16794.mo23082(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC25000
    /* JADX INFO: renamed from: ܺۤ, reason: not valid java name and contains not printable characters */
    public final InputStream mo4183() {
        return new C10081(this);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4209;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f4209) {
            return;
        }
        this.f4209 = true;
        this.f4208.close();
        this.f4207.m6436();
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22411 mo4181() {
        return this.f4208.mo4181();
    }

    public final String toString() {
        return "buffer(" + this.f4208 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
