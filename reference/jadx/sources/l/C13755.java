package l;

import java.io.IOException;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ܰۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N9T0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13755 implements InterfaceC6366 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f45350 = C13488.m32997(C13755.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f45351;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f45354;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f45355;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f45356;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f45357;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5952 f45358;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f45359;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C17241 f45360;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f45353 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f45361 = new byte[8];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23859 f45352 = null;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            C5952 c5952 = this.f45358;
            if (c5952 != null) {
                try {
                    c5952.m16227();
                    this.f45358 = null;
                } catch (C8484 e) {
                    throw C12303.m30559(e);
                }
            }
            this.f45360.m40201();
        } catch (Throwable th) {
            this.f45360.m40201();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C5952 m33512() {
        C5952 c5952 = this.f45358;
        if (c5952 != null && c5952.m16226()) {
            C5952 c5953 = this.f45358;
            c5953.m16224();
            return c5953;
        }
        C5952 c5952M40192 = this.f45360.m40192(this.f45359, this.f45357, 7, 128, this.f45353);
        c5952M40192.m16224();
        this.f45358 = c5952M40192;
        return c5952M40192;
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) throws C12303 {
        short s = (short) i;
        byte[] bArr = this.f45361;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        write(bArr, 0, 2);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) throws C12303 {
        short s = (short) i;
        byte[] bArr = this.f45361;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        write(bArr, 0, 2);
    }

    public C13755(C17241 c17241) throws C12303 {
        this.f45357 = 0;
        this.f45360 = c17241;
        try {
            C17987 c17987M40191 = c17241.m40191();
            try {
                this.f45359 = 17;
                this.f45357 = 1;
                m33512().m16227();
                this.f45354 = c17987M40191.m41881() - 70;
                this.f45356 = c17987M40191.getSendBufferSize() - 70;
                if (c17987M40191.m41870(16384)) {
                    this.f45355 = true;
                    this.f45354 = Math.min(((C9895) c17987M40191.m41882()).m25084() - 70, c17987M40191.m41873() ? 65465 : 16777145);
                }
                if (c17987M40191.m41870(32768) && !c17987M40191.m41873()) {
                    this.f45356 = Math.min(((C9895) c17987M40191.m41882()).m25059() - 70, 65465);
                }
                this.f45351 = 0L;
                c17987M40191.close();
            } catch (Throwable th) {
                if (c17987M40191 != null) {
                    try {
                        c17987M40191.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (C8484 e) {
            throw C12303.m30559(e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) throws C12303 {
        byte[] bArr = this.f45361;
        C12344.m30664((int) (j & 4294967295L), 4, bArr);
        C12344.m30664((int) ((j >> 32) & 4294967295L), 0, bArr);
        write(bArr, 0, 8);
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) throws C12303 {
        int iFloatToIntBits = Float.floatToIntBits(f);
        byte[] bArr = this.f45361;
        C12344.m30664(iFloatToIntBits, 0, bArr);
        write(bArr, 0, 4);
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) throws C12303 {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        byte[] bArr = this.f45361;
        C12344.m30664((int) (jDoubleToLongBits & 4294967295L), 4, bArr);
        C12344.m30664((int) ((jDoubleToLongBits >> 32) & 4294967295L), 0, bArr);
        write(bArr, 0, 8);
    }

    public final int read(byte[] bArr, int i, int i2) throws C12303 {
        int i3;
        int iM44720;
        byte[] bArr2 = bArr;
        char c = 0;
        if (i2 <= 0) {
            return 0;
        }
        long j = this.f45351;
        try {
            C5952 c5952M33512 = m33512();
            try {
                C17987 c17987M16222 = c5952M33512.m16222();
                try {
                    int i4 = i;
                    C19626 c19626 = new C19626(i4, c17987M16222.m41882(), bArr2);
                    int i5 = i2;
                    while (true) {
                        int i6 = this.f45354;
                        int i7 = i5 > i6 ? i6 : i5;
                        if (c17987M16222.m41875()) {
                            C3813 c3813 = new C3813(c17987M16222.m41882(), c5952M33512.m16229(), bArr2, i4);
                            c3813.m11103(this.f45351);
                            c3813.m11104(i7);
                            c3813.m11105(i5 - i4);
                            try {
                                EnumC19358[] enumC19358Arr = new EnumC19358[1];
                                enumC19358Arr[c] = EnumC19358.NO_RETRY;
                                iM44720 = ((C6636) c17987M16222.m41868(c3813, null, enumC19358Arr)).m17997();
                            } catch (C12303 e) {
                                if (e.m30561() != -1073741807) {
                                    throw e;
                                }
                                f45350.mo12120("Reached end of file", (Exception) e);
                                iM44720 = -1;
                            }
                            i3 = i7;
                        } else {
                            i3 = i7;
                            C8337 c8337 = new C8337(c17987M16222.m41882(), c5952M33512.m16223(), this.f45351, i3);
                            if (this.f45355) {
                                c8337.m21767(i3 & 65535);
                                c8337.m21770(65535 & (i3 >> 16));
                            }
                            try {
                                c17987M16222.m41868(c8337, c19626, EnumC19358.NO_RETRY);
                                iM44720 = c19626.m44720();
                            } catch (C8484 e2) {
                                throw C12303.m30559(e2);
                            }
                        }
                        if (iM44720 <= 0) {
                            long j2 = this.f45351 - j;
                            if (j2 <= 0) {
                                j2 = -1;
                            }
                            int i8 = (int) j2;
                            c17987M16222.close();
                            c5952M33512.m16227();
                            return i8;
                        }
                        this.f45351 += (long) iM44720;
                        i5 -= iM44720;
                        i4 += iM44720;
                        c19626.m44716(iM44720);
                        if (i5 > 0 && iM44720 == i3) {
                            bArr2 = bArr;
                            j = j;
                            c = 0;
                        }
                        int i9 = (int) (this.f45351 - j);
                        c17987M16222.close();
                        c5952M33512.m16227();
                        return i9;
                    }
                } catch (Throwable th) {
                    try {
                        c17987M16222.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c5952M33512.m16227();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (C8484 e3) {
            throw C12303.m30559(e3);
        }
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws C12303 {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws C12303 {
        int i3 = 0;
        do {
            int i4 = read(bArr, i + i3, i2 - i3);
            if (i4 < 0) {
                throw new C0307();
            }
            i3 += i4;
        } while (i3 < i2);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        if (i <= 0) {
            return 0;
        }
        this.f45351 += (long) i;
        return i;
    }

    @Override // java.io.DataOutput
    public final void write(int i) throws C12303 {
        byte[] bArr = this.f45361;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr) throws C12303 {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr, int i, int i2) throws C12303 {
        long jM52588;
        C23859 c23859 = this.f45352;
        if (i2 <= 0) {
            return;
        }
        try {
            C5952 c5952M33512 = m33512();
            try {
                C17987 c17987M16222 = c5952M33512.m16222();
                int i3 = i;
                int i4 = i2;
                do {
                    try {
                        int i5 = this.f45356;
                        int i6 = i4 > i5 ? i5 : i4;
                        if (c17987M16222.m41875()) {
                            C22865 c22865 = new C22865(c17987M16222.m41882(), c5952M33512.m16229());
                            c22865.m50612(this.f45351);
                            c22865.m50614((i4 - i6) - i3);
                            c22865.m50613(i3, i6, bArr);
                            jM52588 = ((C15104) c17987M16222.m41868(c22865, null, EnumC19358.NO_RETRY)).m36180();
                        } else {
                            c17987M16222.m41868(new C11159(c17987M16222.m41882(), c5952M33512.m16223(), this.f45351, (i4 - i6) - i3, bArr, i3, i6), c23859, EnumC19358.NO_RETRY);
                            jM52588 = c23859.m52588();
                        }
                        this.f45351 += jM52588;
                        i4 = (int) (((long) i4) - jM52588);
                        i3 = (int) (((long) i3) + jM52588);
                    } catch (Throwable th) {
                        try {
                            c17987M16222.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } while (i4 > 0);
                c17987M16222.close();
                c5952M33512.m16227();
            } catch (Throwable th3) {
                try {
                    c5952M33512.m16227();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (C8484 e) {
            throw C12303.m30559(e);
        }
    }

    public final void seek(long j) {
        this.f45351 = j;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() throws C0307 {
        byte[] bArr = this.f45361;
        if (read(bArr, 0, 1) >= 0) {
            return bArr[0] != 0;
        }
        throw new C0307();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws C0307 {
        byte[] bArr = this.f45361;
        if (read(bArr, 0, 1) < 0) {
            throw new C0307();
        }
        return bArr[0];
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws C0307 {
        byte[] bArr = this.f45361;
        if (read(bArr, 0, 1) < 0) {
            throw new C0307();
        }
        return bArr[0] & 255;
    }

    @Override // java.io.DataInput
    public final short readShort() throws C0307 {
        byte[] bArr = this.f45361;
        if (read(bArr, 0, 2) < 0) {
            throw new C0307();
        }
        return C12344.m30663(0, bArr);
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws C0307 {
        byte[] bArr = this.f45361;
        if (read(bArr, 0, 2) < 0) {
            throw new C0307();
        }
        return C12344.m30663(0, bArr) & HPKE.aead_EXPORT_ONLY;
    }

    @Override // java.io.DataInput
    public final char readChar() throws C0307 {
        byte[] bArr = this.f45361;
        if (read(bArr, 0, 2) < 0) {
            throw new C0307();
        }
        return (char) C12344.m30663(0, bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws C0307 {
        byte[] bArr = this.f45361;
        if (read(bArr, 0, 4) < 0) {
            throw new C0307();
        }
        return C12344.m30666(0, bArr);
    }

    @Override // java.io.DataInput
    public final long readLong() throws C0307 {
        byte[] bArr = this.f45361;
        if (read(bArr, 0, 8) >= 0) {
            return (((long) C12344.m30666(4, bArr)) & 4294967295L) | ((((long) C12344.m30666(0, bArr)) & 4294967295L) << 32);
        }
        throw new C0307();
    }

    @Override // java.io.DataInput
    public final float readFloat() throws C0307 {
        byte[] bArr = this.f45361;
        if (read(bArr, 0, 4) >= 0) {
            return Float.intBitsToFloat(C12344.m30666(0, bArr));
        }
        throw new C0307();
    }

    @Override // java.io.DataInput
    public final double readDouble() throws C0307 {
        byte[] bArr = this.f45361;
        if (read(bArr, 0, 8) >= 0) {
            return Double.longBitsToDouble((((long) C12344.m30666(4, bArr)) & 4294967295L) | ((((long) C12344.m30666(0, bArr)) & 4294967295L) << 32));
        }
        throw new C0307();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        int i = -1;
        while (!z) {
            byte[] bArr = this.f45361;
            int i2 = read(bArr, 0, 1) == -1 ? -1 : bArr[0] & 255;
            if (i2 == -1 || i2 == 10) {
                z = true;
            } else if (i2 == 13) {
                long j = this.f45351;
                if ((read(bArr, 0, 1) == -1 ? -1 : bArr[0] & 255) != 10) {
                    this.f45351 = j;
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
    public final String readUTF() throws C12303 {
        int unsignedShort = readUnsignedShort();
        byte[] bArr = new byte[unsignedShort];
        read(bArr, 0, unsignedShort);
        try {
            return C12344.m30665(unsignedShort, bArr);
        } catch (IOException e) {
            throw new C12303("", e);
        }
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) throws C12303 {
        byte b = z ? (byte) 1 : (byte) 0;
        byte[] bArr = this.f45361;
        bArr[0] = b;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) throws C12303 {
        byte[] bArr = this.f45361;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) throws C12303 {
        byte[] bArr = this.f45361;
        C12344.m30664(i, 0, bArr);
        write(bArr, 0, 4);
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) throws C12303 {
        byte[] bytes = str.getBytes();
        write(bytes, 0, bytes.length);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) throws C12303 {
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
    public final void writeUTF(String str) throws C12303 {
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
