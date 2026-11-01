package l;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SU */
/* JADX INFO: loaded from: classes.dex */
public final class C0216 {

    /* JADX INFO: renamed from: ۬᩸ܶ, reason: not valid java name and contains not printable characters */
    public static int f1393;

    /* JADX INFO: renamed from: ֨᩵ۧ, reason: not valid java name and contains not printable characters */
    public static String m1574(int i, Object obj) {
        return C16737.m39264(i, (Object[]) obj);
    }

    /* JADX INFO: renamed from: ֫ᩳۜ, reason: not valid java name and contains not printable characters */
    public static byte m1575(Object obj, int i) {
        return ((C2519) obj).m7860(i);
    }

    /* JADX INFO: renamed from: ۖۘ۟, reason: not valid java name and contains not printable characters */
    public static char m1576(int i, Object obj) {
        return C3184.m9601(i, (String) obj);
    }

    /* JADX INFO: renamed from: ۗۤۖ, reason: not valid java name and contains not printable characters */
    public static void m1577(Object obj) {
        ((InputStream) obj).close();
    }

    /* JADX INFO: renamed from: ۚ᩻ᩴ, reason: not valid java name and contains not printable characters */
    public static void m1580(Object obj, Object obj2) {
        ((C10111) obj).m25739((AbstractC3384) obj2);
    }

    /* JADX INFO: renamed from: ۛ᩻ܰ, reason: not valid java name and contains not printable characters */
    public static void m1581(Object obj, Object obj2) {
        ((AbstractC17902) obj).mo41554((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۤۛۖ, reason: not valid java name and contains not printable characters */
    public static InputStream m1582(Object obj) {
        return ((AbstractC20745) obj).mo33970();
    }

    /* JADX INFO: renamed from: ۤ۫ܺ, reason: not valid java name and contains not printable characters */
    public static long m1583(Object obj, int i) {
        return ((C21775) obj).m48537(i);
    }

    /* JADX INFO: renamed from: ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static Object m1584(Object obj) {
        return ((Iterator) obj).next();
    }

    /* JADX INFO: renamed from: ۨܳۖ, reason: not valid java name and contains not printable characters */
    public static void m1585(Object obj, Object obj2) {
        ((AbstractActivityC12483) obj).m31004((C6938) obj2);
    }

    /* JADX INFO: renamed from: ۨܶ۠, reason: not valid java name and contains not printable characters */
    public static void m1586(Object obj) {
        ((Activity) obj).finish();
    }

    /* JADX INFO: renamed from: ܰۙۚ, reason: not valid java name and contains not printable characters */
    public static String m1588(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܺ᩶᩶, reason: not valid java name and contains not printable characters */
    public static String m1589(Object obj) {
        return ((AbstractC11462) obj).m28629();
    }

    /* JADX INFO: renamed from: ᩶ۡۖ, reason: not valid java name and contains not printable characters */
    public static int m1590(int i, int i2) {
        return Math.min(i, i2);
    }

    /* JADX INFO: renamed from: ᩶᩷ܺ, reason: not valid java name and contains not printable characters */
    public static int m1591() {
        return 1411416934;
    }

    /* JADX INFO: renamed from: ᩷ۚ֨, reason: not valid java name and contains not printable characters */
    public static Object m1592(Object obj, Object obj2) {
        return ((Context) obj).getSystemService((String) obj2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m1587(Uri uri) {
        if (Build.VERSION.SDK_INT < 24) {
            List<String> pathSegments = uri.getPathSegments();
            return pathSegments.size() >= 2 && "tree".equals(pathSegments.get(0));
        }
        return C19973.m45267(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m1579(Uri uri) {
        return C15740.m37466(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m1578(Uri uri, String str) {
        return C15740.m37467(uri, str);
    }
}
