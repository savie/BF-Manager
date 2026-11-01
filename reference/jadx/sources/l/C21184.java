package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩷᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GT */
/* JADX INFO: loaded from: classes5.dex */
public final class C21184 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16246 f68967;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f68968;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f68969;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C21184(C16246 c16246, int i) {
        this.f68967 = c16246;
        this.f68969 = i;
        this.f68968 = i;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f68969;
        C16246 c16246 = this.f68967;
        if (i >= c16246.f52401) {
            return -1;
        }
        byte[] bArr = c16246.f52400;
        int i2 = this.f68969;
        this.f68969 = i2 + 1;
        return bArr[i2];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int length = bArr.length;
        C16246 c16246 = this.f68967;
        int iMin = Math.min(length, c16246.f52401 - this.f68969);
        if (iMin <= 0) {
            return this.f68969 >= c16246.f52401 ? -1 : 0;
        }
        System.arraycopy(c16246.f52400, this.f68969, bArr, 0, iMin);
        this.f68969 += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C16246 c16246 = this.f68967;
        int iMin = Math.min(i2, c16246.f52401 - this.f68969);
        if (iMin <= 0) {
            return this.f68969 >= c16246.f52401 ? -1 : 0;
        }
        System.arraycopy(c16246.f52400, this.f68969, bArr, i, iMin);
        this.f68969 += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int iMax = (int) Math.max(0L, Math.min(j, this.f68967.f52401 - this.f68969));
        this.f68969 += iMax;
        return iMax;
    }

    @Override // java.io.InputStream
    public final int available() {
        return Math.max(0, this.f68967.f52401 - this.f68969);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f68968 = this.f68969;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f68969 = this.f68968;
    }
}
