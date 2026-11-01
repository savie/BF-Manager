package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1S8 */
/* JADX INFO: loaded from: classes5.dex */
public class C18071 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public IOException f57785;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f57786;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13133 f57787;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f57788;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17720 f57789;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InputStream f57790;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f57791;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f57792;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C18071(InputStream inputStream) throws IOException {
        C17720 c17720M41263 = C17720.m41263();
        this.f57792 = false;
        this.f57785 = null;
        this.f57791 = new byte[1];
        this.f57789 = c17720M41263;
        this.f57790 = inputStream;
        this.f57788 = -1;
        this.f57786 = true;
        byte[] bArr = new byte[12];
        new DataInputStream(inputStream).readFully(bArr);
        this.f57787 = new C13133(inputStream, -1, true, bArr, c17720M41263);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f57791;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f57790 == null) {
            throw new C21599("Stream closed");
        }
        IOException iOException = this.f57785;
        if (iOException != null) {
            throw iOException;
        }
        if (!this.f57792) {
            while (i2 > 0) {
                try {
                    if (this.f57787 == null) {
                        m42066();
                        if (this.f57792) {
                            if (i4 == 0) {
                            }
                        }
                    }
                    int i5 = this.f57787.read(bArr, i, i2);
                    if (i5 > 0) {
                        i4 += i5;
                        i += i5;
                        i2 -= i5;
                    } else if (i5 == -1) {
                        this.f57787 = null;
                    }
                } catch (IOException e) {
                    this.f57785 = e;
                    if (i4 == 0) {
                        throw e;
                    }
                }
            }
            return i4;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42066() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(this.f57790);
        byte[] bArr = new byte[12];
        while (dataInputStream.read(bArr, 0, 1) != -1) {
            dataInputStream.readFully(bArr, 1, 3);
            if (bArr[0] != 0 || bArr[1] != 0 || bArr[2] != 0 || bArr[3] != 0) {
                dataInputStream.readFully(bArr, 4, 8);
                try {
                    this.f57787 = new C13133(this.f57790, this.f57788, this.f57786, bArr, this.f57789);
                    return;
                } catch (C15250 unused) {
                    throw new C19838("Garbage after a valid XZ Stream");
                }
            }
        }
        this.f57792 = true;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f57790 == null) {
            throw new C21599("Stream closed");
        }
        IOException iOException = this.f57785;
        if (iOException != null) {
            throw iOException;
        }
        C13133 c13133 = this.f57787;
        if (c13133 == null) {
            return 0;
        }
        return c13133.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f57790 != null) {
            C13133 c13133 = this.f57787;
            if (c13133 != null) {
                c13133.m32492(false);
                this.f57787 = null;
            }
            try {
                this.f57790.close();
            } finally {
                this.f57790 = null;
            }
        }
    }
}
