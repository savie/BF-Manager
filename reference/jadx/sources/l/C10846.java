package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GT */
/* JADX INFO: loaded from: classes4.dex */
public final class C10846 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f34344;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22781 f34345;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34346;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C10846(C22781 c22781, int i) {
        this.f34345 = c22781;
        this.f34346 = i;
        this.f34344 = i;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f34346;
        C22781 c22781 = this.f34345;
        if (i >= c22781.f73898) {
            return -1;
        }
        byte[] bArr = c22781.f73897;
        int i2 = this.f34346;
        this.f34346 = i2 + 1;
        return bArr[i2];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int length = bArr.length;
        C22781 c22781 = this.f34345;
        int iMin = Math.min(length, c22781.f73898 - this.f34346);
        if (iMin <= 0) {
            return this.f34346 >= c22781.f73898 ? -1 : 0;
        }
        System.arraycopy(c22781.f73897, this.f34346, bArr, 0, iMin);
        this.f34346 += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C22781 c22781 = this.f34345;
        int iMin = Math.min(i2, c22781.f73898 - this.f34346);
        if (iMin <= 0) {
            return this.f34346 >= c22781.f73898 ? -1 : 0;
        }
        System.arraycopy(c22781.f73897, this.f34346, bArr, i, iMin);
        this.f34346 += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int iMax = (int) Math.max(0L, Math.min(j, this.f34345.f73898 - this.f34346));
        this.f34346 += iMax;
        return iMax;
    }

    @Override // java.io.InputStream
    public final int available() {
        return Math.max(0, this.f34345.f73898 - this.f34346);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f34344 = this.f34346;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f34346 = this.f34344;
    }
}
