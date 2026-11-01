package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۬۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21TH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13133 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC8900 f43728;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f43729;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f43731;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17720 f43734;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InputStream f43736;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20189 f43738;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7137 f43737 = null;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C17366 f43730 = new C17366();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f43735 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public IOException f43732 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f43733 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C13133(InputStream inputStream, int i, boolean z, byte[] bArr, C17720 c17720) throws C6782, C19838, C15250 {
        this.f43734 = c17720;
        this.f43736 = inputStream;
        this.f43731 = i;
        this.f43729 = z;
        C20189 c20189M47004 = C20894.m47004(bArr);
        this.f43738 = c20189M47004;
        this.f43728 = AbstractC8900.m23156(c20189M47004.f65535);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f43733;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f43736 == null) {
            throw new C21599("Stream closed");
        }
        IOException iOException = this.f43732;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f43735) {
            return -1;
        }
        int i4 = 0;
        while (i2 > 0) {
            try {
                C7137 c7137 = this.f43737;
                C17366 c17366 = this.f43730;
                if (c7137 == null) {
                    try {
                        this.f43737 = new C7137(this.f43736, this.f43728, this.f43729, this.f43731, this.f43734);
                    } catch (C14194 unused) {
                        c17366.m40439(this.f43736);
                        m32491();
                        this.f43735 = true;
                        if (i4 > 0) {
                            return i4;
                        }
                        return -1;
                    }
                }
                int i5 = this.f43737.read(bArr, i, i2);
                if (i5 > 0) {
                    i4 += i5;
                    i += i5;
                    i2 -= i5;
                } else if (i5 == -1) {
                    c17366.mo30885(this.f43737.m19035(), this.f43737.m19034());
                    this.f43737 = null;
                }
            } catch (IOException e) {
                this.f43732 = e;
                if (i4 == 0) {
                    throw e;
                }
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32491() throws IOException {
        byte[] bArr = new byte[12];
        new DataInputStream(this.f43736).readFully(bArr);
        C20189 c20189M47002 = C20894.m47002(bArr);
        if (this.f43738.f65535 != c20189M47002.f65535 || this.f43730.m39126() != c20189M47002.f65534) {
            throw new C19838("XZ Stream Footer does not match Stream Header");
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f43736 == null) {
            throw new C21599("Stream closed");
        }
        IOException iOException = this.f43732;
        if (iOException != null) {
            throw iOException;
        }
        C7137 c7137 = this.f43737;
        if (c7137 == null) {
            return 0;
        }
        return c7137.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m32492(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32492(boolean z) {
        if (this.f43736 != null) {
            C7137 c7137 = this.f43737;
            if (c7137 != null) {
                c7137.close();
                this.f43737 = null;
            }
            if (z) {
                try {
                    this.f43736.close();
                } finally {
                    this.f43736 = null;
                }
            }
        }
    }
}
