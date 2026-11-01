package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۢ֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1SI */
/* JADX INFO: loaded from: classes4.dex */
public final class C9255 extends AbstractC1492 implements InterfaceC10666 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31469;

    public C9255(byte[] bArr) throws C6782 {
        if (bArr.length == 1) {
            byte b = bArr[0];
            if ((b & 255) <= 37) {
                int i = (b & 1) | 2;
                this.f31469 = i;
                this.f31469 = i << ((b >>> 1) + 11);
                return;
            }
        }
        throw new C6782("Unsupported LZMA2 properties");
    }

    @Override // l.InterfaceC10666
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo23780() {
        return C4665.m12866(this.f31469);
    }

    @Override // l.InterfaceC10666
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo23781(InputStream inputStream, C17720 c17720) {
        return new C4665(inputStream, this.f31469, c17720);
    }
}
