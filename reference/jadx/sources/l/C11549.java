package l;

import java.io.Closeable;
import java.io.DataOutput;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAOU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11549 implements DataOutput, Flushable, Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final OutputStream f36312;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public HashMap f36313 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f36314;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f36315;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f36316;

    public C11549(OutputStream outputStream) {
        C17359.requireNonNull(outputStream);
        this.f36312 = outputStream;
        this.f36314 = new byte[32768];
        this.f36316 = 32768;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29052() throws IOException {
        int i = this.f36315;
        if (i > 0) {
            this.f36312.write(this.f36314, 0, i);
            this.f36315 = 0;
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        m29052();
        this.f36312.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f36312.close();
    }

    @Override // java.io.DataOutput
    public final void write(int i) throws IOException {
        writeByte(i);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f36316;
        if (i3 < i2) {
            m29052();
            this.f36312.write(bArr, i, i2);
        } else {
            if (i3 - this.f36315 < i2) {
                m29052();
            }
            System.arraycopy(bArr, i, this.f36314, this.f36315, i2);
            this.f36315 += i2;
        }
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) throws IOException {
        if (this.f36316 - this.f36315 < str.length() + 2) {
            m29052();
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length > 65535) {
            throw new IOException("Modified UTF-8 length too large: " + bytes.length);
        }
        writeShort(bytes.length);
        write(bytes, 0, bytes.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29053(String str) throws IOException {
        HashMap map = this.f36313;
        Short sh = (Short) map.get(str);
        if (sh != null) {
            writeShort(sh.shortValue());
            return;
        }
        writeShort(65535);
        writeUTF(str);
        map.put(str, Short.valueOf((short) map.size()));
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) throws IOException {
        writeByte(z ? 1 : 0);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) throws IOException {
        if (this.f36316 - this.f36315 < 1) {
            m29052();
        }
        int i2 = this.f36315;
        this.f36315 = i2 + 1;
        this.f36314[i2] = (byte) (i & 255);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) throws IOException {
        if (this.f36316 - this.f36315 < 2) {
            m29052();
        }
        int i2 = this.f36315;
        int i3 = i2 + 1;
        this.f36315 = i3;
        byte[] bArr = this.f36314;
        bArr[i2] = (byte) ((i >> 8) & 255);
        this.f36315 = i2 + 2;
        bArr[i3] = (byte) (i & 255);
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) throws IOException {
        writeShort((short) i);
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) throws IOException {
        if (this.f36316 - this.f36315 < 4) {
            m29052();
        }
        int i2 = this.f36315;
        int i3 = i2 + 1;
        this.f36315 = i3;
        byte[] bArr = this.f36314;
        bArr[i2] = (byte) ((i >> 24) & 255);
        int i4 = i2 + 2;
        this.f36315 = i4;
        bArr[i3] = (byte) ((i >> 16) & 255);
        int i5 = i2 + 3;
        this.f36315 = i5;
        bArr[i4] = (byte) ((i >> 8) & 255);
        this.f36315 = i2 + 4;
        bArr[i5] = (byte) (i & 255);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) throws IOException {
        if (this.f36316 - this.f36315 < 8) {
            m29052();
        }
        int i = (int) (j >> 32);
        int i2 = this.f36315;
        int i3 = i2 + 1;
        this.f36315 = i3;
        byte[] bArr = this.f36314;
        bArr[i2] = (byte) ((i >> 24) & 255);
        int i4 = i2 + 2;
        this.f36315 = i4;
        bArr[i3] = (byte) ((i >> 16) & 255);
        int i5 = i2 + 3;
        this.f36315 = i5;
        bArr[i4] = (byte) ((i >> 8) & 255);
        int i6 = i2 + 4;
        this.f36315 = i6;
        bArr[i5] = (byte) (i & 255);
        int i7 = (int) j;
        int i8 = i2 + 5;
        this.f36315 = i8;
        bArr[i6] = (byte) ((i7 >> 24) & 255);
        int i9 = i2 + 6;
        this.f36315 = i9;
        bArr[i8] = (byte) ((i7 >> 16) & 255);
        int i10 = i2 + 7;
        this.f36315 = i10;
        bArr[i9] = (byte) ((i7 >> 8) & 255);
        this.f36315 = i2 + 8;
        bArr[i10] = (byte) (i7 & 255);
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) throws IOException {
        writeInt(Float.floatToIntBits(f));
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) throws IOException {
        writeLong(Double.doubleToLongBits(d));
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) {
        throw new UnsupportedOperationException();
    }
}
