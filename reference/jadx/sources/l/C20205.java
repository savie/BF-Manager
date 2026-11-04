package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.᩵֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 16SN */
/* JADX INFO: loaded from: classes5.dex */
public final class C20205 extends Reader {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f64855;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f64856;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f64857;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C18251 f64858;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f64859;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f64860;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f64861;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final FileChannel f64862;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f64863;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final int f64864;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f64865;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f64866;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f64867;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f64868;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f64869;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public char[] f64870;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20205 m46475(InterfaceC24329 interfaceC24329, C0352 c0352) {
        FileChannel fileChannelOpen = C19853.open(interfaceC24329, EnumC0462.READ);
        try {
            return new C20205(fileChannelOpen, c0352);
        } catch (IOException | Error | RuntimeException e) {
            try {
                fileChannelOpen.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public C20205(FileChannel fileChannel, C0352 c0352) throws IOException {
        int i;
        this.f64869 = -1;
        this.f64862 = fileChannel;
        byte[] bArr = new byte[4];
        m46477(fileChannel, 0L, bArr, 4);
        int i2 = new C20348(bArr).readInt();
        if (i2 == 2053616492) {
            i = 8192;
        } else if (i2 == 2053617772) {
            i = 32768;
        } else {
            if (i2 != 2053619564) {
                throw new IOException("Unsupported legacy text file magic");
            }
            i = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        }
        this.f64859 = i;
        if (fileChannel.size() < i) {
            throw new EOFException("Truncated legacy text partition table");
        }
        int i3 = (i - 4) / 2;
        this.f64858 = c0352.m2112((((((long) i3) * 2) + 23) & (-8)) + 4240);
        try {
            this.f64870 = new char[i3];
            this.f64863 = new byte[4096];
            int i4 = 0;
            int iMax = -1;
            int i5 = 0;
            while (i4 < i3) {
                int iMin = Math.min(this.f64863.length / 2, i3 - i4);
                m46477(fileChannel, (((long) i4) * 2) + 4, this.f64863, iMin * 2);
                int i6 = 0;
                while (i6 < iMin) {
                    char cM46478 = m46478(i6 * 2);
                    if (cM46478 != 65535) {
                        if (cM46478 < i3) {
                            char[] cArr = this.f64870;
                            if (cArr[cM46478] == 0) {
                                cArr[cM46478] = (char) (i4 + 1);
                                iMax = Math.max(iMax, (int) cM46478);
                                i5++;
                            }
                        }
                        throw new IOException("Invalid legacy text block order");
                    }
                    i6++;
                    i4++;
                }
            }
            if (iMax + 1 != i5) {
                throw new IOException("Missing legacy text block ordinal");
            }
            this.f64868 = i5;
            int i7 = 0;
            int i8 = 0;
            long j = 0;
            while (true) {
                int i9 = this.f64868;
                if (i7 < i9) {
                    m46476(i7);
                    j += (long) this.f64867;
                    i8 = (i8 * 31) + this.f64866;
                    if (j > 2147483647L) {
                        throw new IOException("Legacy text exceeds coordinate limit");
                    }
                    i7++;
                } else {
                    int i10 = (int) j;
                    this.f64865 = i10;
                    this.f64864 = (i10 * 31) + (i9 == 0 ? 15739258 : i8);
                    this.f64869 = -1;
                    this.f64860 = 0;
                    this.f64867 = 0;
                    return;
                }
            }
        } catch (IOException | Error | RuntimeException e) {
            this.f64858.close();
            throw e;
        }
    }

    public final int length() {
        return this.f64865;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m46479() {
        return this.f64864;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46476(int i) throws IOException {
        long j = (((long) (this.f64870[i] - 1)) * X931RNG.BLOCK64_RESEED_MAX) + ((long) this.f64859);
        this.f64855 = j;
        FileChannel fileChannel = this.f64862;
        if (j > fileChannel.size() - X931RNG.BLOCK64_RESEED_MAX) {
            throw new EOFException("Truncated legacy text block");
        }
        m46477(fileChannel, this.f64855, this.f64863, 12);
        C20348 c20348 = new C20348(this.f64863);
        int i2 = c20348.readInt();
        this.f64861 = c20348.readInt();
        int i3 = c20348.readInt();
        this.f64857 = i3;
        int i4 = this.f64861;
        if (i4 < 0 || i3 < 0 || i4 > 16378 || i3 > 16378 - i4) {
            throw new IOException("Invalid legacy text gap");
        }
        this.f64867 = 16378 - i3;
        this.f64866 = ((((((i4 * 31) + i3) * 31) + i2) * 31) + this.f64870[i]) - 1;
        this.f64860 = 0;
        this.f64869 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private char m46478(int i) {
        byte[] bArr = this.f64863;
        return (char) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46477(FileChannel fileChannel, long j, byte[] bArr, int i) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
        while (byteBufferWrap.hasRemaining()) {
            int i2 = fileChannel.read(byteBufferWrap, j);
            if (i2 < 0) {
                throw new EOFException("Truncated legacy text data");
            }
            if (i2 == 0) {
                throw new IOException("Legacy text read made no progress");
            }
            j += (long) i2;
        }
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        if (this.f64856) {
            throw new IOException("Legacy text reader is closed");
        }
        while (true) {
            int i = this.f64860;
            if (i != this.f64867) {
                m46477(this.f64862, (((long) i) * 2) + this.f64855 + 12 + ((long) (i >= this.f64861 ? this.f64857 : 0)), this.f64863, 2);
                this.f64860++;
                return m46478(0);
            }
            int i2 = this.f64869 + 1;
            if (i2 == this.f64868) {
                return -1;
            }
            m46476(i2);
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        if (this.f64856) {
            throw new IOException("Legacy text reader is closed");
        }
        C8796.m23619(cArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        int i5 = 0;
        loop0: while (i5 < i2) {
            if (!this.f64856) {
                while (true) {
                    i3 = this.f64860;
                    i4 = this.f64867;
                    if (i3 == i4) {
                        int i6 = this.f64869 + 1;
                        if (i6 == this.f64868) {
                            break loop0;
                        }
                        m46476(i6);
                    }
                }
                int i7 = this.f64861;
                if (i3 < i7) {
                    i4 = i7;
                }
                int iMin = Math.min(Math.min(i2 - i5, i4 - i3), this.f64863.length / 2);
                long j = this.f64855 + 12;
                int i8 = this.f64860;
                m46477(this.f64862, (((long) i8) * 2) + j + ((long) (i8 >= this.f64861 ? this.f64857 : 0)), this.f64863, iMin * 2);
                for (int i9 = 0; i9 < iMin; i9++) {
                    cArr[i + i5 + i9] = m46478(i9 * 2);
                }
                i5 += iMin;
                this.f64860 += iMin;
            } else {
                throw new IOException("Legacy text reader is closed");
            }
        }
        if (i5 == 0) {
            return -1;
        }
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C18251 c18251 = this.f64858;
        if (this.f64856) {
            return;
        }
        this.f64856 = true;
        try {
            this.f64862.close();
        } finally {
            this.f64870 = null;
            this.f64863 = null;
            c18251.close();
        }
    }
}
