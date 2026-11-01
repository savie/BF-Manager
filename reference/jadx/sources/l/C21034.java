package l;

import android.text.TextUtils;
import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩷ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AL4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21034 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int f68509;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String f68510;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String f68511;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String f68512;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 f68513;

    static {
        m47430();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m47436() {
        return f68513;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static String m47438() {
        return f68511;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m47431() {
        return f68512;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47434(String str, String str2) {
        return !TextUtils.isEmpty(f68511) && str.equals(f68511) && str2.equals(f68512);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47433() {
        return TextUtils.isEmpty(f68511);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m47437() {
        return f68510;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m47435() {
        return f68509;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47432(String str, String str2, String str3, String str4, String str5) {
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
        if (abstractC20745M15313.mo33974()) {
            f68513 = abstractC20745M15313;
        } else {
            f68513 = C11904.f39934;
        }
        f68511 = str2;
        f68512 = str3;
        try {
            Charset.forName(str4);
            f68510 = str4;
        } catch (Exception unused) {
            f68510 = a.D;
        }
        Integer numM37905 = C15945.m37905(str5);
        if (numM37905 != null) {
            f68509 = numM37905.intValue();
        }
        ApplicationC0716.f2992.edit().putString("rmp", f68513.mo33986()).putString("rmun", f68511).putString("rmpw", f68512).putString("rmcs", f68510).mo4065(f68509, "rmpt").apply();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m47430() {
        String string = ApplicationC0716.f2992.getString("rmp", null);
        if (TextUtils.isEmpty(string)) {
            f68513 = C11904.f39934;
        } else {
            AbstractC20745 abstractC20745M15313 = C5553.m15313(string, new String[0]);
            if (abstractC20745M15313.mo33974()) {
                f68513 = abstractC20745M15313;
            } else {
                f68513 = C11904.f39934;
            }
        }
        f68511 = ApplicationC0716.f2992.getString("rmun", "");
        f68512 = ApplicationC0716.f2992.getString("rmpw", "");
        f68510 = ApplicationC0716.f2992.getString("rmcs", a.D);
        int i = ApplicationC0716.f2992.getInt("rmpt", 2121);
        f68509 = C15945.m37906(i) ? i : 2121;
    }
}
