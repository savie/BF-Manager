package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ܺܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: W73I */
/* JADX INFO: loaded from: classes5.dex */
public final class C16904 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f55279;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final PushbackInputStream f55280;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f55282;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f55283;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f55284;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Inflater f55278 = new Inflater(true);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CRC32 f55286 = new CRC32();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f55285 = new byte[65536];

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final byte[] f55281 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C16904(InputStream inputStream) {
        this.f55280 = new PushbackInputStream(inputStream, 65536);
        try {
            m39883();
        } catch (Throwable th) {
            this.f55278.end();
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f55281;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Inflater inflater = this.f55278;
        if (this.f55283) {
            throw new IOException("Stream closed");
        }
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        while (!this.f55284) {
            try {
                int iInflate = inflater.inflate(bArr, i, i2);
                CRC32 crc32 = this.f55286;
                if (iInflate > 0) {
                    crc32.update(bArr, i, iInflate);
                    this.f55279 = (this.f55279 + ((long) iInflate)) & 4294967295L;
                    return iInflate;
                }
                boolean zFinished = inflater.finished();
                byte[] bArr2 = this.f55285;
                PushbackInputStream pushbackInputStream = this.f55280;
                if (!zFinished) {
                    if (inflater.needsDictionary()) {
                        throw new ZipException("GZIP stream requires a preset dictionary");
                    }
                    if (!inflater.needsInput()) {
                        throw new ZipException("GZIP inflater made no progress");
                    }
                    int i3 = pushbackInputStream.read(bArr2);
                    this.f55282 = i3;
                    if (i3 == -1) {
                        throw new EOFException("Unexpected end of GZIP compressed data");
                    }
                    inflater.setInput(bArr2, 0, i3);
                } else {
                    int remaining = inflater.getRemaining();
                    if (remaining > 0) {
                        pushbackInputStream.unread(bArr2, this.f55282 - remaining, remaining);
                    }
                    long jM39884 = m39884();
                    long jM39885 = m39884();
                    if (jM39884 != crc32.getValue()) {
                        throw new ZipException("Corrupt GZIP trailer CRC");
                    }
                    if (jM39885 != this.f55279) {
                        throw new ZipException("Corrupt GZIP trailer size");
                    }
                    int i4 = pushbackInputStream.read();
                    if (i4 == -1) {
                        this.f55284 = true;
                    } else {
                        int i5 = pushbackInputStream.read();
                        if (i5 == -1 || i4 != 31 || i5 != 139) {
                            throw new ZipException("Trailing data after GZIP stream");
                        }
                        pushbackInputStream.unread(i5);
                        pushbackInputStream.unread(i4);
                        inflater.reset();
                        m39883();
                    }
                }
            } catch (DataFormatException e) {
                ZipException zipException = new ZipException("Invalid GZIP compressed data");
                zipException.initCause(e);
                throw zipException;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39883() throws IOException {
        CRC32 crc32 = new CRC32();
        if (m39882(crc32) != 31 || m39882(crc32) != 139) {
            throw new ZipException("Invalid GZIP header");
        }
        if (m39882(crc32) != 8) {
            throw new ZipException("Unsupported GZIP compression method");
        }
        int iM39882 = m39882(crc32);
        if ((iM39882 & BERTags.FLAGS) != 0) {
            throw new ZipException("Reserved GZIP flags are set");
        }
        for (int i = 0; i < 6; i++) {
            m39882(crc32);
        }
        if ((iM39882 & 4) != 0) {
            int iM39883 = m39882(crc32) | (m39882(crc32) << 8);
            for (int i2 = 0; i2 < iM39883; i2++) {
                m39882(crc32);
            }
        }
        if ((iM39882 & 8) != 0) {
            while (m39882(crc32) != 0) {
            }
        }
        if ((iM39882 & 16) != 0) {
            while (m39882(crc32) != 0) {
            }
        }
        if ((iM39882 & 2) != 0) {
            if (((m39881("Unexpected end of GZIP header CRC") << 8) | m39881("Unexpected end of GZIP header CRC")) != (((int) crc32.getValue()) & 65535)) {
                throw new ZipException("Corrupt GZIP header CRC");
            }
        }
        this.f55286.reset();
        this.f55279 = 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m39882(CRC32 crc32) throws IOException {
        int iM39881 = m39881("Unexpected end of GZIP header");
        crc32.update(iM39881);
        return iM39881;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private long m39884() {
        return ((long) m39881("Unexpected end of GZIP trailer")) | (((long) m39881("Unexpected end of GZIP trailer")) << 8) | (((long) m39881("Unexpected end of GZIP trailer")) << 16) | (((long) m39881("Unexpected end of GZIP trailer")) << 24);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m39881(String str) throws IOException {
        int i = this.f55280.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException(str);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f55283) {
            return;
        }
        this.f55283 = true;
        this.f55278.end();
        this.f55280.close();
    }
}
