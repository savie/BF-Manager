package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֡ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A1S8 */
/* JADX INFO: loaded from: classes3.dex */
public class C0529 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InputStream f2229;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C6496 f2230;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f2231;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f2232;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0573 f2233;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IOException f2234;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f2235;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f2236;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C0529(InputStream inputStream) throws IOException {
        C0573 c0573M2591 = C0573.m2591();
        this.f2236 = false;
        this.f2234 = null;
        this.f2235 = new byte[1];
        this.f2233 = c0573M2591;
        this.f2229 = inputStream;
        this.f2231 = -1;
        this.f2232 = true;
        byte[] bArr = new byte[12];
        new DataInputStream(inputStream).readFully(bArr);
        this.f2230 = new C6496(inputStream, -1, true, bArr, c0573M2591);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f2235;
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
        if (this.f2229 == null) {
            throw new C18428("Stream closed");
        }
        IOException iOException = this.f2234;
        if (iOException != null) {
            throw iOException;
        }
        if (!this.f2236) {
            while (i2 > 0) {
                try {
                    if (this.f2230 == null) {
                        m2498();
                        if (this.f2236) {
                            if (i4 == 0) {
                            }
                        }
                    }
                    int i5 = this.f2230.read(bArr, i, i2);
                    if (i5 > 0) {
                        i4 += i5;
                        i += i5;
                        i2 -= i5;
                    } else if (i5 == -1) {
                        this.f2230 = null;
                    }
                } catch (IOException e) {
                    this.f2234 = e;
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
    private void m2498() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(this.f2229);
        byte[] bArr = new byte[12];
        while (dataInputStream.read(bArr, 0, 1) != -1) {
            dataInputStream.readFully(bArr, 1, 3);
            if (bArr[0] != 0 || bArr[1] != 0 || bArr[2] != 0 || bArr[3] != 0) {
                dataInputStream.readFully(bArr, 4, 8);
                try {
                    this.f2230 = new C6496(this.f2229, this.f2231, this.f2232, bArr, this.f2233);
                    return;
                } catch (C21412 unused) {
                    throw new C13996("Garbage after a valid XZ Stream");
                }
            }
        }
        this.f2236 = true;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f2229 == null) {
            throw new C18428("Stream closed");
        }
        IOException iOException = this.f2234;
        if (iOException != null) {
            throw iOException;
        }
        C6496 c6496 = this.f2230;
        if (c6496 == null) {
            return 0;
        }
        return c6496.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2229 != null) {
            C6496 c6496 = this.f2230;
            if (c6496 != null) {
                c6496.m18332(false);
                this.f2230 = null;
            }
            try {
                this.f2229.close();
            } finally {
                this.f2229 = null;
            }
        }
    }
}
