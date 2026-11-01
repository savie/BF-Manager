package l;

import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB1R */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC3888 implements ThreadFactory {

    /* JADX INFO: renamed from: ܳ᩷᩸, reason: not valid java name and contains not printable characters */
    public static int f14547;

    /* JADX INFO: renamed from: ۗ᩸ۡ, reason: not valid java name and contains not printable characters */
    public static void m11299(Object obj, boolean z) {
        ((C8067) obj).m21265(z);
    }

    /* JADX INFO: renamed from: ۘۤ᩶, reason: not valid java name and contains not printable characters */
    public static int m11300() {
        return 1721964212;
    }

    /* JADX INFO: renamed from: ۙۙ᩻, reason: not valid java name and contains not printable characters */
    public static MenuItem m11301(Object obj, int i, int i2, int i3, int i4) {
        return ((Menu) obj).add(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۠ۜ۠, reason: not valid java name and contains not printable characters */
    public static StringBuilder m11302(Object obj, char c) {
        return ((StringBuilder) obj).append(c);
    }

    /* JADX INFO: renamed from: ۧ۠ܿ, reason: not valid java name and contains not printable characters */
    public static void m11303(Object obj, int i) {
        ((TextView) obj).setText(i);
    }

    /* JADX INFO: renamed from: ۧ᩸ۤ, reason: not valid java name and contains not printable characters */
    public static String m11304(Object obj) {
        return C14952.m35814((AbstractC20745) obj);
    }

    /* JADX INFO: renamed from: ܰܺ۬, reason: not valid java name and contains not printable characters */
    public static Looper m11305() {
        return Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: ܳۖ᩷, reason: not valid java name and contains not printable characters */
    public static int m11306(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ܳ᩺ܶ, reason: not valid java name and contains not printable characters */
    public static boolean m11307(Object obj, Object obj2) {
        return ((String) obj).equalsIgnoreCase((String) obj2);
    }

    /* JADX INFO: renamed from: ܶ֨ᩴ, reason: not valid java name and contains not printable characters */
    public static void m11308(Object obj, Object obj2) {
        ((Executor) obj).execute((Runnable) obj2);
    }

    /* JADX INFO: renamed from: ܽ֫ۖ, reason: not valid java name and contains not printable characters */
    public static void m11309(Object obj, Object obj2, int i, int i2, int i3) {
        ((SpannableStringBuilder) obj).setSpan(obj2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ܽܰܿ, reason: not valid java name and contains not printable characters */
    public static void m11310(Object obj, Object obj2) {
        ((C14795) obj).m35466((String) obj2);
    }

    /* JADX INFO: renamed from: ܽᩴ᩻, reason: not valid java name and contains not printable characters */
    public static String m11311(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ܿܶ֫, reason: not valid java name and contains not printable characters */
    public static String m11312(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩳ֡ۗ, reason: not valid java name and contains not printable characters */
    public static C2519 m11313(Object obj, Object obj2) {
        return ((C2519) obj).m7852((C2519) obj2);
    }

    /* JADX INFO: renamed from: ᩳᩳܺ, reason: not valid java name and contains not printable characters */
    public static void m11314(Object obj) {
        ((View) obj).invalidate();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C13062(runnable);
    }
}
