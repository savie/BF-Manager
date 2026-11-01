package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1S8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4665 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C3690 f16475;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10042 f16479;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C17720 f16480;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DataInputStream f16481;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1843 f16482;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f16476 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f16478 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f16477 = true;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f16484 = true;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f16483 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public IOException f16473 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f16474 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m12866(int i) {
        return (m12864(i) / 1024) + IShizukuService.Stub.TRANSACTION_isHidden;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12864(int i) {
        if (i < 4096 || i > 2147483632) {
            throw new IllegalArgumentException(C8479.m22141(i, "Unsupported dictionary size "));
        }
        return (i + 15) & (-16);
    }

    public C4665(InputStream inputStream, int i, C17720 c17720) {
        inputStream.getClass();
        this.f16480 = c17720;
        this.f16481 = new DataInputStream(inputStream);
        this.f16479 = new C10042(c17720);
        this.f16482 = new C1843(m12864(i), c17720);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f16474;
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
        if (this.f16481 == null) {
            throw new C21599("Stream closed");
        }
        IOException iOException = this.f16473;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f16483) {
            return -1;
        }
        while (i2 > 0) {
            try {
                if (this.f16476 == 0) {
                    m12865();
                    if (this.f16483) {
                        if (i4 == 0) {
                            return -1;
                        }
                    }
                }
                int iMin = Math.min(this.f16476, i2);
                if (!this.f16478) {
                    this.f16482.m6002(iMin, this.f16481);
                } else {
                    this.f16482.m6006(iMin);
                    this.f16475.m10860();
                }
                int iM5999 = this.f16482.m5999(i, bArr);
                i += iM5999;
                i2 -= iM5999;
                i4 += iM5999;
                int i5 = this.f16476 - iM5999;
                this.f16476 = i5;
                if (i5 == 0 && (!this.f16479.m25392() || this.f16482.m6007())) {
                    throw new C19838();
                }
            } catch (IOException e) {
                this.f16473 = e;
                throw e;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12865() throws IOException {
        int unsignedByte = this.f16481.readUnsignedByte();
        if (unsignedByte == 0) {
            this.f16483 = true;
            C1843 c1843 = this.f16482;
            if (c1843 != null) {
                C17720 c17720 = this.f16480;
                c1843.m6003(c17720);
                this.f16482 = null;
                this.f16479.m25391(c17720);
                this.f16479 = null;
                return;
            }
            return;
        }
        if (unsignedByte >= 224 || unsignedByte == 1) {
            this.f16484 = true;
            this.f16477 = false;
            this.f16482.m6004();
        } else if (this.f16477) {
            throw new C19838();
        }
        if (unsignedByte < 128) {
            if (unsignedByte > 2) {
                throw new C19838();
            }
            this.f16478 = false;
            this.f16476 = this.f16481.readUnsignedShort() + 1;
            return;
        }
        this.f16478 = true;
        int i = (unsignedByte & 31) << 16;
        this.f16476 = i;
        this.f16476 = this.f16481.readUnsignedShort() + 1 + i;
        int unsignedShort = this.f16481.readUnsignedShort() + 1;
        if (unsignedByte >= 192) {
            this.f16484 = false;
            int unsignedByte2 = this.f16481.readUnsignedByte();
            if (unsignedByte2 > 224) {
                throw new C19838();
            }
            int i2 = unsignedByte2 / 45;
            int i3 = unsignedByte2 - (i2 * 45);
            int i4 = i3 / 9;
            int i5 = i3 - (i4 * 9);
            if (i5 + i4 > 4) {
                throw new C19838();
            }
            this.f16475 = new C3690(this.f16482, this.f16479, i5, i4, i2);
        } else {
            if (this.f16484) {
                throw new C19838();
            }
            if (unsignedByte >= 160) {
                this.f16475.mo10858();
            }
        }
        this.f16479.m25390(unsignedShort, this.f16481);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        DataInputStream dataInputStream = this.f16481;
        if (dataInputStream == null) {
            throw new C21599("Stream closed");
        }
        IOException iOException = this.f16473;
        if (iOException == null) {
            return this.f16478 ? this.f16476 : Math.min(this.f16476, dataInputStream.available());
        }
        throw iOException;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16481 != null) {
            C1843 c1843 = this.f16482;
            if (c1843 != null) {
                C17720 c17720 = this.f16480;
                c1843.m6003(c17720);
                this.f16482 = null;
                this.f16479.m25391(c17720);
                this.f16479 = null;
            }
            try {
                this.f16481.close();
            } finally {
                this.f16481 = null;
            }
        }
    }
}
