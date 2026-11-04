package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۜۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8DM */
/* JADX INFO: loaded from: classes3.dex */
public class C7077 extends FilterInputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC11902 f23309;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] f23310;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f23311;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23312;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f23313;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public byte[] f23314;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f23315;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C23091 f23316;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f23317;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f23318;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f23319;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f23320;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC6683 f23321;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        throw new UnsupportedOperationException("mark not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        throw new UnsupportedOperationException("reset not supported");
    }

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7077(InputStream inputStream) {
        super(inputStream);
        AbstractC11902 abstractC11902M23014 = C8568.m23012().m23014();
        C4445.m14138();
        AbstractC6683 abstractC6683M14140 = C4445.m14140();
        byte[] bArr = new byte[15];
        this.f23310 = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f23315 = byteBufferWrap.order(byteOrder);
        this.f23312 = ByteBuffer.allocate(8).order(byteOrder);
        this.f23318 = null;
        this.f23314 = null;
        this.f23311 = -1;
        this.f23313 = -1L;
        this.f23317 = 0L;
        this.f23320 = false;
        this.f23316 = null;
        this.f23309 = abstractC11902M23014;
        this.f23321 = abstractC6683M14140;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m19412() throws IOException {
        while (true) {
            int i = 0;
            do {
                int i2 = ((FilterInputStream) this).in.read(this.f23312.array(), i, 4 - i);
                if (i2 < 0) {
                    if (!this.f23320) {
                        throw new IOException("Stream ended prematurely");
                    }
                    if (i <= 0) {
                        return false;
                    }
                    throw new IOException("Stream ended prematurely");
                }
                i += i2;
            } while (i < 4);
            int i3 = this.f23312.getInt(0);
            if (i3 == 407708164) {
                this.f23315.rewind();
                int i4 = ((FilterInputStream) this).in.read();
                if (i4 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                int i5 = ((FilterInputStream) this).in.read();
                if (i5 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                byte b = (byte) (i4 & 255);
                C11156 c11156M28103 = C11156.m28103(b);
                this.f23315.put(b);
                byte b2 = (byte) (i5 & 255);
                C13788 c13788M33687 = C13788.m33687(b2);
                this.f23315.put(b2);
                this.f23316 = new C23091(c11156M28103, c13788M33687);
                if (c11156M28103.m28106(EnumC22345.CONTENT_SIZE)) {
                    InputStream inputStream = ((FilterInputStream) this).in;
                    ByteBuffer byteBuffer = this.f23312;
                    int i6 = 0;
                    do {
                        int i7 = inputStream.read(byteBuffer.array(), i6, 8 - i6);
                        if (i7 < 0) {
                            throw new IOException("Stream ended prematurely");
                        }
                        i6 += i7;
                    } while (i6 < 8);
                    long j = byteBuffer.getLong(0);
                    this.f23313 = j;
                    this.f23315.putLong(j);
                }
                this.f23317 = 0L;
                byte bMo18703 = (byte) ((this.f23321.mo18703(this.f23310, 0, this.f23315.position()) >> 8) & 255);
                int i8 = ((FilterInputStream) this).in.read();
                if (i8 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                if (bMo18703 != ((byte) (i8 & 255))) {
                    throw new IOException("Stream frame descriptor corrupted");
                }
                int iM33688 = this.f23316.m51994().m33688();
                this.f23311 = iM33688;
                this.f23319 = new byte[iM33688];
                byte[] bArr = new byte[iM33688];
                this.f23314 = bArr;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                this.f23318 = byteBufferWrap;
                byteBufferWrap.limit(0);
                this.f23320 = true;
                return true;
            }
            if ((i3 >>> 4) != 25481893) {
                throw new IOException("Stream unsupported");
            }
            int iM19411 = m19411(((FilterInputStream) this).in);
            byte[] bArr2 = new byte[1024];
            while (iM19411 > 0) {
                int i9 = ((FilterInputStream) this).in.read(bArr2, 0, Math.min(iM19411, 1024));
                if (i9 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                iM19411 -= i9;
            }
            this.f23320 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m19411(InputStream inputStream) throws IOException {
        ByteBuffer byteBuffer;
        int i = 0;
        do {
            byteBuffer = this.f23312;
            int i2 = inputStream.read(byteBuffer.array(), i, 4 - i);
            if (i2 < 0) {
                throw new IOException("Stream ended prematurely");
            }
            i += i2;
        } while (i < 4);
        return byteBuffer.getInt(0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m19413() throws IOException {
        int iM19411 = m19411(((FilterInputStream) this).in);
        boolean z = (Integer.MIN_VALUE & iM19411) == 0;
        int iMo7536 = iM19411 & Integer.MAX_VALUE;
        if (iMo7536 == 0) {
            if (this.f23316.m51993(EnumC22345.CONTENT_CHECKSUM) && m19411(((FilterInputStream) this).in) != this.f23316.m51991()) {
                throw new IOException("Content checksum mismatch");
            }
            if (!this.f23316.m51993(EnumC22345.CONTENT_SIZE) || this.f23313 == this.f23317) {
                this.f23316.m51996();
                return;
            }
            throw new IOException("Size check mismatch: " + this.f23313 + " != " + this.f23317);
        }
        byte[] bArr = z ? this.f23319 : this.f23314;
        if (iMo7536 > this.f23311) {
            Locale locale = Locale.ROOT;
            throw new IOException(C6934.m19217("Block size ", iMo7536, this.f23311, " exceeded max: "));
        }
        int i = 0;
        while (i < iMo7536) {
            int i2 = ((FilterInputStream) this).in.read(bArr, i, iMo7536 - i);
            if (i2 < 0) {
                throw new IOException("Stream ended prematurely");
            }
            i += i2;
        }
        if (this.f23316.m51993(EnumC22345.BLOCK_CHECKSUM) && m19411(((FilterInputStream) this).in) != this.f23321.mo18703(bArr, 0, iMo7536)) {
            throw new IOException("Block checksum mismatch");
        }
        if (z) {
            try {
                AbstractC11902 abstractC11902 = this.f23309;
                byte[] bArr2 = this.f23314;
                iMo7536 = abstractC11902.mo7536(iMo7536, bArr2.length, bArr, bArr2);
            } catch (C2602 e) {
                throw new IOException(e);
            }
        }
        if (this.f23316.m51993(EnumC22345.CONTENT_CHECKSUM)) {
            this.f23316.m51992(iMo7536, this.f23314);
        }
        this.f23317 += (long) iMo7536;
        this.f23318.limit(iMo7536);
        this.f23318.rewind();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        while (true) {
            if (!this.f23320 || this.f23318.remaining() == 0) {
                if ((!this.f23320 || this.f23316.m51995()) && !m19412()) {
                    return -1;
                }
                m19413();
            } else {
                return this.f23318.get() & 255;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (true) {
            if (!this.f23320 || this.f23318.remaining() == 0) {
                if ((!this.f23320 || this.f23316.m51995()) && !m19412()) {
                    return -1;
                }
                m19413();
            } else {
                int iMin = Math.min(i2, this.f23318.remaining());
                this.f23318.get(bArr, i, iMin);
                return iMin;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j > 0) {
            while (true) {
                if (!this.f23320 || this.f23318.remaining() == 0) {
                    if ((this.f23320 && !this.f23316.m51995()) || m19412()) {
                        m19413();
                    }
                } else {
                    long jMin = Math.min(j, this.f23318.remaining());
                    ByteBuffer byteBuffer = this.f23318;
                    byteBuffer.position(byteBuffer.position() + ((int) jMin));
                    return jMin;
                }
            }
        }
        return 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return this.f23318.remaining();
    }
}
