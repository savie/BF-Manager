package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 94G3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10924 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7739 f37165;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f37166 = 0;

    public C10924(C1388 c1388) {
        this.f37165 = c1388;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            this.f37165.write(bArr, i, i2);
            this.f37166 += (long) i2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f37165.write(i);
        this.f37166++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m27403() {
        return this.f37166;
    }
}
