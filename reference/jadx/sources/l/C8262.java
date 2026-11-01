package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.UTFDataFormatException;
import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.۠ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TCDV */
/* JADX INFO: loaded from: classes4.dex */
public final class C8262 extends AbstractC8968 implements InterfaceC7556, ObjectInput {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f28721;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f28722;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f28723;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f28724;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.ObjectInput
    public final void close() {
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public C8262(byte[] bArr, int i) {
        this.f28722 = bArr;
        this.f28724 = Math.min(i, bArr.length);
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f28723 = this.f28721;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f28721 = this.f28723;
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public final int available() {
        return this.f28724 - this.f28723;
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public final long skip(long j) {
        int i = this.f28723;
        int i2 = this.f28724;
        if (j <= i2 - i) {
            this.f28723 = i + ((int) j);
            return j;
        }
        long j2 = i2 - i;
        this.f28723 = i2;
        return j2;
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public final int read() {
        int i = this.f28723;
        if (this.f28724 == i) {
            return -1;
        }
        this.f28723 = i + 1;
        return this.f28722[i] & 255;
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f28723;
        int i4 = this.f28724;
        if (i4 == i3) {
            return i2 == 0 ? 0 : -1;
        }
        int iMin = Math.min(i2, i4 - i3);
        System.arraycopy(this.f28722, this.f28723, bArr, i, iMin);
        this.f28723 += iMin;
        return iMin;
    }

    @Override // java.io.InputStream, java.io.ObjectInput
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        return (int) skip(i);
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return read() != 0;
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return (byte) read();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        return read() & 255;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        return (short) ((read() << 8) | (read() & 255));
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        return ((read() & 255) << 8) | (read() & 255);
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) (((read() & 255) << 8) | (read() & 255));
    }

    @Override // java.io.DataInput
    public final int readInt() {
        return (read() << 24) | ((read() & 255) << 16) | ((read() & 255) << 8) | (read() & 255);
    }

    @Override // java.io.DataInput
    public final long readLong() {
        return (((long) readInt()) << 32) | (((long) readInt()) & 4294967295L);
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
    @Deprecated
    public final String readLine() {
        StringBuilder sb = new StringBuilder(99);
        while (true) {
            int i = read();
            int i2 = -1;
            if (i == -1) {
                if (sb.length() == 0) {
                    return null;
                }
                return sb.toString();
            }
            if (i == 10) {
                return sb.toString();
            }
            if (i == 13) {
                long j = this.f28724;
                long j2 = this.f28723;
                if (j > j2) {
                    i2 = this.f28722[(int) (((long) 0) + j2)] & 255;
                }
                if (i2 == 10) {
                    read();
                }
                return sb.toString();
            }
            sb.append((char) i);
        }
    }

    @Override // java.io.DataInput
    public final String readUTF() throws UTFDataFormatException {
        try {
            if (available() > 0) {
                return DataInputStream.readUTF(this);
            }
            return null;
        } catch (UTFDataFormatException e) {
            throw e;
        } catch (IOException e2) {
            throw new UncheckedIOException("readUTF @ " + this, e2);
        }
    }

    @Override // java.io.ObjectInput
    public final Object readObject() throws IOException {
        ObjectInputStream objectInputStream = new ObjectInputStream(this);
        try {
            Object object = objectInputStream.readObject();
            objectInputStream.close();
            return object;
        } catch (Throwable th) {
            try {
                objectInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
