package l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ᩳۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 34CP */
/* JADX INFO: loaded from: classes5.dex */
public final class C17768 implements InterfaceC23683 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC10008 f56357;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6043 f56358 = new C6043();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f56359;

    public C17768(InterfaceC10008 interfaceC10008) {
        if (interfaceC10008 == null) {
            throw new NullPointerException("source == null");
        }
        this.f56357 = interfaceC10008;
    }

    @Override // l.InterfaceC23683, l.InterfaceC10983
    /* JADX INFO: renamed from: ۘ */
    public final C6043 mo16399() {
        return this.f56358;
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
        if (this.f56359) {
            throw new IllegalStateException("closed");
        }
        C6043 c6044 = this.f56358;
        if (c6044.f20522 == 0 && this.f56357.mo2293(c6044, 8192L) == -1) {
            return -1L;
        }
        return c6044.mo2293(c6043, Math.min(j, c6044.f20522));
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۜܰ */
    public final boolean mo16415() {
        if (this.f56359) {
            throw new IllegalStateException("closed");
        }
        C6043 c6043 = this.f56358;
        return c6043.mo16415() && this.f56357.mo2293(c6043, 8192L) == -1;
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۚ */
    public final void mo16413(long j) throws EOFException {
        if (!m41335(j)) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m41335(long j) {
        C6043 c6043;
        if (j < 0) {
            throw new IllegalArgumentException(C15489.m37074(j, "byteCount < 0: "));
        }
        if (this.f56359) {
            throw new IllegalStateException("closed");
        }
        do {
            c6043 = this.f56358;
            if (c6043.f20522 >= j) {
                return true;
            }
        } while (this.f56357.mo2293(c6043, 8192L) != -1);
        return false;
    }

    @Override // l.InterfaceC23683
    public final byte readByte() throws EOFException {
        mo16413(1L);
        return this.f56358.readByte();
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۬ */
    public final C14511 mo16421(long j) throws EOFException {
        mo16413(j);
        return this.f56358.mo16421(j);
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۬ܰ */
    public final byte[] mo16422() {
        InterfaceC10008 interfaceC10008 = this.f56357;
        C6043 c6043 = this.f56358;
        c6043.m16411(interfaceC10008);
        return c6043.mo16422();
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۨ */
    public final byte[] mo16420(long j) throws EOFException {
        mo16413(j);
        return this.f56358.mo16420(j);
    }

    @Override // l.InterfaceC23683
    public final void readFully(byte[] bArr) throws EOFException {
        C6043 c6043 = this.f56358;
        try {
            mo16413(bArr.length);
            c6043.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = c6043.f20522;
                if (j > 0) {
                    int i2 = c6043.read(bArr, i, (int) j);
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
        C6043 c6043 = this.f56358;
        if (c6043.f20522 == 0 && this.f56357.mo2293(c6043, 8192L) == -1) {
            return -1;
        }
        return c6043.read(byteBuffer);
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۙ */
    public final long mo16401(InterfaceC8597 interfaceC8597) {
        C6043 c6043;
        long j = 0;
        while (true) {
            InterfaceC10008 interfaceC10008 = this.f56357;
            c6043 = this.f56358;
            if (interfaceC10008.mo2293(c6043, 8192L) == -1) {
                break;
            }
            long jM16417 = c6043.m16417();
            if (jM16417 > 0) {
                j += jM16417;
                interfaceC8597.mo5901(c6043, jM16417);
            }
        }
        long j2 = c6043.f20522;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        interfaceC8597.mo5901(c6043, j2);
        return j3;
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۙ */
    public final String mo16404(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        InterfaceC10008 interfaceC10008 = this.f56357;
        C6043 c6043 = this.f56358;
        c6043.m16411(interfaceC10008);
        return c6043.mo16404(charset);
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ᩵ۙ */
    public final String mo16426() {
        return mo16402(C17492.FOREVER_NS);
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۙ */
    public final String mo16402(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(C15489.m37074(j, "limit < 0: "));
        }
        long j2 = j == C17492.FOREVER_NS ? Long.MAX_VALUE : j + 1;
        long jM41334 = m41334((byte) 10, 0L, j2);
        C6043 c6043 = this.f56358;
        if (jM41334 != -1) {
            return c6043.m16396(jM41334);
        }
        if (j2 < C17492.FOREVER_NS && m41335(j2) && c6043.m16423(j2 - 1) == 13 && m41335(1 + j2) && c6043.m16423(j2) == 10) {
            return c6043.m16396(j2);
        }
        C6043 c6044 = new C6043();
        c6043.m16410(c6044, 0L, Math.min(32L, c6043.f20522));
        throw new EOFException("\\n not found: limit=" + Math.min(c6043.f20522, j) + " content=" + c6044.m16398().mo34946() + (char) 8230);
    }

    @Override // l.InterfaceC23683
    public final short readShort() throws EOFException {
        mo16413(2L);
        return this.f56358.readShort();
    }

    @Override // l.InterfaceC23683
    public final int readInt() throws EOFException {
        mo16413(4L);
        return this.f56358.readInt();
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۠ܰ */
    public final long mo16416() throws EOFException {
        C6043 c6043;
        mo16413(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zM41335 = m41335(i2);
            c6043 = this.f56358;
            if (!zM41335) {
                break;
            }
            byte bM16423 = c6043.m16423(i);
            if ((bM16423 < 48 || bM16423 > 57) && !(i == 0 && bM16423 == 45)) {
                if (i != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(bM16423)));
            }
            i = i2;
        }
        return c6043.mo16416();
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ۜۨ */
    public final long mo16414() throws EOFException {
        C6043 c6043;
        mo16413(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zM41335 = m41335(i2);
            c6043 = this.f56358;
            if (!zM41335) {
                break;
            }
            byte bM16423 = c6043.m16423(i);
            if ((bM16423 < 48 || bM16423 > 57) && ((bM16423 < 97 || bM16423 > 102) && (bM16423 < 65 || bM16423 > 70))) {
                if (i != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bM16423)));
            }
            i = i2;
        }
        return c6043.mo16414();
    }

    @Override // l.InterfaceC23683
    public final void skip(long j) throws EOFException {
        if (this.f56359) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C6043 c6043 = this.f56358;
            if (c6043.f20522 == 0 && this.f56357.mo2293(c6043, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c6043.f20522);
            c6043.skip(jMin);
            j -= jMin;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m41334(byte b, long j, long j2) {
        if (this.f56359) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(C15489.m37074(j2, "fromIndex=0 toIndex="));
        }
        while (jMax < j2) {
            long jM16400 = this.f56358.m16400(b, jMax, j2);
            if (jM16400 != -1) {
                return jM16400;
            }
            C6043 c6043 = this.f56358;
            long j3 = c6043.f20522;
            if (j3 >= j2 || this.f56357.mo2293(c6043, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo16424(C14511 c14511) {
        int iMo34938 = c14511.mo34938();
        if (this.f56359) {
            throw new IllegalStateException("closed");
        }
        if (iMo34938 >= 0 && c14511.mo34938() >= iMo34938) {
            for (int i = 0; i < iMo34938; i++) {
                long j = i;
                if (m41335(1 + j) && this.f56358.m16423(j) == c14511.mo34939(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC23683
    /* JADX INFO: renamed from: ᩺ۨ */
    public final InputStream mo16433() {
        return new C21296(this);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f56359;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f56359) {
            return;
        }
        this.f56359 = true;
        this.f56357.close();
        this.f56358.m16407();
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo2292() {
        return this.f56357.mo2292();
    }

    public final String toString() {
        return "buffer(" + this.f56357 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
