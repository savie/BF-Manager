package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۛܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: HC85 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6527 extends FilterOutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f21941;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21942;

    public C6527(OutputStream outputStream) {
        super(outputStream);
        this.f21941 = new byte[8192];
    }

    public C6527(byte[] bArr, OutputStream outputStream) {
        super(outputStream);
        if (bArr.length == 0) {
            throw new IllegalArgumentException("Buffer size == 0");
        }
        this.f21941 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18402() throws IOException {
        int i = this.f21942;
        if (i > 0) {
            ((FilterOutputStream) this).out.write(this.f21941, 0, i);
            this.f21942 = 0;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.f21942;
        byte[] bArr = this.f21941;
        if (i2 >= bArr.length) {
            m18402();
        }
        int i3 = this.f21942;
        this.f21942 = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.f21941;
        if (i2 >= bArr2.length) {
            m18402();
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        } else {
            if (i2 > bArr2.length - this.f21942) {
                m18402();
            }
            System.arraycopy(bArr, i, bArr2, this.f21942, i2);
            this.f21942 += i2;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m18402();
        ((FilterOutputStream) this).out.flush();
    }
}
