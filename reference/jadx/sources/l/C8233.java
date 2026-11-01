package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* JADX INFO: renamed from: l.۠ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8DM */
/* JADX INFO: loaded from: classes3.dex */
public class C8233 extends FilterInputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f28651;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f28652;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f28653;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C20933 f28654;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f28655;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f28656;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f28657;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f28658;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f28659;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC21803 f28660;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f28661;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC4332 f28662;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f28663;

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

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8233(InputStream inputStream) {
        super(inputStream);
        AbstractC21803 abstractC21803M43421 = C18816.m43419().m43421();
        C11389.m28496();
        AbstractC4332 abstractC4332M28498 = C11389.m28498();
        byte[] bArr = new byte[15];
        this.f28656 = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f28663 = byteBufferWrap.order(byteOrder);
        this.f28655 = ByteBuffer.allocate(8).order(byteOrder);
        this.f28659 = null;
        this.f28652 = null;
        this.f28658 = -1;
        this.f28657 = -1L;
        this.f28653 = 0L;
        this.f28661 = false;
        this.f28654 = null;
        this.f28660 = abstractC21803M43421;
        this.f28662 = abstractC4332M28498;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m21612() throws IOException {
        while (true) {
            int i = 0;
            do {
                int i2 = ((FilterInputStream) this).in.read(this.f28655.array(), i, 4 - i);
                if (i2 < 0) {
                    if (!this.f28661) {
                        throw new IOException("Stream ended prematurely");
                    }
                    if (i <= 0) {
                        return false;
                    }
                    throw new IOException("Stream ended prematurely");
                }
                i += i2;
            } while (i < 4);
            int i3 = this.f28655.getInt(0);
            if (i3 == 407708164) {
                this.f28663.rewind();
                int i4 = ((FilterInputStream) this).in.read();
                if (i4 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                int i5 = ((FilterInputStream) this).in.read();
                if (i5 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                byte b = (byte) (i4 & 255);
                C7527 c7527M20050 = C7527.m20050(b);
                this.f28663.put(b);
                byte b2 = (byte) (i5 & 255);
                C19522 c19522M44579 = C19522.m44579(b2);
                this.f28663.put(b2);
                this.f28654 = new C20933(c7527M20050, c19522M44579);
                if (c7527M20050.m20053(EnumC10350.CONTENT_SIZE)) {
                    InputStream inputStream = ((FilterInputStream) this).in;
                    ByteBuffer byteBuffer = this.f28655;
                    int i6 = 0;
                    do {
                        int i7 = inputStream.read(byteBuffer.array(), i6, 8 - i6);
                        if (i7 < 0) {
                            throw new IOException("Stream ended prematurely");
                        }
                        i6 += i7;
                    } while (i6 < 8);
                    long j = byteBuffer.getLong(0);
                    this.f28657 = j;
                    this.f28663.putLong(j);
                }
                this.f28653 = 0L;
                byte bMo12167 = (byte) ((this.f28662.mo12167(this.f28656, 0, this.f28663.position()) >> 8) & 255);
                int i8 = ((FilterInputStream) this).in.read();
                if (i8 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                if (bMo12167 != ((byte) (i8 & 255))) {
                    throw new IOException("Stream frame descriptor corrupted");
                }
                int iM44580 = this.f28654.m47069().m44580();
                this.f28658 = iM44580;
                this.f28651 = new byte[iM44580];
                byte[] bArr = new byte[iM44580];
                this.f28652 = bArr;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                this.f28659 = byteBufferWrap;
                byteBufferWrap.limit(0);
                this.f28661 = true;
                return true;
            }
            if ((i3 >>> 4) != 25481893) {
                throw new IOException("Stream unsupported");
            }
            int iM21611 = m21611(((FilterInputStream) this).in);
            byte[] bArr2 = new byte[1024];
            while (iM21611 > 0) {
                int i9 = ((FilterInputStream) this).in.read(bArr2, 0, Math.min(iM21611, 1024));
                if (i9 < 0) {
                    throw new IOException("Stream ended prematurely");
                }
                iM21611 -= i9;
            }
            this.f28661 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m21611(InputStream inputStream) throws IOException {
        ByteBuffer byteBuffer;
        int i = 0;
        do {
            byteBuffer = this.f28655;
            int i2 = inputStream.read(byteBuffer.array(), i, 4 - i);
            if (i2 < 0) {
                throw new IOException("Stream ended prematurely");
            }
            i += i2;
        } while (i < 4);
        return byteBuffer.getInt(0);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m21613() throws IOException {
        int iM21611 = m21611(((FilterInputStream) this).in);
        boolean z = (Integer.MIN_VALUE & iM21611) == 0;
        int iMo30971 = iM21611 & Integer.MAX_VALUE;
        if (iMo30971 == 0) {
            if (this.f28654.m47067(EnumC10350.CONTENT_CHECKSUM) && m21611(((FilterInputStream) this).in) != this.f28654.m47065()) {
                throw new IOException("Content checksum mismatch");
            }
            if (!this.f28654.m47067(EnumC10350.CONTENT_SIZE) || this.f28657 == this.f28653) {
                this.f28654.m47070();
                return;
            }
            throw new IOException("Size check mismatch: " + this.f28657 + " != " + this.f28653);
        }
        byte[] bArr = z ? this.f28651 : this.f28652;
        if (iMo30971 > this.f28658) {
            Locale locale = Locale.ROOT;
            throw new IOException(C2271.m6967("Block size ", iMo30971, this.f28658, " exceeded max: "));
        }
        int i = 0;
        while (i < iMo30971) {
            int i2 = ((FilterInputStream) this).in.read(bArr, i, iMo30971 - i);
            if (i2 < 0) {
                throw new IOException("Stream ended prematurely");
            }
            i += i2;
        }
        if (this.f28654.m47067(EnumC10350.BLOCK_CHECKSUM) && m21611(((FilterInputStream) this).in) != this.f28662.mo12167(bArr, 0, iMo30971)) {
            throw new IOException("Block checksum mismatch");
        }
        if (z) {
            try {
                AbstractC21803 abstractC21803 = this.f28660;
                byte[] bArr2 = this.f28652;
                iMo30971 = abstractC21803.mo30971(iMo30971, bArr2.length, bArr, bArr2);
            } catch (C18110 e) {
                throw new IOException(e);
            }
        }
        if (this.f28654.m47067(EnumC10350.CONTENT_CHECKSUM)) {
            this.f28654.m47066(iMo30971, this.f28652);
        }
        this.f28653 += (long) iMo30971;
        this.f28659.limit(iMo30971);
        this.f28659.rewind();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        while (true) {
            if (!this.f28661 || this.f28659.remaining() == 0) {
                if ((!this.f28661 || this.f28654.m47068()) && !m21612()) {
                    return -1;
                }
                m21613();
            } else {
                return this.f28659.get() & 255;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (true) {
            if (!this.f28661 || this.f28659.remaining() == 0) {
                if ((!this.f28661 || this.f28654.m47068()) && !m21612()) {
                    return -1;
                }
                m21613();
            } else {
                int iMin = Math.min(i2, this.f28659.remaining());
                this.f28659.get(bArr, i, iMin);
                return iMin;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        if (j > 0) {
            while (true) {
                if (!this.f28661 || this.f28659.remaining() == 0) {
                    if ((this.f28661 && !this.f28654.m47068()) || m21612()) {
                        m21613();
                    }
                } else {
                    long jMin = Math.min(j, this.f28659.remaining());
                    ByteBuffer byteBuffer = this.f28659;
                    byteBuffer.position(byteBuffer.position() + ((int) jMin));
                    return jMin;
                }
            }
        }
        return 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return this.f28659.remaining();
    }
}
