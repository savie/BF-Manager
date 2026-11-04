package l;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܳ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes5.dex */
public final class C15373 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f50136;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f50137;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CRC32 f50138;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C15373(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
        this.f50138 = new CRC32();
        this.f50136 = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (this.f50136 && i >= 0) {
            this.f50138.update(i);
        }
        if (i >= 0) {
            this.f50137++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (this.f50136 && i3 > 0) {
            this.f50138.update(bArr, i, i3);
        }
        if (i3 > 0) {
            this.f50137 += (long) i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m36805() {
        return this.f50138.getValue();
    }

    public final long getPosition() {
        return this.f50137;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36806() {
        this.f50136 = false;
    }
}
