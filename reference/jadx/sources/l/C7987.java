package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۟ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1QE */
/* JADX INFO: loaded from: classes4.dex */
public final class C7987 extends AbstractC13207 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public IOException f26525;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23124 f26526;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C13952 f26527;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C25142[] f26528;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final byte[] f26529;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public OutputStream f26530;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f26531;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0573 f26532;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC1275 f26533;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f26534;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8776 f26535;

    public C7987(OutputStream outputStream, C17682 c17682) throws IOException {
        C17682[] c17682Arr = {c17682};
        C0573 c0573M2591 = C0573.m2591();
        C13952 c13952 = new C13952();
        this.f26527 = c13952;
        this.f26526 = new C23124();
        this.f26535 = null;
        this.f26525 = null;
        this.f26531 = false;
        this.f26529 = new byte[1];
        this.f26532 = c0573M2591;
        this.f26530 = outputStream;
        this.f26534 = true;
        C17682 c17683 = c17682Arr[0];
        c17683.getClass();
        C25142[] c25142Arr = {new C25142(c17683)};
        this.f26534 = this.f26534;
        C20666.m47291(c25142Arr);
        this.f26528 = c25142Arr;
        c13952.f44255 = 4;
        this.f26533 = AbstractC1275.m4662(4);
        this.f26530.write(C14698.f48037);
        byte[] bArr = {0, (byte) c13952.f44255};
        this.f26530.write(bArr);
        C7241.m19867(bArr, this.f26530);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f26529;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f26525;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f26531) {
            throw new C18428("Stream finished or closed");
        }
        try {
            if (this.f26535 == null) {
                this.f26535 = new C8776(this.f26530, this.f26528, this.f26533, this.f26532);
            }
            this.f26535.write(bArr, i, i2);
        } catch (IOException e) {
            this.f26525 = e;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21774() throws IOException {
        IOException iOException = this.f26525;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f26531) {
            throw new C18428("Stream finished or closed");
        }
        C8776 c8776 = this.f26535;
        if (c8776 != null) {
            try {
                c8776.finish();
                this.f26526.mo28193(this.f26535.m23477(), this.f26535.m23476());
                this.f26535 = null;
            } catch (IOException e) {
                this.f26525 = e;
                throw e;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        IOException iOException = this.f26525;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f26531) {
            throw new C18428("Stream finished or closed");
        }
        try {
            C8776 c8776 = this.f26535;
            if (c8776 != null) {
                if (this.f26534) {
                    c8776.flush();
                    return;
                } else {
                    m21774();
                    this.f26530.flush();
                    return;
                }
            }
            this.f26530.flush();
        } catch (IOException e) {
            this.f26525 = e;
            throw e;
        }
    }

    @Override // l.AbstractC13207
    public final void finish() throws IOException {
        C23124 c23124 = this.f26526;
        if (this.f26531) {
            return;
        }
        m21774();
        try {
            c23124.m52059(this.f26530);
            byte[] bArr = new byte[6];
            long jM28195 = (c23124.m28195() / 4) - 1;
            for (int i = 0; i < 4; i++) {
                bArr[i] = (byte) (jM28195 >>> (i * 8));
            }
            bArr[4] = 0;
            bArr[5] = (byte) this.f26527.f44255;
            C7241.m19867(bArr, this.f26530);
            this.f26530.write(bArr);
            this.f26530.write(C14698.f48036);
            this.f26531 = true;
        } catch (IOException e) {
            this.f26525 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f26530 != null) {
            try {
                finish();
            } catch (IOException unused) {
            }
            try {
                this.f26530.close();
            } catch (IOException e) {
                if (this.f26525 == null) {
                    this.f26525 = e;
                }
            }
            this.f26530 = null;
        }
        IOException iOException = this.f26525;
        if (iOException != null) {
            throw iOException;
        }
    }
}
