package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩺ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24129 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7509 f77974;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f77975 = new byte[1];

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo6198(byte[] bArr, int i, int i2);

    public AbstractC24129(InterfaceC7509 interfaceC7509) {
        this.f77974 = interfaceC7509;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws C15923 {
        byte[] bArr = this.f77975;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws C15923 {
        if (this.f77974.mo924()) {
            throw new C15923();
        }
        mo6198(bArr, i, i2);
    }
}
