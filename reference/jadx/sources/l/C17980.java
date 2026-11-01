package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17980 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f57496;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1388 f57497;

    public C17980(long j, C1388 c1388) {
        this.f57497 = c1388;
        this.f57496 = j;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        synchronized (this.f57497) {
            this.f57497.seek(this.f57496);
            this.f57497.write(bArr, i, i2);
            this.f57496 += (long) i2;
        }
    }
}
