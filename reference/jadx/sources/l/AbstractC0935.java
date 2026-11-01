package l;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.֨ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T90P */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0935 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Map f3736;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3691(String str) {
        return f3736.containsKey(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m3690(String str, int[] iArr) {
        String str2 = (String) f3736.get(str);
        if (str2 == null) {
            return 0;
        }
        int length = str2.length();
        if (length == 1) {
            iArr[0] = str2.charAt(0);
            return length;
        }
        iArr[0] = str2.charAt(0);
        iArr[1] = str2.charAt(1);
        return length;
    }

    static {
        Map map;
        try {
            Field declaredField = C11210.class.getDeclaredField("ۙ");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable unused) {
            map = Collections.EMPTY_MAP;
        }
        f3736 = map;
    }
}
