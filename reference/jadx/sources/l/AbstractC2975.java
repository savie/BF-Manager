package l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۖ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8EY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2975 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f9667;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f9668;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2975(InputStream inputStream, String str) {
        super(inputStream);
        int i = C18046.f59088;
        Charset charsetForName = str != null ? Charset.forName(str) : Charset.defaultCharset();
        this.f9668 = new byte[1];
        if (charsetForName == null) {
            Charset.defaultCharset();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9692(int i) {
        m9693(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9693(long j) {
        if (j != -1) {
            this.f9667 += j;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m9691() {
        return this.f9667;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m9694(long j) {
        this.f9667 -= j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = this.f9668;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
