package l;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public final class C2354 {

    /* JADX INFO: renamed from: ᩵ۜ֨, reason: not valid java name and contains not printable characters */
    public static int f7599;

    /* JADX INFO: renamed from: ֨᩺ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m7967(Object obj, Object obj2) {
        return ((String) obj).equalsIgnoreCase((String) obj2);
    }

    /* JADX INFO: renamed from: ۖ᩹֫, reason: not valid java name and contains not printable characters */
    public static Iterator m7968(Object obj) {
        return ((List) obj).iterator();
    }

    /* JADX INFO: renamed from: ۗ۫ᩳ, reason: not valid java name and contains not printable characters */
    public static Throwable m7969(Object obj) {
        return ((Throwable) obj).getCause();
    }

    /* JADX INFO: renamed from: ۜۡۛ, reason: not valid java name and contains not printable characters */
    public static Object m7973(Object obj, Object obj2) {
        return ((Context) obj).getSystemService((String) obj2);
    }

    /* JADX INFO: renamed from: ۢܽ᩺, reason: not valid java name and contains not printable characters */
    public static Iterator m7974(Object obj) {
        return ((AbstractC8696) obj).iterator();
    }

    /* JADX INFO: renamed from: ۧۧۗ, reason: not valid java name and contains not printable characters */
    public static C17505 m7975(Object obj) {
        return ((InterfaceC19106) obj).mo11043();
    }

    /* JADX INFO: renamed from: ۨ۟᩻, reason: not valid java name and contains not printable characters */
    public static int m7976(int i, int i2) {
        return Math.min(i, i2);
    }

    /* JADX INFO: renamed from: ܰۗ᩺, reason: not valid java name and contains not printable characters */
    public static long m7977(Object obj) {
        return ((C8002) obj).getSize();
    }

    /* JADX INFO: renamed from: ܳ۫᩸, reason: not valid java name and contains not printable characters */
    public static void m7978(Object obj, Object obj2) {
        ((TextView) obj).setText((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܶۙ᩺, reason: not valid java name and contains not printable characters */
    public static int m7979(Object obj, int i) {
        return C23434.m52632((Resources.Theme) obj, i);
    }

    /* JADX INFO: renamed from: ܺۙᩴ, reason: not valid java name and contains not printable characters */
    public static String m7980(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܽۘ᩻, reason: not valid java name and contains not printable characters */
    public static String m7981(int i, Object obj) {
        return C13645.m33382(i, (String) obj);
    }

    /* JADX INFO: renamed from: ܿۙ᩸, reason: not valid java name and contains not printable characters */
    public static void m7982(Object obj, boolean z) {
        ((View) obj).setEnabled(z);
    }

    /* JADX INFO: renamed from: ܿᩳᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m7983() {
        return true;
    }

    /* JADX INFO: renamed from: ᩹᩵֡, reason: not valid java name and contains not printable characters */
    public static Set m7984(Object obj) {
        return ((InterfaceC1174) obj).mo4327();
    }

    /* JADX INFO: renamed from: ᩺ᩳ۫, reason: not valid java name and contains not printable characters */
    public static Iterator m7985(Object obj) {
        return ((Collection) obj).iterator();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7972(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m7970(View view) {
        return view.getImportantForAutofill();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7971(View view, int i) {
        view.setImportantForAutofill(i);
    }
}
