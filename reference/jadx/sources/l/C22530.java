package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩸ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 98J9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22530 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19546 m50769(C19546 c19546, String[] strArr, Map map) {
        int i = 0;
        if (c19546 == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C19546) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C19546 c19547 = new C19546();
                int length = strArr.length;
                while (i < length) {
                    c19547.m45088((C19546) map.get(strArr[i]));
                    i++;
                }
                return c19547;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c19546.m45088((C19546) map.get(strArr[0]));
                return c19546;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c19546.m45088((C19546) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c19546;
    }
}
