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

/* JADX INFO: renamed from: l.᩸ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W73I */
/* JADX INFO: loaded from: classes5.dex */
public final class C21649 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f70183;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f70184;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f70185;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final PushbackInputStream f70186;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f70187;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Inflater f70188 = new Inflater(true);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CRC32 f70190 = new CRC32();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f70189 = new byte[65536];

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] f70191 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C21649(InputStream inputStream) {
        this.f70186 = new PushbackInputStream(inputStream, 65536);
        try {
            m48358();
        } catch (Throwable th) {
            this.f70188.end();
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f70191;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Inflater inflater = this.f70188;
        if (this.f70187) {
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
        while (!this.f70183) {
            try {
                int iInflate = inflater.inflate(bArr, i, i2);
                CRC32 crc32 = this.f70190;
                if (iInflate > 0) {
                    crc32.update(bArr, i, iInflate);
                    this.f70185 = (this.f70185 + ((long) iInflate)) & 4294967295L;
                    return iInflate;
                }
                boolean zFinished = inflater.finished();
                byte[] bArr2 = this.f70189;
                PushbackInputStream pushbackInputStream = this.f70186;
                if (!zFinished) {
                    if (inflater.needsDictionary()) {
                        throw new ZipException("GZIP stream requires a preset dictionary");
                    }
                    if (!inflater.needsInput()) {
                        throw new ZipException("GZIP inflater made no progress");
                    }
                    int i3 = pushbackInputStream.read(bArr2);
                    this.f70184 = i3;
                    if (i3 == -1) {
                        throw new EOFException("Unexpected end of GZIP compressed data");
                    }
                    inflater.setInput(bArr2, 0, i3);
                } else {
                    int remaining = inflater.getRemaining();
                    if (remaining > 0) {
                        pushbackInputStream.unread(bArr2, this.f70184 - remaining, remaining);
                    }
                    long jM48359 = m48359();
                    long jM483510 = m48359();
                    if (jM48359 != crc32.getValue()) {
                        throw new ZipException("Corrupt GZIP trailer CRC");
                    }
                    if (jM483510 != this.f70185) {
                        throw new ZipException("Corrupt GZIP trailer size");
                    }
                    int i4 = pushbackInputStream.read();
                    if (i4 == -1) {
                        this.f70183 = true;
                    } else {
                        int i5 = pushbackInputStream.read();
                        if (i5 == -1 || i4 != 31 || i5 != 139) {
                            throw new ZipException("Trailing data after GZIP stream");
                        }
                        pushbackInputStream.unread(i5);
                        pushbackInputStream.unread(i4);
                        inflater.reset();
                        m48358();
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
    private void m48358() throws IOException {
        CRC32 crc32 = new CRC32();
        if (m48357(crc32) != 31 || m48357(crc32) != 139) {
            throw new ZipException("Invalid GZIP header");
        }
        if (m48357(crc32) != 8) {
            throw new ZipException("Unsupported GZIP compression method");
        }
        int iM48357 = m48357(crc32);
        if ((iM48357 & BERTags.FLAGS) != 0) {
            throw new ZipException("Reserved GZIP flags are set");
        }
        for (int i = 0; i < 6; i++) {
            m48357(crc32);
        }
        if ((iM48357 & 4) != 0) {
            int iM48358 = m48357(crc32) | (m48357(crc32) << 8);
            for (int i2 = 0; i2 < iM48358; i2++) {
                m48357(crc32);
            }
        }
        if ((iM48357 & 8) != 0) {
            while (m48357(crc32) != 0) {
            }
        }
        if ((iM48357 & 16) != 0) {
            while (m48357(crc32) != 0) {
            }
        }
        if ((iM48357 & 2) != 0) {
            if (((m48356("Unexpected end of GZIP header CRC") << 8) | m48356("Unexpected end of GZIP header CRC")) != (((int) crc32.getValue()) & 65535)) {
                throw new ZipException("Corrupt GZIP header CRC");
            }
        }
        this.f70190.reset();
        this.f70185 = 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m48357(CRC32 crc32) throws IOException {
        int iM48356 = m48356("Unexpected end of GZIP header");
        crc32.update(iM48356);
        return iM48356;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private long m48359() {
        return ((long) m48356("Unexpected end of GZIP trailer")) | (((long) m48356("Unexpected end of GZIP trailer")) << 8) | (((long) m48356("Unexpected end of GZIP trailer")) << 16) | (((long) m48356("Unexpected end of GZIP trailer")) << 24);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m48356(String str) throws IOException {
        int i = this.f70186.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException(str);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f70187) {
            return;
        }
        this.f70187 = true;
        this.f70188.end();
        this.f70186.close();
    }
}
