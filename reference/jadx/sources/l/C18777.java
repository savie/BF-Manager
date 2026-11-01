package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩴ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1QE */
/* JADX INFO: loaded from: classes5.dex */
public final class C18777 extends AbstractC23366 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC8900 f60863;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f60864;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f60865;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12428 f60866;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2903[] f60867;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20189 f60868;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17720 f60869;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public IOException f60870;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f60871;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20543 f60872;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public OutputStream f60873;

    public C18777(OutputStream outputStream, C13839 c13839) throws IOException {
        C13839[] c13839Arr = {c13839};
        C17720 c17720M41263 = C17720.m41263();
        C20189 c20189 = new C20189();
        this.f60868 = c20189;
        this.f60866 = new C12428();
        this.f60872 = null;
        this.f60870 = null;
        this.f60865 = false;
        this.f60864 = new byte[1];
        this.f60869 = c17720M41263;
        this.f60873 = outputStream;
        this.f60871 = true;
        C13839 c138310 = c13839Arr[0];
        c138310.getClass();
        C2903[] c2903Arr = {new C2903(c138310)};
        this.f60871 = this.f60871;
        C22305.m49472(c2903Arr);
        this.f60867 = c2903Arr;
        c20189.f65535 = 4;
        this.f60863 = AbstractC8900.m23156(4);
        this.f60873.write(C23011.f74786);
        byte[] bArr = {0, (byte) c20189.f65535};
        this.f60873.write(bArr);
        C15956.m37940(bArr, this.f60873);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f60864;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f60870;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f60865) {
            throw new C21599("Stream finished or closed");
        }
        try {
            if (this.f60872 == null) {
                this.f60872 = new C20543(this.f60873, this.f60867, this.f60863, this.f60869);
            }
            this.f60872.write(bArr, i, i2);
        } catch (IOException e) {
            this.f60870 = e;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43335() throws IOException {
        IOException iOException = this.f60870;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f60865) {
            throw new C21599("Stream finished or closed");
        }
        C20543 c20543 = this.f60872;
        if (c20543 != null) {
            try {
                c20543.finish();
                this.f60866.mo30885(this.f60872.m46320(), this.f60872.m46319());
                this.f60872 = null;
            } catch (IOException e) {
                this.f60870 = e;
                throw e;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        IOException iOException = this.f60870;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f60865) {
            throw new C21599("Stream finished or closed");
        }
        try {
            C20543 c20543 = this.f60872;
            if (c20543 != null) {
                if (this.f60871) {
                    c20543.flush();
                    return;
                } else {
                    m43335();
                    this.f60873.flush();
                    return;
                }
            }
            this.f60873.flush();
        } catch (IOException e) {
            this.f60870 = e;
            throw e;
        }
    }

    @Override // l.AbstractC23366
    public final void finish() throws IOException {
        C12428 c12428 = this.f60866;
        if (this.f60865) {
            return;
        }
        m43335();
        try {
            c12428.m30886(this.f60873);
            byte[] bArr = new byte[6];
            long jM39126 = (c12428.m39126() / 4) - 1;
            for (int i = 0; i < 4; i++) {
                bArr[i] = (byte) (jM39126 >>> (i * 8));
            }
            bArr[4] = 0;
            bArr[5] = (byte) this.f60868.f65535;
            C15956.m37940(bArr, this.f60873);
            this.f60873.write(bArr);
            this.f60873.write(C23011.f74785);
            this.f60865 = true;
        } catch (IOException e) {
            this.f60870 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f60873 != null) {
            try {
                finish();
            } catch (IOException unused) {
            }
            try {
                this.f60873.close();
            } catch (IOException e) {
                if (this.f60870 == null) {
                    this.f60870 = e;
                }
            }
            this.f60873 = null;
        }
        IOException iOException = this.f60870;
        if (iOException != null) {
            throw iOException;
        }
    }
}
