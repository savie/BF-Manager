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

/* JADX INFO: renamed from: l.ܳ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6TW */
/* JADX INFO: loaded from: classes3.dex */
public final class C14165 extends Reader {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f46473;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C9017 f46474;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f46475;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f46476;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile InputStream f46477;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f46478;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f46479;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharBuffer f46480;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f46481;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public CharsetDecoder f46482;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f46483;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f46484;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f46485;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14165 m34239(InputStream inputStream, Charset charset, C10428 c10428) {
        return m34240(inputStream, charset, c10428, true, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14165 m34241(InputStream inputStream, C10428 c10428) {
        return m34240(inputStream, StandardCharsets.UTF_8, c10428, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14165 m34240(InputStream inputStream, Charset charset, C10428 c10428, boolean z, boolean z2) {
        C13638.requireNonNull(inputStream);
        if (z2) {
            try {
                if (c10428.m26340() - c10428.m26331() >= 33344) {
                    try {
                        return new C14165(inputStream, charset, c10428, 8192, 4096, z);
                    } catch (C18188 unused) {
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
        return new C14165(inputStream, charset, c10428, 1024, 512, z);
    }

    public C14165(InputStream inputStream, Charset charset, C10428 c10428, int i, int i2, boolean z) {
        if (i < 4 || i > 65536 || i2 < 2 || i2 > 32768) {
            throw new IllegalArgumentException("Invalid decoder buffer sizes");
        }
        C13638.requireNonNull(charset);
        this.f46484 = charset.name();
        this.f46475 = z;
        C9017 c9017M26333 = c10428.m26333(((((long) i) + 23) & (-8)) + 256 + (((((long) i2) * 2) + 23) & (-8)));
        try {
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.f46482 = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            this.f46478 = byteBufferAllocate;
            byteBufferAllocate.limit(0);
            CharBuffer charBufferAllocate = CharBuffer.allocate(i2);
            this.f46480 = charBufferAllocate;
            charBufferAllocate.limit(0);
            this.f46477 = inputStream;
            this.f46474 = c9017M26333;
        } catch (Error | RuntimeException e) {
            c9017M26333.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m34244() {
        return this.f46481;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m34238() throws IOException {
        int i;
        if (this.f46483) {
            return false;
        }
        if (!this.f46476) {
            byte[] bArrArray = this.f46478.array();
            int i2 = 0;
            while (true) {
                i = 4;
                if (i2 >= 4) {
                    break;
                }
                int iM34243 = m34243(i2, 4 - i2, bArrArray);
                if (iM34243 == -1) {
                    this.f46485 = true;
                    break;
                }
                i2 += iM34243;
            }
            this.f46478.limit(i2);
            String str = this.f46484;
            if (str.equalsIgnoreCase(a.D) && m34242(bArrArray, i2, 239, 187, 191)) {
                i = 3;
            } else if ((str.equalsIgnoreCase("UTF-16BE") && m34242(bArrArray, i2, Scalar25519.TARGET_LENGTH, 255)) || (str.equalsIgnoreCase("UTF-16LE") && m34242(bArrArray, i2, 255, Scalar25519.TARGET_LENGTH))) {
                i = 2;
            } else if ((!str.equalsIgnoreCase("UTF-32BE") || !m34242(bArrArray, i2, 0, 0, Scalar25519.TARGET_LENGTH, 255)) && (!str.equalsIgnoreCase("UTF-32LE") || !m34242(bArrArray, i2, 255, Scalar25519.TARGET_LENGTH, 0, 0))) {
                i = 0;
            }
            this.f46478.position(this.f46475 ? i : 0);
            this.f46476 = true;
        }
        this.f46480.clear();
        while (this.f46480.position() == 0 && !this.f46483) {
            if (this.f46479) {
                CoderResult coderResultFlush = this.f46482.flush(this.f46480);
                if (coderResultFlush.isError()) {
                    coderResultFlush.throwException();
                }
                if (coderResultFlush.isUnderflow()) {
                    this.f46483 = true;
                } else if (this.f46480.position() == 0) {
                    throw new IOException("Decoder flush made no progress");
                }
            } else {
                CoderResult coderResultDecode = this.f46482.decode(this.f46478, this.f46480, this.f46485);
                if (coderResultDecode.isError()) {
                    coderResultDecode.throwException();
                }
                if (coderResultDecode.isUnderflow()) {
                    if (this.f46485) {
                        this.f46479 = true;
                    } else if (this.f46480.position() == 0) {
                        this.f46478.compact();
                        int iRemaining = this.f46478.remaining();
                        if (iRemaining == 0) {
                            throw new IOException("Decoder input buffer is too small");
                        }
                        int iM34244 = m34243(this.f46478.position(), iRemaining, this.f46478.array());
                        if (iM34244 == -1) {
                            this.f46485 = true;
                        } else {
                            ByteBuffer byteBuffer = this.f46478;
                            byteBuffer.position(byteBuffer.position() + iM34244);
                        }
                        this.f46478.flip();
                    } else {
                        continue;
                    }
                } else if (this.f46480.position() == 0) {
                    throw new IOException("Decoder output buffer is too small");
                }
            }
        }
        this.f46480.flip();
        return this.f46480.hasRemaining();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34242(byte[] bArr, int i, int... iArr) {
        if (i >= iArr.length) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if ((bArr[i2] & 255) == iArr[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m34243(int i, int i2, byte[] bArr) throws IOException {
        InputStream inputStream = this.f46477;
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
        long j = this.f46481;
        long j2 = i3;
        if (j > C17492.FOREVER_NS - j2) {
            throw new IOException("Source byte count exhausted");
        }
        this.f46481 = j + j2;
        return i3;
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        if (!this.f46473) {
            if (this.f46480.hasRemaining() || m34238()) {
                return this.f46480.get();
            }
            return -1;
        }
        throw new IOException("Text decoder is closed");
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        if (!this.f46473) {
            C17565.m40836(cArr, i, i2);
            if (i2 == 0) {
                return 0;
            }
            if (!this.f46480.hasRemaining() && !m34238()) {
                return -1;
            }
            int iMin = Math.min(i2, this.f46480.remaining());
            this.f46480.get(cArr, i, iMin);
            return iMin;
        }
        throw new IOException("Text decoder is closed");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m34245() throws IOException {
        InputStream inputStream;
        synchronized (this) {
            inputStream = this.f46477;
            this.f46477 = null;
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f46473) {
            return;
        }
        this.f46473 = true;
        try {
            m34245();
        } finally {
            this.f46478 = null;
            this.f46480 = null;
            this.f46482 = null;
            C9017 c9017 = this.f46474;
            this.f46474 = null;
            c9017.close();
        }
    }
}
