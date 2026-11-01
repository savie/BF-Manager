package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֡ۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4HB */
/* JADX INFO: loaded from: classes2.dex */
public final class C0339 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f1746 = new byte[1];

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C16568 f1747;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5984 f1748;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C0339(C2455 c2455, C12107 c12107, C5984 c5984, String str) throws IOException {
        this.f1748 = c5984;
        byte[] bArr = new byte[12];
        C21506.m48154(c5984, bArr, 12);
        this.f1747 = new C16568(c2455, c12107, str, bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f1748.read(bArr, i, i2);
        if (i3 > 0) {
            this.f1747.m38981(i, i3, bArr);
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f1746;
        if (read(bArr) <= 0) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
