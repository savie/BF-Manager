package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C12333 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10922 f41224;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C12333(C10922 c10922) {
        this.f41224 = c10922;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f41224.m27388() & 255;
        } catch (C17271 e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            this.f41224.m27397(bArr.length, bArr);
            return bArr.length;
        } catch (C17271 e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        this.f41224.f37163 = (int) j;
        return j;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f41224.m27391();
    }
}
