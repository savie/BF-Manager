package l;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: l.᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes.dex */
public final class C22566 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50071(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17855 m50070(Configuration configuration) {
        return C17855.m41446(configuration.getLocales().toLanguageTags());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50072(Configuration configuration, C17855 c17855) {
        configuration.setLocales(LocaleList.forLanguageTags(c17855.m41452()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50073(C17855 c17855) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c17855.m41452()));
    }
}
