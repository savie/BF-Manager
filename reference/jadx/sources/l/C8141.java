package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠ۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S8BI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8141 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f28488;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8516 f28489;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C8141(InputStream inputStream, C8516 c8516, boolean z) {
        super(inputStream);
        this.f28489 = c8516;
        this.f28488 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8516 m21449() {
        return this.f28489;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (this.f28488 && i != -1) {
            this.f28489.m22242(1);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (this.f28488 && jSkip > 0) {
            this.f28489.m22240(jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (this.f28488 && i3 != -1) {
            this.f28489.m22242(i3);
        }
        return i3;
    }
}
