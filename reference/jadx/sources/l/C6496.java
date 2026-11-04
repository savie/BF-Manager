package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۛܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 21TH */
/* JADX INFO: loaded from: classes3.dex */
public final class C6496 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f21815;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f21818;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C13952 f21819;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0573 f21821;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC1275 f21822;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InputStream f21823;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2810 f21824 = null;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C20140 f21820 = new C20140();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f21814 = false;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public IOException f21817 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f21816 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C6496(InputStream inputStream, int i, boolean z, byte[] bArr, C0573 c0573) throws C21412, C13996, C4258 {
        this.f21821 = c0573;
        this.f21823 = inputStream;
        this.f21815 = i;
        this.f21818 = z;
        C13952 c13952M23416 = C8732.m23416(bArr);
        this.f21819 = c13952M23416;
        this.f21822 = AbstractC1275.m4662(c13952M23416.f44255);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f21816;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f21823 == null) {
            throw new C18428("Stream closed");
        }
        IOException iOException = this.f21817;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f21814) {
            return -1;
        }
        int i4 = 0;
        while (i2 > 0) {
            try {
                C2810 c2810 = this.f21824;
                C20140 c20140 = this.f21820;
                if (c2810 == null) {
                    try {
                        this.f21824 = new C2810(this.f21823, this.f21822, this.f21818, this.f21815, this.f21821);
                    } catch (C5750 unused) {
                        c20140.m46367(this.f21823);
                        m18331();
                        this.f21814 = true;
                        if (i4 > 0) {
                            return i4;
                        }
                        return -1;
                    }
                }
                int i5 = this.f21824.read(bArr, i, i2);
                if (i5 > 0) {
                    i4 += i5;
                    i += i5;
                    i2 -= i5;
                } else if (i5 == -1) {
                    c20140.mo28193(this.f21824.m9283(), this.f21824.m9282());
                    this.f21824 = null;
                }
            } catch (IOException e) {
                this.f21817 = e;
                if (i4 == 0) {
                    throw e;
                }
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18331() throws IOException {
        byte[] bArr = new byte[12];
        new DataInputStream(this.f21823).readFully(bArr);
        C13952 c13952M23414 = C8732.m23414(bArr);
        if (this.f21819.f44255 != c13952M23414.f44255 || this.f21820.m28195() != c13952M23414.f44254) {
            throw new C13996("XZ Stream Footer does not match Stream Header");
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f21823 == null) {
            throw new C18428("Stream closed");
        }
        IOException iOException = this.f21817;
        if (iOException != null) {
            throw iOException;
        }
        C2810 c2810 = this.f21824;
        if (c2810 == null) {
            return 0;
        }
        return c2810.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m18332(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18332(boolean z) {
        if (this.f21823 != null) {
            C2810 c2810 = this.f21824;
            if (c2810 != null) {
                c2810.close();
                this.f21824 = null;
            }
            if (z) {
                try {
                    this.f21823.close();
                } finally {
                    this.f21823 = null;
                }
            }
        }
    }
}
