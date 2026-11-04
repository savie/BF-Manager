package l;

import android.app.LocaleManager;
import android.content.Intent;
import android.os.LocaleList;
import android.view.View;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0619 {

    /* JADX INFO: renamed from: ۬֡᩺, reason: not valid java name and contains not printable characters */
    public static boolean f2439;

    /* JADX INFO: renamed from: ֡᩸ᩴ, reason: not valid java name and contains not printable characters */
    public static void m2749(Object obj, Object obj2) {
        ((C5068) obj).append((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ֨֡ۙ, reason: not valid java name and contains not printable characters */
    public static void m2750(Object obj, Object obj2) throws IOException {
        ((C25179) obj).write((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ֨ܶܳ, reason: not valid java name and contains not printable characters */
    public static void m2751(Object obj) {
        ((View) obj).invalidate();
    }

    /* JADX INFO: renamed from: ֫᩺ۢ, reason: not valid java name and contains not printable characters */
    public static String m2752() {
        return C18978.m44077();
    }

    /* JADX INFO: renamed from: ۚ֨ᩴ, reason: not valid java name and contains not printable characters */
    public static void m2755(int i, int i2, Object obj) {
        C6929.m19210(i, i2, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ۚ᩹ۡ, reason: not valid java name and contains not printable characters */
    public static String m2756(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۛۤܿ, reason: not valid java name and contains not printable characters */
    public static int m2757(Object obj) {
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: ۠֫ܰ, reason: not valid java name and contains not printable characters */
    public static Set m2758(Object obj) {
        return ((IdentityHashMap) obj).keySet();
    }

    /* JADX INFO: renamed from: ۤ᩹᩷, reason: not valid java name and contains not printable characters */
    public static boolean m2759(Object obj, Object obj2) {
        return ((AbstractC18900) obj).m43847((String) obj2);
    }

    /* JADX INFO: renamed from: ۨۜۜ, reason: not valid java name and contains not printable characters */
    public static String m2760(Object obj, Object obj2) {
        return ((Intent) obj).getStringExtra((String) obj2);
    }

    /* JADX INFO: renamed from: ۨ۟ۛ, reason: not valid java name and contains not printable characters */
    public static int m2761(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ܳ᩹ۗ, reason: not valid java name and contains not printable characters */
    public static void m2762(Object obj, Object obj2) {
        ((C8614) obj).m23230((String) obj2);
    }

    /* JADX INFO: renamed from: ܿᩴ۫, reason: not valid java name and contains not printable characters */
    public static boolean m2763() {
        return false;
    }

    /* JADX INFO: renamed from: ᩶᩻ۛ, reason: not valid java name and contains not printable characters */
    public static Integer m2764(int i) {
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ᩹ۙܿ, reason: not valid java name and contains not printable characters */
    public static void m2765(Object obj) throws IOException {
        ((C25179) obj).close();
    }

    /* JADX INFO: renamed from: ᩹᩷᩸, reason: not valid java name and contains not printable characters */
    public static int m2766(Object obj) {
        return ((View) obj).getWidth();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2754(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LocaleList m2753(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }
}
