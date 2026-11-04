package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16005 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f51944;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13961 f51945;

    public C16005(long j, C13961 c13961) {
        this.f51945 = c13961;
        this.f51944 = j;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        synchronized (this.f51945) {
            this.f51945.seek(this.f51944);
            this.f51945.write(bArr, i, i2);
            this.f51944 += (long) i2;
        }
    }
}
