package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֫ۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes2.dex */
public final class C1763 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f6895;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f6896;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C1763(C0261 c0261) {
        super(c0261);
        this.f6896 = 2097152L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i == -1) {
            return -1;
        }
        long j = this.f6895 + 1;
        this.f6895 = j;
        if (j <= this.f6896) {
            return i;
        }
        throw new C13676();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f6895;
        long j2 = this.f6896;
        int i3 = super.read(bArr, i, (int) Math.max(1L, Math.min(i2, (j2 - j) + 1)));
        if (i3 > 0) {
            long j3 = this.f6895 + ((long) i3);
            this.f6895 = j3;
            if (j3 > j2) {
                throw new C13676();
            }
        }
        return i3;
    }
}
