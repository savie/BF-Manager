package l;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֫ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2LU */
/* JADX INFO: loaded from: classes3.dex */
public final class C2037 extends FilterInputStream implements DataInput, InterfaceC8469 {
    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C2037(C13223 c13223) {
        super(c13223);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte m7008() throws IOException {
        InputStream inputStream = ((FilterInputStream) this).in;
        C17359.requireNonNull(inputStream);
        int i = inputStream.read();
        if (i != -1) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws IOException {
        InputStream inputStream = ((FilterInputStream) this).in;
        C17359.requireNonNull(inputStream);
        int i = inputStream.read();
        if (i >= 0) {
            return i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        InputStream inputStream = ((FilterInputStream) this).in;
        C17359.requireNonNull(inputStream);
        return (int) inputStream.skip(i);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        int i = C5020.f17412;
        C5020.m15247(this, bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        C5020.m15247(this, bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        return C18444.m42968((byte) 0, (byte) 0, m7008(), m7008());
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        byte bM7008 = m7008();
        byte bM7009 = m7008();
        return C18444.m42968(m7008(), m7008(), bM7009, bM7008);
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        byte bM7008 = m7008();
        byte bM7009 = m7008();
        byte bM70010 = m7008();
        byte bM70011 = m7008();
        byte bM70012 = m7008();
        byte bM70013 = m7008();
        return ((((long) bM7009) & 255) << 8) | ((((long) bM70011) & 255) << 24) | ((((long) bM70013) & 255) << 40) | ((((long) m7008()) & 255) << 56) | ((((long) m7008()) & 255) << 48) | ((((long) bM70012) & 255) << 32) | ((((long) bM70010) & 255) << 16) | (((long) bM7008) & 255);
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
        InputStream inputStream = ((FilterInputStream) this).in;
        C17359.requireNonNull(inputStream);
        return new DataInputStream(inputStream).readUTF();
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
}
