package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4007 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f13693;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final OutputStream f13694;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f13695;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12970(boolean z) throws IOException {
        int i = this.f13695 + 1;
        int i2 = ((z ? 1 : 0) << (32 - i)) | this.f13693;
        if (i == 8) {
            this.f13694.write(i2 >>> 24);
            i = 0;
            i2 = 0;
        }
        this.f13693 = i2;
        this.f13695 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12969(int i, int i2) throws IOException {
        int i3 = this.f13695;
        int i4 = ((i2 << (32 - i)) >>> i3) | this.f13693;
        int i5 = i3 + i;
        while (i5 >= 8) {
            this.f13694.write(i4 >>> 24);
            i4 <<= 8;
            i5 -= 8;
        }
        this.f13693 = i4;
        this.f13695 = i5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12968() throws IOException {
        int i = this.f13695;
        if (i > 0) {
            m12969(8 - i, 0);
        }
    }

    public C4007(OutputStream outputStream) {
        this.f13694 = outputStream;
    }
}
