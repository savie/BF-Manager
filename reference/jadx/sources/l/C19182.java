package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩵ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: R70I */
/* JADX INFO: loaded from: classes4.dex */
public final class C19182 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22710 f61955;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44036() {
        C22710 c22710 = this.f61955;
        if (c22710 == null) {
            return 0;
        }
        return c22710.f73964;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44038(OutputStream outputStream, int i) {
        C22979.m50823(m44036(), 0, i);
        int iMin = Math.min(1048576, Math.max(1, i));
        byte[] bArr = new byte[iMin];
        int i2 = 0;
        while (i > 0) {
            int iMin2 = Math.min(iMin, i);
            m44037(i2, iMin2, bArr);
            outputStream.write(bArr, 0, iMin2);
            i2 += iMin2;
            i -= iMin2;
        }
    }

    public C19182(C22710 c22710) {
        this.f61955 = c22710;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44037(int i, int i2, byte[] bArr) {
        C7893.m20871(i, 0, i2, this.f61955, bArr);
    }
}
