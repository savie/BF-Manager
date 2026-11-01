package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3624 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5614 f13316;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f13317 = new byte[1];

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6131(byte[] bArr, int i, int i2);

    public AbstractC3624(InterfaceC5614 interfaceC5614) {
        this.f13316 = interfaceC5614;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws C11387 {
        byte[] bArr = this.f13317;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws C11387 {
        if (this.f13316.mo2357()) {
            throw new C11387();
        }
        mo6131(bArr, i, i2);
    }
}
