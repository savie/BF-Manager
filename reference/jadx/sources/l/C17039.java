package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T61X */
/* JADX INFO: loaded from: classes4.dex */
public final class C17039 extends AbstractC5750 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39816(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m39822(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39818(long j) {
        int i = (int) j;
        C18304.m42512(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39817(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m39821(Collection collection) {
        if (collection instanceof C12101) {
            C12101 c12101 = (C12101) collection;
            return Arrays.copyOfRange(c12101.f40473, c12101.f40472, c12101.f40474);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m39820(int... iArr) {
        if (iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new C12101(0, iArr.length, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m39819(String str) {
        Long lValueOf;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                int iM26897 = C10690.m26897(str.charAt(i));
                if (iM26897 >= 0 && iM26897 < 10) {
                    long j = -iM26897;
                    long j2 = 10;
                    long j3 = Long.MIN_VALUE / j2;
                    while (true) {
                        if (i2 >= str.length()) {
                            if (i == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i3 = i2 + 1;
                        int iM26898 = C10690.m26897(str.charAt(i2));
                        if (iM26898 >= 0 && iM26898 < 10 && j >= j3) {
                            long j4 = j * j2;
                            long j5 = iM26898;
                            if (j4 >= j5 - Long.MIN_VALUE) {
                                j = j4 - j5;
                                i2 = i3;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }
}
