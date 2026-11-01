package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54YN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10562 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f36156;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC7739 f36157;

    public C10562(long j, C1388 c1388) {
        this.f36156 = j;
        this.f36157 = c1388;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        long j = this.f36156;
        InterfaceC7739 interfaceC7739 = this.f36157;
        interfaceC7739.seek(j);
        this.f36156++;
        interfaceC7739.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        long j = this.f36156;
        InterfaceC7739 interfaceC7739 = this.f36157;
        interfaceC7739.seek(j);
        this.f36156 += (long) bArr.length;
        interfaceC7739.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        long j = this.f36156;
        InterfaceC7739 interfaceC7739 = this.f36157;
        interfaceC7739.seek(j);
        this.f36156 += (long) i2;
        interfaceC7739.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f36157.flush();
    }
}
