package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ܶۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: S3QK */
/* JADX INFO: loaded from: classes4.dex */
public final class C15034 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Locale[] f49011 = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36021(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr = f49011;
            for (Locale locale3 : localeArr) {
                if (!locale3.equals(locale)) {
                }
            }
            for (Locale locale4 : localeArr) {
                if (!locale4.equals(locale2)) {
                }
            }
            String strM44462 = C19412.m44462(locale);
            if (strM44462.isEmpty()) {
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
            } else {
                return strM44462.equals(C19412.m44462(locale2));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Locale m36020(String str) {
        return Locale.forLanguageTag(str);
    }
}
