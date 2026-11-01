package l;

import java.io.Closeable;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ᩳۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AO5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18031 implements DataInput, Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f57645;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InputStream f57647;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] f57648;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f57649;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f57651;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f57650 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String[] f57646 = new String[32];

    public C18031(InputStream inputStream) {
        C13638.requireNonNull(inputStream);
        this.f57647 = inputStream;
        this.f57648 = new byte[32768];
        this.f57651 = 32768;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41981(int i) throws IOException {
        int i2 = this.f57645;
        int i3 = this.f57649;
        int i4 = i2 - i3;
        byte[] bArr = this.f57648;
        System.arraycopy(bArr, i3, bArr, 0, i4);
        this.f57649 = 0;
        this.f57645 = i4;
        while (true) {
            i -= i4;
            if (i <= 0) {
                return;
            }
            int i5 = this.f57645;
            i4 = this.f57647.read(bArr, i5, this.f57651 - i5);
            if (i4 == -1) {
                throw new EOFException();
            }
            this.f57645 += i4;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f57647.close();
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f57651;
        byte[] bArr2 = this.f57648;
        if (i3 >= i2) {
            if (this.f57645 - this.f57649 < i2) {
                m41981(i2);
            }
            System.arraycopy(bArr2, this.f57649, bArr, i, i2);
            this.f57649 += i2;
            return;
        }
        int i4 = this.f57645;
        int i5 = this.f57649;
        int i6 = i4 - i5;
        System.arraycopy(bArr2, i5, bArr, i, i6);
        this.f57649 += i6;
        do {
            i += i6;
            i2 -= i6;
            if (i2 <= 0) {
                return;
            } else {
                i6 = this.f57647.read(bArr, i, i2);
            }
        } while (i6 != -1);
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() throws IOException {
        int unsignedShort = readUnsignedShort();
        if (this.f57651 >= unsignedShort) {
            if (this.f57645 - this.f57649 < unsignedShort) {
                m41981(unsignedShort);
            }
            String str = new String(this.f57648, this.f57649, unsignedShort, StandardCharsets.UTF_8);
            this.f57649 += unsignedShort;
            return str;
        }
        byte[] bArr = new byte[unsignedShort];
        readFully(bArr, 0, unsignedShort);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m41983() throws IOException {
        int unsignedShort = readUnsignedShort();
        if (unsignedShort == 65535) {
            String utf = readUTF();
            int i = this.f57650;
            if (i < 65535) {
                String[] strArr = this.f57646;
                if (i == strArr.length) {
                    this.f57646 = (String[]) Arrays.copyOf(strArr, i + (i >> 1));
                }
                String[] strArr2 = this.f57646;
                int i2 = this.f57650;
                this.f57650 = i2 + 1;
                strArr2[i2] = utf;
            }
            return utf;
        }
        return this.f57646[unsignedShort];
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return readByte() != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m41982() throws IOException {
        if (this.f57645 - this.f57649 < 1) {
            m41981(1);
        }
        return this.f57648[this.f57649];
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        if (this.f57645 - this.f57649 < 1) {
            m41981(1);
        }
        int i = this.f57649;
        this.f57649 = i + 1;
        return this.f57648[i];
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        return readByte() & 255;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        if (this.f57645 - this.f57649 < 2) {
            m41981(2);
        }
        int i = this.f57649;
        int i2 = i + 1;
        this.f57649 = i2;
        byte[] bArr = this.f57648;
        int i3 = (bArr[i] & 255) << 8;
        this.f57649 = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        return readShort() & HPKE.aead_EXPORT_ONLY;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) readShort();
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        if (this.f57645 - this.f57649 < 4) {
            m41981(4);
        }
        int i = this.f57649;
        int i2 = i + 1;
        this.f57649 = i2;
        byte[] bArr = this.f57648;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f57649 = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f57649 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f57649 = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        if (this.f57645 - this.f57649 < 8) {
            m41981(8);
        }
        int i = this.f57649;
        int i2 = i + 1;
        this.f57649 = i2;
        byte[] bArr = this.f57648;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f57649 = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f57649 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i + 4;
        this.f57649 = i8;
        int i9 = i7 | (bArr[i6] & 255);
        int i10 = i + 5;
        this.f57649 = i10;
        int i11 = (bArr[i8] & 255) << 24;
        int i12 = i + 6;
        this.f57649 = i12;
        int i13 = ((bArr[i10] & 255) << 16) | i11;
        int i14 = i + 7;
        this.f57649 = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f57649 = i + 8;
        return (((long) i9) << 32) | (((long) ((bArr[i14] & 255) | i15)) & 4294967295L);
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
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException();
    }
}
