package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17NL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17080 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f54498 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC23844 f54499 = AbstractC23844.m52567("\r\n", "\n", "\r");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m39865(String str) {
        return f54499.contains(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39862(int i, String str) {
        AbstractC0477 it = f54499.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.startsWith(str2, i)) {
                return str2.length();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39863(String str) {
        AbstractC0477 it = f54499.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.endsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m39866(String str) {
        char cCharAt;
        int i = 0;
        while (i < str.length() && (cCharAt = str.charAt(i)) != '\n') {
            i++;
            if (cCharAt == '\r') {
                return (i >= str.length() || str.charAt(i) != '\n') ? "\r" : "\r\n";
            }
        }
        return "\n";
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Iterator m39864(String str) {
        return new C12142(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Iterator m39861(String str) {
        return new C16375(str);
    }
}
