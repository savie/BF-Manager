package l;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.ۧۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes4.dex */
public class C10784 extends InputStream implements DataInput, InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f36733;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f36734;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ByteOrder f36735;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f36736;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DataInputStream f36737;

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C10784(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
        this.f36733 = bArr.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10784(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public C10784(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f36737 = dataInputStream;
        dataInputStream.mark(0);
        this.f36736 = 0;
        this.f36735 = byteOrder;
        this.f36733 = inputStream instanceof C10784 ? ((C10784) inputStream).f36733 : -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27081(ByteOrder byteOrder) {
        this.f36735 = byteOrder;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f36737.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f36736++;
        return this.f36737.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f36737.read(bArr, i, i2);
        this.f36736 += i3;
        return i3;
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f36736++;
        return this.f36737.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f36736++;
        return this.f36737.readBoolean();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f36736 += 2;
        return this.f36737.readChar();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f36736 += 2;
        return this.f36737.readUTF();
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f36736 += i2;
        this.f36737.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f36736 += bArr.length;
        this.f36737.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f36736++;
        int i = this.f36737.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f36736 += 2;
        DataInputStream dataInputStream = this.f36737;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f36735;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i << 8) + i2);
        }
        throw new IOException("Invalid byte order: " + this.f36735);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f36736 += 4;
        DataInputStream dataInputStream = this.f36737;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f36735;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IOException("Invalid byte order: " + this.f36735);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27080(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.f36737;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.f36734 == null) {
                    this.f36734 = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f36734, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException(C2271.m6966(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.f36736 += i2;
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f36736 += 2;
        DataInputStream dataInputStream = this.f36737;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f36735;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i2 << 8) + i;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i << 8) + i2;
        }
        throw new IOException("Invalid byte order: " + this.f36735);
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j;
        long j2;
        this.f36736 += 8;
        DataInputStream dataInputStream = this.f36737;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f36735;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8);
            j2 = i;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f36735);
            }
            j = (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8);
            j2 = i8;
        }
        return j + j2;
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    public final int length() {
        return this.f36733;
    }
}
