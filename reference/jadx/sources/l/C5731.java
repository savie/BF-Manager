package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۛ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C5731 extends OutputStream {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4670 f19501;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f19503;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long[] f19508;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f19502 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f19506 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int[] f19498 = new int[1];

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f19500 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f19507 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f19499 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23371 f19505 = new C23371();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f19504 = new byte[1];

    public C5731(C4670 c4670, byte[] bArr, long[] jArr) {
        this.f19501 = c4670;
        this.f19503 = bArr;
        this.f19508 = jArr;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f19502) {
            this.f19500 = this.f19501.f16524;
            int unused = this.f19501.f16524;
            this.f19502 = false;
        }
        if (this.f19506) {
            throw new IOException("stream already closed");
        }
        while (i2 > 0) {
            try {
                if (this.f19501.f16529 && this.f19501.f25823 < C8015.m21118(this.f19503.length, 21, i2, 4)) {
                    flush();
                }
                int iM12895 = C4670.m12895(this.f19501, this.f19503, this.f19508[0], bArr, i, i2);
                this.f19499++;
                long[] jArr = this.f19508;
                jArr[0] = jArr[0] + ((long) iM12895);
                i += iM12895;
                i2 -= iM12895;
                if (this.f19501.f16524 - 1 == this.f19500 || this.f19501.f16522.available() >= 1024) {
                    while (this.f19501.f16522.available() > 0) {
                        this.f19501.m12912(this.f19498, this.f19505);
                        int i3 = this.f19498[0];
                        if (this.f19500 > i3 || i3 > this.f19501.f16524 - 1) {
                            throw new C12019(4, "");
                        }
                        this.f19507++;
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
        byte[] bArr = this.f19504;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f19506) {
            throw new IOException("stream already closed");
        }
        if (this.f19502) {
            return;
        }
        while (this.f19499 > this.f19507) {
            try {
                this.f19501.m12912((int[]) null, this.f19505);
                this.f19507++;
            } catch (C12019 e) {
                throw new IOException(e.toString(), e);
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f19506) {
            return;
        }
        flush();
        try {
            C4670.m12905(this.f19501, this.f19503, this.f19505);
            this.f19506 = true;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.toString(), e2);
        }
    }
}
