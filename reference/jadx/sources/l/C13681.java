package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܰ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X7RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C13681 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45140;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final OutputStream f45141;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f45142;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33385(boolean z) throws IOException {
        int i = this.f45142 + 1;
        int i2 = ((z ? 1 : 0) << (32 - i)) | this.f45140;
        if (i == 8) {
            this.f45141.write(i2 >>> 24);
            i = 0;
            i2 = 0;
        }
        this.f45140 = i2;
        this.f45142 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33384(int i, int i2) throws IOException {
        int i3 = this.f45142;
        int i4 = ((i2 << (32 - i)) >>> i3) | this.f45140;
        int i5 = i3 + i;
        while (i5 >= 8) {
            this.f45141.write(i4 >>> 24);
            i4 <<= 8;
            i5 -= 8;
        }
        this.f45140 = i4;
        this.f45142 = i5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33383() throws IOException {
        int i = this.f45142;
        if (i > 0) {
            m33384(8 - i, 0);
        }
    }

    public C13681(OutputStream outputStream) {
        this.f45141 = outputStream;
    }
}
