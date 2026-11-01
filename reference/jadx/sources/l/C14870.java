package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܶ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16SN */
/* JADX INFO: loaded from: classes4.dex */
public final class C14870 extends Reader {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f48575;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f48576;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f48577;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C9017 f48578;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte[] f48579;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f48580;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f48581;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int f48582;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f48583;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public char[] f48584;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f48585;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f48586;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f48587;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f48588;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48589;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final FileChannel f48590;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14870 m35557(InterfaceC3800 interfaceC3800, C10428 c10428) {
        FileChannel fileChannelOpen = C6001.open(interfaceC3800, EnumC17912.READ);
        try {
            return new C14870(fileChannelOpen, c10428);
        } catch (IOException | Error | RuntimeException e) {
            try {
                fileChannelOpen.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public C14870(FileChannel fileChannel, C10428 c10428) throws IOException {
        int i;
        this.f48589 = -1;
        this.f48590 = fileChannel;
        byte[] bArr = new byte[4];
        m35559(fileChannel, 0L, bArr, 4);
        int i2 = new C17367(bArr).readInt();
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
        this.f48580 = i;
        if (fileChannel.size() < i) {
            throw new EOFException("Truncated legacy text partition table");
        }
        int i3 = (i - 4) / 2;
        this.f48578 = c10428.m26333((((((long) i3) * 2) + 23) & (-8)) + 4240);
        try {
            this.f48584 = new char[i3];
            this.f48579 = new byte[4096];
            int i4 = 0;
            int iMax = -1;
            int i5 = 0;
            while (i4 < i3) {
                int iMin = Math.min(this.f48579.length / 2, i3 - i4);
                m35559(fileChannel, (((long) i4) * 2) + 4, this.f48579, iMin * 2);
                int i6 = 0;
                while (i6 < iMin) {
                    char cM35560 = m35560(i6 * 2);
                    if (cM35560 != 65535) {
                        if (cM35560 < i3) {
                            char[] cArr = this.f48584;
                            if (cArr[cM35560] == 0) {
                                cArr[cM35560] = (char) (i4 + 1);
                                iMax = Math.max(iMax, (int) cM35560);
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
            this.f48588 = i5;
            int i7 = 0;
            int i8 = 0;
            long j = 0;
            while (true) {
                int i9 = this.f48588;
                if (i7 < i9) {
                    m35558(i7);
                    j += (long) this.f48575;
                    i8 = (i8 * 31) + this.f48586;
                    if (j > 2147483647L) {
                        throw new IOException("Legacy text exceeds coordinate limit");
                    }
                    i7++;
                } else {
                    int i10 = (int) j;
                    this.f48577 = i10;
                    this.f48582 = (i10 * 31) + (i9 == 0 ? 15739258 : i8);
                    this.f48589 = -1;
                    this.f48583 = 0;
                    this.f48575 = 0;
                    return;
                }
            }
        } catch (IOException | Error | RuntimeException e) {
            this.f48578.close();
            throw e;
        }
    }

    public final int length() {
        return this.f48577;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35561() {
        return this.f48582;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35558(int i) throws IOException {
        long j = (((long) (this.f48584[i] - 1)) * X931RNG.BLOCK64_RESEED_MAX) + ((long) this.f48580);
        this.f48587 = j;
        FileChannel fileChannel = this.f48590;
        if (j > fileChannel.size() - X931RNG.BLOCK64_RESEED_MAX) {
            throw new EOFException("Truncated legacy text block");
        }
        m35559(fileChannel, this.f48587, this.f48579, 12);
        C17367 c17367 = new C17367(this.f48579);
        int i2 = c17367.readInt();
        this.f48576 = c17367.readInt();
        int i3 = c17367.readInt();
        this.f48585 = i3;
        int i4 = this.f48576;
        if (i4 < 0 || i3 < 0 || i4 > 16378 || i3 > 16378 - i4) {
            throw new IOException("Invalid legacy text gap");
        }
        this.f48575 = 16378 - i3;
        this.f48586 = ((((((i4 * 31) + i3) * 31) + i2) * 31) + this.f48584[i]) - 1;
        this.f48583 = 0;
        this.f48589 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private char m35560(int i) {
        byte[] bArr = this.f48579;
        return (char) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35559(FileChannel fileChannel, long j, byte[] bArr, int i) throws IOException {
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
        if (this.f48581) {
            throw new IOException("Legacy text reader is closed");
        }
        while (true) {
            int i = this.f48583;
            if (i != this.f48575) {
                m35559(this.f48590, (((long) i) * 2) + this.f48587 + 12 + ((long) (i >= this.f48576 ? this.f48585 : 0)), this.f48579, 2);
                this.f48583++;
                return m35560(0);
            }
            int i2 = this.f48589 + 1;
            if (i2 == this.f48588) {
                return -1;
            }
            m35558(i2);
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        if (this.f48581) {
            throw new IOException("Legacy text reader is closed");
        }
        C17565.m40836(cArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        int i5 = 0;
        loop0: while (i5 < i2) {
            if (!this.f48581) {
                while (true) {
                    i3 = this.f48583;
                    i4 = this.f48575;
                    if (i3 == i4) {
                        int i6 = this.f48589 + 1;
                        if (i6 == this.f48588) {
                            break loop0;
                        }
                        m35558(i6);
                    }
                }
                int i7 = this.f48576;
                if (i3 < i7) {
                    i4 = i7;
                }
                int iMin = Math.min(Math.min(i2 - i5, i4 - i3), this.f48579.length / 2);
                long j = this.f48587 + 12;
                int i8 = this.f48583;
                m35559(this.f48590, (((long) i8) * 2) + j + ((long) (i8 >= this.f48576 ? this.f48585 : 0)), this.f48579, iMin * 2);
                for (int i9 = 0; i9 < iMin; i9++) {
                    cArr[i + i5 + i9] = m35560(i9 * 2);
                }
                i5 += iMin;
                this.f48583 += iMin;
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
        C9017 c9017 = this.f48578;
        if (this.f48581) {
            return;
        }
        this.f48581 = true;
        try {
            this.f48590.close();
        } finally {
            this.f48584 = null;
            this.f48579 = null;
            c9017.close();
        }
    }
}
