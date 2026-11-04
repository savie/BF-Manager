package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4M5 */
/* JADX INFO: loaded from: classes.dex */
public final class C3779 {

    /* JADX INFO: renamed from: ᩹ܶ۬, reason: not valid java name and contains not printable characters */
    public static int f12953;

    /* JADX INFO: renamed from: ֡ۗ֡, reason: not valid java name and contains not printable characters */
    public static void m12255(Object obj, Object obj2) throws IOException {
        ((C25179) obj).m56124((String) obj2);
    }

    /* JADX INFO: renamed from: ֨ܳܶ, reason: not valid java name and contains not printable characters */
    public static void m12256(Object obj, int i) {
        ((C23308) obj).m52450(i);
    }

    /* JADX INFO: renamed from: ֫֫᩻, reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m12257(Object obj) {
        return ((View) obj).getLayoutParams();
    }

    /* JADX INFO: renamed from: ۗۚۛ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m12258(Object obj, Object obj2) {
        return ((StringBuilder) obj).append((String) obj2);
    }

    /* JADX INFO: renamed from: ۛܺ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m12260(Object obj, Object obj2) {
        return ((String) obj).getBytes((Charset) obj2);
    }

    /* JADX INFO: renamed from: ۜ֨ۧ, reason: not valid java name and contains not printable characters */
    public static String m12261(Object obj) {
        return ((Throwable) obj).getMessage();
    }

    /* JADX INFO: renamed from: ۟֫ۛ, reason: not valid java name and contains not printable characters */
    public static void m12262(Object obj, Object obj2, Object obj3) {
        ((C25179) obj).m56126((C8002) obj2, (C22941) obj3);
    }

    /* JADX INFO: renamed from: ۢۗ᩶, reason: not valid java name and contains not printable characters */
    public static C11456 m12263(Object obj) {
        return ((ActivityC16677) obj).f53875;
    }

    /* JADX INFO: renamed from: ۧۚ֡, reason: not valid java name and contains not printable characters */
    public static boolean m12264() {
        return true;
    }

    /* JADX INFO: renamed from: ۨۡܿ, reason: not valid java name and contains not printable characters */
    public static void m12265(Object obj, Object obj2) {
        ((C15856) obj).m37816((String[]) obj2);
    }

    /* JADX INFO: renamed from: ۫ܺۡ, reason: not valid java name and contains not printable characters */
    public static String m12266(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۬᩻۬, reason: not valid java name and contains not printable characters */
    public static void m12267(Object obj, Object obj2) {
        ((AbstractC2432) obj).m8190((AbstractActivityC17204) obj2);
    }

    /* JADX INFO: renamed from: ܺۢ᩷, reason: not valid java name and contains not printable characters */
    public static Looper m12268() {
        return Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: ᩳ᩸ܺ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m12269(Object obj, int i) {
        return ((StringBuilder) obj).append(i);
    }

    /* JADX INFO: renamed from: ᩷ᩴܳ, reason: not valid java name and contains not printable characters */
    public static C2592 m12270(int i) {
        return C2592.m8672(i);
    }

    /* JADX INFO: renamed from: ᩻᩺᩻, reason: not valid java name and contains not printable characters */
    public static String m12271(Object obj, int i) {
        return ((Context) obj).getString(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Drawable m12259(Context context, int i) {
        return context.getDrawable(i);
    }
}
