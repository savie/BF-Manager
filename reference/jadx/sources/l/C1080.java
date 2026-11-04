package l;

import android.net.Uri;
import android.os.Build;
import android.view.MenuItem;
import android.widget.TextView;
import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SU */
/* JADX INFO: loaded from: classes.dex */
public final class C1080 {

    /* JADX INFO: renamed from: ۬ܿܺ, reason: not valid java name and contains not printable characters */
    public static int f3865;

    /* JADX INFO: renamed from: ֡ᩳܶ, reason: not valid java name and contains not printable characters */
    public static JSONObject m4045() {
        return JSON.object();
    }

    /* JADX INFO: renamed from: ֫ۧ᩻, reason: not valid java name and contains not printable characters */
    public static StringBuilder m4046(Object obj, char c) {
        return ((StringBuilder) obj).append(c);
    }

    /* JADX INFO: renamed from: ۖܿۘ, reason: not valid java name and contains not printable characters */
    public static int m4047(Object obj) {
        return ((C24132) obj).m53882();
    }

    /* JADX INFO: renamed from: ۗ۫ۛ, reason: not valid java name and contains not printable characters */
    public static void m4048(Object obj, Object obj2) {
        ((C2592) obj).m8687((String) obj2);
    }

    /* JADX INFO: renamed from: ۘۧܽ, reason: not valid java name and contains not printable characters */
    public static String m4049(Object obj) {
        return ((C13778) obj).m33677();
    }

    /* JADX INFO: renamed from: ۘܳۘ, reason: not valid java name and contains not printable characters */
    public static boolean m4050() {
        return true;
    }

    /* JADX INFO: renamed from: ۜܳۜ, reason: not valid java name and contains not printable characters */
    public static C24943 m4053(Object obj) {
        return ((ActivityC2350) obj).f7578;
    }

    /* JADX INFO: renamed from: ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static Collection m4054(Object obj) {
        return ((C22941) obj).m51742();
    }

    /* JADX INFO: renamed from: ۢܶᩴ, reason: not valid java name and contains not printable characters */
    public static void m4055(Object obj) {
        ((Runnable) obj).run();
    }

    /* JADX INFO: renamed from: ܰ֫֡, reason: not valid java name and contains not printable characters */
    public static String m4056(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܺܰۙ, reason: not valid java name and contains not printable characters */
    public static String m4057(Object obj, boolean z) {
        return C13047.m32489((String) obj, z);
    }

    /* JADX INFO: renamed from: ܿܽ۠, reason: not valid java name and contains not printable characters */
    public static String m4058(Object obj) {
        return obj.toString();
    }

    /* JADX INFO: renamed from: ᩴ֨ܺ, reason: not valid java name and contains not printable characters */
    public static byte m4059(Object obj) {
        return ((C20348) obj).readByte();
    }

    /* JADX INFO: renamed from: ᩵֡᩹, reason: not valid java name and contains not printable characters */
    public static void m4060(Object obj, int i) {
        ((TextView) obj).setText(i);
    }

    /* JADX INFO: renamed from: ᩶᩵֡, reason: not valid java name and contains not printable characters */
    public static MenuItem m4061(Object obj, int i) {
        return ((MenuItem) obj).setIcon(i);
    }

    /* JADX INFO: renamed from: ᩷᩻᩸, reason: not valid java name and contains not printable characters */
    public static boolean m4063(Object obj) {
        return ((C8614) obj).m23193();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m4062(Uri uri) {
        if (Build.VERSION.SDK_INT < 24) {
            List<String> pathSegments = uri.getPathSegments();
            return pathSegments.size() >= 2 && "tree".equals(pathSegments.get(0));
        }
        return C10028.m25877(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4052(Uri uri) {
        return C18979.m44087(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m4051(Uri uri, String str) {
        return C18979.m44086(uri, str);
    }
}
