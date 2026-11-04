package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܶۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58FP */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15808 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f51433;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f51434;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f51435;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo10210(long j, ByteBuffer byteBuffer);

    public AbstractC15808(long j, long j2) {
        long j3 = j + j2;
        this.f51433 = j3;
        if (j3 >= j) {
            this.f51435 = j;
        } else {
            StringBuilder sbM8289 = C2458.m8289("Invalid length of stream at offset=", ", length=", j);
            sbM8289.append(j2);
            throw new IllegalArgumentException(sbM8289.toString());
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        if (this.f51435 >= this.f51433) {
            return -1;
        }
        ByteBuffer byteBuffer = this.f51434;
        if (byteBuffer == null) {
            this.f51434 = ByteBuffer.allocate(1);
        } else {
            byteBuffer.rewind();
        }
        if (mo10210(this.f51435, this.f51434) < 1) {
            return -1;
        }
        this.f51435++;
        return this.f51434.get() & 255;
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        long j = this.f51435;
        long j2 = this.f51433;
        if (j >= j2) {
            return -1;
        }
        long jMin = Math.min(i2, j2 - j);
        if (jMin <= 0) {
            return 0;
        }
        if (i < 0 || i > bArr.length || jMin > bArr.length - i) {
            throw new IndexOutOfBoundsException("offset or len are out of bounds");
        }
        int iMo10210 = mo10210(this.f51435, ByteBuffer.wrap(bArr, i, (int) jMin));
        if (iMo10210 > 0) {
            this.f51435 += (long) iMo10210;
        }
        return iMo10210;
    }
}
