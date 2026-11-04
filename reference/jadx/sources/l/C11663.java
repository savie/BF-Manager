package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11663 extends OutputStream {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20614 f37793;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f37794;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long[] f37797;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f37795 = true;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f37801 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f37800 = new int[1];

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f37798 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f37802 = 0;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f37796 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C16884 f37792 = new C16884();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f37799 = new byte[1];

    public C11663(C20614 c20614, byte[] bArr, long[] jArr) {
        this.f37793 = c20614;
        this.f37794 = bArr;
        this.f37797 = jArr;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f37795) {
            this.f37798 = this.f37793.f66132;
            int unused = this.f37793.f66132;
            this.f37795 = false;
        }
        if (this.f37801) {
            throw new IOException("stream already closed");
        }
        while (i2 > 0) {
            try {
                if (this.f37793.f66122 && this.f37793.f27484 < C24579.m54897(this.f37794.length, 21, i2, 4)) {
                    flush();
                }
                int iM47193 = C20614.m47193(this.f37793, this.f37794, this.f37797[0], bArr, i, i2);
                this.f37796++;
                long[] jArr = this.f37797;
                jArr[0] = jArr[0] + ((long) iM47193);
                i += iM47193;
                i2 -= iM47193;
                if (this.f37793.f66132 - 1 == this.f37798 || this.f37793.f66129.available() >= 1024) {
                    while (this.f37793.f66129.available() > 0) {
                        this.f37793.m47210(this.f37800, this.f37792);
                        int i3 = this.f37800[0];
                        if (this.f37798 > i3 || i3 > this.f37793.f66132 - 1) {
                            throw new C20199(4, "");
                        }
                        this.f37802++;
                    }
                }
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2.toString(), e2);
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f37799;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f37801) {
            throw new IOException("stream already closed");
        }
        if (this.f37795) {
            return;
        }
        while (this.f37796 > this.f37802) {
            try {
                this.f37793.m47210((int[]) null, this.f37792);
                this.f37802++;
            } catch (C20199 e) {
                throw new IOException(e.toString(), e);
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f37801) {
            return;
        }
        flush();
        try {
            C20614.m47205(this.f37793, this.f37794, this.f37792);
            this.f37801 = true;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.toString(), e2);
        }
    }
}
