package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۙᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 439X */
/* JADX INFO: loaded from: classes3.dex */
public final class C4835 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14009 f16990;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f16991 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f16992 = 0;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C4835(C14009 c14009) {
        this.f16990 = c14009;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f16991;
        C14009 c14009 = this.f16990;
        if (i >= c14009.f46031) {
            return -1;
        }
        int iM33858 = c14009.m33858(this.f16991);
        this.f16991++;
        return iM33858;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        C14009 c14009 = this.f16990;
        int i3 = c14009.f46031 - this.f16991;
        if (i2 > i3) {
            i2 = i3;
        }
        System.arraycopy(c14009.f46030, this.f16991, bArr, i, i2);
        this.f16991 += i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f16990.f46031 - this.f16991;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f16992 = this.f16991;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f16991 = this.f16992;
    }
}
