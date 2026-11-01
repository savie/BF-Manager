package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.֫ۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q73C */
/* JADX INFO: loaded from: classes2.dex */
public final class C1750 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CRC32 f6877;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InputStream f6878;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InputStream f6879;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12107 f6880;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f6881;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f6882;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C1750(C12107 c12107, InputStream inputStream, C8101 c8101, boolean z) {
        this.f6880 = c12107;
        this.f6878 = inputStream;
        this.f6879 = c8101;
        this.f6877 = z ? new CRC32() : null;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f6878.read();
        if (i == -1) {
            m5796();
            return i;
        }
        m5797(1);
        CRC32 crc32 = this.f6877;
        if (crc32 != null) {
            crc32.update(i);
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f6878.read(bArr, i, i2);
        if (i3 == -1) {
            m5796();
            return i3;
        }
        if (i3 > 0) {
            m5797(i3);
            CRC32 crc32 = this.f6877;
            if (crc32 != null) {
                crc32.update(bArr, i, i3);
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5797(int i) throws ZipException {
        C12107 c12107 = this.f6880;
        long size = c12107.getSize();
        long j = this.f6882;
        long j2 = i;
        if (j > C17492.FOREVER_NS - j2) {
            throw new ZipException("Uncompressed size overflow (" + c12107.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        long j3 = j + j2;
        if (j3 > size) {
            throw new ZipException(String.format("Bad uncompressed size: expected=%d, got=%d (%s)", Long.valueOf(c12107.getSize()), Long.valueOf(j3), c12107.getName()));
        }
        this.f6882 = j3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5796() throws IOException {
        int value;
        if (this.f6881) {
            return;
        }
        InputStream inputStream = this.f6879;
        if (inputStream != null) {
            while (inputStream.read(new byte[8192]) != -1) {
            }
        }
        long j = this.f6882;
        C12107 c12107 = this.f6880;
        if (j != c12107.getSize()) {
            throw new ZipException(String.format("Bad uncompressed size: expected=%d, got=%d (%s)", Long.valueOf(c12107.getSize()), Long.valueOf(this.f6882), c12107.getName()));
        }
        CRC32 crc32 = this.f6877;
        if (crc32 != null && c12107.m30126() != (value = (int) crc32.getValue())) {
            throw C23624.m52088(c12107, value);
        }
        this.f6881 = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f6878.close();
    }
}
