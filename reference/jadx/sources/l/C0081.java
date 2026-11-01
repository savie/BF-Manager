package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֡֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2OJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0081 extends C15605 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f989;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            long j = this.f989;
            if (j >= 0) {
                this.f989 = j + 1;
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 > 0) {
            long j = this.f989;
            if (j >= 0) {
                this.f989 = j + ((long) i3);
            }
        }
        return i3;
    }

    public C0081(InputStream inputStream) {
        super(inputStream);
        this.f989 = 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m1015() {
        return this.f989;
    }
}
