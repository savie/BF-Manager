package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.۫۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12277 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String m30514(String str) {
        int i = ViewOnClickListenerC8374.f29048;
        int iM31144 = C12529.m31144(str);
        if (iM31144 == -1) {
            return ".";
        }
        String strSubstring = str.substring(iM31144 + 1);
        C13465.m32967(strSubstring, "substring(...)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        C13465.m32967(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
