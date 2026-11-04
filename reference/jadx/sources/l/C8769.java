package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.۠ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q73C */
/* JADX INFO: loaded from: classes4.dex */
public final class C8769 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8002 f28511;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InputStream f28512;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InputStream f28513;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CRC32 f28514;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f28515;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f28516;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C8769(C8002 c8002, InputStream inputStream, C3549 c3549, boolean z) {
        this.f28511 = c8002;
        this.f28512 = inputStream;
        this.f28513 = c3549;
        this.f28514 = z ? new CRC32() : null;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f28512.read();
        if (i == -1) {
            m23466();
            return i;
        }
        m23467(1);
        CRC32 crc32 = this.f28514;
        if (crc32 != null) {
            crc32.update(i);
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f28512.read(bArr, i, i2);
        if (i3 == -1) {
            m23466();
            return i3;
        }
        if (i3 > 0) {
            m23467(i3);
            CRC32 crc32 = this.f28514;
            if (crc32 != null) {
                crc32.update(bArr, i, i3);
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23467(int i) throws ZipException {
        C8002 c8002 = this.f28511;
        long size = c8002.getSize();
        long j = this.f28516;
        long j2 = i;
        if (j > C25227.FOREVER_NS - j2) {
            throw new ZipException("Uncompressed size overflow (" + c8002.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        long j3 = j + j2;
        if (j3 > size) {
            throw new ZipException(String.format("Bad uncompressed size: expected=%d, got=%d (%s)", Long.valueOf(c8002.getSize()), Long.valueOf(j3), c8002.getName()));
        }
        this.f28516 = j3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23466() throws IOException {
        int value;
        if (this.f28515) {
            return;
        }
        InputStream inputStream = this.f28513;
        if (inputStream != null) {
            while (inputStream.read(new byte[8192]) != -1) {
            }
        }
        long j = this.f28516;
        C8002 c8002 = this.f28511;
        if (j != c8002.getSize()) {
            throw new ZipException(String.format("Bad uncompressed size: expected=%d, got=%d (%s)", Long.valueOf(c8002.getSize()), Long.valueOf(this.f28516), c8002.getName()));
        }
        CRC32 crc32 = this.f28514;
        if (crc32 != null && c8002.m21825() != (value = (int) crc32.getValue())) {
            throw C9514.m24903(c8002, value);
        }
        this.f28515 = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f28512.close();
    }
}
