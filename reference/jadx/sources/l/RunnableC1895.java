package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.AbstractCollection;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YF */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1895 implements Runnable {

    /* JADX INFO: renamed from: ۧ᩵۫, reason: not valid java name and contains not printable characters */
    public static boolean f7152;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractViewOnTouchListenerC9658 f7153;

    /* JADX INFO: renamed from: ۘ᩹֨, reason: not valid java name and contains not printable characters */
    public static boolean m6162(Object obj) {
        return ((AbstractCollection) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ۛܿ۟, reason: not valid java name and contains not printable characters */
    public static boolean m6163(Object obj, Object obj2) {
        return ((HashMap) obj).containsKey(obj2);
    }

    /* JADX INFO: renamed from: ۟ۢۚ, reason: not valid java name and contains not printable characters */
    public static String m6164(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۟ܽܶ, reason: not valid java name and contains not printable characters */
    public static void m6165(Object obj, int i) {
        ((View) obj).setVisibility(i);
    }

    /* JADX INFO: renamed from: ۨܶ᩷, reason: not valid java name and contains not printable characters */
    public static C2519 m6166(Object obj, Object obj2) {
        return ((C2519) obj).m7859((C2519) obj2);
    }

    /* JADX INFO: renamed from: ܰۧ᩶, reason: not valid java name and contains not printable characters */
    public static int m6167(Object obj) {
        return ((View) obj).getScrollX();
    }

    /* JADX INFO: renamed from: ܳ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m6168(Object obj, Object obj2) {
        return ((StringBuilder) obj).append(obj2);
    }

    /* JADX INFO: renamed from: ܶ᩻ۖ, reason: not valid java name and contains not printable characters */
    public static String m6169(Object obj) {
        return ((C12107) obj).getName();
    }

    /* JADX INFO: renamed from: ܺ֨ᩳ, reason: not valid java name and contains not printable characters */
    public static int m6170() {
        return 0;
    }

    /* JADX INFO: renamed from: ܺ᩶ۡ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m6171(Object obj, Object obj2) {
        return C5553.m15313((String) obj, (String[]) obj2);
    }

    /* JADX INFO: renamed from: ᩳܽ᩺, reason: not valid java name and contains not printable characters */
    public static Object m6172(Object obj, Object obj2, Object obj3) {
        return ((HashMap) obj).put(obj2, obj3);
    }

    /* JADX INFO: renamed from: ᩴ۬֫, reason: not valid java name and contains not printable characters */
    public static int m6173(Object obj) {
        return ((ViewGroup) obj).getChildCount();
    }

    /* JADX INFO: renamed from: ᩸ۖ᩶, reason: not valid java name and contains not printable characters */
    public static int m6174(Object obj) {
        return ((C1313) obj).m4681();
    }

    /* JADX INFO: renamed from: ᩸ۘۤ, reason: not valid java name and contains not printable characters */
    public static void m6175(Object obj) {
        ((C7817) obj).m20606();
    }

    /* JADX INFO: renamed from: ᩸᩷᩹, reason: not valid java name and contains not printable characters */
    public static boolean m6176(Object obj, Object obj2) {
        return ((String) obj).endsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ᩹ۧ֨, reason: not valid java name and contains not printable characters */
    public static boolean m6177(Object obj) {
        return ((C11545) obj).m28800();
    }

    public RunnableC1895(AbstractViewOnTouchListenerC9658 abstractViewOnTouchListenerC9658) {
        this.f7153 = abstractViewOnTouchListenerC9658;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7153.m24557();
    }
}
