package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۚܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes3.dex */
public final class C5742 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25134 f19763;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C5742(C25134 c25134) {
        this.f19763 = c25134;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f19763.m56020() & 255;
        } catch (C2013 e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            this.f19763.m56024(bArr.length, bArr);
            return bArr.length;
        } catch (C2013 e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        this.f19763.f81262 = (int) j;
        return j;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f19763.m56013();
    }
}
