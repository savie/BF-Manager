package l;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: l.ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5708 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16745(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12266 m16744(Configuration configuration) {
        return C12266.m30636(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16746(Configuration configuration, C12266 c12266) {
        configuration.setLocales(LocaleList.forLanguageTags(c12266.m30641()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16747(C12266 c12266) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c12266.m30641()));
    }
}
