package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.۟᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7779 extends OutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f25644;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16246 f25645;

    public C7779(C16246 c16246, int i) {
        this.f25645 = c16246;
        this.f25644 = i;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.f25644 + 1;
        C16246 c16246 = this.f25645;
        C16246.m38369(c16246, i2);
        byte[] bArr = c16246.f52400;
        int i3 = this.f25644;
        this.f25644 = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        int length = this.f25644 + bArr.length;
        C16246 c16246 = this.f25645;
        C16246.m38369(c16246, length);
        System.arraycopy(bArr, 0, c16246.f52400, this.f25644, bArr.length);
        this.f25644 += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.f25644 + i2;
        C16246 c16246 = this.f25645;
        C16246.m38369(c16246, i3);
        System.arraycopy(bArr, i, c16246.f52400, this.f25644, i2);
        this.f25644 += i2;
    }
}
