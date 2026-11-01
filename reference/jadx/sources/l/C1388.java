package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֨᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GH */
/* JADX INFO: loaded from: classes3.dex */
public final class C1388 implements InterfaceC7739 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C19805 f5774 = new C19805(2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC21850 f5776;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f5777;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f5780;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f5782;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f5786;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f5778 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f5785 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f5781 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f5783 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f5784 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f5775 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f5779 = 0;

    public C1388(InterfaceC21850 interfaceC21850) {
        this.f5776 = interfaceC21850;
        byte[] bArr = (byte[]) f5774.m45009();
        if (bArr == null) {
            bArr = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        this.f5782 = bArr;
        this.f5786 = 131072L;
        this.f5777 = false;
        this.f5780 = 0L;
    }

    @Override // l.InterfaceC7739
    public final int available() {
        long length = length() - getFilePointer();
        if (length <= 2147483647L) {
            return (int) length;
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m4862() {
        long filePointer = getFilePointer();
        int i = (int) filePointer;
        if (filePointer == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m4871(int i) {
        if (i < 0 || i > 65535) {
            throw new RuntimeException("Data out of range (UShort)");
        }
        write(i & 255);
        write((i >>> 8) & 255);
    }

    @Override // l.InterfaceC7739
    public final void write(int i) {
        long j = this.f5775;
        long j2 = this.f5784;
        if (j >= j2) {
            if (this.f5777 && j2 < this.f5786) {
                this.f5784 = j2 + 1;
            } else {
                seek(j);
                long j3 = this.f5775;
                long j4 = this.f5784;
                if (j3 == j4) {
                    this.f5784 = j4 + 1;
                }
            }
        }
        byte[] bArr = this.f5782;
        long j5 = this.f5775;
        bArr[(int) (j5 - this.f5779)] = (byte) i;
        this.f5775 = j5 + 1;
        this.f5783 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4863(char c) {
        write(c & 255);
        write((c >>> '\b') & 255);
    }

    public final void writeInt(int i) {
        write(i & 255);
        write((i >>> 8) & 255);
        write((i >>> 16) & 255);
        write((i >>> 24) & 255);
    }

    @Override // l.InterfaceC7739
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC7739
    public final byte readByte() throws EOFException {
        int i = read();
        if (i != -1) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // l.InterfaceC7739
    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public final int mo4872() {
        return (readByte() & 255) | ((readByte() & 255) << 8);
    }

    @Override // l.InterfaceC7739
    public final int read() {
        long j = this.f5775;
        if (j >= this.f5784) {
            if (this.f5777) {
                return -1;
            }
            seek(j);
            if (this.f5775 == this.f5784) {
                return -1;
            }
        }
        byte[] bArr = this.f5782;
        long j2 = this.f5775;
        byte b = bArr[(int) (j2 - this.f5779)];
        this.f5775 = j2 + 1;
        return b & 255;
    }

    @Override // l.InterfaceC7739
    public final int readInt() {
        return (readByte() & 255) | ((readByte() & 255) << 8) | ((readByte() & 255) << 16) | ((readByte() & 255) << 24);
    }

    @Override // l.InterfaceC7739
    public final long readLong() {
        return (((long) readByte()) & 255) | ((((long) readByte()) & 255) << 8) | ((((long) readByte()) & 255) << 16) | ((((long) readByte()) & 255) << 24) | ((((long) readByte()) & 255) << 32) | ((((long) readByte()) & 255) << 40) | ((((long) readByte()) & 255) << 48) | ((255 & ((long) readByte())) << 56);
    }

    @Override // l.InterfaceC7739
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC7739
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f5775;
        if (j >= this.f5784) {
            if (this.f5777) {
                return -1;
            }
            seek(j);
            if (this.f5775 == this.f5784) {
                return -1;
            }
        }
        int iMin = Math.min(i2, (int) (this.f5784 - this.f5775));
        System.arraycopy(this.f5782, (int) (this.f5775 - this.f5779), bArr, i, iMin);
        this.f5775 += (long) iMin;
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

    @Override // l.InterfaceC7739
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo4867(int i, int i2, byte[] bArr) {
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

    @Override // l.InterfaceC7739
    public final void readFully(byte[] bArr) throws EOFException {
        m4864(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4864(byte[] bArr, int i, int i2) throws EOFException {
        int i3 = 0;
        do {
            int i4 = read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                throw new EOFException();
            }
            i3 += i4;
        } while (i3 < i2);
    }

    @Override // l.InterfaceC7739
    public final long length() {
        long j = this.f5775;
        if (this.f5778 == -1) {
            this.f5778 = this.f5776.length();
        }
        return Math.max(j, this.f5778);
    }

    public final void setLength(long j) {
        m4861();
        InterfaceC21850 interfaceC21850 = this.f5776;
        interfaceC21850.setLength(j);
        this.f5778 = j;
        if (this.f5775 > j) {
            this.f5775 = j;
        }
        if (this.f5780 > j) {
            interfaceC21850.seek(j);
            this.f5780 = j;
        }
        this.f5784 = 0L;
        this.f5779 = 0L;
        seek(this.f5775);
    }

    @Override // l.InterfaceC7739
    public final void seek(long j) {
        if (j >= this.f5784 || j < this.f5779) {
            m4861();
            long j2 = (-131072) & j;
            this.f5779 = j2;
            this.f5786 = ((long) this.f5782.length) + j2;
            long j3 = this.f5780;
            InterfaceC21850 interfaceC21850 = this.f5776;
            if (j3 != j2) {
                interfaceC21850.seek(j2);
                this.f5780 = this.f5779;
            }
            int length = this.f5782.length;
            int i = 0;
            while (length > 0) {
                int i2 = interfaceC21850.read(this.f5782, i, length);
                if (i2 < 0) {
                    break;
                }
                i += i2;
                length -= i2;
            }
            byte[] bArr = this.f5782;
            boolean z = i < bArr.length;
            this.f5777 = z;
            if (z) {
                Arrays.fill(bArr, i, bArr.length, (byte) -1);
            }
            long j4 = i;
            this.f5780 += j4;
            this.f5784 = this.f5779 + j4;
        } else if (j < this.f5775) {
            m4861();
        }
        this.f5775 = j;
    }

    @Override // l.InterfaceC7739
    public final long getFilePointer() {
        return this.f5775;
    }

    @Override // l.InterfaceC7739
    public final int skipBytes(int i) {
        if (i <= 0) {
            return 0;
        }
        long j = this.f5775;
        long length = length();
        long j2 = ((long) i) + j;
        if (j2 <= length) {
            length = j2;
        }
        seek(length);
        return (int) (length - j);
    }

    @Override // l.InterfaceC7739
    public final String getName() {
        return this.f5776.getName();
    }

    @Override // l.InterfaceC7739
    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21850 mo4866() {
        return this.f5776;
    }

    @Override // l.InterfaceC7739
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C1388 mo4870() {
        return new C1388(this.f5776.mo3060());
    }

    @Override // l.InterfaceC7739
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1388 mo4868(long j, long j2) {
        return new C1388(this.f5776.mo3058(j, j2));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1388 m4865(long j, long j2) {
        return new C1388(this.f5776.mo3056(j, j2));
    }

    @Override // l.InterfaceC7739
    public final void flush() {
        m4861();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m4869() {
        if (this.f5781) {
            this.f5776.mo3059();
            this.f5781 = false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f5785) {
            return;
        }
        m4861();
        this.f5785 = true;
        this.f5776.close();
        f5774.m45011(this.f5782);
        this.f5782 = null;
    }

    @Override // l.InterfaceC7739
    public final boolean isClosed() {
        return this.f5785;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f5785;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    @Override // l.InterfaceC7739, java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
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
            long j = this.f5775;
            if (j >= this.f5784) {
                if (!this.f5777) {
                    seek(j);
                    if (this.f5775 != this.f5784) {
                        iMin = Math.min(i2, (int) (this.f5784 - this.f5775));
                        byteBuffer.put(this.f5782, (int) (this.f5775 - this.f5779), iMin);
                        this.f5775 += (long) iMin;
                    }
                }
                iMin = -1;
            } else {
                iMin = Math.min(i2, (int) (this.f5784 - this.f5775));
                byteBuffer.put(this.f5782, (int) (this.f5775 - this.f5779), iMin);
                this.f5775 += (long) iMin;
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
            long j = this.f5775;
            long j2 = this.f5784;
            if (j >= j2) {
                if (this.f5777) {
                    long j3 = this.f5786;
                    if (j2 < j3) {
                        this.f5784 = j3;
                    } else {
                        seek(j);
                        if (this.f5775 == this.f5784) {
                            this.f5784 = this.f5786;
                        }
                    }
                } else {
                    seek(j);
                    if (this.f5775 == this.f5784) {
                        this.f5784 = this.f5786;
                    }
                }
            }
            int iMin = Math.min(iRemaining, (int) (this.f5784 - this.f5775));
            byteBuffer.get(this.f5782, (int) (this.f5775 - this.f5779), iMin);
            this.f5775 += (long) iMin;
            i += iMin;
            this.f5783 = true;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m4861() {
        if (this.f5783) {
            long j = this.f5780;
            long j2 = this.f5779;
            InterfaceC21850 interfaceC21850 = this.f5776;
            if (j != j2) {
                interfaceC21850.seek(j2);
            }
            interfaceC21850.write(this.f5782, 0, (int) (this.f5775 - this.f5779));
            long j3 = this.f5775;
            this.f5780 = j3;
            this.f5783 = false;
            long j4 = this.f5778;
            if (j4 != -1 && j3 > j4) {
                this.f5778 = -1L;
            }
            this.f5781 = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[SYNTHETIC] */
    @Override // l.InterfaceC7739
    public final void write(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            long j = this.f5775;
            long j2 = this.f5784;
            if (j >= j2) {
                if (this.f5777) {
                    long j3 = this.f5786;
                    if (j2 < j3) {
                        this.f5784 = j3;
                    } else {
                        seek(j);
                        if (this.f5775 == this.f5784) {
                            this.f5784 = this.f5786;
                        }
                    }
                } else {
                    seek(j);
                    if (this.f5775 == this.f5784) {
                        this.f5784 = this.f5786;
                    }
                }
            }
            int iMin = Math.min(i2, (int) (this.f5784 - this.f5775));
            System.arraycopy(bArr, i, this.f5782, (int) (this.f5775 - this.f5779), iMin);
            this.f5775 += (long) iMin;
            i += iMin;
            i2 -= iMin;
            this.f5783 = true;
        }
    }
}
