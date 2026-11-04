package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۧܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R1SI */
/* JADX INFO: loaded from: classes4.dex */
public final class C11715 extends AbstractC2021 implements InterfaceC15444 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f37920;

    public C11715(byte[] bArr) throws C4258 {
        if (bArr.length == 1) {
            byte b = bArr[0];
            if ((b & 255) <= 37) {
                int i = (b & 1) | 2;
                this.f37920 = i;
                this.f37920 = i << ((b >>> 1) + 11);
                return;
            }
        }
        throw new C4258("Unsupported LZMA2 properties");
    }

    @Override // l.InterfaceC15444
    /* JADX INFO: renamed from: ۙ */
    public final int mo21905() {
        return C16936.m39914(this.f37920);
    }

    @Override // l.InterfaceC15444
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo21906(InputStream inputStream, C0573 c0573) {
        return new C16936(inputStream, this.f37920, c0573);
    }
}
