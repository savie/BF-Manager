package l;

import java.io.IOException;
import java.io.OutputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۖ۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2515 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f8048;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4007 f8050;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public OutputStream f8051;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14447 f8053;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f8052 = false;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f8049 = 0;

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (this.f8051 == null) {
            throw new C7736("Stream closed");
        }
        if (this.f8052) {
            throw new C7736("Write beyond end of stream");
        }
        int i2 = i & 255;
        if (this.f8053.m34871(i2)) {
            return;
        }
        m8402();
        C14447 c14447 = new C14447(this.f8050, this.f8048);
        this.f8053 = c14447;
        c14447.m34871(i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f8051 == null) {
            throw new C7736("Stream closed");
        }
        if (this.f8052) {
            throw new C7736("Write beyond end of stream");
        }
        while (i2 > 0) {
            C14447 c14447 = this.f8053;
            c14447.getClass();
            int i3 = 0;
            int i4 = i;
            int i5 = i2;
            while (true) {
                int i6 = i5 - 1;
                if (i5 <= 0) {
                    break;
                }
                int i7 = i4 + 1;
                if (!c14447.m34871(bArr[i4])) {
                    break;
                }
                i3++;
                i4 = i7;
                i5 = i6;
            }
            if (i3 < i2) {
                m8402();
                this.f8053 = new C14447(this.f8050, this.f8048);
            }
            i += i3;
            i2 -= i3;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f8051 != null) {
            C4007 c4007 = this.f8050;
            if (!this.f8052) {
                this.f8052 = true;
                try {
                    m8402();
                    c4007.m12969(24, 1536581);
                    c4007.m12969(24, 3690640);
                    int i = this.f8049;
                    c4007.m12969(16, (i >>> 16) & 65535);
                    c4007.m12969(16, i & 65535);
                    c4007.m12968();
                    this.f8051.flush();
                    this.f8053 = null;
                } catch (Throwable th) {
                    this.f8053 = null;
                    throw th;
                }
            }
            this.f8051.close();
            this.f8051 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8402() throws IOException {
        if (this.f8053.m34872()) {
            return;
        }
        this.f8053.m34870();
        int iM34873 = this.f8053.m34873();
        int i = this.f8049;
        this.f8049 = iM34873 ^ ((i >>> 31) | (i << 1));
    }

    public C2515(OutputStream outputStream, int i) throws IOException {
        if (i < 1 || i > 9) {
            throw new IllegalArgumentException(C13645.m33382(i, "Invalid BZip2 block size"));
        }
        int i2 = 100000 * i;
        this.f8048 = i2;
        this.f8051 = outputStream;
        C4007 c4007 = new C4007(outputStream);
        this.f8050 = c4007;
        c4007.m12969(16, 16986);
        c4007.m12969(8, IShizukuService.Stub.TRANSACTION_isHidden);
        c4007.m12969(8, i + 48);
        this.f8053 = new C14447(c4007, i2);
    }
}
