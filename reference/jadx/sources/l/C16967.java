package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܺܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54YN */
/* JADX INFO: loaded from: classes4.dex */
public final class C16967 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f55473;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC17713 f55474;

    public C16967(long j, C13961 c13961) {
        this.f55473 = j;
        this.f55474 = c13961;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        long j = this.f55473;
        InterfaceC17713 interfaceC17713 = this.f55474;
        interfaceC17713.seek(j);
        this.f55473++;
        interfaceC17713.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        long j = this.f55473;
        InterfaceC17713 interfaceC17713 = this.f55474;
        interfaceC17713.seek(j);
        this.f55473 += (long) bArr.length;
        interfaceC17713.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        long j = this.f55473;
        InterfaceC17713 interfaceC17713 = this.f55474;
        interfaceC17713.seek(j);
        this.f55473 += (long) i2;
        interfaceC17713.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f55474.flush();
    }
}
