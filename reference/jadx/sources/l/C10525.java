package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 439X */
/* JADX INFO: loaded from: classes4.dex */
public final class C10525 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22460 f33472;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f33471 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f33473 = 0;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C10525(C22460 c22460) {
        this.f33472 = c22460;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f33471;
        C22460 c22460 = this.f33472;
        if (i >= c22460.f72689) {
            return -1;
        }
        int iM50633 = c22460.m50633(this.f33471);
        this.f33471++;
        return iM50633;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        C22460 c22460 = this.f33472;
        int i3 = c22460.f72689 - this.f33471;
        if (i2 > i3) {
            i2 = i3;
        }
        System.arraycopy(c22460.f72688, this.f33471, bArr, i, i2);
        this.f33471 += i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f33472.f72689 - this.f33471;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f33473 = this.f33471;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f33471 = this.f33473;
    }
}
