package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8BC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12323 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f39600;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C12323(long j) {
        this.f39600 = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.f39600;
        if (j <= 0) {
            return -1;
        }
        this.f39600 = j - 1;
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f39600;
        if (j <= 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        Arrays.fill(bArr, i, i + i2, (byte) 0);
        this.f39600 -= (long) i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        long j = this.f39600;
        if (65535 > j) {
            return (int) j;
        }
        return 65535;
    }
}
