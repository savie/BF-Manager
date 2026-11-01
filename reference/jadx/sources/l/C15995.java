package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15995 extends FilterOutputStream {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC10350[] f51773 = {EnumC10350.BLOCK_INDEPENDENCE};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final byte[] f51774;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f51775;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C20933 f51776;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f51777;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC12568 f51778;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f51779;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC4332 f51780;

    public C15995(OutputStream outputStream, EnumC8939 enumC8939, long j, AbstractC12568 abstractC12568, AbstractC4332 abstractC4332, EnumC10350... enumC10350Arr) throws IOException {
        super(outputStream);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f51779 = byteBufferAllocate.order(byteOrder);
        this.f51776 = null;
        this.f51778 = abstractC12568;
        this.f51780 = abstractC4332;
        C20933 c20933 = new C20933(new C7527(enumC10350Arr), new C19522(enumC8939, 0));
        this.f51776 = c20933;
        int iM44580 = c20933.m47069().m44580();
        this.f51775 = iM44580;
        this.f51777 = ByteBuffer.allocate(iM44580).order(byteOrder);
        abstractC12568.getClass();
        if (iM44580 < 0) {
            throw new IllegalArgumentException(C8479.m22141(iM44580, "length must be >= 0, got "));
        }
        if (iM44580 >= 2113929216) {
            throw new IllegalArgumentException("length must be < 2113929216");
        }
        this.f51774 = new byte[(iM44580 / 255) + iM44580 + 16];
        C7527 c7527M47064 = c20933.m47064();
        EnumC10350 enumC10350 = EnumC10350.CONTENT_SIZE;
        if (c7527M47064.m20053(enumC10350) && j < 0) {
            throw new IllegalArgumentException("Known size must be greater than zero in order to use the known size feature");
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(15).order(byteOrder);
        byteBufferOrder.putInt(407708164);
        byteBufferOrder.put(c20933.m47064().m20052());
        byteBufferOrder.put(c20933.m47069().m44581());
        if (c20933.m47067(enumC10350)) {
            byteBufferOrder.putLong(j);
        }
        byteBufferOrder.put((byte) ((abstractC4332.mo12167(byteBufferOrder.array(), 4, byteBufferOrder.position() - 4) >> 8) & 255));
        ((FilterOutputStream) this).out.write(byteBufferOrder.array(), 0, byteBufferOrder.position());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C15995(OutputStream outputStream) {
        EnumC8939 enumC8939 = EnumC8939.SIZE_4MB;
        C18816.m43419().getClass();
        C11389.m28496();
        this(outputStream, enumC8939, -1L, C16700.f53493, C11389.m28498(), f51773);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C15995(OutputStream outputStream, int i, long j) {
        AbstractC12568 abstractC12568M43420;
        EnumC8939 enumC8939 = EnumC8939.SIZE_4MB;
        if (i == 1) {
            C18816.m43419().getClass();
            abstractC12568M43420 = C16700.f53493;
        } else {
            abstractC12568M43420 = C18816.m43419().m43420(i);
        }
        AbstractC12568 abstractC12568 = abstractC12568M43420;
        C11389.m28496();
        this(outputStream, enumC8939, j, abstractC12568, C11389.m28498(), j < 0 ? new EnumC10350[]{EnumC10350.BLOCK_INDEPENDENCE, EnumC10350.CONTENT_CHECKSUM} : new EnumC10350[]{EnumC10350.BLOCK_INDEPENDENCE, EnumC10350.CONTENT_CHECKSUM, EnumC10350.CONTENT_SIZE});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37972() throws IOException {
        int i;
        ByteBuffer byteBuffer = this.f51777;
        if (byteBuffer.position() == 0) {
            return;
        }
        byte[] bArrCopyOf = this.f51774;
        Arrays.fill(bArrCopyOf, (byte) 0);
        EnumC10350 enumC10350 = EnumC10350.CONTENT_CHECKSUM;
        C20933 c20933 = this.f51776;
        if (c20933.m47067(enumC10350)) {
            c20933.m47066(byteBuffer.position(), byteBuffer.array());
        }
        byte[] bArrArray = byteBuffer.array();
        int iPosition = byteBuffer.position();
        AbstractC12568 abstractC12568 = this.f51778;
        abstractC12568.getClass();
        int iMo2340 = abstractC12568.mo2340(iPosition, bArrCopyOf.length, bArrArray, bArrCopyOf);
        if (iMo2340 >= byteBuffer.position()) {
            iMo2340 = byteBuffer.position();
            bArrCopyOf = Arrays.copyOf(byteBuffer.array(), iMo2340);
            i = Integer.MIN_VALUE;
        } else {
            i = 0;
        }
        ByteBuffer byteBuffer2 = this.f51779;
        byteBuffer2.putInt(0, i | iMo2340);
        ((FilterOutputStream) this).out.write(byteBuffer2.array());
        ((FilterOutputStream) this).out.write(bArrCopyOf, 0, iMo2340);
        if (c20933.m47067(EnumC10350.BLOCK_CHECKSUM)) {
            byteBuffer2.putInt(0, this.f51780.mo12167(bArrCopyOf, 0, iMo2340));
            ((FilterOutputStream) this).out.write(byteBuffer2.array());
        }
        byteBuffer.rewind();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f51776.m47068()) {
            throw new IllegalStateException("The stream is already closed");
        }
        while (true) {
            ByteBuffer byteBuffer = this.f51777;
            if (i2 > byteBuffer.remaining()) {
                int iRemaining = byteBuffer.remaining();
                byteBuffer.put(bArr, i, iRemaining);
                m37972();
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
        if (!this.f51776.m47068()) {
            m37972();
        }
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        if (!this.f51776.m47068()) {
            ByteBuffer byteBuffer = this.f51777;
            if (byteBuffer.position() == this.f51775) {
                m37972();
            }
            byteBuffer.put((byte) i);
            return;
        }
        throw new IllegalStateException("The stream is already closed");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C20933 c20933 = this.f51776;
        if (!c20933.m47068()) {
            flush();
            ByteBuffer byteBuffer = this.f51779;
            byteBuffer.putInt(0, 0);
            ((FilterOutputStream) this).out.write(byteBuffer.array());
            if (c20933.m47067(EnumC10350.CONTENT_CHECKSUM)) {
                byteBuffer.putInt(0, c20933.m47065());
                ((FilterOutputStream) this).out.write(byteBuffer.array());
            }
            c20933.m47070();
        }
        super.close();
    }
}
