package l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۟۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAOJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7489 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f24942 = {1701707776, 1701741568};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f24941 = {'e', 'n'};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19987(char[] cArr, char[] cArr2) {
        return ((cArr[1] & 255) << 16) | ((cArr[0] & 255) << 24) | ((cArr2[0] & 255) << 8) | (cArr2[1] & 255);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19989(int[] iArr, C15957 c15957, int i, String str, int[] iArr2, int i2) {
        int i3 = 0;
        do {
            if (iArr != null) {
                iArr[i3] = i;
            }
            i3++;
            for (int i4 = 0; i4 < i2; i4++) {
                if (iArr2[i4] == i) {
                    c15957.m37942(Long.valueOf(i4));
                    return i3;
                }
            }
            if ((65535 & i) != 0) {
                Iterator it = C20895.f67882.entrySet().iterator();
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
        c15957.m37942(-1L);
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19991(int i, String str) {
        return C20895.f67877.contains(Long.valueOf((((long) str.charAt(3)) & 255) | (((long) i) << 32) | ((((long) str.charAt(0)) & 255) << 24) | ((((long) str.charAt(1)) & 255) << 16) | ((((long) str.charAt(2)) & 255) << 8)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m19988(char[] cArr, char[] cArr2, char[] cArr3, String str, char[] cArr4) {
        int i;
        int i2;
        if (cArr[0] == cArr2[0] && cArr[1] == cArr2[1]) {
            return 0;
        }
        int iM19987 = m19987(cArr3, cArr);
        int iM19988 = m19987(cArr3, cArr2);
        int iM19989 = m19987(cArr3, cArr4);
        boolean z = iM19987 == 1702057299 || iM19987 == 1702055256;
        boolean z2 = iM19988 == 1702057299 || iM19988 == 1702055256;
        if (z && !z2 && iM19988 != 1702077476) {
            i2 = iM19988;
            i = 1702077476;
        } else if (!z2 || z || iM19987 == 1702077476) {
            i = iM19987;
            i2 = iM19988;
        } else {
            i = iM19987;
            i2 = 1702077476;
        }
        int[] iArr = new int[4];
        C15957 c15957 = new C15957();
        int iM199810 = m19989(iArr, c15957, iM19989, str, new int[]{i, i2}, 2);
        if (((Long) c15957.m37941()).longValue() == 0) {
            return 1;
        }
        if (((Long) c15957.m37941()).longValue() == 1) {
            return -1;
        }
        C15957 c15958 = new C15957();
        int iLongValue = (int) ((((Long) c15958.m37941()).longValue() + ((long) m19989(null, c15958, i, str, iArr, iM199810))) - 1);
        C15957 c15959 = new C15957();
        int iLongValue2 = (int) ((((Long) c15959.m37941()).longValue() + ((long) m19989(null, c15959, i2, str, iArr, iM199810))) - 1);
        if (iLongValue != iLongValue2) {
            return iLongValue2 - iLongValue;
        }
        boolean zM19991 = m19991(i, str);
        boolean zM19992 = m19991(i2, str);
        return zM19991 != zM19992 ? (zM19991 ? 1 : 0) - (zM19992 ? 1 : 0) : i2 - i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19990(char[] cArr, char[] cArr2, char[] cArr3) {
        Character ch;
        if (cArr2[0] == 0) {
            Arrays.fill(cArr, (char) 0);
            return;
        }
        int iM19987 = m19987(cArr2, cArr3);
        Map map = C20895.f67880;
        Character ch2 = (Character) map.get(Integer.valueOf(iM19987));
        if (ch2 == null) {
            if (cArr3[0] != 0 && (ch = (Character) map.get(Integer.valueOf(iM19987 & (-65536)))) != null) {
                System.arraycopy(C20895.f67879[ch.charValue()], 0, cArr, 0, 4);
                return;
            } else {
                Arrays.fill(cArr, (char) 0);
                return;
            }
        }
        System.arraycopy(C20895.f67879[ch2.charValue()], 0, cArr, 0, 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m19992(char[] cArr) {
        int iM19987 = m19987(f24941, cArr);
        C15957 c15957 = new C15957();
        m19989(null, c15957, iM19987, "Latn", f24942, 2);
        return ((Long) c15957.m37941()).longValue() == 0;
    }
}
