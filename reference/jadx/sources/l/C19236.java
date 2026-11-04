package l;

import java.io.IOException;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ᩳܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N9T0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19236 implements InterfaceC20794 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f62226 = C16980.m40037(C19236.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C6558 f62227;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f62228;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f62229;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f62230;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f62234;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f62235;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f62236;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12523 f62237;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f62233 = 0;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f62232 = new byte[8];

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C24634 f62231 = null;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            C6558 c6558 = this.f62227;
            if (c6558 != null) {
                try {
                    c6558.m18470();
                    this.f62227 = null;
                } catch (C20048 e) {
                    throw C20728.m47406(e);
                }
            }
            this.f62237.m31106();
        } catch (Throwable th) {
            this.f62237.m31106();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C6558 m44566() {
        C6558 c6558 = this.f62227;
        if (c6558 != null && c6558.m18466()) {
            C6558 c6559 = this.f62227;
            c6559.m18465();
            return c6559;
        }
        C6558 c6558M31087 = this.f62237.m31087(this.f62236, this.f62234, 7, 128, this.f62233);
        c6558M31087.m18465();
        this.f62227 = c6558M31087;
        return c6558M31087;
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) throws C20728 {
        short s = (short) i;
        byte[] bArr = this.f62232;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        write(bArr, 0, 2);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) throws C20728 {
        short s = (short) i;
        byte[] bArr = this.f62232;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        write(bArr, 0, 2);
    }

    public C19236(C12523 c12523) throws C20728 {
        this.f62234 = 0;
        this.f62237 = c12523;
        try {
            C19457 c19457M31099 = c12523.m31099();
            try {
                this.f62236 = 17;
                this.f62234 = 1;
                m44566().m18470();
                this.f62228 = c19457M31099.m44981() - 70;
                this.f62229 = c19457M31099.getSendBufferSize() - 70;
                if (c19457M31099.m44973(16384)) {
                    this.f62230 = true;
                    this.f62228 = Math.min(((C14826) c19457M31099.m44979()).m35714() - 70, c19457M31099.m44984() ? 65465 : 16777145);
                }
                if (c19457M31099.m44973(32768) && !c19457M31099.m44984()) {
                    this.f62229 = Math.min(((C14826) c19457M31099.m44979()).m35711() - 70, 65465);
                }
                this.f62235 = 0L;
                c19457M31099.close();
            } catch (Throwable th) {
                if (c19457M31099 != null) {
                    try {
                        c19457M31099.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C20048 e) {
            throw C20728.m47406(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) throws C20728 {
        byte[] bArr = this.f62232;
        C20203.m46469((int) (j & 4294967295L), 4, bArr);
        C20203.m46469((int) ((j >> 32) & 4294967295L), 0, bArr);
        write(bArr, 0, 8);
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) throws C20728 {
        int iFloatToIntBits = Float.floatToIntBits(f);
        byte[] bArr = this.f62232;
        C20203.m46469(iFloatToIntBits, 0, bArr);
        write(bArr, 0, 4);
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) throws C20728 {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        byte[] bArr = this.f62232;
        C20203.m46469((int) (jDoubleToLongBits & 4294967295L), 4, bArr);
        C20203.m46469((int) ((jDoubleToLongBits >> 32) & 4294967295L), 0, bArr);
        write(bArr, 0, 8);
    }

    public final int read(byte[] bArr, int i, int i2) throws C20728 {
        int i3;
        int iM33089;
        byte[] bArr2 = bArr;
        char c = 0;
        if (i2 <= 0) {
            return 0;
        }
        long j = this.f62235;
        try {
            C6558 c6558M44566 = m44566();
            try {
                C19457 c19457M18468 = c6558M44566.m18468();
                try {
                    int i4 = i;
                    C13445 c13445 = new C13445(i4, c19457M18468.m44979(), bArr2);
                    int i5 = i2;
                    while (true) {
                        int i6 = this.f62228;
                        int i7 = i5 > i6 ? i6 : i5;
                        if (c19457M18468.m44978()) {
                            C6888 c6888 = new C6888(c19457M18468.m44979(), c6558M44566.m18469(), bArr2, i4);
                            c6888.m19152(this.f62235);
                            c6888.m19150(i7);
                            c6888.m19151(i5 - i4);
                            try {
                                EnumC13269[] enumC13269Arr = new EnumC13269[1];
                                enumC13269Arr[c] = EnumC13269.NO_RETRY;
                                iM33089 = ((C13599) c19457M18468.m44971(c6888, null, enumC13269Arr)).m33334();
                            } catch (C20728 e) {
                                if (e.m47408() != -1073741807) {
                                    throw e;
                                }
                                f62226.mo13711("Reached end of file", e);
                                iM33089 = -1;
                            }
                            i3 = i7;
                        } else {
                            i3 = i7;
                            C15682 c15682 = new C15682(c19457M18468.m44979(), c6558M44566.m18467(), this.f62235, i3);
                            if (this.f62230) {
                                c15682.m37458(i3 & 65535);
                                c15682.m37461(65535 & (i3 >> 16));
                            }
                            try {
                                c19457M18468.m44971(c15682, c13445, EnumC13269.NO_RETRY);
                                iM33089 = c13445.m33089();
                            } catch (C20048 e2) {
                                throw C20728.m47406(e2);
                            }
                        }
                        if (iM33089 <= 0) {
                            long j2 = this.f62235 - j;
                            if (j2 <= 0) {
                                j2 = -1;
                            }
                            int i8 = (int) j2;
                            c19457M18468.close();
                            c6558M44566.m18470();
                            return i8;
                        }
                        this.f62235 += (long) iM33089;
                        i5 -= iM33089;
                        i4 += iM33089;
                        c13445.m33086(iM33089);
                        if (i5 > 0 && iM33089 == i3) {
                            bArr2 = bArr;
                            j = j;
                            c = 0;
                        }
                        int i9 = (int) (this.f62235 - j);
                        c19457M18468.close();
                        c6558M44566.m18470();
                        return i9;
                    }
                } catch (Throwable th) {
                    try {
                        c19457M18468.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c6558M44566.m18470();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (C20048 e3) {
            throw C20728.m47406(e3);
        }
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws C20728 {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws C20728 {
        int i3 = 0;
        do {
            int i4 = read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                throw new C23712();
            }
            i3 += i4;
        } while (i3 < i2);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        if (i <= 0) {
            return 0;
        }
        this.f62235 += (long) i;
        return i;
    }

    @Override // java.io.DataOutput
    public final void write(int i) throws C20728 {
        byte[] bArr = this.f62232;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr) throws C20728 {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) throws C20728 {
        long jM54971;
        C24634 c24634 = this.f62231;
        if (i2 <= 0) {
            return;
        }
        try {
            C6558 c6558M44566 = m44566();
            try {
                C19457 c19457M18468 = c6558M44566.m18468();
                int i3 = i;
                int i4 = i2;
                do {
                    try {
                        int i5 = this.f62229;
                        int i6 = i4 > i5 ? i5 : i4;
                        if (c19457M18468.m44978()) {
                            C4956 c4956 = new C4956(c19457M18468.m44979(), c6558M44566.m18469());
                            c4956.m15160(this.f62235);
                            c4956.m15158((i4 - i6) - i3);
                            c4956.m15159(i3, i6, bArr);
                            jM54971 = ((C22110) c19457M18468.m44971(c4956, null, EnumC13269.NO_RETRY)).m50065();
                        } else {
                            c19457M18468.m44971(new C6734(c19457M18468.m44979(), c6558M44566.m18467(), this.f62235, (i4 - i6) - i3, bArr, i3, i6), c24634, EnumC13269.NO_RETRY);
                            jM54971 = c24634.m54971();
                        }
                        this.f62235 += jM54971;
                        i4 = (int) (((long) i4) - jM54971);
                        i3 = (int) (((long) i3) + jM54971);
                    } catch (Throwable th) {
                        try {
                            c19457M18468.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } while (i4 > 0);
                c19457M18468.close();
                c6558M44566.m18470();
            } catch (Throwable th3) {
                try {
                    c6558M44566.m18470();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (C20048 e) {
            throw C20728.m47406(e);
        }
    }

    public final void seek(long j) {
        this.f62235 = j;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() throws C23712 {
        byte[] bArr = this.f62232;
        if (read(bArr, 0, 1) >= 0) {
            return bArr[0] != 0;
        }
        throw new C23712();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws C23712 {
        byte[] bArr = this.f62232;
        if (read(bArr, 0, 1) < 0) {
            throw new C23712();
        }
        return bArr[0];
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws C23712 {
        byte[] bArr = this.f62232;
        if (read(bArr, 0, 1) < 0) {
            throw new C23712();
        }
        return bArr[0] & 255;
    }

    @Override // java.io.DataInput
    public final short readShort() throws C23712 {
        byte[] bArr = this.f62232;
        if (read(bArr, 0, 2) < 0) {
            throw new C23712();
        }
        return C20203.m46468(0, bArr);
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws C23712 {
        byte[] bArr = this.f62232;
        if (read(bArr, 0, 2) < 0) {
            throw new C23712();
        }
        return C20203.m46468(0, bArr) & HPKE.aead_EXPORT_ONLY;
    }

    @Override // java.io.DataInput
    public final char readChar() throws C23712 {
        byte[] bArr = this.f62232;
        if (read(bArr, 0, 2) < 0) {
            throw new C23712();
        }
        return (char) C20203.m46468(0, bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws C23712 {
        byte[] bArr = this.f62232;
        if (read(bArr, 0, 4) < 0) {
            throw new C23712();
        }
        return C20203.m46470(0, bArr);
    }

    @Override // java.io.DataInput
    public final long readLong() throws C23712 {
        byte[] bArr = this.f62232;
        if (read(bArr, 0, 8) >= 0) {
            return (((long) C20203.m46470(4, bArr)) & 4294967295L) | ((((long) C20203.m46470(0, bArr)) & 4294967295L) << 32);
        }
        throw new C23712();
    }

    @Override // java.io.DataInput
    public final float readFloat() throws C23712 {
        byte[] bArr = this.f62232;
        if (read(bArr, 0, 4) >= 0) {
            return Float.intBitsToFloat(C20203.m46470(0, bArr));
        }
        throw new C23712();
    }

    @Override // java.io.DataInput
    public final double readDouble() throws C23712 {
        byte[] bArr = this.f62232;
        if (read(bArr, 0, 8) >= 0) {
            return Double.longBitsToDouble((((long) C20203.m46470(4, bArr)) & 4294967295L) | ((((long) C20203.m46470(0, bArr)) & 4294967295L) << 32));
        }
        throw new C23712();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        int i = -1;
        while (!z) {
            byte[] bArr = this.f62232;
            int i2 = read(bArr, 0, 1) == -1 ? -1 : bArr[0] & 255;
            if (i2 == -1 || i2 == 10) {
                z = true;
            } else if (i2 == 13) {
                long j = this.f62235;
                if ((read(bArr, 0, 1) == -1 ? -1 : bArr[0] & 255) != 10) {
                    this.f62235 = j;
                }
                z = true;
            } else {
                stringBuffer.append((char) i2);
            }
            i = i2;
        }
        if (i == -1 && stringBuffer.length() == 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    @Override // java.io.DataInput
    public final String readUTF() throws C20728 {
        int unsignedShort = readUnsignedShort();
        byte[] bArr = new byte[unsignedShort];
        read(bArr, 0, unsignedShort);
        try {
            return C20203.m46471(unsignedShort, bArr);
        } catch (IOException e) {
            throw new C20728("", e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) throws C20728 {
        byte b = z ? (byte) 1 : (byte) 0;
        byte[] bArr = this.f62232;
        bArr[0] = b;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) throws C20728 {
        byte[] bArr = this.f62232;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) throws C20728 {
        byte[] bArr = this.f62232;
        C20203.m46469(i, 0, bArr);
        write(bArr, 0, 4);
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) throws C20728 {
        byte[] bytes = str.getBytes();
        write(bytes, 0, bytes.length);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) throws C20728 {
        int length = str.length();
        int i = length * 2;
        byte[] bArr = new byte[i];
        char[] cArr = new char[length];
        str.getChars(0, length, cArr, 0);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i2 + 1;
            char c = cArr[i3];
            bArr[i2] = (byte) (c >>> '\b');
            i2 += 2;
            bArr[i4] = (byte) c;
        }
        write(bArr, 0, i);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) throws C20728 {
        int i;
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 2;
            i = 3;
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 127) {
                i4 = 1;
            } else if (cCharAt > 2047) {
                i4 = 3;
            }
            i3 += i4;
            i2++;
        }
        byte[] bArr = new byte[i3];
        writeShort(i3);
        int length2 = str.length();
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3 && i6 < length2) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                bArr[i5] = (byte) cCharAt2;
                i5++;
            } else if (cCharAt2 > 2047) {
                if (i3 - i5 < i) {
                    break;
                }
                bArr[i5] = (byte) (((cCharAt2 >> '\f') & 15) | BERTags.FLAGS);
                int i7 = i5 + 2;
                bArr[i5 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                i5 += 3;
                bArr[i7] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if (i3 - i5 < 2) {
                    break;
                }
                int i8 = i5 + 1;
                bArr[i5] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                i5 += 2;
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
            }
            i6++;
            i = 3;
        }
        write(bArr, 0, i3);
    }
}
