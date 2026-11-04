package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ܽܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 573L */
/* JADX INFO: loaded from: classes5.dex */
public final class C17650 extends InflaterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f58024;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f58025;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1 || this.f58025) {
            return i3;
        }
        if (((InflaterInputStream) this).inf.needsDictionary()) {
            throw new ZipException("ZLIB stream requires a preset dictionary");
        }
        if (((InflaterInputStream) this).inf.getRemaining() != 0 || ((InflaterInputStream) this).in.read() != -1) {
            throw new ZipException("Trailing data after ZLIB stream");
        }
        this.f58025 = true;
        return i3;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f58024) {
            return;
        }
        this.f58024 = true;
        try {
            super.close();
        } finally {
            ((InflaterInputStream) this).inf.end();
        }
    }
}
