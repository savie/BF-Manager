package l;

import com.alipay.sdk.m.y.l;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۖ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R78M */
/* JADX INFO: loaded from: classes2.dex */
public final class C2209 {
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m6824(String str) {
        if (str.startsWith("L") && str.endsWith(l.b)) {
            return str;
        }
        return "L" + str.replace('.', '/') + l.b;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m6825(String str) {
        return (str.startsWith("L") && str.endsWith(l.b)) ? str.substring(1, str.length() - 1).replace('/', '.') : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m6822(String str) {
        if ("classes.dex".equals(str)) {
            return 1;
        }
        if (str != null && str.indexOf(47) < 0 && str.startsWith("classes") && str.endsWith(".dex")) {
            String strM46498 = C20630.m46498(4, 7, str);
            if (!strM46498.isEmpty() && strM46498.charAt(0) != '0') {
                try {
                    int i = Integer.parseInt(strM46498);
                    if (i >= 2) {
                        return i;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Comparator m6823() {
        return C21023.thenComparing(C7618.comparingInt(new C4326()), new C20865());
    }
}
