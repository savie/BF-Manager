package l;

import android.view.View;
import android.view.WindowInsets;
import bin.mt.plugin.api.PluginContext;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public final class C0862 {

    /* JADX INFO: renamed from: ۜۜۖ, reason: not valid java name and contains not printable characters */
    public static int f3233;

    /* JADX INFO: renamed from: ֫᩺ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m3493(Object obj, Object obj2) {
        return ((List) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ۖܿ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m3494(Object obj) {
        return ((C8002) obj).isDirectory();
    }

    /* JADX INFO: renamed from: ۗۛۗ, reason: not valid java name and contains not printable characters */
    public static String m3495(Object obj) {
        return ((C8002) obj).getName();
    }

    /* JADX INFO: renamed from: ۘ᩺֨, reason: not valid java name and contains not printable characters */
    public static C10186 m3496(Object obj, Object obj2) {
        return C10186.m26300((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۛۗۗ, reason: not valid java name and contains not printable characters */
    public static int m3499(Object obj) {
        return ((InterfaceC12142) obj).mo1542();
    }

    /* JADX INFO: renamed from: ۜ᩸ۖ, reason: not valid java name and contains not printable characters */
    public static String m3500(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۤ᩹᩸, reason: not valid java name and contains not printable characters */
    public static void m3501(Object obj, Object obj2, int i) {
        ((C14787) obj).m35632((String) obj2, i);
    }

    /* JADX INFO: renamed from: ۫ۘܿ, reason: not valid java name and contains not printable characters */
    public static boolean m3502(Object obj, Object obj2) {
        return ((HashSet) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ۫ܳۛ, reason: not valid java name and contains not printable characters */
    public static boolean m3503() {
        return true;
    }

    /* JADX INFO: renamed from: ۬֫ܰ, reason: not valid java name and contains not printable characters */
    public static void m3504(Object obj, float f) {
        ((View) obj).setAlpha(f);
    }

    /* JADX INFO: renamed from: ᩴۧܿ, reason: not valid java name and contains not printable characters */
    public static boolean m3505(Object obj) {
        return ((View) obj).requestFocus();
    }

    /* JADX INFO: renamed from: ᩶ۘ۠, reason: not valid java name and contains not printable characters */
    public static EnumC22631 m3506(Object obj) {
        return ((InterfaceC23331) obj).mo30864();
    }

    /* JADX INFO: renamed from: ᩸֫᩸, reason: not valid java name and contains not printable characters */
    public static void m3507(Object obj, Object obj2) {
        ((AbstractC22044) obj).m49849((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ᩸ۙۖ, reason: not valid java name and contains not printable characters */
    public static String m3508(Object obj, Object obj2) {
        return ((PluginContext) obj).getStringNullable((String) obj2);
    }

    /* JADX INFO: renamed from: ᩹ۡۢ, reason: not valid java name and contains not printable characters */
    public static int m3509(Object obj) {
        return ((CharSequence) obj).length();
    }

    /* JADX INFO: renamed from: ᩻ۜۖ, reason: not valid java name and contains not printable characters */
    public static int m3510(Object obj) {
        return ((StringBuilder) obj).length();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3977 m3497(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C3977 c3977M12812 = C3977.m12812(null, rootWindowInsets);
        c3977M12812.m12819(c3977M12812);
        c3977M12812.m12818(view.getRootView());
        return c3977M12812;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3498(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
