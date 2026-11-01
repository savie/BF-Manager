package l;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶ֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C14923 extends FilterInputStream implements DataInput, InterfaceC20818 {
    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C14923(C6455 c6455) {
        super(c6455);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        int i = C2221.f7996;
        C2221.m6840(this, bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        C2221.m6840(this, bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        return (int) ((FilterInputStream) this).in.skip(i);
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i >= 0) {
            return i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        return C17039.m39816((byte) 0, (byte) 0, m35670(), m35670());
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        byte bM35670 = m35670();
        byte bM35671 = m35670();
        return C17039.m39816(m35670(), m35670(), bM35671, bM35670);
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        byte bM35670 = m35670();
        byte bM35671 = m35670();
        byte bM35672 = m35670();
        byte bM35673 = m35670();
        byte bM35674 = m35670();
        byte bM35675 = m35670();
        return ((((long) bM35671) & 255) << 8) | ((((long) bM35673) & 255) << 24) | ((((long) bM35675) & 255) << 40) | ((((long) m35670()) & 255) << 56) | ((((long) m35670()) & 255) << 48) | ((((long) bM35674) & 255) << 32) | ((((long) bM35672) & 255) << 16) | (((long) bM35670) & 255);
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return readUnsignedByte() != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte m35670() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            return (byte) i;
        }
        throw new EOFException();
    }
}
