package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩺ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 74MB */
/* JADX INFO: loaded from: classes.dex */
public final class C24276 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f78588 = 0;

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m54287(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence2.length();
            int length2 = charSequence.length() - length;
            for (int i = 0; i <= length2; i++) {
                if (C3392.m11107(i, length, charSequence, charSequence2, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m54282(int i, String str, Object[] objArr) {
        if (objArr != null) {
            return (String) C23654.of(objArr).skip(0).limit(Math.max(0, i)).collect(C9357.m24671(str, new C6376(0)));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m54279(String str, char c) {
        if (m54286((CharSequence) str)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (c == str.charAt(i2)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m54286(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m54285(Collection collection, char c) {
        Iterator it;
        if (collection == null || (it = collection.iterator()) == null) {
            return null;
        }
        return !it.hasNext() ? "" : (String) C12465.stream(C13629.spliteratorUnknownSize(it, 16), false).collect(C9357.m24671(C17359.toString(String.valueOf(c), ""), new C6376(0)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m54283(Iterable iterable, String str) {
        Iterator it;
        if (iterable == null || (it = iterable.iterator()) == null) {
            return null;
        }
        return !it.hasNext() ? "" : (String) C12465.stream(C13629.spliteratorUnknownSize(it, 16), false).collect(C9357.m24671(str, new C6376(0)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m54284(String str) {
        int length = str == null ? 0 : str.length();
        if (length == 0) {
            return str;
        }
        while (length != 0 && "/".indexOf(str.charAt(length - 1)) != -1) {
            length--;
        }
        return str.substring(0, length);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m54288(String str) {
        int i = 0;
        int length = str == null ? 0 : str.length();
        if (length == 0) {
            return str;
        }
        while (i != length && "/".indexOf(str.charAt(i)) != -1) {
            i++;
        }
        return str.substring(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m54280(char c, int i) {
        if (i <= 0) {
            return "";
        }
        char[] cArr = new char[i];
        Arrays.fill(cArr, c);
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m54281(int i, String str) {
        if (str == null) {
            return null;
        }
        if (i <= 0) {
            return "";
        }
        int length = str.length();
        if (i == 1 || length == 0) {
            return str;
        }
        if (length == 1 && i <= 8192) {
            return m54280(str.charAt(0), i);
        }
        int i2 = length * i;
        if (length == 1) {
            return m54280(str.charAt(0), i);
        }
        if (length == 2) {
            char cCharAt = str.charAt(0);
            char cCharAt2 = str.charAt(1);
            char[] cArr = new char[i2];
            for (int i3 = (i * 2) - 2; i3 >= 0; i3 -= 2) {
                cArr[i3] = cCharAt;
                cArr[i3 + 1] = cCharAt2;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(i2);
        for (int i4 = 0; i4 < i; i4++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
