package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.᩻ۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K4GS */
/* JADX INFO: loaded from: classes.dex */
public final class C23624 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InputStream f76530;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final CRC32 f76531 = new CRC32();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12107 f76532;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C23624(C12107 c12107, InputStream inputStream) {
        this.f76532 = c12107;
        this.f76530 = inputStream;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f76530.read(bArr, i, i2);
        CRC32 crc32 = this.f76531;
        if (i3 > 0) {
            crc32.update(bArr, i, i3);
            return i3;
        }
        if (i3 == -1) {
            int value = (int) crc32.getValue();
            C12107 c12107 = this.f76532;
            if (c12107.m30126() != value) {
                throw m52088(c12107, value);
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f76530.read();
        CRC32 crc32 = this.f76531;
        if (i != -1) {
            crc32.update(i);
            return i;
        }
        int value = (int) crc32.getValue();
        C12107 c12107 = this.f76532;
        if (c12107.m30126() == value) {
            return i;
        }
        throw m52088(c12107, value);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f76530.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IOException m52088(C12107 c12107, int i) {
        if (c12107.m30133() && c12107.m30118() && c12107.m30119() == 0) {
            return new C17978(c12107.getName());
        }
        return new ZipException(String.format("Bad file CRC value: expected=0x%08x, got=0x%08x (%s)", Integer.valueOf(c12107.m30126()), Integer.valueOf(i), c12107.getName()));
    }
}
