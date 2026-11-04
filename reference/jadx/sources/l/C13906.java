package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۬ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes4.dex */
public final class C13906 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f44112;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public byte[] f44113;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f44114;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C18251 f44115;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStream f44116;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C13906(InputStream inputStream, byte[] bArr, int i, C18251 c18251) {
        this.f44116 = inputStream;
        this.f44113 = bArr;
        this.f44114 = i;
        this.f44115 = c18251;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C17359.checkFromIndexSize(i, i2, bArr.length);
        synchronized (this) {
            if (this.f44116 == null) {
                throw new IOException("Text input is closed");
            }
            if (i2 == 0) {
                return 0;
            }
            int i3 = this.f44112;
            int i4 = this.f44114;
            if (i3 < i4) {
                int iMin = Math.min(i2, i4 - i3);
                System.arraycopy(this.f44113, this.f44112, bArr, i, iMin);
                int i5 = this.f44112 + iMin;
                this.f44112 = i5;
                if (i5 == this.f44114) {
                    this.f44113 = null;
                    C18251 c18251 = this.f44115;
                    if (c18251 != null) {
                        c18251.close();
                        this.f44115 = null;
                    }
                }
                return iMin;
            }
            this.f44113 = null;
            C18251 c18252 = this.f44115;
            if (c18252 != null) {
                c18252.close();
                this.f44115 = null;
            }
            return this.f44116.read(bArr, i, i2);
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream;
        synchronized (this) {
            inputStream = this.f44116;
            this.f44116 = null;
            this.f44113 = null;
            C18251 c18251 = this.f44115;
            if (c18251 != null) {
                c18251.close();
                this.f44115 = null;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
