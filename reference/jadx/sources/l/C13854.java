package l;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.۬۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64F5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13854 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f43953 = 0;

    static {
        C16794.m39651("\"\\");
        C16794.m39651("\t ,=");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m33800(C9444 c9444) {
        String strM29361 = c9444.m24822().m29361("Content-Length");
        if (strM29361 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM29361);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set m33801(C11682 c11682) {
        Set treeSet = Collections.EMPTY_SET;
        int iM29363 = c11682.m29363();
        for (int i = 0; i < iM29363; i++) {
            if ("Vary".equalsIgnoreCase(c11682.m29360(i))) {
                String strM29364 = c11682.m29364(i);
                if (treeSet.isEmpty()) {
                    treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strM29364.split(",")) {
                    treeSet.add(str.trim());
                }
            }
        }
        return treeSet;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m33802(C9444 c9444) {
        if (c9444.m24826().m21651().equals("HEAD")) {
            return false;
        }
        int iM24820 = c9444.m24820();
        return (((iM24820 >= 100 && iM24820 < 200) || iM24820 == 204 || iM24820 == 304) && m33800(c9444) == -1 && !"chunked".equalsIgnoreCase(c9444.m24817("Transfer-Encoding"))) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m33799(int i, String str, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m33798(int i, String str) {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
