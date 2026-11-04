package l;

import android.text.TextUtils;
import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ᩴۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AL4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19733 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String f63506;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String f63507;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String f63508;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 f63509;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int f63510;

    static {
        m45437();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m45436() {
        return f63509;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m45438() {
        return f63508;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m45441() {
        return f63507;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45435(String str, String str2) {
        return !TextUtils.isEmpty(f63508) && str.equals(f63508) && str2.equals(f63507);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45434() {
        return TextUtils.isEmpty(f63508);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m45440() {
        return f63506;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m45439() {
        return f63510;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45433(String str, String str2, String str3, String str4, String str5) {
        AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
        if (abstractC22044M35193.mo4281()) {
            f63509 = abstractC22044M35193;
        } else {
            f63509 = C6382.f21566;
        }
        f63508 = str2;
        f63507 = str3;
        try {
            Charset.forName(str4);
            f63506 = str4;
        } catch (Exception unused) {
            f63506 = a.D;
        }
        Integer numM43756 = C18856.m43756(str5);
        if (numM43756 != null) {
            f63510 = numM43756.intValue();
        }
        ApplicationC17729.f58258.edit().putString("rmp", f63509.mo4294()).putString("rmun", f63508).putString("rmpw", f63507).putString("rmcs", f63506).mo3486(f63510, "rmpt").apply();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m45437() {
        String string = ApplicationC17729.f58258.getString("rmp", null);
        if (TextUtils.isEmpty(string)) {
            f63509 = C6382.f21566;
        } else {
            AbstractC22044 abstractC22044M35193 = C14584.m35193(string, new String[0]);
            if (abstractC22044M35193.mo4281()) {
                f63509 = abstractC22044M35193;
            } else {
                f63509 = C6382.f21566;
            }
        }
        f63508 = ApplicationC17729.f58258.getString("rmun", "");
        f63507 = ApplicationC17729.f58258.getString("rmpw", "");
        f63506 = ApplicationC17729.f58258.getString("rmcs", a.D);
        int i = ApplicationC17729.f58258.getInt("rmpt", 2121);
        f63510 = C18856.m43746(i) ? i : 2121;
    }
}
