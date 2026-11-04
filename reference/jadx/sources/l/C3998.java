package l;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: OB4B */
/* JADX INFO: loaded from: classes.dex */
public final class C3998 {

    /* JADX INFO: renamed from: ۜ᩺᩺, reason: not valid java name and contains not printable characters */
    public static int f13671;

    /* JADX INFO: renamed from: ۗۖ֡, reason: not valid java name and contains not printable characters */
    public static boolean m12914(Object obj, Object obj2) {
        return C17359.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: ۘۡۧ, reason: not valid java name and contains not printable characters */
    public static C13778 m12915(Object obj) {
        return ((C2592) obj).m8688();
    }

    /* JADX INFO: renamed from: ۚۜ۬, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m12917(Object obj, Object obj2, Object obj3) {
        return ObjectAnimator.ofFloat(obj, (String) obj2, (float[]) obj3);
    }

    /* JADX INFO: renamed from: ۠ۡܽ, reason: not valid java name and contains not printable characters */
    public static boolean m12918(Object obj, Object obj2) {
        return ((C8614) obj).m23228((String) obj2);
    }

    /* JADX INFO: renamed from: ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static int m12919(Object obj) {
        return ((SpannableStringBuilder) obj).length();
    }

    /* JADX INFO: renamed from: ۤۢ۟, reason: not valid java name and contains not printable characters */
    public static boolean m12920() {
        return true;
    }

    /* JADX INFO: renamed from: ۨۙ᩵, reason: not valid java name and contains not printable characters */
    public static void m12921(Object obj) {
        ((ReentrantLock) obj).unlock();
    }

    /* JADX INFO: renamed from: ۬ۢ᩵, reason: not valid java name and contains not printable characters */
    public static Context m12922(Object obj) {
        return ((View) obj).getContext();
    }

    /* JADX INFO: renamed from: ᩳۘ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m12923(Object obj) {
        return ((Iterator) obj).hasNext();
    }

    /* JADX INFO: renamed from: ᩵ᩴۜ, reason: not valid java name and contains not printable characters */
    public static Looper m12924() {
        return Looper.myLooper();
    }

    /* JADX INFO: renamed from: ᩷᩶۟, reason: not valid java name and contains not printable characters */
    public static String m12925(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩹۬֡, reason: not valid java name and contains not printable characters */
    public static String m12926(Object obj) {
        return ((AbstractC22044) obj).getName();
    }

    /* JADX INFO: renamed from: ᩹ᩴ᩸, reason: not valid java name and contains not printable characters */
    public static void m12927(Object obj, Object obj2) {
        ((C25227) obj).setAdapter((AbstractC12964) obj2);
    }

    /* JADX INFO: renamed from: ᩹᩵֨, reason: not valid java name and contains not printable characters */
    public static Editable m12928(Object obj) {
        return ((EditText) obj).getText();
    }

    /* JADX INFO: renamed from: ᩻ᩳ۬, reason: not valid java name and contains not printable characters */
    public static boolean m12929(Object obj) {
        return C18282.m42583((String) obj);
    }

    /* JADX INFO: renamed from: ᩻᩺ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m12930(Object obj) {
        return ((AbstractC22044) obj).mo2934();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17422 m12916(int i) {
        return C17422.m40899(i);
    }
}
