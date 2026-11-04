package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۛۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6229 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7509 f21155;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f21156;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21157;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo17856(int i);

    public AbstractC6229(int i, InterfaceC7509 interfaceC7509) {
        this.f21156 = new StringBuilder(Math.min(i, 524288));
        this.f21155 = interfaceC7509;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws C15923 {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j != i3) {
            throw new ArithmeticException();
        }
        while (i < i3) {
            if ((this.f21157 & 4095) == 0 && this.f21155.mo924()) {
                throw new C15923();
            }
            mo17856(bArr[i] & 255);
            this.f21157++;
            i++;
        }
    }

    public String finish() {
        return this.f21156.toString();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws C15923 {
        if (!this.f21155.mo924()) {
            mo17856(i & 255);
            this.f21157++;
            return;
        }
        throw new C15923();
    }
}
