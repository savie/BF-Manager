package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G8BC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9222 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f31346;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C9222(long j) {
        this.f31346 = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.f31346;
        if (j <= 0) {
            return -1;
        }
        this.f31346 = j - 1;
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f31346;
        if (j <= 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        Arrays.fill(bArr, i, i + i2, (byte) 0);
        this.f31346 -= (long) i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        long j = this.f31346;
        if (65535 > j) {
            return (int) j;
        }
        return 65535;
    }
}
