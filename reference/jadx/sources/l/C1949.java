package l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֫۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3NK */
/* JADX INFO: loaded from: classes3.dex */
public final class C1949 extends AbstractC15372 {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (l.C22832.m51499(r6, r25) > (-65)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (l.C22832.m51499(r6, r25) > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b1, code lost:
    
        if (l.C22832.m51499(r8, r25) > (-65)) goto L53;
     */
    @Override // l.AbstractC15372
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo6731(int r24, byte[] r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1949.mo6731(int, byte[], int, int):int");
    }

    @Override // l.AbstractC15372
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo6732(int i, int i2, byte[] bArr) throws C20463 {
        Charset charset = C23447.f75888;
        String str = new String(bArr, i, i2, charset);
        if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
            throw C20463.m46970();
        }
        return str;
    }

    @Override // l.AbstractC15372
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo6733(ByteBuffer byteBuffer, int i, int i2) throws C20463 {
        byte bM51497;
        byte bM51498;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        long jM51500 = C22832.m51500(byteBuffer) + ((long) i);
        long j = ((long) i2) + jM51500;
        char[] cArr = new char[i2];
        int i3 = 0;
        while (jM51500 < j && (bM51498 = C22832.m51497(jM51500)) >= 0) {
            jM51500++;
            cArr[i3] = (char) bM51498;
            i3++;
        }
        while (jM51500 < j) {
            long j2 = jM51500 + 1;
            byte bM51499 = C22832.m51497(jM51500);
            if (bM51499 >= 0) {
                cArr[i3] = (char) bM51499;
                i3++;
                jM51500 = j2;
                while (jM51500 < j && (bM51497 = C22832.m51497(jM51500)) >= 0) {
                    jM51500++;
                    cArr[i3] = (char) bM51497;
                    i3++;
                }
            } else if (bM51499 < -32) {
                if (j2 >= j) {
                    throw C20463.m46970();
                }
                jM51500 += 2;
                C19848.m45708(bM51499, C22832.m51497(j2), cArr, i3);
                i3++;
            } else if (bM51499 < -16) {
                if (j2 >= j - 1) {
                    throw C20463.m46970();
                }
                long j3 = 2 + jM51500;
                jM51500 += 3;
                C19848.m45707(bM51499, C22832.m51497(j2), C22832.m51497(j3), cArr, i3);
                i3++;
            } else {
                if (j2 >= j - 2) {
                    throw C20463.m46970();
                }
                byte bM514910 = C22832.m51497(j2);
                long j4 = jM51500 + 3;
                byte bM514911 = C22832.m51497(2 + jM51500);
                jM51500 += 4;
                C19848.m45706(bM51499, bM514910, bM514911, C22832.m51497(j4), cArr, i3);
                i3 += 2;
            }
        }
        return new String(cArr, 0, i3);
    }

    @Override // l.AbstractC15372
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo6730(int i, int i2, String str, byte[] bArr) {
        long j;
        char c;
        String str2;
        String str3;
        int i3;
        char cCharAt;
        long j2 = i;
        long j3 = ((long) i2) + j2;
        int length = str.length();
        String str4 = " at index ";
        String str5 = "Failed writing ";
        if (length > i2 || bArr.length - i2 < i) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
        }
        int i4 = 0;
        while (true) {
            j = 1;
            c = 128;
            if (i4 >= length || (cCharAt = str.charAt(i4)) >= 128) {
                break;
            }
            C22832.m51513(bArr, j2, (byte) cCharAt);
            i4++;
            j2 = 1 + j2;
        }
        if (i4 == length) {
            return (int) j2;
        }
        String str6 = str;
        while (i4 < length) {
            char cCharAt2 = str6.charAt(i4);
            if (cCharAt2 < c && j2 < j3) {
                C22832.m51513(bArr, j2, (byte) cCharAt2);
                str3 = str5;
                j2 += j;
                str2 = str4;
            } else if (cCharAt2 >= 2048 || j2 > j3 - 2) {
                str2 = str4;
                str3 = str5;
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j2 > j3 - 3) {
                    if (j2 <= j3 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = str.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                C22832.m51513(bArr, j2, (byte) ((codePoint >>> 18) | 240));
                                C22832.m51513(bArr, j2 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j4 = j2 + 3;
                                C22832.m51513(bArr, j2 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j2 += 4;
                                C22832.m51513(bArr, j4, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new C5678(i4 - 1, length);
                    }
                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                        throw new C5678(i4, length);
                    }
                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt2 + str2 + j2);
                }
                C22832.m51513(bArr, j2, (byte) ((cCharAt2 >>> '\f') | 480));
                long j5 = j2 + 2;
                C22832.m51513(bArr, j2 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                j2 += 3;
                C22832.m51513(bArr, j5, (byte) ((cCharAt2 & '?') | 128));
                str6 = str;
            } else {
                str2 = str4;
                str3 = str5;
                long j6 = j2 + j;
                C22832.m51513(bArr, j2, (byte) ((cCharAt2 >>> 6) | 960));
                j2 += 2;
                C22832.m51513(bArr, j6, (byte) (c | (cCharAt2 & '?')));
            }
            i4++;
            c = 128;
            str4 = str2;
            str5 = str3;
            j = 1;
        }
        return (int) j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m6729(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return C11643.m29251(i);
        }
        if (i2 == 1) {
            return C11643.m29260(i, C22832.m51499(j, bArr));
        }
        if (i2 == 2) {
            return C11643.m29261(i, C22832.m51499(j, bArr), C22832.m51499(j + 1, bArr));
        }
        throw new AssertionError();
    }
}
