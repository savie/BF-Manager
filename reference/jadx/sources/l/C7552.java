package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۟ܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 16WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7552 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final OutputStream f25054;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f25055;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C7552(InputStream inputStream, long j, OutputStream outputStream) {
        super(inputStream);
        this.f25054 = outputStream;
        this.f25055 = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        try {
            C16020.m37995();
            int i3 = -1;
            if (this.f25055 == 0) {
                if (((FilterInputStream) this).in.read() == -1) {
                    return -1;
                }
                throw new IOException("Source grew during text append");
            }
            InputStream inputStream = ((FilterInputStream) this).in;
            int i4 = inputStream.read(bArr, i, (int) Math.min(i2, this.f25055));
            if (i4 != 0) {
                i3 = i4;
            } else {
                int i5 = inputStream.read();
                if (i5 >= 0) {
                    bArr[i] = (byte) i5;
                    i3 = 1;
                }
            }
            if (i3 < 0) {
                throw new IOException("Source ended before its expected size");
            }
            this.f25054.write(bArr, i, i3);
            this.f25055 -= (long) i3;
            return i3;
        } catch (C12731 e) {
            throw new C10375(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
