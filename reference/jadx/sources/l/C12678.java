package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: HC85 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12678 extends FilterOutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f42334;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f42335;

    public C12678(OutputStream outputStream) {
        super(outputStream);
        this.f42334 = new byte[8192];
    }

    public C12678(byte[] bArr, OutputStream outputStream) {
        super(outputStream);
        if (bArr.length == 0) {
            throw new IllegalArgumentException("Buffer size == 0");
        }
        this.f42334 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31534() throws IOException {
        int i = this.f42335;
        if (i > 0) {
            ((FilterOutputStream) this).out.write(this.f42334, 0, i);
            this.f42335 = 0;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.f42335;
        byte[] bArr = this.f42334;
        if (i2 >= bArr.length) {
            m31534();
        }
        int i3 = this.f42335;
        this.f42335 = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.f42334;
        if (i2 >= bArr2.length) {
            m31534();
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        } else {
            if (i2 > bArr2.length - this.f42335) {
                m31534();
            }
            System.arraycopy(bArr, i, bArr2, this.f42335, i2);
            this.f42335 += i2;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m31534();
        ((FilterOutputStream) this).out.flush();
    }
}
