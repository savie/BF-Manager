package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes5.dex */
public final class C17694 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7817 f56190;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e) {
            this.f56190.m20531(e);
            throw e;
        }
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17694(C7817 c7817, InputStream inputStream) {
        super(inputStream);
        this.f56190 = c7817;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        try {
            return ((FilterInputStream) this).in.read();
        } catch (IOException e) {
            this.f56190.m20531(e);
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return ((FilterInputStream) this).in.read(bArr);
        } catch (IOException e) {
            this.f56190.m20531(e);
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return ((FilterInputStream) this).in.read(bArr, i, i2);
        } catch (IOException e) {
            this.f56190.m20531(e);
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return ((FilterInputStream) this).in.skip(j);
        } catch (IOException e) {
            this.f56190.m20531(e);
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        try {
            return ((FilterInputStream) this).in.available();
        } catch (IOException e) {
            this.f56190.m20531(e);
            throw e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f56190.m20592();
        this.f56190.f25723.set(false);
        ((FilterInputStream) this).in.close();
    }
}
