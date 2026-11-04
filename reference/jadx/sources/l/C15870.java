package l;

import com.alipay.sdk.m.y.l;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܶۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R78M */
/* JADX INFO: loaded from: classes4.dex */
public final class C15870 {
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m37840(String str) {
        if (str.startsWith("L") && str.endsWith(l.b)) {
            return str;
        }
        return "L" + str.replace('.', '/') + l.b;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m37841(String str) {
        return (str.startsWith("L") && str.endsWith(l.b)) ? str.substring(1, str.length() - 1).replace('/', '.') : str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37838(String str) {
        if ("classes.dex".equals(str)) {
            return 1;
        }
        if (str != null && str.indexOf(47) < 0 && str.startsWith("classes") && str.endsWith(".dex")) {
            String strM5124 = C1402.m5124(4, 7, str);
            if (!strM5124.isEmpty() && strM5124.charAt(0) != '0') {
                try {
                    int i = Integer.parseInt(strM5124);
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
    public static Comparator m37839() {
        return C8627.thenComparing(C2661.comparingInt(new C24822(0)), new C0187(0));
    }
}
