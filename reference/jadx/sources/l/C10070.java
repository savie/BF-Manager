package l;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ۤۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 64F5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10070 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f34404 = 0;

    static {
        C14511.m34934("\"\\");
        C14511.m34934("\t ,=");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m25481(C18485 c18485) {
        String strM27345 = c18485.m42857().m27345("Content-Length");
        if (strM27345 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM27345);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set m25482(C10912 c10912) {
        Set treeSet = Collections.EMPTY_SET;
        int iM27347 = c10912.m27347();
        for (int i = 0; i < iM27347; i++) {
            if ("Vary".equalsIgnoreCase(c10912.m27344(i))) {
                String strM27348 = c10912.m27348(i);
                if (treeSet.isEmpty()) {
                    treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strM27348.split(",")) {
                    treeSet.add(str.trim());
                }
            }
        }
        return treeSet;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m25483(C18485 c18485) {
        if (c18485.m42866().m50359().equals("HEAD")) {
            return false;
        }
        int iM42858 = c18485.m42858();
        return (((iM42858 >= 100 && iM42858 < 200) || iM42858 == 204 || iM42858 == 304) && m25481(c18485) == -1 && !"chunked".equalsIgnoreCase(c18485.m42859("Transfer-Encoding"))) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25480(int i, String str, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25479(int i, String str) {
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
