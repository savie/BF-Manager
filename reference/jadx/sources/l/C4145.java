package l;

import com.umeng.commonsdk.debug.UMLog;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۘ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: IC6V */
/* JADX INFO: loaded from: classes2.dex */
public final class C4145 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15163 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f15162 = {"", " ", EnumC19730.f63352, "   ", ASN1Dump.TAB, UMLog.INDENT, "      ", "       ", EnumC19730.f63358, "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f15165 = Pattern.compile("^/((\\.{1,2}/)+)");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f15167 = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f15166 = Pattern.compile("[\\x00-\\x1f]*");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f15164 = new C13319();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11785(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11781(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        StringBuilder sbM11782 = m11782();
        C5557.m15341(sbM11782);
        Object obj = string;
        while (true) {
            sbM11782.append(obj);
            if (it.hasNext()) {
                Object next = it.next();
                sbM11782.append(str);
                obj = next;
            } else {
                return m11780(sbM11782);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11778(int i, int i2) {
        if (!(i >= 0)) {
            throw new C22491("width must be >= 0");
        }
        C5557.m15344(i2 >= -1);
        if (i2 != -1) {
            i = Math.min(i, i2);
        }
        if (i < 21) {
            return f15162[i];
        }
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = ' ';
        }
        return String.valueOf(cArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11786(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m11785(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11784(String str, StringBuilder sb, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13 || iCodePointAt == 160) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (iCodePointAt != 8203 && iCodePointAt != 173) {
                sb.appendCodePoint(iCodePointAt);
                z2 = true;
                z3 = false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m11787(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11779(String str, String str2) {
        Pattern pattern = f15166;
        String strReplaceAll = pattern.matcher(str).replaceAll("");
        String strReplaceAll2 = pattern.matcher(str2).replaceAll("");
        try {
            try {
                return m11783(new URL(strReplaceAll), strReplaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(strReplaceAll2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return f15167.matcher(strReplaceAll2).find() ? strReplaceAll2 : "";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static URL m11783(URL url, String str) {
        String strReplaceAll = f15166.matcher(str).replaceAll("");
        if (strReplaceAll.startsWith("?")) {
            strReplaceAll = C15489.m37076(url.getPath(), strReplaceAll);
        }
        URL url2 = new URL(url, strReplaceAll);
        String strReplaceFirst = f15165.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            strReplaceFirst = C1679.m5594(strReplaceFirst, "#", url2.getRef());
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m11782() {
        Stack stack = (Stack) f15164.get();
        if (stack.empty()) {
            return new StringBuilder(8192);
        }
        return (StringBuilder) stack.pop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11780(StringBuilder sb) {
        C5557.m15341(sb);
        String string = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack stack = (Stack) f15164.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return string;
    }
}
