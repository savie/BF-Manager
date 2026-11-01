package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۘ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1RE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3959 extends AbstractC23366 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f14710;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC23366 f14711;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17720 f14712;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final DataOutputStream f14714;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f14716 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f14715 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f14713 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public IOException f14708 = null;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final byte[] f14709 = new byte[1];

    public C3959(AbstractC23366 abstractC23366, C17720 c17720) {
        abstractC23366.getClass();
        this.f14711 = abstractC23366;
        this.f14714 = new DataOutputStream(abstractC23366);
        this.f14712 = c17720;
        this.f14710 = c17720.mo25183(65536);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f14709;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        byte[] bArr2 = this.f14710;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f14708;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f14713) {
            throw new C21599("Stream finished or closed");
        }
        while (i2 > 0) {
            try {
                int iMin = Math.min(65536 - this.f14716, i2);
                DataOutputStream dataOutputStream = this.f14714;
                if (iMin != 65536) {
                    System.arraycopy(bArr, i, bArr2, this.f14716, iMin);
                    int i4 = this.f14716 + iMin;
                    this.f14716 = i4;
                    if (i4 == 65536) {
                        dataOutputStream.writeByte(this.f14715 ? 1 : 2);
                        dataOutputStream.writeShort(i4 - 1);
                        dataOutputStream.write(bArr2, 0, i4);
                        this.f14715 = false;
                        this.f14716 = 0;
                    }
                } else {
                    dataOutputStream.writeByte(this.f14715 ? 1 : 2);
                    dataOutputStream.writeShort(iMin - 1);
                    dataOutputStream.write(bArr, i, iMin);
                    this.f14715 = false;
                }
                i += iMin;
                i2 -= iMin;
            } catch (IOException e) {
                this.f14708 = e;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11443() throws IOException {
        IOException iOException = this.f14708;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f14713) {
            throw new C21599("Stream finished or closed");
        }
        try {
            int i = this.f14716;
            byte[] bArr = this.f14710;
            if (i > 0) {
                DataOutputStream dataOutputStream = this.f14714;
                dataOutputStream.writeByte(this.f14715 ? 1 : 2);
                dataOutputStream.writeShort(i - 1);
                dataOutputStream.write(bArr, 0, i);
                this.f14715 = false;
                this.f14716 = 0;
            }
            this.f14711.write(0);
            this.f14713 = true;
            this.f14712.mo25181(bArr);
        } catch (IOException e) {
            this.f14708 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        IOException iOException = this.f14708;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f14713) {
            throw new C21599("Stream finished or closed");
        }
        try {
            int i = this.f14716;
            if (i > 0) {
                byte[] bArr = this.f14710;
                DataOutputStream dataOutputStream = this.f14714;
                dataOutputStream.writeByte(this.f14715 ? 1 : 2);
                dataOutputStream.writeShort(i - 1);
                dataOutputStream.write(bArr, 0, i);
                this.f14715 = false;
                this.f14716 = 0;
            }
            this.f14711.flush();
        } catch (IOException e) {
            this.f14708 = e;
            throw e;
        }
    }

    @Override // l.AbstractC23366
    public final void finish() throws IOException {
        if (this.f14713) {
            return;
        }
        m11443();
        try {
            this.f14711.finish();
        } catch (IOException e) {
            this.f14708 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f14711 != null) {
            if (!this.f14713) {
                try {
                    m11443();
                } catch (IOException unused) {
                }
            }
            try {
                this.f14711.close();
            } catch (IOException e) {
                if (this.f14708 == null) {
                    this.f14708 = e;
                }
            }
            this.f14711 = null;
        }
        IOException iOException = this.f14708;
        if (iOException != null) {
            throw iOException;
        }
    }
}
