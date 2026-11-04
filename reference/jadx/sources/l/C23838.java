package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩹᩸۫, reason: contains not printable characters */
/* JADX INFO: compiled from: S8BI */
/* JADX INFO: loaded from: classes.dex */
public final class C23838 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f77199;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3374 f77200;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C23838(InputStream inputStream, C3374 c3374, boolean z) {
        super(inputStream);
        this.f77200 = c3374;
        this.f77199 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3374 m53163() {
        return this.f77200;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (this.f77199 && i != -1) {
            this.f77200.m11079(1);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (this.f77199 && jSkip > 0) {
            this.f77200.m11077(jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (this.f77199 && i3 != -1) {
            this.f77200.m11079(i3);
        }
        return i3;
    }
}
