package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAOJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5432 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f18926 = {1701707776, 1701741568};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f18925 = {'e', 'n'};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16163(char[] cArr, char[] cArr2) {
        return ((cArr[1] & 255) << 16) | ((cArr[0] & 255) << 24) | ((cArr2[0] & 255) << 8) | (cArr2[1] & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16165(int[] iArr, C11397 c11397, int i, String str, int[] iArr2, int i2) {
        int i3 = 0;
        do {
            if (iArr != null) {
                iArr[i3] = i;
            }
            i3++;
            for (int i4 = 0; i4 < i2; i4++) {
                if (iArr2[i4] == i) {
                    c11397.m28750(Long.valueOf(i4));
                    return i3;
                }
            }
            if ((65535 & i) != 0) {
                Iterator it = C1703.f5839.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (str.equals(entry.getKey())) {
                            Integer num = (Integer) ((Map) entry.getValue()).get(Integer.valueOf(i));
                            if (num != null) {
                                i = num.intValue();
                                break;
                            }
                        }
                    }
                    i &= -65536;
                    break;
                }
            }
            i = 0;
        } while (i != 0);
        c11397.m28750(-1L);
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16167(int i, String str) {
        return C1703.f5842.contains(Long.valueOf((((long) str.charAt(3)) & 255) | (((long) i) << 32) | ((((long) str.charAt(0)) & 255) << 24) | ((((long) str.charAt(1)) & 255) << 16) | ((((long) str.charAt(2)) & 255) << 8)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16164(char[] cArr, char[] cArr2, char[] cArr3, String str, char[] cArr4) {
        int i;
        int i2;
        if (cArr[0] == cArr2[0] && cArr[1] == cArr2[1]) {
            return 0;
        }
        int iM16163 = m16163(cArr3, cArr);
        int iM16164 = m16163(cArr3, cArr2);
        int iM16165 = m16163(cArr3, cArr4);
        boolean z = iM16163 == 1702057299 || iM16163 == 1702055256;
        boolean z2 = iM16164 == 1702057299 || iM16164 == 1702055256;
        if (z && !z2 && iM16164 != 1702077476) {
            i2 = iM16164;
            i = 1702077476;
        } else if (!z2 || z || iM16163 == 1702077476) {
            i = iM16163;
            i2 = iM16164;
        } else {
            i = iM16163;
            i2 = 1702077476;
        }
        int[] iArr = new int[4];
        C11397 c11397 = new C11397();
        int iM16166 = m16165(iArr, c11397, iM16165, str, new int[]{i, i2}, 2);
        if (((Long) c11397.m28749()).longValue() == 0) {
            return 1;
        }
        if (((Long) c11397.m28749()).longValue() == 1) {
            return -1;
        }
        C11397 c11398 = new C11397();
        int iLongValue = (int) ((((Long) c11398.m28749()).longValue() + ((long) m16165(null, c11398, i, str, iArr, iM16166))) - 1);
        C11397 c11399 = new C11397();
        int iLongValue2 = (int) ((((Long) c11399.m28749()).longValue() + ((long) m16165(null, c11399, i2, str, iArr, iM16166))) - 1);
        if (iLongValue != iLongValue2) {
            return iLongValue2 - iLongValue;
        }
        boolean zM16167 = m16167(i, str);
        boolean zM16168 = m16167(i2, str);
        return zM16167 != zM16168 ? (zM16167 ? 1 : 0) - (zM16168 ? 1 : 0) : i2 - i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16166(char[] cArr, char[] cArr2, char[] cArr3) {
        Character ch;
        if (cArr2[0] == 0) {
            Arrays.fill(cArr, (char) 0);
            return;
        }
        int iM16163 = m16163(cArr2, cArr3);
        Map map = C1703.f5838;
        Character ch2 = (Character) map.get(Integer.valueOf(iM16163));
        if (ch2 == null) {
            if (cArr3[0] != 0 && (ch = (Character) map.get(Integer.valueOf(iM16163 & (-65536)))) != null) {
                System.arraycopy(C1703.f5840[ch.charValue()], 0, cArr, 0, 4);
                return;
            } else {
                Arrays.fill(cArr, (char) 0);
                return;
            }
        }
        System.arraycopy(C1703.f5840[ch2.charValue()], 0, cArr, 0, 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16168(char[] cArr) {
        int iM16163 = m16163(f18925, cArr);
        C11397 c11397 = new C11397();
        m16165(null, c11397, iM16163, "Latn", f18926, 2);
        return ((Long) c11397.m28749()).longValue() == 0;
    }
}
