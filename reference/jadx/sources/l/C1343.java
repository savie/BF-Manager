package l;

import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: l.֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X2Z7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1343 {

    /* JADX INFO: renamed from: ۚ֫ۛ, reason: not valid java name and contains not printable characters */
    public static int f4799;

    /* JADX INFO: renamed from: ֡֫ۛ, reason: not valid java name and contains not printable characters */
    public static boolean m4936(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: ֡᩶ۖ, reason: not valid java name and contains not printable characters */
    public static char m4937(Object obj, int i) {
        return ((String) obj).charAt(i);
    }

    /* JADX INFO: renamed from: ۗۘۙ, reason: not valid java name and contains not printable characters */
    public static int m4938(Object obj) {
        return ((ViewGroup) obj).getChildCount();
    }

    /* JADX INFO: renamed from: ۘ᩸֨, reason: not valid java name and contains not printable characters */
    public static String m4939(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙۗ᩷, reason: not valid java name and contains not printable characters */
    public static String m4941(Object obj) {
        return C18326.m42779((String) obj);
    }

    /* JADX INFO: renamed from: ۛۙۙ, reason: not valid java name and contains not printable characters */
    public static Iterator m4942(Object obj) {
        return ((ArrayList) obj).iterator();
    }

    /* JADX INFO: renamed from: ۤ۟ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m4943() {
        return true;
    }

    /* JADX INFO: renamed from: ܳۤ᩺, reason: not valid java name and contains not printable characters */
    public static InputStream m4944(Object obj) {
        return ((AbstractC22044) obj).mo4290();
    }

    /* JADX INFO: renamed from: ܶᩴ۟, reason: not valid java name and contains not printable characters */
    public static void m4945(Object obj) {
        ((Lock) obj).unlock();
    }

    /* JADX INFO: renamed from: ܶ᩷ᩴ, reason: not valid java name and contains not printable characters */
    public static String m4946(Object obj, Object obj2) {
        return ((String) obj).concat((String) obj2);
    }

    /* JADX INFO: renamed from: ܿ᩸ۧ, reason: not valid java name and contains not printable characters */
    public static Boolean m4947(boolean z) {
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ᩳ᩶᩶, reason: not valid java name and contains not printable characters */
    public static String m4948(Object obj) {
        return ((AbstractC7364) obj).m20218();
    }

    /* JADX INFO: renamed from: ᩵᩵ۛ, reason: not valid java name and contains not printable characters */
    public static View m4949(Object obj, int i) {
        return ((ViewGroup) obj).getChildAt(i);
    }

    /* JADX INFO: renamed from: ᩹֫֡, reason: not valid java name and contains not printable characters */
    public static boolean m4950(Object obj) {
        return ((C20348) obj).m46753();
    }

    /* JADX INFO: renamed from: ᩻۠۫, reason: not valid java name and contains not printable characters */
    public static void m4951(Object obj) {
        ((C13511) obj).m33192();
    }

    /* JADX INFO: renamed from: ᩻᩸᩵, reason: not valid java name and contains not printable characters */
    public static void m4952(Object obj, Object obj2) {
        ((C2361) obj).m8005((View) obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Icon m4940(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }
}
