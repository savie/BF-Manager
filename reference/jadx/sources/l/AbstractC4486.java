package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۙۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 58FP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4486 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ByteBuffer f15956;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f15957;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f15958;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract int mo12514(long j, ByteBuffer byteBuffer);

    public AbstractC4486(long j, long j2) {
        long j3 = j + j2;
        this.f15957 = j3;
        if (j3 >= j) {
            this.f15958 = j;
        } else {
            StringBuilder sbM39970 = C17114.m39970("Invalid length of stream at offset=", ", length=", j);
            sbM39970.append(j2);
            throw new IllegalArgumentException(sbM39970.toString());
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        if (this.f15958 >= this.f15957) {
            return -1;
        }
        ByteBuffer byteBuffer = this.f15956;
        if (byteBuffer == null) {
            this.f15956 = ByteBuffer.allocate(1);
        } else {
            byteBuffer.rewind();
        }
        if (mo12514(this.f15958, this.f15956) < 1) {
            return -1;
        }
        this.f15958++;
        return this.f15956.get() & 255;
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        long j = this.f15958;
        long j2 = this.f15957;
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
        int iMo12514 = mo12514(this.f15958, ByteBuffer.wrap(bArr, i, (int) jMin));
        if (iMo12514 > 0) {
            this.f15958 += (long) iMo12514;
        }
        return iMo12514;
    }
}
