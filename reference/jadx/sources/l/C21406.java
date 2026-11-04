package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17NL */
/* JADX INFO: loaded from: classes2.dex */
public final class C21406 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f68189 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC8639 f68190 = AbstractC8639.m23276("\r\n", "\n", "\r");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m48703(String str) {
        return f68190.contains(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48701(int i, String str) {
        AbstractC4516 it = f68190.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.startsWith(str2, i)) {
                return str2.length();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48702(String str) {
        AbstractC4516 it = f68190.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.endsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m48705(String str) {
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

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Iterator m48704(String str) {
        return new C14692(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Iterator m48706(String str) {
        return new C4252(str);
    }
}
