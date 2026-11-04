package l;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ۢ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: B1QE */
/* JADX INFO: loaded from: classes4.dex */
public final class C9982 extends OutputStream implements InterfaceC2525, ObjectOutput, InterfaceC9236 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f32079;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f32080;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f32081;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.ObjectOutput
    public final void close() {
    }

    public C9982(int i) {
        this.f32079 = new byte[i];
    }

    public C9982() {
        this(16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25824() {
        this.f32081 = 0;
        this.f32080 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25825() {
        byte[] bArr = this.f32079;
        int i = this.f32081;
        if (i < bArr.length) {
            byte[] bArr2 = i == 0 ? C9498.f30777 : new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            bArr = bArr2;
        }
        this.f32079 = bArr;
    }

    @Override // java.io.OutputStream, java.io.ObjectOutput, java.io.DataOutput
    public final void write(int i) {
        int i2 = this.f32080;
        byte[] bArr = this.f32079;
        if (i2 >= bArr.length) {
            this.f32079 = C9498.m24879(i2 + 1, this.f32081, bArr);
        }
        byte[] bArr2 = this.f32079;
        int i3 = this.f32080;
        int i4 = i3 + 1;
        this.f32080 = i4;
        bArr2[i3] = (byte) i;
        if (this.f32081 < i4) {
            this.f32081 = i4;
        }
    }

    public final void position(long j) {
        if (j > 2147483647L) {
            throw new IllegalArgumentException(C24770.m55292(j, "Position too large: "));
        }
        this.f32080 = (int) j;
    }

    @Override // java.io.OutputStream, java.io.ObjectOutput, java.io.DataOutput
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) {
        write(z ? 1 : 0);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) {
        write(i);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) {
        write(i >> 8);
        write(i);
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) {
        write(i >> 8);
        write(i);
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) {
        write(i >> 24);
        write(i >> 16);
        write(i >> 8);
        write(i);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) {
        writeInt((int) (j >> 32));
        writeInt((int) j);
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) {
        writeInt(Float.floatToIntBits(f));
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) {
        writeLong(Double.doubleToLongBits(d));
    }

    @Override // java.io.DataOutput
    @Deprecated
    public final void writeBytes(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            write((byte) str.charAt(i));
        }
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            writeChar(str.charAt(i));
        }
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) {
        int i = this.f32080;
        writeShort(0);
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != 0 && cCharAt < 128) {
                write(cCharAt);
            } else if (cCharAt >= 2048) {
                write(((cCharAt >> '\f') & 15) | BERTags.FLAGS);
                write(((cCharAt >> 6) & 63) | 128);
                write((cCharAt & '?') | 128);
            } else {
                write(((cCharAt >> 6) & 31) | 192);
                write((cCharAt & '?') | 128);
            }
            if (this.f32080 - i > 65537) {
                this.f32080 = i;
                this.f32081 = i;
                throw new IllegalArgumentException(String.format("UTF encoded string too long: %d: %s", Integer.valueOf(str.length()), str.substring(0, 99)));
            }
        }
        int i3 = (this.f32080 - i) - 2;
        byte[] bArr = this.f32079;
        bArr[i] = (byte) (i3 >> 8);
        bArr[i + 1] = (byte) i3;
    }

    @Override // java.io.ObjectOutput
    public final void writeObject(Object obj) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(this);
        try {
            objectOutputStream.writeObject(obj);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Throwable th) {
            try {
                objectOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.ObjectOutput, java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) {
        C18450.m42990(bArr.length, i, i2);
        int i3 = this.f32080;
        int i4 = i3 + i2;
        byte[] bArr2 = this.f32079;
        if (i4 > bArr2.length) {
            this.f32079 = C9498.m24879(i3 + i2, i3, bArr2);
        }
        System.arraycopy(bArr, i, this.f32079, this.f32080, i2);
        int i5 = this.f32080;
        if (i5 + i2 > this.f32081) {
            int i6 = i5 + i2;
            this.f32080 = i6;
            this.f32081 = i6;
        }
    }
}
