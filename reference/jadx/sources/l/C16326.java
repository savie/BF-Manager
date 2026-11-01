package l;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܽ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes4.dex */
public final class C16326 extends FilterOutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C23610 f52592;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f52593;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CRC32 f52594;

    public C16326(BufferedOutputStream bufferedOutputStream, C23610 c23610) {
        super(bufferedOutputStream);
        this.f52594 = new CRC32();
        this.f52593 = true;
        this.f52592 = c23610;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m38494() {
        return this.f52594.getValue();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m38495() {
        this.f52593 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        C23610 c23610 = this.f52592;
        if (c23610 != null) {
            c23610.m52081();
        }
        ((FilterOutputStream) this).out.write(i);
        if (this.f52593) {
            this.f52594.update(i);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C23610 c23610 = this.f52592;
        if (c23610 != null) {
            c23610.m52081();
        }
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        if (this.f52593) {
            this.f52594.update(bArr, i, i2);
        }
    }
}
