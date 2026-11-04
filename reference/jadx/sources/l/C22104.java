package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩷ܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 880P */
/* JADX INFO: loaded from: classes.dex */
public final class C22104 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InputStream f71242;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f71243;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f71244;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f71245;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C22104(long j, InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Input stream cannot be null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Max size cannot be negative");
        }
        this.f71242 = inputStream;
        this.f71244 = j;
        this.f71243 = 0L;
        this.f71245 = false;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f71245) {
            throw new IOException("Stream is closed");
        }
        if (this.f71243 >= this.f71244) {
            return -1;
        }
        int i = this.f71242.read();
        if (i != -1) {
            this.f71243++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f71245) {
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
        long j = this.f71243;
        long j2 = this.f71244;
        if (j >= j2) {
            return -1;
        }
        int i3 = this.f71242.read(bArr, i, (int) Math.min(i2, j2 - j));
        if (i3 > 0) {
            this.f71243 += (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (this.f71245) {
            throw new IOException("Stream is closed");
        }
        if (j <= 0) {
            return 0L;
        }
        long jSkip = this.f71242.skip(Math.min(j, this.f71244 - this.f71243));
        this.f71243 += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f71245) {
            throw new IOException("Stream is closed");
        }
        return (int) Math.min(this.f71242.available(), this.f71244 - this.f71243);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f71245) {
            return;
        }
        this.f71245 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m50064() {
        return this.f71243;
    }
}
