package l;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3YK */
/* JADX INFO: loaded from: classes3.dex */
public final class C9754 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24735(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m24741(String str) {
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Hex input must contain an even number of digits");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iM24735 = m24735(str.charAt(i2));
            int iM24736 = m24735(str.charAt(i2 + 1));
            if (iM24735 < 0 || iM24736 < 0) {
                throw new IllegalArgumentException("Hex input contains a non-hexadecimal digit");
            }
            bArr[i] = (byte) (iM24736 | (iM24735 << 4));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24738(byte[] bArr) {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            cArr[i2] = charArray[(b & 255) >>> 4];
            cArr[i2 + 1] = charArray[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m24743(String str) {
        if (str == null) {
            return "null";
        }
        int length = str.length();
        if (length == 0) {
            return "\"\"";
        }
        int i = 0;
        char c = '/';
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (c == '/') {
                if (!Character.isJavaIdentifierStart(cCharAt) && cCharAt != '-') {
                    return C16523.m38890("\"", str, "\"");
                }
                i++;
                c = cCharAt;
            } else {
                if (cCharAt != '/' && !Character.isJavaIdentifierPart(cCharAt) && cCharAt != '-') {
                    return C16523.m38890("\"", str, "\"");
                }
                i++;
                c = cCharAt;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m24742(int i) {
        return new int[(i + 31) >> 5];
    }

    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m24739(byte[] bArr, boolean z) {
        int iMin;
        int i = 3;
        if (!z) {
            iMin = bArr.length;
        } else {
            iMin = Math.min(bArr.length, 10485760);
            int iM48950 = C22037.m48950(Math.min(bArr.length, 32768), bArr);
            int i2 = 1;
            if (iM48950 == C22037.f71424 || iM48950 == C22037.f71431) {
                if (iMin > 0) {
                    int i3 = iMin - 1;
                    while (i3 >= 0 && (bArr[i3] & 192) == 128) {
                        i3--;
                    }
                    if (i3 < 0) {
                        iMin = 0;
                    } else {
                        int i4 = bArr[i3] & 255;
                        if (i4 >= 128) {
                            if (i4 >= 194 && i4 <= 223) {
                                i2 = 2;
                            } else if (i4 >= 224 && i4 <= 239) {
                                i2 = 3;
                            } else if (i4 >= 240 && i4 <= 244) {
                                i2 = 4;
                            }
                        }
                        if (i2 + i3 > iMin) {
                            iMin = i3;
                        }
                    }
                }
            } else if (iM48950 == C22037.f71428) {
                iMin = m24737(bArr, iMin, false);
            } else if (iM48950 == C22037.f71432) {
                iMin = m24737(bArr, iMin, true);
            } else if (iM48950 == C22037.f71429 || iM48950 == C22037.f71430) {
                int iM24736 = iMin - m24736(iMin, bArr);
                if (iM24736 > 0) {
                    iMin -= iM24736 % 4;
                }
            } else if (iM48950 != -1) {
                Charset charsetM48953 = C22037.m48953(iM48950);
                int iMax = Math.max(0, iMin - 16);
                for (int i5 = iMin; i5 >= iMax; i5--) {
                    try {
                        CharsetDecoder charsetDecoderNewDecoder = charsetM48953.newDecoder();
                        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                        charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, 0, i5));
                        iMin = i5;
                        break;
                    } catch (CharacterCodingException unused) {
                    }
                }
            }
        }
        int i6 = C22037.f71424;
        int iM48951 = C22037.m48950(Math.min(iMin, 32768), bArr);
        if (iM48951 == -1) {
            return null;
        }
        if (iM48951 == C22037.f71424 || iM48951 == C22037.f71431) {
            if (C13571.m33175(iMin, bArr)) {
                iMin -= 3;
            } else {
                i = 0;
            }
        } else if (iM48951 == C22037.f71428) {
            if (C13571.m33172(iMin, bArr)) {
                iMin -= 2;
                i = 2;
            } else {
                i = 0;
            }
        } else {
            if (iM48951 == C22037.f71432) {
                if (C13571.m33178(iMin, bArr)) {
                    iMin -= 2;
                    i = 2;
                }
            } else if (iM48951 != C22037.f71429 ? !(iM48951 != C22037.f71430 || !C13571.m33168(iMin, bArr)) : C13571.m33176(iMin, bArr)) {
                iMin -= 4;
                i = 4;
            }
            i = 0;
        }
        return new String(bArr, i, iMin, C22037.m48953(iM48951));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m24744(int i, int[] iArr) {
        return ((1 << (i & 31)) & iArr[i >> 5]) != 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m24734(int i, int[] iArr) {
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24740(int i, int[] iArr) {
        int i2 = i >> 5;
        iArr[i2] = (~(1 << (i & 31))) & iArr[i2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24737(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        int iM24736 = i - m24736(i, bArr);
        if (iM24736 > 0) {
            i -= iM24736 % 2;
        }
        if (i - m24736(i, bArr) >= 2) {
            int i4 = i - 2;
            if (z) {
                i2 = bArr[i4] & 255;
                i3 = (bArr[i - 1] & 255) << 8;
            } else {
                i2 = (bArr[i4] & 255) << 8;
                i3 = bArr[i - 1] & 255;
            }
            int i5 = i3 | i2;
            if (i5 >= 55296 && i5 <= 56319) {
                return i4;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24736(int i, byte[] bArr) {
        int i2;
        if ((i >= 4 && bArr[0] == 0 && bArr[1] == 0 && (bArr[2] & 255) == 254 && (bArr[3] & 255) == 255) || (i >= 4 && (bArr[0] & 255) == 255 && (bArr[1] & 255) == 254 && bArr[2] == 0 && bArr[3] == 0)) {
            return 4;
        }
        if (i >= 3 && (bArr[0] & 255) == 239 && (bArr[1] & 255) == 187 && (bArr[2] & 255) == 191) {
            return 3;
        }
        return (i < 2 || !(((i2 = bArr[0] & 255) == 254 && (bArr[1] & 255) == 255) || (i2 == 255 && (bArr[1] & 255) == 254))) ? 0 : 2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m24745(int i, int[] iArr) {
        int length = iArr.length;
        int i2 = i & 31;
        int i3 = i >> 5;
        while (true) {
            if (i3 >= length) {
                return -1;
            }
            int i4 = iArr[i3];
            if (i4 != 0) {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros((~((1 << i2) - 1)) & i4);
                int i5 = iNumberOfTrailingZeros != 32 ? iNumberOfTrailingZeros : -1;
                if (i5 >= 0) {
                    return (i3 << 5) + i5;
                }
            }
            i3++;
            i2 = 0;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m24746(String str) {
        C10730 c10730 = C6535.f22002;
        Set<InterfaceC2967> setM51595 = AbstractC23430.m51595();
        HashSet hashSet = new HashSet();
        for (InterfaceC2967 interfaceC2967 : setM51595) {
            if (interfaceC2967.mo8793().equals(str)) {
                hashSet.add(interfaceC2967);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((InterfaceC2967) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
