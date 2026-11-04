package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۛ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6040 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String m17520(String str) {
        int i = ViewOnClickListenerC11499.f36169;
        int iM3583 = C0878.m3583(str);
        if (iM3583 == -1) {
            return ".";
        }
        String strSubstring = str.substring(iM3583 + 1);
        C15243.m36591(strSubstring, "substring(...)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        C15243.m36591(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
