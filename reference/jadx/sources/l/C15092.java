package l;

import java.io.IOException;
import java.io.OutputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܶ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15092 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public OutputStream f49284;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C13681 f49286;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f49287;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11564 f49289;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f49288 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f49285 = 0;

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (this.f49284 == null) {
            throw new C0979("Stream closed");
        }
        if (this.f49288) {
            throw new C0979("Write beyond end of stream");
        }
        int i2 = i & 255;
        if (this.f49289.m28864(i2)) {
            return;
        }
        m36164();
        C11564 c11564 = new C11564(this.f49286, this.f49287);
        this.f49289 = c11564;
        c11564.m28864(i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f49284 == null) {
            throw new C0979("Stream closed");
        }
        if (this.f49288) {
            throw new C0979("Write beyond end of stream");
        }
        while (i2 > 0) {
            C11564 c11564 = this.f49289;
            c11564.getClass();
            int i3 = 0;
            int i4 = i;
            int i5 = i2;
            while (true) {
                int i6 = i5 - 1;
                if (i5 <= 0) {
                    break;
                }
                int i7 = i4 + 1;
                if (!c11564.m28864(bArr[i4])) {
                    break;
                }
                i3++;
                i4 = i7;
                i5 = i6;
            }
            if (i3 < i2) {
                m36164();
                this.f49289 = new C11564(this.f49286, this.f49287);
            }
            i += i3;
            i2 -= i3;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f49284 != null) {
            C13681 c13681 = this.f49286;
            if (!this.f49288) {
                this.f49288 = true;
                try {
                    m36164();
                    c13681.m33384(24, 1536581);
                    c13681.m33384(24, 3690640);
                    int i = this.f49285;
                    c13681.m33384(16, (i >>> 16) & 65535);
                    c13681.m33384(16, i & 65535);
                    c13681.m33383();
                    this.f49284.flush();
                    this.f49289 = null;
                } catch (Throwable th) {
                    this.f49289 = null;
                    throw th;
                }
            }
            this.f49284.close();
            this.f49284 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36164() throws IOException {
        if (this.f49289.m28865()) {
            return;
        }
        this.f49289.m28863();
        int iM28866 = this.f49289.m28866();
        int i = this.f49285;
        this.f49285 = iM28866 ^ ((i >>> 31) | (i << 1));
    }

    public C15092(OutputStream outputStream, int i) throws IOException {
        if (i < 1 || i > 9) {
            throw new IllegalArgumentException(C8479.m22141(i, "Invalid BZip2 block size"));
        }
        int i2 = 100000 * i;
        this.f49287 = i2;
        this.f49284 = outputStream;
        C13681 c13681 = new C13681(outputStream);
        this.f49286 = c13681;
        c13681.m33384(16, 16986);
        c13681.m33384(8, IShizukuService.Stub.TRANSACTION_isHidden);
        c13681.m33384(8, i + 48);
        this.f49289 = new C11564(c13681, i2);
    }
}
