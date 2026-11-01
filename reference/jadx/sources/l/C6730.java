package l;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import bin.mt.plus.R;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۜۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: XALX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6730 implements InterfaceC18739 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Locale f22657;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m18157(String str) {
        if (str == null) {
            return null;
        }
        return C20630.m46498(1, 1, str);
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public int mo12775(long j) {
        return 0;
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public void mo12777() {
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۚ */
    public boolean mo12778() {
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m18172(String str) {
        int iLastIndexOf;
        if (str.length() > 1 && str.endsWith("/")) {
            str = C20630.m46498(1, 0, str);
            if (str.endsWith("/")) {
                return str;
            }
        }
        if (str.isEmpty() || str.equals("/") || (iLastIndexOf = str.lastIndexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18159(int i) {
        return new String(new char[]{'0', 'x', "0123456789abcdef".charAt((i >>> 28) & 15), "0123456789abcdef".charAt((i >>> 24) & 15), "0123456789abcdef".charAt((i >>> 20) & 15), "0123456789abcdef".charAt((i >>> 16) & 15), "0123456789abcdef".charAt((i >>> 12) & 15), "0123456789abcdef".charAt((i >>> 8) & 15), "0123456789abcdef".charAt((i >>> 4) & 15), "0123456789abcdef".charAt(i & 15)});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18162(String str, String str2) {
        if (str2.startsWith("/")) {
            str2 = str2.substring(1);
        }
        if (str.isEmpty()) {
            return str2;
        }
        if (str.endsWith("/")) {
            return C15489.m37076(str, str2);
        }
        return str + '/' + str2;
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public int mo12776(C12526 c12526, C16033 c16033, int i) {
        c16033.m42267(4);
        return -4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18170(StringBuilder sb, int i) {
        if (i < 0 || i >= 1000) {
            sb.append(String.format(Locale.ENGLISH, "%03d", Integer.valueOf(i)));
            return;
        }
        sb.append((i / 100) % 10);
        sb.append((i / 10) % 10);
        sb.append(i % 10);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18161(String str) {
        if (str.equals("/")) {
            return C16737.m39288(R.string.MT_Protector);
        }
        if (str.length() > 1 && str.endsWith("/")) {
            str = C20630.m46498(1, 0, str);
        }
        String strM39305 = C16753.m39305(str);
        return strM39305 == null ? m18175(str) : strM39305;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m18175(String str) {
        if (str.length() > 1 && str.endsWith("/")) {
            str = C20630.m46498(1, 0, str);
        }
        if (str.isEmpty() || str.equals("/")) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18171(ActivityC10845 activityC10845, String str) {
        Locale localeM18164 = m18164((Context) activityC10845, str);
        m18167((ContextWrapper) activityC10845, str);
        m18168(activityC10845, localeM18164);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18160(Context context) {
        SharedPreferences sharedPreferencesM15442 = ApplicationC0716.f2988;
        if (sharedPreferencesM15442 == null && context != null) {
            sharedPreferencesM15442 = C5582.m15442(context);
        }
        return sharedPreferencesM15442 == null ? "auto" : sharedPreferencesM15442.getString("custom_language", "auto");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Locale m18163(Application application) {
        return m18164((Context) application, (String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18166(ContextWrapper contextWrapper) {
        m18168(contextWrapper, m18164((Context) contextWrapper, (String) null));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m18173() {
        Locale localeM18164 = m18164((Context) null, (String) null);
        return localeM18164.getLanguage().equals("zh") && localeM18164.getCountry().equals("CN");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m18176() {
        return m18164((Context) null, (String) null).getLanguage().equals("zh");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Locale m18165(Resources resources) {
        Locale localeM41450 = C3743.m10953(resources.getConfiguration()).m41450(0);
        if (localeM41450 != null) {
            return localeM41450;
        }
        Locale locale = resources.getConfiguration().locale;
        return locale != null ? locale : Locale.getDefault();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Context m18174(Context context) {
        if (f22657 == null) {
            f22657 = m18165(Resources.getSystem());
        }
        Locale localeM18164 = m18164(context, (String) null);
        if (C13638.equals(localeM18164, m18165(context.getResources()))) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(localeM18164);
        configuration.setLayoutDirection(localeM18164);
        return context.createConfigurationContext(configuration);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m18158() {
        Locale localeM18165 = m18165(Resources.getSystem());
        if (localeM18165 != null) {
            f22657 = localeM18165;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18168(ContextWrapper contextWrapper, Locale locale) {
        m18169(contextWrapper.getResources(), locale);
        Resources resources = contextWrapper.getResources();
        try {
            Resources resourcesM39279 = C16737.m39279();
            if (resourcesM39279 != resources) {
                m18169(resourcesM39279, locale);
            }
        } catch (Throwable unused) {
        }
        C2724.m8310(locale);
        C21157.m47605(locale.getLanguage());
        C21157.m47607(locale.getCountry());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18169(Resources resources, Locale locale) {
        if (C13638.equals(locale, m18165(resources))) {
            return;
        }
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.setLocale(locale);
        configuration.setLayoutDirection(locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Locale m18164(Context context, String str) {
        if (str == null) {
            str = m18160(context);
        }
        str.getClass();
        switch (str) {
            case "zh-rCN":
                return Locale.SIMPLIFIED_CHINESE;
            case "zh-rTW":
                return Locale.TRADITIONAL_CHINESE;
            case "az":
            case "be":
            case "es":
            case "in":
            case "it":
            case "ru":
            case "tr":
            case "uk":
                return new Locale(str);
            case "en":
                return Locale.ENGLISH;
            case "auto":
                Locale locale = f22657;
                return locale != null ? locale : Locale.getDefault();
            default:
                throw new IllegalArgumentException("Unknown language name: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18167(ContextWrapper contextWrapper, String str) {
        C17855 c17855M41447;
        if (str == null) {
            str = m18160((Context) contextWrapper);
        }
        if ("auto".equals(str)) {
            c17855M41447 = C17855.m41448();
        } else {
            c17855M41447 = C17855.m41447(m18164((Context) contextWrapper, str));
        }
        if (C13638.equals(c17855M41447.m41452(), AbstractC17129.m40005().m41452())) {
            return;
        }
        AbstractC17129.m39997(c17855M41447);
    }
}
