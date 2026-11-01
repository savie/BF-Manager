package l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3NK */
/* JADX INFO: loaded from: classes4.dex */
public final class C17292 extends AbstractC0358 {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (l.C15882.m37768(r6, r25) > (-65)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (l.C15882.m37768(r6, r25) > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b1, code lost:
    
        if (l.C15882.m37768(r8, r25) > (-65)) goto L53;
     */
    @Override // l.AbstractC0358
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo2071(int r24, byte[] r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17292.mo2071(int, byte[], int, int):int");
    }

    @Override // l.AbstractC0358
    /* JADX INFO: renamed from: ۙ */
    public final String mo2072(int i, int i2, byte[] bArr) throws C4529 {
        Charset charset = C9779.f33479;
        String str = new String(bArr, i, i2, charset);
        if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
            throw C4529.m12643();
        }
        return str;
    }

    @Override // l.AbstractC0358
    /* JADX INFO: renamed from: ۙ */
    public final String mo2073(ByteBuffer byteBuffer, int i, int i2) throws C4529 {
        byte bM37766;
        byte bM37767;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        long jM37769 = C15882.m37769(byteBuffer) + ((long) i);
        long j = ((long) i2) + jM37769;
        char[] cArr = new char[i2];
        int i3 = 0;
        while (jM37769 < j && (bM37767 = C15882.m37766(jM37769)) >= 0) {
            jM37769++;
            cArr[i3] = (char) bM37767;
            i3++;
        }
        while (jM37769 < j) {
            long j2 = jM37769 + 1;
            byte bM37768 = C15882.m37766(jM37769);
            if (bM37768 >= 0) {
                cArr[i3] = (char) bM37768;
                i3++;
                jM37769 = j2;
                while (jM37769 < j && (bM37766 = C15882.m37766(jM37769)) >= 0) {
                    jM37769++;
                    cArr[i3] = (char) bM37766;
                    i3++;
                }
            } else if (bM37768 < -32) {
                if (j2 >= j) {
                    throw C4529.m12643();
                }
                jM37769 += 2;
                C20115.m45479(bM37768, C15882.m37766(j2), cArr, i3);
                i3++;
            } else if (bM37768 < -16) {
                if (j2 >= j - 1) {
                    throw C4529.m12643();
                }
                long j3 = 2 + jM37769;
                jM37769 += 3;
                C20115.m45478(bM37768, C15882.m37766(j2), C15882.m37766(j3), cArr, i3);
                i3++;
            } else {
                if (j2 >= j - 2) {
                    throw C4529.m12643();
                }
                byte bM37769 = C15882.m37766(j2);
                long j4 = jM37769 + 3;
                byte bM377610 = C15882.m37766(2 + jM37769);
                jM37769 += 4;
                C20115.m45477(bM37768, bM37769, bM377610, C15882.m37766(j4), cArr, i3);
                i3 += 2;
            }
        }
        return new String(cArr, 0, i3);
    }

    @Override // l.AbstractC0358
    /* JADX INFO: renamed from: ۙ */
    public final int mo2070(int i, int i2, String str, byte[] bArr) {
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
            C15882.m37782(bArr, j2, (byte) cCharAt);
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
                C15882.m37782(bArr, j2, (byte) cCharAt2);
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
                                C15882.m37782(bArr, j2, (byte) ((codePoint >>> 18) | 240));
                                C15882.m37782(bArr, j2 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j4 = j2 + 3;
                                C15882.m37782(bArr, j2 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j2 += 4;
                                C15882.m37782(bArr, j4, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new C12354(i4 - 1, length);
                    }
                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                        throw new C12354(i4, length);
                    }
                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt2 + str2 + j2);
                }
                C15882.m37782(bArr, j2, (byte) ((cCharAt2 >>> '\f') | 480));
                long j5 = j2 + 2;
                C15882.m37782(bArr, j2 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                j2 += 3;
                C15882.m37782(bArr, j5, (byte) ((cCharAt2 & '?') | 128));
                str6 = str;
            } else {
                str2 = str4;
                str3 = str5;
                long j6 = j2 + j;
                C15882.m37782(bArr, j2, (byte) ((cCharAt2 >>> 6) | 960));
                j2 += 2;
                C15882.m37782(bArr, j6, (byte) (c | (cCharAt2 & '?')));
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
    public static int m40260(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return C6003.m16286(i);
        }
        if (i2 == 1) {
            return C6003.m16295(i, C15882.m37768(j, bArr));
        }
        if (i2 == 2) {
            return C6003.m16296(i, C15882.m37768(j, bArr), C15882.m37768(j + 1, bArr));
        }
        throw new AssertionError();
    }
}
