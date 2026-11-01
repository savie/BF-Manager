package l;

import java.io.BufferedInputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩴ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19057 extends BufferedInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f61622;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f61623;

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long jSkip;
        jSkip = super.skip(j);
        if (this.f61623 && jSkip > 0) {
            this.f61622 += jSkip;
        }
        return jSkip;
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m43811() {
        this.f61623 = true;
        this.f61622 = 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m43810() {
        return this.f61622;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        if (this.f61623 && i >= 0) {
            this.f61622++;
        }
        return i;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        if (this.f61623 && i3 > 0) {
            this.f61622 += (long) i3;
        }
        return i3;
    }
}
