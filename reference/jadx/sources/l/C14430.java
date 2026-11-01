package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.cb;
import java.math.BigInteger;
import java.util.logging.Logger;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܳۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QN */
/* JADX INFO: loaded from: classes4.dex */
public final class C14430 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f47308 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Logger f47309 = Logger.getLogger(C14430.class.getName());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m34697(byte b) {
        if (48 > b || b > 57) {
            return (97 > b || b > 122) ? b - 55 : b - 87;
        }
        return b - UTF8.S_P3A;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m34704(byte b) {
        if (48 <= b && b <= 57) {
            return true;
        }
        if (97 > b || b > 102) {
            return 65 <= b && b <= 70;
        }
        return true;
    }

    static {
        EnumC17251 enumC17251 = EnumC17251.ALLOW_SINGULAR_OVERWRITES;
        int i = C11648.f39164;
        int i2 = C13765.f45372;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static AbstractC23725 m34701(String str) {
        int i;
        int i2;
        int length;
        byte b;
        byte b2;
        AbstractC23725 abstractC23725M52256 = AbstractC23725.m52256(str.toString());
        byte[] bArr = ((C6085) abstractC23725M52256).f20598;
        int length2 = bArr.length;
        byte[] bArr2 = new byte[length2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            byte b3 = bArr[i3];
            if (b3 == 92) {
                int i5 = i3 + 1;
                if (i5 >= bArr.length) {
                    throw new C12313("Invalid escape sequence: '\\' at end of string.");
                }
                byte b4 = bArr[i5];
                if (48 <= b4 && b4 <= 55) {
                    int iM34697 = m34697(b4);
                    int i6 = i3 + 2;
                    if (i6 < bArr.length && 48 <= (b2 = bArr[i6]) && b2 <= 55) {
                        iM34697 = (iM34697 * 8) + m34697(b2);
                        i5 = i6;
                    }
                    int i7 = i5 + 1;
                    if (i7 < bArr.length && 48 <= (b = bArr[i7]) && b <= 55) {
                        iM34697 = (iM34697 * 8) + m34697(b);
                        i5 = i7;
                    }
                    i = i4 + 1;
                    bArr2[i4] = (byte) iM34697;
                } else if (b4 == 34) {
                    i = i4 + 1;
                    bArr2[i4] = 34;
                } else if (b4 == 39) {
                    i = i4 + 1;
                    bArr2[i4] = 39;
                } else if (b4 != 63) {
                    if (b4 == 85) {
                        int i8 = i3 + 2;
                        i2 = i3 + 9;
                        if (i2 >= bArr.length) {
                            throw new C12313("Invalid escape sequence: '\\U' with too few hex chars");
                        }
                        int iM34698 = 0;
                        int i9 = i8;
                        while (true) {
                            int i10 = i3 + 10;
                            if (i9 < i10) {
                                byte b5 = bArr[i9];
                                if (!m34704(b5)) {
                                    throw new C12313("Invalid escape sequence: '\\U' with too few hex chars");
                                }
                                iM34698 = (iM34698 << 4) | m34697(b5);
                                i9++;
                            } else {
                                if (!Character.isValidCodePoint(iM34698)) {
                                    throw new C12313("Invalid escape sequence: '\\U" + abstractC23725M52256.mo16493(i8, i10).m52260() + "' is not a valid code point value");
                                }
                                Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iM34698);
                                if (unicodeBlockOf != null && (unicodeBlockOf.equals(Character.UnicodeBlock.LOW_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES))) {
                                    throw new C12313("Invalid escape sequence: '\\U" + abstractC23725M52256.mo16493(i8, i10).m52260() + "' refers to a surrogate code unit");
                                }
                                byte[] bytes = new String(new int[]{iM34698}, 0, 1).getBytes(C9779.f33479);
                                System.arraycopy(bytes, 0, bArr2, i4, bytes.length);
                                length = bytes.length;
                            }
                        }
                    } else if (b4 == 92) {
                        i = i4 + 1;
                        bArr2[i4] = 92;
                    } else if (b4 == 102) {
                        i = i4 + 1;
                        bArr2[i4] = 12;
                    } else if (b4 == 110) {
                        i = i4 + 1;
                        bArr2[i4] = 10;
                    } else if (b4 == 114) {
                        i = i4 + 1;
                        bArr2[i4] = cb.k;
                    } else if (b4 == 120) {
                        i5 = i3 + 2;
                        if (i5 >= bArr.length || !m34704(bArr[i5])) {
                            throw new C12313("Invalid escape sequence: '\\x' with no digits");
                        }
                        int iM34699 = m34697(bArr[i5]);
                        int i11 = i3 + 3;
                        if (i11 < bArr.length && m34704(bArr[i11])) {
                            iM34699 = (iM34699 * 16) + m34697(bArr[i11]);
                            i5 = i11;
                        }
                        i = i4 + 1;
                        bArr2[i4] = (byte) iM34699;
                    } else if (b4 == 97) {
                        i = i4 + 1;
                        bArr2[i4] = 7;
                    } else if (b4 != 98) {
                        switch (b4) {
                            case 116:
                                i = i4 + 1;
                                bArr2[i4] = 9;
                                break;
                            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                int i12 = i3 + 2;
                                i2 = i3 + 5;
                                if (i2 < bArr.length && m34704(bArr[i12])) {
                                    int i13 = i3 + 3;
                                    if (m34704(bArr[i13])) {
                                        int i14 = i3 + 4;
                                        if (m34704(bArr[i14]) && m34704(bArr[i2])) {
                                            char cM34697 = (char) ((m34697(bArr[i14]) << 4) | (m34697(bArr[i12]) << 12) | (m34697(bArr[i13]) << 8) | m34697(bArr[i2]));
                                            if (cM34697 >= 55296 && cM34697 <= 57343) {
                                                throw new C12313("Invalid escape sequence: '\\u' refers to a surrogate");
                                            }
                                            byte[] bytes2 = Character.toString(cM34697).getBytes(C9779.f33479);
                                            System.arraycopy(bytes2, 0, bArr2, i4, bytes2.length);
                                            length = bytes2.length;
                                            break;
                                        }
                                    }
                                }
                                throw new C12313("Invalid escape sequence: '\\u' with too few hex chars");
                            case 118:
                                i = i4 + 1;
                                bArr2[i4] = 11;
                                break;
                            default:
                                throw new C12313("Invalid escape sequence: '\\" + ((char) b4) + '\'');
                        }
                    } else {
                        i = i4 + 1;
                        bArr2[i4] = 8;
                    }
                    i4 += length;
                    i3 = i2;
                } else {
                    i = i4 + 1;
                    bArr2[i4] = 63;
                }
                i4 = i;
                i3 = i5;
            } else {
                bArr2[i4] = b3;
                i4++;
            }
            i3++;
        }
        return length2 == i4 ? new C6085(bArr2) : AbstractC23725.m52255(0, i4, bArr2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m34698(String str) {
        return (int) m34699(str, true, false);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m34702(String str) {
        return (int) m34699(str, false, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m34703(String str) {
        return m34699(str, true, true);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static long m34696(String str) {
        return m34699(str, false, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m34699(String str, boolean z, boolean z2) {
        boolean z3;
        int i;
        int i2 = 0;
        if (!str.startsWith("-", 0)) {
            z3 = false;
        } else {
            if (!z) {
                throw new NumberFormatException("Number must be positive: ".concat(str));
            }
            i2 = 1;
            z3 = true;
        }
        if (str.startsWith("0x", i2)) {
            i2 += 2;
            i = 16;
        } else {
            i = str.startsWith("0", i2) ? 8 : 10;
        }
        String strSubstring = str.substring(i2);
        if (strSubstring.length() < 16) {
            long j = Long.parseLong(strSubstring, i);
            if (z3) {
                j = -j;
            }
            if (!z2) {
                if (z) {
                    if (j > 2147483647L || j < -2147483648L) {
                        throw new NumberFormatException("Number out of range for 32-bit signed integer: ".concat(str));
                    }
                } else if (j >= Blake2xsDigest.MAX_NUMBER_BLOCKS || j < 0) {
                    throw new NumberFormatException("Number out of range for 32-bit unsigned integer: ".concat(str));
                }
            }
            return j;
        }
        BigInteger bigInteger = new BigInteger(strSubstring, i);
        if (z3) {
            bigInteger = bigInteger.negate();
        }
        if (z2) {
            if (z) {
                if (bigInteger.bitLength() > 63) {
                    throw new NumberFormatException("Number out of range for 64-bit signed integer: ".concat(str));
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new NumberFormatException("Number out of range for 64-bit unsigned integer: ".concat(str));
            }
        } else if (z) {
            if (bigInteger.bitLength() > 31) {
                throw new NumberFormatException("Number out of range for 32-bit signed integer: ".concat(str));
            }
        } else if (bigInteger.bitLength() > 32) {
            throw new NumberFormatException("Number out of range for 32-bit unsigned integer: ".concat(str));
        }
        return bigInteger.longValue();
    }
}
