package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۡ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H4SF */
/* JADX INFO: loaded from: classes3.dex */
public final class C9157 extends PushbackInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final boolean f31126 = System.lineSeparator().equals("\r\n");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final byte[] f31127 = System.lineSeparator().getBytes(StandardCharsets.US_ASCII);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f31128;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C9157(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream, f31127.length + 1);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        if (((PushbackInputStream) this).in == null) {
            throw new IOException("Stream closed");
        }
        return ((PushbackInputStream) this).in.available() + (((PushbackInputStream) this).buf.length - ((PushbackInputStream) this).pos);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (f31126) {
            return super.read();
        }
        return readInt();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (f31126) {
            return super.read(bArr, i, i2);
        }
        if (i2 < 1) {
            return 0;
        }
        int iMin = Math.min(i2, available());
        this.f31128 = iMin;
        if (iMin < 1) {
            this.f31128 = 1;
        }
        int i4 = readInt();
        if (i4 == -1) {
            return -1;
        }
        int i5 = i;
        while (true) {
            i3 = i5 + 1;
            bArr[i5] = (byte) i4;
            int i6 = this.f31128 - 1;
            this.f31128 = i6;
            if (i6 <= 0 || (i4 = readInt()) == -1) {
                break;
            }
            i5 = i3;
        }
        return i3 - i;
    }

    private int readInt() throws IOException {
        int i = super.read();
        if (i != 13) {
            return i;
        }
        int i2 = super.read();
        if (i2 != 10) {
            if (i2 != -1) {
                unread(i2);
            }
            return 13;
        }
        unread(f31127);
        int i3 = super.read();
        this.f31128--;
        return i3;
    }
}
