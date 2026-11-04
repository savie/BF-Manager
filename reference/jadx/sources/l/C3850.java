package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C3850 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f13155;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f13156;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C3850(C2247 c2247) {
        super(c2247);
        this.f13156 = 2097152L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i == -1) {
            return -1;
        }
        long j = this.f13155 + 1;
        this.f13155 = j;
        if (j <= this.f13156) {
            return i;
        }
        throw new C0121();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13155;
        long j2 = this.f13156;
        int i3 = super.read(bArr, i, (int) Math.max(1L, Math.min(i2, (j2 - j) + 1)));
        if (i3 > 0) {
            long j3 = this.f13155 + ((long) i3);
            this.f13155 = j3;
            if (j3 > j2) {
                throw new C0121();
            }
        }
        return i3;
    }
}
