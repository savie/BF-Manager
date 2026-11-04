package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܳۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R70I */
/* JADX INFO: loaded from: classes4.dex */
public final class C15130 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13856 f49366;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36404() {
        C13856 c13856 = this.f49366;
        if (c13856 == null) {
            return 0;
        }
        return c13856.f43959;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36406(OutputStream outputStream, int i) {
        C13921.m33904(m36404(), 0, i);
        int iMin = Math.min(1048576, Math.max(1, i));
        byte[] bArr = new byte[iMin];
        int i2 = 0;
        while (i > 0) {
            int iMin2 = Math.min(iMin, i);
            m36405(i2, bArr, 0, iMin2);
            outputStream.write(bArr, 0, iMin2);
            i2 += iMin2;
            i -= iMin2;
        }
    }

    public C15130(C13856 c13856) {
        this.f49366 = c13856;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36405(int i, byte[] bArr, int i2, int i3) {
        C19606.m45244(i, i2, i3, this.f49366, bArr);
    }
}
