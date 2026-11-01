package l;

import android.graphics.Rect;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.io.DataOutputStream;

/* JADX INFO: renamed from: l.ۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes.dex */
public final class C2788 {

    /* JADX INFO: renamed from: ۨܽ۬, reason: not valid java name and contains not printable characters */
    public static int f10625;

    /* JADX INFO: renamed from: ֨֨۫, reason: not valid java name and contains not printable characters */
    public static void m8463(Object obj, int i) {
        ((TextView) obj).setTextColor(i);
    }

    /* JADX INFO: renamed from: ۗ֨֨, reason: not valid java name and contains not printable characters */
    public static void m8464(Object obj, int i) {
        ((C6753) obj).m18256(i);
    }

    /* JADX INFO: renamed from: ۚ᩶᩵, reason: not valid java name and contains not printable characters */
    public static byte[] m8467(Object obj, Object obj2, Object obj3) {
        return ((C2455) obj).m7475((C12107) obj2, (C8516) obj3);
    }

    /* JADX INFO: renamed from: ۛۢ֫, reason: not valid java name and contains not printable characters */
    public static void m8468(Object obj, int i, Object obj2) {
        ((C17212) obj).m40149(i, obj2);
    }

    /* JADX INFO: renamed from: ۠᩶֨, reason: not valid java name and contains not printable characters */
    public static C2724 m8469(int i) {
        return C2724.m8305(i);
    }

    /* JADX INFO: renamed from: ۧۛۘ, reason: not valid java name and contains not printable characters */
    public static String m8470(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۨۢܽ, reason: not valid java name and contains not printable characters */
    public static void m8471(Object obj, int i) {
        ((DataOutputStream) obj).writeInt(i);
    }

    /* JADX INFO: renamed from: ۫᩻ܽ, reason: not valid java name and contains not printable characters */
    public static int m8472() {
        return 0;
    }

    /* JADX INFO: renamed from: ܰ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static Boolean m8473(boolean z) {
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ܰ᩻۠, reason: not valid java name and contains not printable characters */
    public static boolean m8474(Object obj) {
        return ((AbstractC20745) obj).mo33975();
    }

    /* JADX INFO: renamed from: ᩴܺ۬, reason: not valid java name and contains not printable characters */
    public static void m8475() {
        C21094.m47530();
    }

    /* JADX INFO: renamed from: ᩷֡ۗ, reason: not valid java name and contains not printable characters */
    public static Integer m8476(int i) {
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ᩺۟ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m8477(Object obj, Object obj2) {
        return ((C5342) obj).mo7854((C5342) obj2);
    }

    /* JADX INFO: renamed from: ᩺ܳܿ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m8478(Object obj) {
        return ((AbstractC20745) obj).m46728();
    }

    /* JADX INFO: renamed from: ᩻ܶᩴ, reason: not valid java name and contains not printable characters */
    public static void m8479(Object obj, int i) {
        ((C8067) obj).m21253(i);
    }

    /* JADX INFO: renamed from: ᩻᩸ۗ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m8480(Object obj, Object obj2) {
        return ((StringBuilder) obj).append((String) obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8465(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8466(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }
}
