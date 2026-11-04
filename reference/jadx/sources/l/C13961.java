package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۬ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13961 implements InterfaceC17713 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C20528 f44263 = new C20528(2);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f44268;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public InterfaceC15475 f44269;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f44270;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f44271;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f44272;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f44267 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f44275 = false;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f44266 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f44264 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f44274 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f44273 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f44265 = 0;

    public C13961(InterfaceC15475 interfaceC15475) {
        this.f44269 = interfaceC15475;
        byte[] bArr = (byte[]) f44263.m47061();
        if (bArr == null) {
            bArr = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        this.f44272 = bArr;
        this.f44270 = 131072L;
        this.f44271 = false;
        this.f44268 = 0L;
    }

    @Override // l.InterfaceC17713
    public final int available() {
        long length = length() - getFilePointer();
        if (length <= 2147483647L) {
            return (int) length;
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34027() {
        long filePointer = getFilePointer();
        int i = (int) filePointer;
        if (filePointer == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m34036(int i) {
        if (i < 0 || i > 65535) {
            throw new RuntimeException("Data out of range (UShort)");
        }
        write(i & 255);
        write((i >>> 8) & 255);
    }

    @Override // l.InterfaceC17713
    public final void write(int i) {
        long j = this.f44273;
        long j2 = this.f44274;
        if (j >= j2) {
            if (this.f44271 && j2 < this.f44270) {
                this.f44274 = j2 + 1;
            } else {
                seek(j);
                long j3 = this.f44273;
                long j4 = this.f44274;
                if (j3 == j4) {
                    this.f44274 = j4 + 1;
                }
            }
        }
        byte[] bArr = this.f44272;
        long j5 = this.f44273;
        bArr[(int) (j5 - this.f44265)] = (byte) i;
        this.f44273 = j5 + 1;
        this.f44264 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34034(char c) {
        write(c & 255);
        write((c >>> '\b') & 255);
    }

    public final void writeInt(int i) {
        write(i & 255);
        write((i >>> 8) & 255);
        write((i >>> 16) & 255);
        write((i >>> 24) & 255);
    }

    @Override // l.InterfaceC17713
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC17713
    public final byte readByte() throws EOFException {
        int i = read();
        if (i != -1) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // l.InterfaceC17713
    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public final int mo34029() {
        return (readByte() & 255) | ((readByte() & 255) << 8);
    }

    @Override // l.InterfaceC17713
    public final int read() {
        long j = this.f44273;
        if (j >= this.f44274) {
            if (this.f44271) {
                return -1;
            }
            seek(j);
            if (this.f44273 == this.f44274) {
                return -1;
            }
        }
        byte[] bArr = this.f44272;
        long j2 = this.f44273;
        byte b = bArr[(int) (j2 - this.f44265)];
        this.f44273 = j2 + 1;
        return b & 255;
    }

    @Override // l.InterfaceC17713
    public final int readInt() {
        return (readByte() & 255) | ((readByte() & 255) << 8) | ((readByte() & 255) << 16) | ((readByte() & 255) << 24);
    }

    @Override // l.InterfaceC17713
    public final long readLong() {
        return (((long) readByte()) & 255) | ((((long) readByte()) & 255) << 8) | ((((long) readByte()) & 255) << 16) | ((((long) readByte()) & 255) << 24) | ((((long) readByte()) & 255) << 32) | ((((long) readByte()) & 255) << 40) | ((((long) readByte()) & 255) << 48) | ((255 & ((long) readByte())) << 56);
    }

    @Override // l.InterfaceC17713
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC17713
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f44273;
        if (j >= this.f44274) {
            if (this.f44271) {
                return -1;
            }
            seek(j);
            if (this.f44273 == this.f44274) {
                return -1;
            }
        }
        int iMin = Math.min(i2, (int) (this.f44274 - this.f44273));
        System.arraycopy(this.f44272, (int) (this.f44273 - this.f44265), bArr, i, iMin);
        this.f44273 += (long) iMin;
        return iMin;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final long position() {
        return getFilePointer();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final SeekableByteChannel position(long j) {
        seek(j);
        return this;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final long size() {
        return length();
    }

    @Override // l.InterfaceC17713
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo34032(int i, int i2, byte[] bArr) {
        int i3 = 0;
        do {
            int i4 = read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                return i3;
            }
            i3 += i4;
        } while (i3 < i2);
        return i3;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final SeekableByteChannel truncate(long j) {
        setLength(j);
        return this;
    }

    @Override // l.InterfaceC17713
    public final void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC17713
    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                throw new EOFException();
            }
            i3 += i4;
        } while (i3 < i2);
    }

    @Override // l.InterfaceC17713
    public final long length() {
        long j = this.f44273;
        if (this.f44267 == -1) {
            this.f44267 = this.f44269.length();
        }
        return Math.max(j, this.f44267);
    }

    public final void setLength(long j) {
        m34026();
        InterfaceC15475 interfaceC15475 = this.f44269;
        interfaceC15475.setLength(j);
        this.f44267 = j;
        if (this.f44273 > j) {
            this.f44273 = j;
        }
        if (this.f44268 > j) {
            interfaceC15475.seek(j);
            this.f44268 = j;
        }
        this.f44274 = 0L;
        this.f44265 = 0L;
        seek(this.f44273);
    }

    @Override // l.InterfaceC17713
    public final void seek(long j) {
        if (j >= this.f44274 || j < this.f44265) {
            m34026();
            long j2 = (-131072) & j;
            this.f44265 = j2;
            this.f44270 = ((long) this.f44272.length) + j2;
            long j3 = this.f44268;
            InterfaceC15475 interfaceC15475 = this.f44269;
            if (j3 != j2) {
                interfaceC15475.seek(j2);
                this.f44268 = this.f44265;
            }
            int length = this.f44272.length;
            int i = 0;
            while (length > 0) {
                int i2 = interfaceC15475.read(this.f44272, i, length);
                if (i2 < 0) {
                    break;
                }
                i += i2;
                length -= i2;
            }
            byte[] bArr = this.f44272;
            boolean z = i < bArr.length;
            this.f44271 = z;
            if (z) {
                Arrays.fill(bArr, i, bArr.length, (byte) -1);
            }
            long j4 = i;
            this.f44268 += j4;
            this.f44274 = this.f44265 + j4;
        } else if (j < this.f44273) {
            m34026();
        }
        this.f44273 = j;
    }

    @Override // l.InterfaceC17713
    public final long getFilePointer() {
        return this.f44273;
    }

    @Override // l.InterfaceC17713
    public final int skipBytes(int i) {
        if (i <= 0) {
            return 0;
        }
        long j = this.f44273;
        long length = length();
        long j2 = ((long) i) + j;
        if (j2 <= length) {
            length = j2;
        }
        seek(length);
        return (int) (length - j);
    }

    @Override // l.InterfaceC17713
    public final String getName() {
        return this.f44269.getName();
    }

    @Override // l.InterfaceC17713
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15475 mo34028() {
        return this.f44269;
    }

    @Override // l.InterfaceC17713
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13961 mo34035() {
        return new C13961(this.f44269.mo7071());
    }

    @Override // l.InterfaceC17713
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13961 mo34033(long j, long j2) {
        return new C13961(this.f44269.mo7070(j, j2));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C13961 m34030(long j, long j2) {
        return new C13961(this.f44269.mo7068(j, j2));
    }

    @Override // l.InterfaceC17713
    public final void flush() {
        m34026();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m34031() {
        if (this.f44266) {
            this.f44269.mo7069();
            this.f44266 = false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f44275) {
            return;
        }
        m34026();
        this.f44275 = true;
        this.f44269.close();
        f44263.m47060(this.f44272);
        this.f44272 = null;
    }

    @Override // l.InterfaceC17713
    public final boolean isClosed() {
        return this.f44275;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f44275;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    @Override // l.InterfaceC17713, java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        int iMin;
        int iRemaining = byteBuffer.remaining();
        int iAvailable = available();
        if (iAvailable <= 0) {
            return -1;
        }
        if (iRemaining > iAvailable) {
            iRemaining = iAvailable;
        }
        int i = 0;
        do {
            int i2 = iRemaining - i;
            long j = this.f44273;
            if (j >= this.f44274) {
                if (!this.f44271) {
                    seek(j);
                    if (this.f44273 != this.f44274) {
                        iMin = Math.min(i2, (int) (this.f44274 - this.f44273));
                        byteBuffer.put(this.f44272, (int) (this.f44273 - this.f44265), iMin);
                        this.f44273 += (long) iMin;
                    }
                }
                iMin = -1;
            } else {
                iMin = Math.min(i2, (int) (this.f44274 - this.f44273));
                byteBuffer.put(this.f44272, (int) (this.f44273 - this.f44265), iMin);
                this.f44273 += (long) iMin;
            }
            if (iMin < 0) {
                return i;
            }
            i += iMin;
        } while (i < iRemaining);
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002f A[SYNTHETIC] */
    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            int iRemaining = byteBuffer.remaining();
            long j = this.f44273;
            long j2 = this.f44274;
            if (j >= j2) {
                if (this.f44271) {
                    long j3 = this.f44270;
                    if (j2 < j3) {
                        this.f44274 = j3;
                    } else {
                        seek(j);
                        if (this.f44273 == this.f44274) {
                            this.f44274 = this.f44270;
                        }
                    }
                } else {
                    seek(j);
                    if (this.f44273 == this.f44274) {
                        this.f44274 = this.f44270;
                    }
                }
            }
            int iMin = Math.min(iRemaining, (int) (this.f44274 - this.f44273));
            byteBuffer.get(this.f44272, (int) (this.f44273 - this.f44265), iMin);
            this.f44273 += (long) iMin;
            i += iMin;
            this.f44264 = true;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m34026() {
        if (this.f44264) {
            long j = this.f44268;
            long j2 = this.f44265;
            InterfaceC15475 interfaceC15475 = this.f44269;
            if (j != j2) {
                interfaceC15475.seek(j2);
            }
            interfaceC15475.write(this.f44272, 0, (int) (this.f44273 - this.f44265));
            long j3 = this.f44273;
            this.f44268 = j3;
            this.f44264 = false;
            long j4 = this.f44267;
            if (j4 != -1 && j3 > j4) {
                this.f44267 = -1L;
            }
            this.f44266 = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[SYNTHETIC] */
    @Override // l.InterfaceC17713
    public final void write(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            long j = this.f44273;
            long j2 = this.f44274;
            if (j >= j2) {
                if (this.f44271) {
                    long j3 = this.f44270;
                    if (j2 < j3) {
                        this.f44274 = j3;
                    } else {
                        seek(j);
                        if (this.f44273 == this.f44274) {
                            this.f44274 = this.f44270;
                        }
                    }
                } else {
                    seek(j);
                    if (this.f44273 == this.f44274) {
                        this.f44274 = this.f44270;
                    }
                }
            }
            int iMin = Math.min(i2, (int) (this.f44274 - this.f44273));
            System.arraycopy(bArr, i, this.f44272, (int) (this.f44273 - this.f44265), iMin);
            this.f44273 += (long) iMin;
            i += iMin;
            i2 -= iMin;
            this.f44264 = true;
        }
    }
}
