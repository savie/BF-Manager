package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.۬֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12798 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final StringBuilder f42626;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5614 f42627;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f42628;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo3370(int i);

    public AbstractC12798(int i, InterfaceC5614 interfaceC5614) {
        this.f42626 = new StringBuilder(Math.min(i, 524288));
        this.f42627 = interfaceC5614;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws C11387 {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j != i3) {
            throw new ArithmeticException();
        }
        while (i < i3) {
            if ((this.f42628 & 4095) == 0 && this.f42627.mo2357()) {
                throw new C11387();
            }
            mo3370(bArr[i] & 255);
            this.f42628++;
            i++;
        }
    }

    public String finish() {
        return this.f42626.toString();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws C11387 {
        if (!this.f42627.mo2357()) {
            mo3370(i & 255);
            this.f42628++;
            return;
        }
        throw new C11387();
    }
}
