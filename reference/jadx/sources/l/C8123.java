package l;

import android.icu.util.ULocale;
import java.util.Locale;

/* JADX INFO: renamed from: l.۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O529 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8123 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ULocale m21388(Locale locale) {
        return ULocale.forLocale(locale);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ULocale m21387(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m21389(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
