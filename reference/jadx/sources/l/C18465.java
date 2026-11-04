package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܿܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4HB */
/* JADX INFO: loaded from: classes5.dex */
public final class C18465 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C0566 f60096;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f60097 = new byte[1];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10260 f60098;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C18465(C22941 c22941, C8002 c8002, C10260 c10260, String str) throws IOException {
        this.f60098 = c10260;
        byte[] bArr = new byte[12];
        C17719.m41498(c10260, bArr, 12);
        this.f60096 = new C0566(c22941, c8002, str, bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f60098.read(bArr, i, i2);
        if (i3 > 0) {
            this.f60096.m2581(i, i3, bArr);
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f60097;
        if (read(bArr) <= 0) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
