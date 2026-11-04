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

/* JADX INFO: renamed from: l.ᩴۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71B */
/* JADX INFO: loaded from: classes5.dex */
public final class C19556 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String[] f63059 = new String[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f63060;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f63061;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f63062;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f63063 = new byte[1024];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long[] f63064;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f63065;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f63066;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f63067;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f63068;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f63069;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f63070;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f63071;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f63072;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f63073;

    public C19556(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f63068 = j;
        this.f63073 = j2;
        this.f63067 = j3;
        this.f63069 = j4;
        this.f63071 = j5;
        this.f63061 = j6;
        this.f63070 = j7;
        this.f63072 = j8;
        this.f63060 = j9;
        this.f63062 = j10;
        this.f63065 = j11;
        this.f63066 = j12;
        if (j4 > 2147483647L) {
            throw new IllegalArgumentException("Too many boot hierarchy types");
        }
        this.f63064 = new long[(int) j4];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19556 m45130(File file) throws IOException {
        if (!file.isFile() || file.length() != 3415240) {
            throw new IOException("Boot hierarchy raw file size mismatch");
        }
        byte[] bArr = new byte[208];
        MessageDigest messageDigestM36179 = C15022.m36179();
        MessageDigest messageDigestM361710 = C15022.m36179();
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
        messageDigestM36179.update(bArr);
        byte[] bArr2 = new byte[32768];
        while (true) {
            int i3 = fileInputStream.read(bArr2);
            if (i3 == -1) {
                break;
            }
            messageDigestM36179.update(bArr2, 0, i3);
            messageDigestM361710.update(bArr2, 0, i3);
        }
        fileInputStream.close();
        if (!"bacb8cb4bb4a4c60edf467ff9d5a56aff4b5bb36e37bbd08e3b0e162efede5fc".equals(C15022.m36182(messageDigestM36179.digest()))) {
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
        if (!"d9eb9da824d9e247a352f570f01e1169e725b2954bca9e283a71786c59b59f9a".equals(C15022.m36182(bArr3)) || !"b2e82096748c00fa60056e7affddea44002d3a0e44201dc814dff202cdfc0e95".equals(C15022.m36182(bArr4)) || !"b2e82096748c00fa60056e7affddea44002d3a0e44201dc814dff202cdfc0e95".equals(C15022.m36182(messageDigestM361710.digest()))) {
            throw new IOException("Boot hierarchy payload identity mismatch");
        }
        long[] jArr3 = {jArr2[0], m45126(12, j), m45126(16, j2), m45126(4, j3), m45126(20, j4), m45126(8, j5)};
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
        C19556 c19556 = new C19556(jArr[0], jArr2[0], jArr[1], j, jArr[2], j2, jArr[3], j3, jArr[4], j4, jArr[5], j5);
        byte[] bArr5 = c19556.f63063;
        long[] jArr4 = c19556.f63064;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        for (int i8 = 0; i8 < jArr4.length; i8++) {
            try {
                randomAccessFile.seek((((long) i8) * 12) + c19556.f63067);
                long jM45127 = m45127(randomAccessFile);
                long jM45128 = m45127(randomAccessFile);
                c19556.m45131(jM45127, jM45128);
                randomAccessFile.seek(c19556.f63068 + jM45127);
                long j11 = -3750763034362895579L;
                while (jM45128 > 0) {
                    int iMin = (int) Math.min(bArr5.length, jM45128);
                    randomAccessFile.readFully(bArr5, 0, iMin);
                    for (int i9 = 0; i9 < iMin; i9++) {
                        j11 = (j11 ^ ((long) (bArr5[i9] & 255))) * 1099511628211L;
                    }
                    jM45128 -= (long) iMin;
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
        return c19556;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0192 A[EDGE_INSN: B:76:0x0192->B:77:0x0193 BREAK  A[LOOP:2: B:57:0x0148->B:64:0x0169]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14179 m45132(RandomAccessFile randomAccessFile, String str, String str2) throws IOException {
        String[] strArr;
        int unsignedByte;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length <= 1048576) {
            long j = -3750763034362895579L;
            for (byte b : bytes) {
                j = (j ^ ((long) (b & 255))) * 1099511628211L;
            }
            if (Arrays.binarySearch(this.f63064, j) >= 0) {
                long jM45128 = m45128(randomAccessFile, bytes, this.f63067, this.f63069, 12);
                long j2 = 0;
                if (jM45128 < 0) {
                    return C14179.f44834;
                }
                randomAccessFile.seek(C11958.m29929(jM45128, 12L, this.f63067, 8L));
                long jM45127 = m45127(randomAccessFile);
                if (jM45127 == 4294967295L) {
                    return C14179.f44834;
                }
                if (jM45127 >= this.f63061) {
                    throw new IOException("Invalid boot hierarchy class index");
                }
                randomAccessFile.seek((jM45127 * 16) + this.f63071);
                if (m45127(randomAccessFile) != jM45128) {
                    throw new IOException("Boot hierarchy class/type mismatch");
                }
                long jM45129 = m45127(randomAccessFile);
                long jM451210 = m45127(randomAccessFile);
                int iReverseBytes = Short.reverseBytes(randomAccessFile.readShort()) & HPKE.aead_EXPORT_ONLY;
                int unsignedByte2 = randomAccessFile.readUnsignedByte();
                if (randomAccessFile.readUnsignedByte() == 0 && (unsignedByte2 & (-2)) == 0) {
                    long j3 = this.f63072;
                    if (jM451210 <= j3 && iReverseBytes <= j3 - jM451210) {
                        String strM45129 = jM45129 == 4294967295L ? null : m45129(randomAccessFile, jM45129);
                        if (iReverseBytes == 0) {
                            strArr = f63059;
                        } else {
                            strArr = new String[iReverseBytes];
                        }
                        String[] strArr2 = strArr;
                        for (int i = 0; i < iReverseBytes; i++) {
                            randomAccessFile.seek(((((long) i) + jM451210) * 4) + this.f63070);
                            strArr2[i] = m45129(randomAccessFile, m45127(randomAccessFile));
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
                        long jM451211 = m45128(randomAccessFile, bytes2, this.f63060, this.f63062, 20);
                        if (jM451211 < 0) {
                            unsignedByte = -1;
                            break;
                        }
                        randomAccessFile.seek(C11958.m29929(jM451211, 20L, this.f63060, 8L));
                        long jReverseBytes = Long.reverseBytes(randomAccessFile.readLong());
                        long jM451212 = m45127(randomAccessFile);
                        if (jReverseBytes >= 0 && jReverseBytes % 8 == 0) {
                            long j4 = this.f63066;
                            if (jReverseBytes <= j4 * 8 && jM451212 <= j4 - (jReverseBytes / 8)) {
                                long j5 = jM451212 - 1;
                                while (true) {
                                    if (j2 > j5) {
                                        unsignedByte = -1;
                                        break;
                                    }
                                    long j6 = (j2 + j5) >>> c;
                                    randomAccessFile.seek((j6 * 8) + this.f63065 + jReverseBytes);
                                    long jM451213 = m45127(randomAccessFile);
                                    if (jM451213 >= jM45128) {
                                        if (jM451213 <= jM45128) {
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
                        if (!C19401.m44859(i2)) {
                            throw new IOException("Invalid boot hierarchy method flags");
                        }
                        return C14179.m34467(new C7468(strM45129, strArr2, unsignedByte2, i2, z));
                    }
                }
                throw new IOException("Invalid boot hierarchy class record");
            }
        }
        return C14179.f44834;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m45128(RandomAccessFile randomAccessFile, byte[] bArr, long j, long j2, int i) throws IOException {
        long j3;
        long j4;
        int iCompare;
        long j5;
        long j6 = j2 - 1;
        long j7 = 0;
        while (j7 <= j6) {
            long j8 = (j7 + j6) >>> 1;
            randomAccessFile.seek((((long) i) * j8) + j);
            long jM45127 = m45127(randomAccessFile);
            long jM45128 = m45127(randomAccessFile);
            m45131(jM45127, jM45128);
            long jMin = Math.min(jM45128, bArr.length);
            long j9 = j6;
            randomAccessFile.seek(this.f63068 + jM45127);
            long j10 = 0;
            while (true) {
                if (j10 < jMin) {
                    byte[] bArr2 = this.f63063;
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
                    iCompare = Long.compare(jM45128, bArr.length);
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
    private String m45129(RandomAccessFile randomAccessFile, long j) throws IOException {
        if (j < 0 || j >= this.f63069) {
            throw new IOException("Invalid boot hierarchy type id");
        }
        randomAccessFile.seek((j * 12) + this.f63067);
        long jM45127 = m45127(randomAccessFile);
        long jM45128 = m45127(randomAccessFile);
        m45131(jM45127, jM45128);
        if (jM45128 > 1048576) {
            throw new IOException("Boot hierarchy string is too large");
        }
        byte[] bArr = new byte[(int) jM45128];
        randomAccessFile.seek(this.f63068 + jM45127);
        randomAccessFile.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45131(long j, long j2) throws IOException {
        if (j >= 0 && j2 >= 0) {
            long j3 = this.f63073;
            if (j <= j3 && j2 <= j3 - j) {
                return;
            }
        }
        throw new IOException("Invalid boot hierarchy string slice");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m45126(int i, long j) throws IOException {
        long j2 = i;
        if (j <= C25227.FOREVER_NS / j2) {
            return j * j2;
        }
        throw new IOException("Boot hierarchy count overflow");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m45127(RandomAccessFile randomAccessFile) {
        return ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
    }
}
