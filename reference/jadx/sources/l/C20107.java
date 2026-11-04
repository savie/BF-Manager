package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20107 extends FilterOutputStream {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC22345[] f64599 = {EnumC22345.BLOCK_INDEPENDENCE};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC8909 f64600;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C23091 f64601;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f64602;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f64603;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f64604;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f64605;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC6683 f64606;

    public C20107(OutputStream outputStream, EnumC5191 enumC5191, long j, AbstractC8909 abstractC8909, AbstractC6683 abstractC6683, EnumC22345... enumC22345Arr) throws IOException {
        super(outputStream);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f64605 = byteBufferAllocate.order(byteOrder);
        this.f64601 = null;
        this.f64600 = abstractC8909;
        this.f64606 = abstractC6683;
        C23091 c23091 = new C23091(new C11156(enumC22345Arr), new C13788(enumC5191, 0));
        this.f64601 = c23091;
        int iM33688 = c23091.m51994().m33688();
        this.f64602 = iM33688;
        this.f64603 = ByteBuffer.allocate(iM33688).order(byteOrder);
        abstractC8909.getClass();
        if (iM33688 < 0) {
            throw new IllegalArgumentException(C13645.m33382(iM33688, "length must be >= 0, got "));
        }
        if (iM33688 >= 2113929216) {
            throw new IllegalArgumentException("length must be < 2113929216");
        }
        this.f64604 = new byte[(iM33688 / 255) + iM33688 + 16];
        C11156 c11156M51997 = c23091.m51997();
        EnumC22345 enumC22345 = EnumC22345.CONTENT_SIZE;
        if (c11156M51997.m28106(enumC22345) && j < 0) {
            throw new IllegalArgumentException("Known size must be greater than zero in order to use the known size feature");
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(15).order(byteOrder);
        byteBufferOrder.putInt(407708164);
        byteBufferOrder.put(c23091.m51997().m28105());
        byteBufferOrder.put(c23091.m51994().m33689());
        if (c23091.m51993(enumC22345)) {
            byteBufferOrder.putLong(j);
        }
        byteBufferOrder.put((byte) ((abstractC6683.mo18703(byteBufferOrder.array(), 4, byteBufferOrder.position() - 4) >> 8) & 255));
        ((FilterOutputStream) this).out.write(byteBufferOrder.array(), 0, byteBufferOrder.position());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20107(OutputStream outputStream) {
        EnumC5191 enumC5191 = EnumC5191.SIZE_4MB;
        C8568.m23012().getClass();
        C4445.m14138();
        this(outputStream, enumC5191, -1L, C5937.f20288, C4445.m14140(), f64599);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20107(OutputStream outputStream, int i, long j) {
        AbstractC8909 abstractC8909M23013;
        EnumC5191 enumC5191 = EnumC5191.SIZE_4MB;
        if (i == 1) {
            C8568.m23012().getClass();
            abstractC8909M23013 = C5937.f20288;
        } else {
            abstractC8909M23013 = C8568.m23012().m23013(i);
        }
        AbstractC8909 abstractC8909 = abstractC8909M23013;
        C4445.m14138();
        this(outputStream, enumC5191, j, abstractC8909, C4445.m14140(), j < 0 ? new EnumC22345[]{EnumC22345.BLOCK_INDEPENDENCE, EnumC22345.CONTENT_CHECKSUM} : new EnumC22345[]{EnumC22345.BLOCK_INDEPENDENCE, EnumC22345.CONTENT_CHECKSUM, EnumC22345.CONTENT_SIZE});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46229() throws IOException {
        int i;
        ByteBuffer byteBuffer = this.f64603;
        if (byteBuffer.position() == 0) {
            return;
        }
        byte[] bArrCopyOf = this.f64604;
        Arrays.fill(bArrCopyOf, (byte) 0);
        EnumC22345 enumC22345 = EnumC22345.CONTENT_CHECKSUM;
        C23091 c23091 = this.f64601;
        if (c23091.m51993(enumC22345)) {
            c23091.m51992(byteBuffer.position(), byteBuffer.array());
        }
        byte[] bArrArray = byteBuffer.array();
        int iPosition = byteBuffer.position();
        AbstractC8909 abstractC8909 = this.f64600;
        abstractC8909.getClass();
        int iMo17251 = abstractC8909.mo17251(iPosition, bArrCopyOf.length, bArrArray, bArrCopyOf);
        if (iMo17251 >= byteBuffer.position()) {
            iMo17251 = byteBuffer.position();
            bArrCopyOf = Arrays.copyOf(byteBuffer.array(), iMo17251);
            i = Integer.MIN_VALUE;
        } else {
            i = 0;
        }
        ByteBuffer byteBuffer2 = this.f64605;
        byteBuffer2.putInt(0, i | iMo17251);
        ((FilterOutputStream) this).out.write(byteBuffer2.array());
        ((FilterOutputStream) this).out.write(bArrCopyOf, 0, iMo17251);
        if (c23091.m51993(EnumC22345.BLOCK_CHECKSUM)) {
            byteBuffer2.putInt(0, this.f64606.mo18703(bArrCopyOf, 0, iMo17251));
            ((FilterOutputStream) this).out.write(byteBuffer2.array());
        }
        byteBuffer.rewind();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f64601.m51995()) {
            throw new IllegalStateException("The stream is already closed");
        }
        while (true) {
            ByteBuffer byteBuffer = this.f64603;
            if (i2 > byteBuffer.remaining()) {
                int iRemaining = byteBuffer.remaining();
                byteBuffer.put(bArr, i, iRemaining);
                m46229();
                i += iRemaining;
                i2 -= iRemaining;
            } else {
                byteBuffer.put(bArr, i, i2);
                return;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (!this.f64601.m51995()) {
            m46229();
        }
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        if (!this.f64601.m51995()) {
            ByteBuffer byteBuffer = this.f64603;
            if (byteBuffer.position() == this.f64602) {
                m46229();
            }
            byteBuffer.put((byte) i);
            return;
        }
        throw new IllegalStateException("The stream is already closed");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C23091 c23091 = this.f64601;
        if (!c23091.m51995()) {
            flush();
            ByteBuffer byteBuffer = this.f64605;
            byteBuffer.putInt(0, 0);
            ((FilterOutputStream) this).out.write(byteBuffer.array());
            if (c23091.m51993(EnumC22345.CONTENT_CHECKSUM)) {
                byteBuffer.putInt(0, c23091.m51991());
                ((FilterOutputStream) this).out.write(byteBuffer.array());
            }
            c23091.m51996();
        }
        super.close();
    }
}
