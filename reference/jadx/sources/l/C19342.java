package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩵۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98J9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19342 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8759 m44336(C8759 c8759, String[] strArr, Map map) {
        int i = 0;
        if (c8759 == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C8759) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C8759 c87510 = new C8759();
                int length = strArr.length;
                while (i < length) {
                    c87510.m22736((C8759) map.get(strArr[i]));
                    i++;
                }
                return c87510;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c8759.m22736((C8759) map.get(strArr[0]));
                return c8759;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c8759.m22736((C8759) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c8759;
    }
}
