package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A1RE */
/* JADX INFO: loaded from: classes.dex */
public final class C24396 extends AbstractC13207 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] f79141;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC13207 f79142;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0573 f79145;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final DataOutputStream f79147;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f79143 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f79148 = true;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f79140 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IOException f79146 = null;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final byte[] f79144 = new byte[1];

    public C24396(AbstractC13207 abstractC13207, C0573 c0573) {
        abstractC13207.getClass();
        this.f79142 = abstractC13207;
        this.f79147 = new DataOutputStream(abstractC13207);
        this.f79145 = c0573;
        this.f79141 = c0573.mo2594(65536);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f79144;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        byte[] bArr2 = this.f79141;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f79146;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f79140) {
            throw new C18428("Stream finished or closed");
        }
        while (i2 > 0) {
            try {
                int iMin = Math.min(65536 - this.f79143, i2);
                DataOutputStream dataOutputStream = this.f79147;
                if (iMin != 65536) {
                    System.arraycopy(bArr, i, bArr2, this.f79143, iMin);
                    int i4 = this.f79143 + iMin;
                    this.f79143 = i4;
                    if (i4 == 65536) {
                        dataOutputStream.writeByte(this.f79148 ? 1 : 2);
                        dataOutputStream.writeShort(i4 - 1);
                        dataOutputStream.write(bArr2, 0, i4);
                        this.f79148 = false;
                        this.f79143 = 0;
                    }
                } else {
                    dataOutputStream.writeByte(this.f79148 ? 1 : 2);
                    dataOutputStream.writeShort(iMin - 1);
                    dataOutputStream.write(bArr, i, iMin);
                    this.f79148 = false;
                }
                i += iMin;
                i2 -= iMin;
            } catch (IOException e) {
                this.f79146 = e;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54532() throws IOException {
        IOException iOException = this.f79146;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f79140) {
            throw new C18428("Stream finished or closed");
        }
        try {
            int i = this.f79143;
            byte[] bArr = this.f79141;
            if (i > 0) {
                DataOutputStream dataOutputStream = this.f79147;
                dataOutputStream.writeByte(this.f79148 ? 1 : 2);
                dataOutputStream.writeShort(i - 1);
                dataOutputStream.write(bArr, 0, i);
                this.f79148 = false;
                this.f79143 = 0;
            }
            this.f79142.write(0);
            this.f79140 = true;
            this.f79145.mo2592(bArr);
        } catch (IOException e) {
            this.f79146 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        IOException iOException = this.f79146;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f79140) {
            throw new C18428("Stream finished or closed");
        }
        try {
            int i = this.f79143;
            if (i > 0) {
                byte[] bArr = this.f79141;
                DataOutputStream dataOutputStream = this.f79147;
                dataOutputStream.writeByte(this.f79148 ? 1 : 2);
                dataOutputStream.writeShort(i - 1);
                dataOutputStream.write(bArr, 0, i);
                this.f79148 = false;
                this.f79143 = 0;
            }
            this.f79142.flush();
        } catch (IOException e) {
            this.f79146 = e;
            throw e;
        }
    }

    @Override // l.AbstractC13207
    public final void finish() throws IOException {
        if (this.f79140) {
            return;
        }
        m54532();
        try {
            this.f79142.finish();
        } catch (IOException e) {
            this.f79146 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f79142 != null) {
            if (!this.f79140) {
                try {
                    m54532();
                } catch (IOException unused) {
                }
            }
            try {
                this.f79142.close();
            } catch (IOException e) {
                if (this.f79146 == null) {
                    this.f79146 = e;
                }
            }
            this.f79142 = null;
        }
        IOException iOException = this.f79146;
        if (iOException != null) {
            throw iOException;
        }
    }
}
