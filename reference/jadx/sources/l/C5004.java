package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۙܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B2OJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5004 extends C7285 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f17371;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            long j = this.f17371;
            if (j >= 0) {
                this.f17371 = j + 1;
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (i3 > 0) {
            long j = this.f17371;
            if (j >= 0) {
                this.f17371 = j + ((long) i3);
            }
        }
        return i3;
    }

    public C5004(InputStream inputStream) {
        super(inputStream);
        this.f17371 = 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m15231() {
        return this.f17371;
    }
}
