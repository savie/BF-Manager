package l;

import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩸ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K2RY */
/* JADX INFO: loaded from: classes4.dex */
public final class C21420 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f69633 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final char f69634;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final char f69635;

    static {
        Character.toString('.');
        char c = File.separatorChar;
        f69634 = c;
        char c2 = '\\';
        if (c != '/') {
            if (c != '\\') {
                throw new IllegalArgumentException(String.valueOf(c));
            }
            c2 = '/';
        }
        f69635 = c2;
        Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m47958(String str) {
        int i;
        if (str != null) {
            char c = f69634;
            if (c == '\\') {
                int iLastIndexOf = str.lastIndexOf(c);
                int iLastIndexOf2 = str.lastIndexOf(f69635);
                if (iLastIndexOf == -1) {
                    i = iLastIndexOf2 == -1 ? 0 : iLastIndexOf2 + 1;
                } else {
                    if (iLastIndexOf2 != -1) {
                        iLastIndexOf = Math.max(iLastIndexOf, iLastIndexOf2);
                    }
                    i = iLastIndexOf + 1;
                }
                if (str.indexOf(58, i) != -1) {
                    throw new IllegalArgumentException("NTFS ADS separator (':') in file name is forbidden.");
                }
            }
            int iLastIndexOf3 = str.lastIndexOf(46);
            if (Math.max(str.lastIndexOf(47), str.lastIndexOf(92)) <= iLastIndexOf3) {
                return iLastIndexOf3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m47956(String str) {
        if (str == null) {
            return null;
        }
        if (str.indexOf(0) < 0) {
            return str.substring(Math.max(str.lastIndexOf(47), str.lastIndexOf(92)) + 1);
        }
        throw new IllegalArgumentException("Null character present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m47957(String str) {
        if (str == null) {
            return null;
        }
        if (str.indexOf(0) < 0) {
            int iM47958 = m47958(str);
            return iM47958 == -1 ? str : str.substring(0, iM47958);
        }
        throw new IllegalArgumentException("Null character present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
    }
}
