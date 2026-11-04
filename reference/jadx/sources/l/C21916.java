package l;

import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.᩷۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D6TW */
/* JADX INFO: loaded from: classes.dex */
public final class C21916 extends Reader {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public CharsetDecoder f70768;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ByteBuffer f70769;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public CharBuffer f70770;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile InputStream f70771;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f70772;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C18251 f70773;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f70774;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f70775;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f70776;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f70777;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f70778;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f70779;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f70780;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21916 m49604(InputStream inputStream, Charset charset, C0352 c0352) {
        return m49605(inputStream, charset, c0352, true, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21916 m49606(InputStream inputStream, C0352 c0352) {
        return m49605(inputStream, StandardCharsets.UTF_8, c0352, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21916 m49605(InputStream inputStream, Charset charset, C0352 c0352, boolean z, boolean z2) {
        C17359.requireNonNull(inputStream);
        if (z2) {
            try {
                if (c0352.m2119() - c0352.m2122() >= 33344) {
                    try {
                        return new C21916(inputStream, charset, c0352, 8192, 4096, z);
                    } catch (C24219 unused) {
                    }
                }
            } catch (Error | RuntimeException e) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
                throw e;
            }
        }
        return new C21916(inputStream, charset, c0352, 1024, 512, z);
    }

    public C21916(InputStream inputStream, Charset charset, C0352 c0352, int i, int i2, boolean z) {
        if (i < 4 || i > 65536 || i2 < 2 || i2 > 32768) {
            throw new IllegalArgumentException("Invalid decoder buffer sizes");
        }
        C17359.requireNonNull(charset);
        this.f70780 = charset.name();
        this.f70776 = z;
        C18251 c18251M2112 = c0352.m2112(((((long) i) + 23) & (-8)) + 256 + (((((long) i2) * 2) + 23) & (-8)));
        try {
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.f70768 = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            this.f70769 = byteBufferAllocate;
            byteBufferAllocate.limit(0);
            CharBuffer charBufferAllocate = CharBuffer.allocate(i2);
            this.f70770 = charBufferAllocate;
            charBufferAllocate.limit(0);
            this.f70771 = inputStream;
            this.f70773 = c18251M2112;
        } catch (Error | RuntimeException e) {
            c18251M2112.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m49610() {
        return this.f70777;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m49608() throws IOException {
        int i;
        if (this.f70779) {
            return false;
        }
        if (!this.f70775) {
            byte[] bArrArray = this.f70769.array();
            int i2 = 0;
            while (true) {
                i = 4;
                if (i2 >= 4) {
                    break;
                }
                int iM49609 = m49609(i2, 4 - i2, bArrArray);
                if (iM49609 == -1) {
                    this.f70774 = true;
                    break;
                }
                i2 += iM49609;
            }
            this.f70769.limit(i2);
            String str = this.f70780;
            if (str.equalsIgnoreCase(a.D) && m49607(bArrArray, i2, 239, 187, 191)) {
                i = 3;
            } else if ((str.equalsIgnoreCase("UTF-16BE") && m49607(bArrArray, i2, Scalar25519.TARGET_LENGTH, 255)) || (str.equalsIgnoreCase("UTF-16LE") && m49607(bArrArray, i2, 255, Scalar25519.TARGET_LENGTH))) {
                i = 2;
            } else if ((!str.equalsIgnoreCase("UTF-32BE") || !m49607(bArrArray, i2, 0, 0, Scalar25519.TARGET_LENGTH, 255)) && (!str.equalsIgnoreCase("UTF-32LE") || !m49607(bArrArray, i2, 255, Scalar25519.TARGET_LENGTH, 0, 0))) {
                i = 0;
            }
            this.f70769.position(this.f70776 ? i : 0);
            this.f70775 = true;
        }
        this.f70770.clear();
        while (this.f70770.position() == 0 && !this.f70779) {
            if (this.f70772) {
                CoderResult coderResultFlush = this.f70768.flush(this.f70770);
                if (coderResultFlush.isError()) {
                    coderResultFlush.throwException();
                }
                if (coderResultFlush.isUnderflow()) {
                    this.f70779 = true;
                } else if (this.f70770.position() == 0) {
                    throw new IOException("Decoder flush made no progress");
                }
            } else {
                CoderResult coderResultDecode = this.f70768.decode(this.f70769, this.f70770, this.f70774);
                if (coderResultDecode.isError()) {
                    coderResultDecode.throwException();
                }
                if (coderResultDecode.isUnderflow()) {
                    if (this.f70774) {
                        this.f70772 = true;
                    } else if (this.f70770.position() == 0) {
                        this.f70769.compact();
                        int iRemaining = this.f70769.remaining();
                        if (iRemaining == 0) {
                            throw new IOException("Decoder input buffer is too small");
                        }
                        int iM496010 = m49609(this.f70769.position(), iRemaining, this.f70769.array());
                        if (iM496010 == -1) {
                            this.f70774 = true;
                        } else {
                            ByteBuffer byteBuffer = this.f70769;
                            byteBuffer.position(byteBuffer.position() + iM496010);
                        }
                        this.f70769.flip();
                    } else {
                        continue;
                    }
                } else if (this.f70770.position() == 0) {
                    throw new IOException("Decoder output buffer is too small");
                }
            }
        }
        this.f70770.flip();
        return this.f70770.hasRemaining();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49607(byte[] bArr, int i, int... iArr) {
        if (i >= iArr.length) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if ((bArr[i2] & 255) == iArr[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m49609(int i, int i2, byte[] bArr) throws IOException {
        InputStream inputStream = this.f70771;
        if (inputStream == null) {
            throw new IOException("Text input is canceled or closed");
        }
        int i3 = inputStream.read(bArr, i, i2);
        if (i3 == 0 || i3 < -1 || i3 > i2) {
            throw new IOException("Text input made invalid progress");
        }
        if (i3 <= 0) {
            return i3;
        }
        long j = this.f70777;
        long j2 = i3;
        if (j > C25227.FOREVER_NS - j2) {
            throw new IOException("Source byte count exhausted");
        }
        this.f70777 = j + j2;
        return i3;
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        if (!this.f70778) {
            if (this.f70770.hasRemaining() || m49608()) {
                return this.f70770.get();
            }
            return -1;
        }
        throw new IOException("Text decoder is closed");
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        if (!this.f70778) {
            C8796.m23619(cArr, i, i2);
            if (i2 == 0) {
                return 0;
            }
            if (!this.f70770.hasRemaining() && !m49608()) {
                return -1;
            }
            int iMin = Math.min(i2, this.f70770.remaining());
            this.f70770.get(cArr, i, iMin);
            return iMin;
        }
        throw new IOException("Text decoder is closed");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49611() throws IOException {
        InputStream inputStream;
        synchronized (this) {
            inputStream = this.f70771;
            this.f70771 = null;
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f70778) {
            return;
        }
        this.f70778 = true;
        try {
            m49611();
        } finally {
            this.f70769 = null;
            this.f70770 = null;
            this.f70768 = null;
            C18251 c18251 = this.f70773;
            this.f70773 = null;
            c18251.close();
        }
    }
}
