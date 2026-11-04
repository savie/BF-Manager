package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94G3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1312 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17713 f4722;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f4723 = 0;

    public C1312(C13961 c13961) {
        this.f4722 = c13961;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            this.f4722.write(bArr, i, i2);
            this.f4723 += (long) i2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f4722.write(i);
        this.f4723++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m4788() {
        return this.f4723;
    }
}
