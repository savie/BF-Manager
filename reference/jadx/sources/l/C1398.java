package l;

import android.content.res.Configuration;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes.dex */
public final class C1398 {

    /* JADX INFO: renamed from: ᩻ᩳ֨, reason: not valid java name and contains not printable characters */
    public static int f5802;

    /* JADX INFO: renamed from: ֫ܽۛ, reason: not valid java name and contains not printable characters */
    public static Collection m4889(Object obj) {
        return ((C2455) obj).m7466();
    }

    /* JADX INFO: renamed from: ۗۧܿ, reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m4890(Object obj) {
        return ((View) obj).getLayoutParams();
    }

    /* JADX INFO: renamed from: ۚܺܶ, reason: not valid java name and contains not printable characters */
    public static String m4892(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۚܽܺ, reason: not valid java name and contains not printable characters */
    public static String m4893(Object obj) {
        return ((Throwable) obj).getMessage();
    }

    /* JADX INFO: renamed from: ۛۡ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC17314 m4894(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC17314) obj).putString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۜ֡ۡ, reason: not valid java name and contains not printable characters */
    public static int m4895() {
        return 897889307;
    }

    /* JADX INFO: renamed from: ۜ᩸᩹, reason: not valid java name and contains not printable characters */
    public static void m4896(Object obj, int i) {
        ((Handler) obj).removeMessages(i);
    }

    /* JADX INFO: renamed from: ۡܿ᩺, reason: not valid java name and contains not printable characters */
    public static Button m4897(Object obj) {
        return ((DialogInterfaceC19356) obj).m44373();
    }

    /* JADX INFO: renamed from: ۧۚۨ, reason: not valid java name and contains not printable characters */
    public static Iterator m4898(Object obj) {
        return ((Iterable) obj).iterator();
    }

    /* JADX INFO: renamed from: ۧ᩸᩹, reason: not valid java name and contains not printable characters */
    public static boolean m4899(Object obj, Object obj2) {
        return ((String) obj).startsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ۨۡۙ, reason: not valid java name and contains not printable characters */
    public static int m4900(Object obj) {
        return ((C11092) obj).length();
    }

    /* JADX INFO: renamed from: ۫۠۠, reason: not valid java name and contains not printable characters */
    public static void m4901(Object obj) {
        ((AbstractC0414) obj).notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۬ܳ᩶, reason: not valid java name and contains not printable characters */
    public static void m4902(Object obj) {
        C13465.m32968((String) obj);
    }

    /* JADX INFO: renamed from: ᩸᩶ۨ, reason: not valid java name and contains not printable characters */
    public static String m4903(int i, Object obj) {
        return C8479.m22141(i, (String) obj);
    }

    /* JADX INFO: renamed from: ᩺᩶֫, reason: not valid java name and contains not printable characters */
    public static String m4904(Object obj, char c, char c2) {
        return ((String) obj).replace(c, c2);
    }

    /* JADX INFO: renamed from: ᩻ۢۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4905(Object obj, Object obj2) {
        return ((HashSet) obj).contains(obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4891(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = configuration.colorMode & 3;
        int i2 = configuration2.colorMode & 3;
        if (i != i2) {
            configuration3.colorMode |= i2;
        }
        int i3 = configuration.colorMode & 12;
        int i4 = configuration2.colorMode & 12;
        if (i3 != i4) {
            configuration3.colorMode |= i4;
        }
    }
}
