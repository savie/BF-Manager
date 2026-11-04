package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ۡܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4GS */
/* JADX INFO: loaded from: classes4.dex */
public final class C9514 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CRC32 f30816 = new CRC32();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InputStream f30817;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8002 f30818;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C9514(C8002 c8002, InputStream inputStream) {
        this.f30818 = c8002;
        this.f30817 = inputStream;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f30817.read(bArr, i, i2);
        CRC32 crc32 = this.f30816;
        if (i3 > 0) {
            crc32.update(bArr, i, i3);
            return i3;
        }
        if (i3 == -1) {
            int value = (int) crc32.getValue();
            C8002 c8002 = this.f30818;
            if (c8002.m21825() != value) {
                throw m24903(c8002, value);
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f30817.read();
        CRC32 crc32 = this.f30816;
        if (i != -1) {
            crc32.update(i);
            return i;
        }
        int value = (int) crc32.getValue();
        C8002 c8002 = this.f30818;
        if (c8002.m21825() == value) {
            return i;
        }
        throw m24903(c8002, value);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f30817.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IOException m24903(C8002 c8002, int i) {
        if (c8002.m21856() && c8002.m21827() && c8002.m21826() == 0) {
            return new C16227(c8002.getName());
        }
        return new ZipException(String.format("Bad file CRC value: expected=0x%08x, got=0x%08x (%s)", Integer.valueOf(c8002.m21825()), Integer.valueOf(i), c8002.getName()));
    }
}
