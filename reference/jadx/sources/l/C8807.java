package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۡۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8807 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C10218 f30282;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f30283;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final OutputStream f30284;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f30285 = new byte[16];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f30287 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f30288 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f30286 = true;

    public C8807(OutputStream outputStream, String str, int i, boolean z) {
        this.f30284 = outputStream;
        this.f30283 = z;
        this.f30282 = new C10218(str, i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int iMin = Math.min(16 - this.f30287, i2);
            System.arraycopy(bArr, i, this.f30285, this.f30287, iMin);
            int i3 = this.f30287 + iMin;
            this.f30287 = i3;
            i += iMin;
            i2 -= iMin;
            if (i3 == 16) {
                m22924(false);
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.f30287;
        int i3 = i2 + 1;
        this.f30287 = i3;
        this.f30285[i2] = (byte) i;
        if (i3 == 16) {
            m22924(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22924(boolean z) throws IOException {
        boolean z2 = this.f30286;
        C10218 c10218 = this.f30282;
        OutputStream outputStream = this.f30284;
        if (z2) {
            this.f30286 = false;
            if (this.f30283) {
                byte[] bArr = new byte[8];
                C15157.m36340(6436280820912968781L, 0, bArr);
                outputStream.write(bArr);
            }
            outputStream.write(c10218.m26003());
            outputStream.write(c10218.m26002());
        }
        if (!z && this.f30287 != 16) {
            throw new IllegalStateException();
        }
        int i = this.f30287;
        byte[] bArr2 = this.f30285;
        c10218.m26001(i, bArr2);
        outputStream.write(bArr2, 0, this.f30287);
        this.f30287 = 0;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f30288) {
            return;
        }
        this.f30288 = true;
        int i = this.f30287;
        C10218 c10218 = this.f30282;
        OutputStream outputStream = this.f30284;
        if (i > 0) {
            m22924(true);
        } else if (this.f30286) {
            this.f30286 = false;
            if (this.f30283) {
                byte[] bArr = new byte[8];
                C15157.m36340(6436280820912968781L, 0, bArr);
                outputStream.write(bArr);
            }
            outputStream.write(c10218.m26003());
            outputStream.write(c10218.m26002());
        }
        outputStream.write(c10218.m26004());
        outputStream.close();
    }
}
