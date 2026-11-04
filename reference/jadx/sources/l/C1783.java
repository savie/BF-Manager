package l;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 364S */
/* JADX INFO: loaded from: classes.dex */
public final class C1783 {

    /* JADX INFO: renamed from: ۢᩴ᩺, reason: not valid java name and contains not printable characters */
    public static int f6087;

    /* JADX INFO: renamed from: ۖ֡ۛ, reason: not valid java name and contains not printable characters */
    public static Looper m6230() {
        return Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: ۙ֡ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6232() {
        return true;
    }

    /* JADX INFO: renamed from: ۟ܿۖ, reason: not valid java name and contains not printable characters */
    public static String m6233(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧۜܿ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m6234(Object obj, Object obj2) {
        return ((StringBuilder) obj).append((String) obj2);
    }

    /* JADX INFO: renamed from: ۧ۫ۧ, reason: not valid java name and contains not printable characters */
    public static void m6235(Object obj, Object obj2, Object obj3) {
        ((C25179) obj).m56126((C8002) obj2, (C22941) obj3);
    }

    /* JADX INFO: renamed from: ܰ۟ۨ, reason: not valid java name and contains not printable characters */
    public static byte[] m6236(Object obj, Object obj2) {
        return ((String) obj).getBytes((Charset) obj2);
    }

    /* JADX INFO: renamed from: ܺ᩹᩸, reason: not valid java name and contains not printable characters */
    public static StringBuilder m6237(Object obj, int i) {
        return ((StringBuilder) obj).append(i);
    }

    /* JADX INFO: renamed from: ܽۚۚ, reason: not valid java name and contains not printable characters */
    public static C2592 m6238(int i) {
        return C2592.m8672(i);
    }

    /* JADX INFO: renamed from: ܽܺܽ, reason: not valid java name and contains not printable characters */
    public static C11456 m6239(Object obj) {
        return ((ActivityC16677) obj).f53875;
    }

    /* JADX INFO: renamed from: ᩵᩹᩷, reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m6240(Object obj) {
        return ((View) obj).getLayoutParams();
    }

    /* JADX INFO: renamed from: ᩶ۗۡ, reason: not valid java name and contains not printable characters */
    public static void m6241(Object obj, Object obj2) {
        ((C15856) obj).m37816((String[]) obj2);
    }

    /* JADX INFO: renamed from: ᩶᩹᩷, reason: not valid java name and contains not printable characters */
    public static void m6242(Object obj, Object obj2) {
        ((AbstractC2432) obj).m8190((AbstractActivityC17204) obj2);
    }

    /* JADX INFO: renamed from: ᩷ۛܳ, reason: not valid java name and contains not printable characters */
    public static String m6243(Object obj) {
        return ((Throwable) obj).getMessage();
    }

    /* JADX INFO: renamed from: ᩸۫۬, reason: not valid java name and contains not printable characters */
    public static void m6244(Object obj, int i) {
        ((C23308) obj).m52450(i);
    }

    /* JADX INFO: renamed from: ᩹ᩳ᩸, reason: not valid java name and contains not printable characters */
    public static void m6245(Object obj, Object obj2) throws IOException {
        ((C25179) obj).m56124((String) obj2);
    }

    /* JADX INFO: renamed from: ᩺ܿܺ, reason: not valid java name and contains not printable characters */
    public static String m6246(Object obj, int i) {
        return ((Context) obj).getString(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m6231(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }
}
