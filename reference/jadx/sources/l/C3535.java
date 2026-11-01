package l;

import android.graphics.Typeface;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes.dex */
public final class C3535 {

    /* JADX INFO: renamed from: ۢۜ᩶, reason: not valid java name and contains not printable characters */
    public static int f13026;

    /* JADX INFO: renamed from: ֡ܳ֨, reason: not valid java name and contains not printable characters */
    public static String m10415(Object obj) {
        return ((Throwable) obj).getMessage();
    }

    /* JADX INFO: renamed from: ֡ܽᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m10416(Object obj, Object obj2) {
        return ((HashSet) obj).contains(obj2);
    }

    /* JADX INFO: renamed from: ۘۤ᩹, reason: not valid java name and contains not printable characters */
    public static Iterator m10417(Object obj) {
        return ((Iterable) obj).iterator();
    }

    /* JADX INFO: renamed from: ۙ᩶᩻, reason: not valid java name and contains not printable characters */
    public static Collection m10419(Object obj) {
        return ((C2455) obj).m7466();
    }

    /* JADX INFO: renamed from: ۛ֡ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m10420(Object obj, Object obj2) {
        return ((String) obj).startsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ۢܿ֫, reason: not valid java name and contains not printable characters */
    public static int m10421(Object obj) {
        return ((C11092) obj).length();
    }

    /* JADX INFO: renamed from: ۤܶܰ, reason: not valid java name and contains not printable characters */
    public static void m10422(Object obj) {
        ((AbstractC0414) obj).notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۧۤ۟, reason: not valid java name and contains not printable characters */
    public static String m10423(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ᩺ۖ, reason: not valid java name and contains not printable characters */
    public static String m10424(int i, Object obj) {
        return C8479.m22141(i, (String) obj);
    }

    /* JADX INFO: renamed from: ۬۟ᩴ, reason: not valid java name and contains not printable characters */
    public static Button m10425(Object obj) {
        return ((DialogInterfaceC19356) obj).m44373();
    }

    /* JADX INFO: renamed from: ۬᩹ۤ, reason: not valid java name and contains not printable characters */
    public static void m10426(Object obj) {
        C13465.m32968((String) obj);
    }

    /* JADX INFO: renamed from: ܽ۬ܿ, reason: not valid java name and contains not printable characters */
    public static String m10427(Object obj, char c, char c2) {
        return ((String) obj).replace(c, c2);
    }

    /* JADX INFO: renamed from: ܽܰ᩻, reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m10428(Object obj) {
        return ((View) obj).getLayoutParams();
    }

    /* JADX INFO: renamed from: ᩴۙۡ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17314 m10429(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC17314) obj).putString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩸᩵֨, reason: not valid java name and contains not printable characters */
    public static void m10430(Object obj, int i) {
        ((Handler) obj).removeMessages(i);
    }

    /* JADX INFO: renamed from: ᩺᩺ۖ, reason: not valid java name and contains not printable characters */
    public static int m10431() {
        return 1862100881;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m10418(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }
}
