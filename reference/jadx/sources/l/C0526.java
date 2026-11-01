package l;

import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.io.IOException;

/* JADX INFO: renamed from: l.֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F942 */
/* JADX INFO: loaded from: classes.dex */
public final class C0526 {

    /* JADX INFO: renamed from: ܰ᩶᩷, reason: not valid java name and contains not printable characters */
    public static boolean f2219;

    /* JADX INFO: renamed from: ֡ۨۗ, reason: not valid java name and contains not printable characters */
    public static boolean m2420(Object obj, int i) {
        return ((C8516) obj).m22242(i);
    }

    /* JADX INFO: renamed from: ֫ۘۢ, reason: not valid java name and contains not printable characters */
    public static String m2421(Object obj, Object obj2) {
        return ((Intent) obj).getStringExtra((String) obj2);
    }

    /* JADX INFO: renamed from: ֫ܰ۬, reason: not valid java name and contains not printable characters */
    public static Looper m2422() {
        return Looper.myLooper();
    }

    /* JADX INFO: renamed from: ۗ۟᩺, reason: not valid java name and contains not printable characters */
    public static Context m2423(Object obj) {
        return ((View) obj).getContext();
    }

    /* JADX INFO: renamed from: ۗܺۛ, reason: not valid java name and contains not printable characters */
    public static String m2424(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۚܳ᩷, reason: not valid java name and contains not printable characters */
    public static void m2427(Object obj, int i, Object obj2, int i2, int i3) {
        System.arraycopy(obj, i, obj2, i2, i3);
    }

    /* JADX INFO: renamed from: ۠ۛۛ, reason: not valid java name and contains not printable characters */
    public static C2519 m2428(Object obj, Object obj2) {
        return ((C2519) obj).m7851((C2519) obj2);
    }

    /* JADX INFO: renamed from: ۢۤᩴ, reason: not valid java name and contains not printable characters */
    public static Class m2429(Object obj) {
        return obj.getClass();
    }

    /* JADX INFO: renamed from: ۫֨᩹, reason: not valid java name and contains not printable characters */
    public static void m2430(Object obj, Object obj2) {
        ((C6938) obj).setNavigationOnClickListener((View.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۫᩺᩺, reason: not valid java name and contains not printable characters */
    public static String m2431(Object obj, int i) {
        return C4820.m13401((C1313) obj, i);
    }

    /* JADX INFO: renamed from: ۬ᩳܿ, reason: not valid java name and contains not printable characters */
    public static int m2432(Object obj) {
        return Integer.parseInt((String) obj);
    }

    /* JADX INFO: renamed from: ܽۢۨ, reason: not valid java name and contains not printable characters */
    public static void m2433(Object obj, Object obj2) {
        ViewOnClickListenerC23253.m51310((SpannableStringBuilder) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ܽܺ᩻, reason: not valid java name and contains not printable characters */
    public static void m2434(Object obj) throws IOException {
        ((C22918) obj).close();
    }

    /* JADX INFO: renamed from: ᩴ᩸᩶, reason: not valid java name and contains not printable characters */
    public static void m2435(Object obj, char c) {
        ((C14795) obj).append(c);
    }

    /* JADX INFO: renamed from: ᩷ܰܶ, reason: not valid java name and contains not printable characters */
    public static boolean m2436(Object obj) {
        return ((AbstractC20745) obj).mo24647();
    }

    /* JADX INFO: renamed from: ᩹ۢᩴ, reason: not valid java name and contains not printable characters */
    public static int m2437() {
        return -591333329;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LocusId m2425(String str) {
        return new LocusId(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m2426(LocusId locusId) {
        return locusId.getId();
    }
}
