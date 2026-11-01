package l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.۠ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E8EY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7932 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f26058;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f26059;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7932(InputStream inputStream, String str) {
        super(inputStream);
        int i = C22832.f74282;
        Charset charsetForName = str != null ? Charset.forName(str) : Charset.defaultCharset();
        this.f26059 = new byte[1];
        if (charsetForName == null) {
            Charset.defaultCharset();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20948(int i) {
        m20949(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20949(long j) {
        if (j != -1) {
            this.f26058 += j;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m20947() {
        return this.f26058;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m20946(long j) {
        this.f26058 -= j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = this.f26059;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
