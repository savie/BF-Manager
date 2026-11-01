package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫ۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C12109 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C8516 f40541;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C12109(InputStream inputStream, C8516 c8516) {
        super(inputStream);
        this.f40541 = c8516;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        C8516 c8516;
        int i = super.read();
        if (i != -1 && (c8516 = this.f40541) != null) {
            c8516.m22242(1);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C8516 c8516;
        int i3 = super.read(bArr, i, i2);
        if (i3 > 0 && (c8516 = this.f40541) != null) {
            c8516.m22242(i3);
        }
        return i3;
    }
}
