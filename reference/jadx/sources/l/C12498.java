package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۨܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GI */
/* JADX INFO: loaded from: classes4.dex */
public final class C12498 extends OutputStream {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final OutputStream f40130;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f40131;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6533 f40133;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f40132 = new byte[16];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f40134 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f40135 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f40129 = true;

    public C12498(OutputStream outputStream, String str, int i, boolean z) {
        this.f40130 = outputStream;
        this.f40131 = z;
        this.f40133 = new C6533(str, i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int iMin = Math.min(16 - this.f40134, i2);
            System.arraycopy(bArr, i, this.f40132, this.f40134, iMin);
            int i3 = this.f40134 + iMin;
            this.f40134 = i3;
            i += iMin;
            i2 -= iMin;
            if (i3 == 16) {
                m31037(false);
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.f40134;
        int i3 = i2 + 1;
        this.f40134 = i3;
        this.f40132[i2] = (byte) i;
        if (i3 == 16) {
            m31037(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31037(boolean z) throws IOException {
        boolean z2 = this.f40129;
        C6533 c6533 = this.f40133;
        OutputStream outputStream = this.f40130;
        if (z2) {
            this.f40129 = false;
            if (this.f40131) {
                byte[] bArr = new byte[8];
                C6929.m19211(6436280820912968781L, 0, bArr);
                outputStream.write(bArr);
            }
            outputStream.write(c6533.m18408());
            outputStream.write(c6533.m18407());
        }
        if (!z && this.f40134 != 16) {
            throw new IllegalStateException();
        }
        int i = this.f40134;
        byte[] bArr2 = this.f40132;
        c6533.m18406(i, bArr2);
        outputStream.write(bArr2, 0, this.f40134);
        this.f40134 = 0;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f40135) {
            return;
        }
        this.f40135 = true;
        int i = this.f40134;
        C6533 c6533 = this.f40133;
        OutputStream outputStream = this.f40130;
        if (i > 0) {
            m31037(true);
        } else if (this.f40129) {
            this.f40129 = false;
            if (this.f40131) {
                byte[] bArr = new byte[8];
                C6929.m19211(6436280820912968781L, 0, bArr);
                outputStream.write(bArr);
            }
            outputStream.write(c6533.m18408());
            outputStream.write(c6533.m18407());
        }
        outputStream.write(c6533.m18409());
        outputStream.close();
    }
}
