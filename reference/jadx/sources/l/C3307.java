package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 880P */
/* JADX INFO: loaded from: classes2.dex */
public final class C3307 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f12216;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f12217;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InputStream f12218;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f12219;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C3307(long j, InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream cannot be null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Max size cannot be negative");
        }
        this.f12218 = inputStream;
        this.f12216 = j;
        this.f12217 = 0L;
        this.f12219 = false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f12219) {
            throw new IOException("Stream is closed");
        }
        if (this.f12217 >= this.f12216) {
            return -1;
        }
        int i = this.f12218.read();
        if (i != -1) {
            this.f12217++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f12219) {
            throw new IOException("Stream is closed");
        }
        if (bArr == null) {
            throw new NullPointerException("Buffer cannot be null");
        }
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        long j = this.f12217;
        long j2 = this.f12216;
        if (j >= j2) {
            return -1;
        }
        int i3 = this.f12218.read(bArr, i, (int) Math.min(i2, j2 - j));
        if (i3 > 0) {
            this.f12217 += (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (this.f12219) {
            throw new IOException("Stream is closed");
        }
        if (j <= 0) {
            return 0L;
        }
        long jSkip = this.f12218.skip(Math.min(j, this.f12216 - this.f12217));
        this.f12217 += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f12219) {
            throw new IOException("Stream is closed");
        }
        return (int) Math.min(this.f12218.available(), this.f12216 - this.f12217);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12219) {
            return;
        }
        this.f12219 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m9810() {
        return this.f12217;
    }
}
