package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes4.dex */
public final class C11237 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9017 f38018;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f38019;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f38020;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f38021;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStream f38022;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C11237(InputStream inputStream, byte[] bArr, int i, C9017 c9017) {
        this.f38022 = inputStream;
        this.f38019 = bArr;
        this.f38020 = i;
        this.f38018 = c9017;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C13638.checkFromIndexSize(i, i2, bArr.length);
        synchronized (this) {
            if (this.f38022 == null) {
                throw new IOException("Text input is closed");
            }
            if (i2 == 0) {
                return 0;
            }
            int i3 = this.f38021;
            int i4 = this.f38020;
            if (i3 < i4) {
                int iMin = Math.min(i2, i4 - i3);
                System.arraycopy(this.f38019, this.f38021, bArr, i, iMin);
                int i5 = this.f38021 + iMin;
                this.f38021 = i5;
                if (i5 == this.f38020) {
                    this.f38019 = null;
                    C9017 c9017 = this.f38018;
                    if (c9017 != null) {
                        c9017.close();
                        this.f38018 = null;
                    }
                }
                return iMin;
            }
            this.f38019 = null;
            C9017 c9018 = this.f38018;
            if (c9018 != null) {
                c9018.close();
                this.f38018 = null;
            }
            return this.f38022.read(bArr, i, i2);
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream;
        synchronized (this) {
            inputStream = this.f38022;
            this.f38022 = null;
            this.f38019 = null;
            C9017 c9017 = this.f38018;
            if (c9017 != null) {
                c9017.close();
                this.f38018 = null;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
