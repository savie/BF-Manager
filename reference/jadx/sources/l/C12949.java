package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.۬ۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: J71B */
/* JADX INFO: loaded from: classes3.dex */
public final class C12949 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final String[] f43037 = new String[0];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f43038;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f43039;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f43040;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f43041;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f43042;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long[] f43043;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f43044 = new byte[1024];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f43045;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f43046;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f43047;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f43048;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f43049;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f43050;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f43051;

    public C12949(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f43047 = j;
        this.f43051 = j2;
        this.f43048 = j3;
        this.f43049 = j4;
        this.f43046 = j5;
        this.f43041 = j6;
        this.f43042 = j7;
        this.f43039 = j8;
        this.f43040 = j9;
        this.f43045 = j10;
        this.f43038 = j11;
        this.f43050 = j12;
        if (j4 > 2147483647L) {
            throw new IllegalArgumentException("Too many boot hierarchy types");
        }
        this.f43043 = new long[(int) j4];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12949 m32083(File file) throws IOException {
        if (!file.isFile() || file.length() != 3415240) {
            throw new IOException("Boot hierarchy raw file size mismatch");
        }
        byte[] bArr = new byte[208];
        MessageDigest messageDigestM49421 = C22253.m49421();
        MessageDigest messageDigestM49422 = C22253.m49421();
        FileInputStream fileInputStream = new FileInputStream(file);
        int i = 0;
        while (i < 208) {
            try {
                int i2 = fileInputStream.read(bArr, i, 208 - i);
                if (i2 < 0) {
                    throw new IOException("Truncated boot hierarchy header");
                }
                i += i2;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        messageDigestM49421.update(bArr);
        byte[] bArr2 = new byte[32768];
        while (true) {
            int i3 = fileInputStream.read(bArr2);
            if (i3 == -1) {
                break;
            }
            messageDigestM49421.update(bArr2, 0, i3);
            messageDigestM49422.update(bArr2, 0, i3);
        }
        fileInputStream.close();
        if (!"bacb8cb4bb4a4c60edf467ff9d5a56aff4b5bb36e37bbd08e3b0e162efede5fc".equals(C22253.m49424(messageDigestM49421.digest()))) {
            throw new IOException("Boot hierarchy raw checksum mismatch");
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        if (byteBufferOrder.get() != 77 || byteBufferOrder.get() != 84 || byteBufferOrder.get() != 66 || byteBufferOrder.get() != 72 || (byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY) != 1 || (byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY) != 208 || byteBufferOrder.getInt() != 16909060 || (((long) byteBufferOrder.getInt()) & 4294967295L) != 36 || (((long) byteBufferOrder.getInt()) & 4294967295L) != 1) {
            throw new IOException("Invalid boot hierarchy header");
        }
        if (byteBufferOrder.getInt() != 0) {
            throw new IOException("Unsupported boot hierarchy flags");
        }
        long j = ((long) byteBufferOrder.getInt()) & 4294967295L;
        long j2 = ((long) byteBufferOrder.getInt()) & 4294967295L;
        long j3 = ((long) byteBufferOrder.getInt()) & 4294967295L;
        long j4 = ((long) byteBufferOrder.getInt()) & 4294967295L;
        long j5 = ((long) byteBufferOrder.getInt()) & 4294967295L;
        if (byteBufferOrder.getInt() != 0 || j2 > j) {
            throw new IOException("Invalid boot hierarchy counts");
        }
        long[] jArr = new long[6];
        long[] jArr2 = new long[6];
        for (int i4 = 0; i4 < 6; i4++) {
            jArr[i4] = byteBufferOrder.getLong();
            jArr2[i4] = byteBufferOrder.getLong();
        }
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[32];
        byteBufferOrder.get(bArr3);
        byteBufferOrder.get(bArr4);
        if (!"d9eb9da824d9e247a352f570f01e1169e725b2954bca9e283a71786c59b59f9a".equals(C22253.m49424(bArr3)) || !"b2e82096748c00fa60056e7affddea44002d3a0e44201dc814dff202cdfc0e95".equals(C22253.m49424(bArr4)) || !"b2e82096748c00fa60056e7affddea44002d3a0e44201dc814dff202cdfc0e95".equals(C22253.m49424(messageDigestM49422.digest()))) {
            throw new IOException("Boot hierarchy payload identity mismatch");
        }
        long[] jArr3 = {jArr2[0], m32079(12, j), m32079(16, j2), m32079(4, j3), m32079(20, j4), m32079(8, j5)};
        int i5 = 1;
        for (int i6 = 6; i5 < i6; i6 = 6) {
            if (jArr2[i5] != jArr3[i5]) {
                throw new IOException("Invalid boot hierarchy section length");
            }
            i5++;
        }
        int i7 = 0;
        long j6 = 208;
        while (i7 < 6) {
            long j7 = jArr[i7];
            long j8 = jArr2[i7];
            long length = file.length();
            if (j7 >= 208 && j8 >= 0 && j7 <= length && j8 <= length - j7) {
                long j9 = j7 + j8;
                long j10 = jArr[i7];
                if ((j10 & 7) != 0 || j10 < j6) {
                    throw new IOException("Overlapping boot hierarchy sections");
                }
                i7++;
                j6 = j9;
            } else {
                throw new IOException("Invalid boot hierarchy section range");
            }
        }
        if (j6 != file.length()) {
            throw new IOException("Trailing boot hierarchy data");
        }
        file.length();
        C12949 c12949 = new C12949(jArr[0], jArr2[0], jArr[1], j, jArr[2], j2, jArr[3], j3, jArr[4], j4, jArr[5], j5);
        byte[] bArr5 = c12949.f43044;
        long[] jArr4 = c12949.f43043;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        for (int i8 = 0; i8 < jArr4.length; i8++) {
            try {
                randomAccessFile.seek((((long) i8) * 12) + c12949.f43048);
                long jM32080 = m32080(randomAccessFile);
                long jM32081 = m32080(randomAccessFile);
                c12949.m32084(jM32080, jM32081);
                randomAccessFile.seek(c12949.f43047 + jM32080);
                long j11 = -3750763034362895579L;
                while (jM32081 > 0) {
                    int iMin = (int) Math.min(bArr5.length, jM32081);
                    randomAccessFile.readFully(bArr5, 0, iMin);
                    for (int i9 = 0; i9 < iMin; i9++) {
                        j11 = (j11 ^ ((long) (bArr5[i9] & 255))) * 1099511628211L;
                    }
                    jM32081 -= (long) iMin;
                }
                jArr4[i8] = j11;
            } catch (Throwable th3) {
                try {
                    randomAccessFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        randomAccessFile.close();
        Arrays.sort(jArr4);
        return c12949;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0192 A[EDGE_INSN: B:76:0x0192->B:77:0x0193 BREAK  A[LOOP:2: B:57:0x0148->B:64:0x0169]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11538 m32085(RandomAccessFile randomAccessFile, String str, String str2) throws IOException {
        String[] strArr;
        int unsignedByte;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length <= 1048576) {
            long j = -3750763034362895579L;
            for (byte b : bytes) {
                j = (j ^ ((long) (b & 255))) * 1099511628211L;
            }
            if (Arrays.binarySearch(this.f43043, j) >= 0) {
                long jM32081 = m32081(randomAccessFile, bytes, this.f43048, this.f43049, 12);
                long j2 = 0;
                if (jM32081 < 0) {
                    return C11538.f38771;
                }
                randomAccessFile.seek(C7309.m19505(jM32081, 12L, this.f43048, 8L));
                long jM32080 = m32080(randomAccessFile);
                if (jM32080 == 4294967295L) {
                    return C11538.f38771;
                }
                if (jM32080 >= this.f43041) {
                    throw new IOException("Invalid boot hierarchy class index");
                }
                randomAccessFile.seek((jM32080 * 16) + this.f43046);
                if (m32080(randomAccessFile) != jM32081) {
                    throw new IOException("Boot hierarchy class/type mismatch");
                }
                long jM32082 = m32080(randomAccessFile);
                long jM32083 = m32080(randomAccessFile);
                int iReverseBytes = Short.reverseBytes(randomAccessFile.readShort()) & HPKE.aead_EXPORT_ONLY;
                int unsignedByte2 = randomAccessFile.readUnsignedByte();
                if (randomAccessFile.readUnsignedByte() == 0 && (unsignedByte2 & (-2)) == 0) {
                    long j3 = this.f43039;
                    if (jM32083 <= j3 && iReverseBytes <= j3 - jM32083) {
                        String strM32082 = jM32082 == 4294967295L ? null : m32082(randomAccessFile, jM32082);
                        if (iReverseBytes == 0) {
                            strArr = f43037;
                        } else {
                            strArr = new String[iReverseBytes];
                        }
                        String[] strArr2 = strArr;
                        for (int i = 0; i < iReverseBytes; i++) {
                            randomAccessFile.seek(((((long) i) + jM32083) * 4) + this.f43042);
                            strArr2[i] = m32082(randomAccessFile, m32080(randomAccessFile));
                        }
                        char c = 1;
                        if (str2.length() > 1048576) {
                            unsignedByte = -1;
                            break;
                        }
                        byte[] bytes2 = str2.getBytes(StandardCharsets.UTF_8);
                        if (bytes2.length > 1048576) {
                            unsignedByte = -1;
                            break;
                        }
                        long jM32084 = m32081(randomAccessFile, bytes2, this.f43040, this.f43045, 20);
                        if (jM32084 < 0) {
                            unsignedByte = -1;
                            break;
                        }
                        randomAccessFile.seek(C7309.m19505(jM32084, 20L, this.f43040, 8L));
                        long jReverseBytes = Long.reverseBytes(randomAccessFile.readLong());
                        long jM32085 = m32080(randomAccessFile);
                        if (jReverseBytes >= 0 && jReverseBytes % 8 == 0) {
                            long j4 = this.f43050;
                            if (jReverseBytes <= j4 * 8 && jM32085 <= j4 - (jReverseBytes / 8)) {
                                long j5 = jM32085 - 1;
                                while (true) {
                                    if (j2 > j5) {
                                        unsignedByte = -1;
                                        break;
                                    }
                                    long j6 = (j2 + j5) >>> c;
                                    randomAccessFile.seek((j6 * 8) + this.f43038 + jReverseBytes);
                                    long jM32086 = m32080(randomAccessFile);
                                    if (jM32086 >= jM32081) {
                                        if (jM32086 <= jM32081) {
                                            unsignedByte = randomAccessFile.readUnsignedByte();
                                            if (randomAccessFile.readUnsignedByte() == 0 && randomAccessFile.readUnsignedByte() == 0 && randomAccessFile.readUnsignedByte() == 0) {
                                                break;
                                            }
                                            throw new IOException("Invalid boot hierarchy posting record");
                                        }
                                        j5 = j6 - 1;
                                    } else {
                                        j2 = j6 + 1;
                                    }
                                    c = 1;
                                }
                            }
                        }
                        throw new IOException("Invalid boot hierarchy posting range");
                        boolean z = unsignedByte >= 0;
                        int i2 = !z ? 0 : unsignedByte;
                        if (!C23450.m51672(i2)) {
                            throw new IOException("Invalid boot hierarchy method flags");
                        }
                        return C11538.m28712(new C13655(strM32082, strArr2, unsignedByte2, i2, z));
                    }
                }
                throw new IOException("Invalid boot hierarchy class record");
            }
        }
        return C11538.f38771;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m32081(RandomAccessFile randomAccessFile, byte[] bArr, long j, long j2, int i) throws IOException {
        long j3;
        long j4;
        int iCompare;
        long j5;
        long j6 = j2 - 1;
        long j7 = 0;
        while (j7 <= j6) {
            long j8 = (j7 + j6) >>> 1;
            randomAccessFile.seek((((long) i) * j8) + j);
            long jM32080 = m32080(randomAccessFile);
            long jM32081 = m32080(randomAccessFile);
            m32084(jM32080, jM32081);
            long jMin = Math.min(jM32081, bArr.length);
            long j9 = j6;
            randomAccessFile.seek(this.f43047 + jM32080);
            long j10 = 0;
            while (true) {
                if (j10 < jMin) {
                    byte[] bArr2 = this.f43044;
                    j3 = j7;
                    j4 = j8;
                    int iMin = (int) Math.min(bArr2.length, jMin - j10);
                    randomAccessFile.readFully(bArr2, 0, iMin);
                    for (int i2 = 0; i2 < iMin; i2++) {
                        int i3 = bArr2[i2] & 255;
                        int i4 = bArr[((int) j10) + i2] & 255;
                        if (i3 != i4) {
                            if (i3 >= i4) {
                                iCompare = 1;
                                break;
                            }
                            iCompare = -1;
                            break;
                        }
                    }
                    j10 += (long) iMin;
                    j7 = j3;
                    j8 = j4;
                } else {
                    j3 = j7;
                    j4 = j8;
                    iCompare = Long.compare(jM32081, bArr.length);
                    break;
                }
            }
            if (iCompare < 0) {
                j7 = j4 + 1;
                j5 = j9;
            } else {
                if (iCompare <= 0) {
                    return j4;
                }
                j5 = j4 - 1;
                j7 = j3;
            }
            j6 = j5;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m32082(RandomAccessFile randomAccessFile, long j) throws IOException {
        if (j < 0 || j >= this.f43049) {
            throw new IOException("Invalid boot hierarchy type id");
        }
        randomAccessFile.seek((j * 12) + this.f43048);
        long jM32080 = m32080(randomAccessFile);
        long jM32081 = m32080(randomAccessFile);
        m32084(jM32080, jM32081);
        if (jM32081 > 1048576) {
            throw new IOException("Boot hierarchy string is too large");
        }
        byte[] bArr = new byte[(int) jM32081];
        randomAccessFile.seek(this.f43047 + jM32080);
        randomAccessFile.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m32084(long j, long j2) throws IOException {
        if (j >= 0 && j2 >= 0) {
            long j3 = this.f43051;
            if (j <= j3 && j2 <= j3 - j) {
                return;
            }
        }
        throw new IOException("Invalid boot hierarchy string slice");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m32079(int i, long j) throws IOException {
        long j2 = i;
        if (j <= C17492.FOREVER_NS / j2) {
            return j * j2;
        }
        throw new IOException("Boot hierarchy count overflow");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m32080(RandomAccessFile randomAccessFile) {
        return ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
    }
}
