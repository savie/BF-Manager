package l;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.֡֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes2.dex */
public final class C0097 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f1028;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f1029;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CRC32 f1030;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C0097(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
        this.f1030 = new CRC32();
        this.f1029 = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (this.f1029 && i >= 0) {
            this.f1030.update(i);
        }
        if (i >= 0) {
            this.f1028++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (this.f1029 && i3 > 0) {
            this.f1030.update(bArr, i, i3);
        }
        if (i3 > 0) {
            this.f1028 += (long) i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m1056() {
        return this.f1030.getValue();
    }

    public final long getPosition() {
        return this.f1028;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m1057() {
        this.f1029 = false;
    }
}
