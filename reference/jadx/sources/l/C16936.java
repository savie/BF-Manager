package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܺܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G1S8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16936 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public DataInputStream f55331;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C2986 f55333;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C4478 f55338;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0573 f55339;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11935 f55341;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f55334 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f55335 = false;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f55332 = true;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f55337 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f55342 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IOException f55340 = null;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final byte[] f55336 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m39914(int i) {
        return (m39912(i) / 1024) + IShizukuService.Stub.TRANSACTION_isHidden;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39912(int i) {
        if (i < 4096 || i > 2147483632) {
            throw new IllegalArgumentException(C13645.m33382(i, "Unsupported dictionary size "));
        }
        return (i + 15) & (-16);
    }

    public C16936(InputStream inputStream, int i, C0573 c0573) {
        inputStream.getClass();
        this.f55339 = c0573;
        this.f55331 = new DataInputStream(inputStream);
        this.f55333 = new C2986(c0573);
        this.f55341 = new C11935(m39912(i), c0573);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f55336;
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
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f55331 == null) {
            throw new C18428("Stream closed");
        }
        IOException iOException = this.f55340;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f55342) {
            return -1;
        }
        while (i2 > 0) {
            try {
                if (this.f55334 == 0) {
                    m39913();
                    if (this.f55342) {
                        if (i4 == 0) {
                            return -1;
                        }
                    }
                }
                int iMin = Math.min(this.f55334, i2);
                if (!this.f55335) {
                    this.f55341.m29899(iMin, this.f55331);
                } else {
                    this.f55341.m29903(iMin);
                    this.f55338.m14183();
                }
                int iM29896 = this.f55341.m29896(i, bArr);
                i += iM29896;
                i2 -= iM29896;
                i4 += iM29896;
                int i5 = this.f55334 - iM29896;
                this.f55334 = i5;
                if (i5 == 0 && (!this.f55333.m9709() || this.f55341.m29904())) {
                    throw new C13996();
                }
            } catch (IOException e) {
                this.f55340 = e;
                throw e;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39913() throws IOException {
        int unsignedByte = this.f55331.readUnsignedByte();
        if (unsignedByte == 0) {
            this.f55342 = true;
            C11935 c11935 = this.f55341;
            if (c11935 != null) {
                C0573 c0573 = this.f55339;
                c11935.m29900(c0573);
                this.f55341 = null;
                this.f55333.m9708(c0573);
                this.f55333 = null;
                return;
            }
            return;
        }
        if (unsignedByte >= 224 || unsignedByte == 1) {
            this.f55337 = true;
            this.f55332 = false;
            this.f55341.m29902();
        } else if (this.f55332) {
            throw new C13996();
        }
        if (unsignedByte < 128) {
            if (unsignedByte > 2) {
                throw new C13996();
            }
            this.f55335 = false;
            this.f55334 = this.f55331.readUnsignedShort() + 1;
            return;
        }
        this.f55335 = true;
        int i = (unsignedByte & 31) << 16;
        this.f55334 = i;
        this.f55334 = this.f55331.readUnsignedShort() + 1 + i;
        int unsignedShort = this.f55331.readUnsignedShort() + 1;
        if (unsignedByte >= 192) {
            this.f55337 = false;
            int unsignedByte2 = this.f55331.readUnsignedByte();
            if (unsignedByte2 > 224) {
                throw new C13996();
            }
            int i2 = unsignedByte2 / 45;
            int i3 = unsignedByte2 - (i2 * 45);
            int i4 = i3 / 9;
            int i5 = i3 - (i4 * 9);
            if (i5 + i4 > 4) {
                throw new C13996();
            }
            this.f55338 = new C4478(this.f55341, this.f55333, i5, i4, i2);
        } else {
            if (this.f55337) {
                throw new C13996();
            }
            if (unsignedByte >= 160) {
                this.f55338.mo3090();
            }
        }
        this.f55333.m9707(unsignedShort, this.f55331);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        DataInputStream dataInputStream = this.f55331;
        if (dataInputStream == null) {
            throw new C18428("Stream closed");
        }
        IOException iOException = this.f55340;
        if (iOException == null) {
            return this.f55335 ? this.f55334 : Math.min(this.f55334, dataInputStream.available());
        }
        throw iOException;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f55331 != null) {
            C11935 c11935 = this.f55341;
            if (c11935 != null) {
                C0573 c0573 = this.f55339;
                c11935.m29900(c0573);
                this.f55341 = null;
                this.f55333.m9708(c0573);
                this.f55333 = null;
            }
            try {
                this.f55331.close();
            } finally {
                this.f55331 = null;
            }
        }
    }
}
