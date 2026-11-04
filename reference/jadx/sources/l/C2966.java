package l;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import java.io.DataInputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: T58S */
/* JADX INFO: loaded from: classes.dex */
public final class C2966 {

    /* JADX INFO: renamed from: ۫ܽۗ, reason: not valid java name and contains not printable characters */
    public static int f9654;

    /* JADX INFO: renamed from: ֡ۗ۟, reason: not valid java name and contains not printable characters */
    public static boolean m9659(Object obj, Object obj2) {
        return ((String) obj).endsWith((String) obj2);
    }

    /* JADX INFO: renamed from: ۗۖܿ, reason: not valid java name and contains not printable characters */
    public static void m9660(Object obj, int i, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }

    /* JADX INFO: renamed from: ۛۡᩴ, reason: not valid java name and contains not printable characters */
    public static void m9662(Object obj, int i) {
        ((View) obj).setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: ۜۚܳ, reason: not valid java name and contains not printable characters */
    public static int m9663(Object obj) {
        return ((C24132) obj).m53968();
    }

    /* JADX INFO: renamed from: ۠ۗۘ, reason: not valid java name and contains not printable characters */
    public static boolean m9664() {
        return true;
    }

    /* JADX INFO: renamed from: ۢۛ۫, reason: not valid java name and contains not printable characters */
    public static InterfaceC18752 m9665(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC18752) obj).putString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۨۤ᩺, reason: not valid java name and contains not printable characters */
    public static C9431 m9666(Object obj) {
        return ((AbstractC7283) obj).m19934();
    }

    /* JADX INFO: renamed from: ܳܰܰ, reason: not valid java name and contains not printable characters */
    public static void m9667(Object obj, int i) {
        ((TextView) obj).setTextColor(i);
    }

    /* JADX INFO: renamed from: ܳܽ֫, reason: not valid java name and contains not printable characters */
    public static C22673 m9668(int i) {
        return C22673.m51152(i);
    }

    /* JADX INFO: renamed from: ܿۚ֨, reason: not valid java name and contains not printable characters */
    public static boolean m9669(Object obj) {
        return ((Activity) obj).isFinishing();
    }

    /* JADX INFO: renamed from: ᩳۨ֨, reason: not valid java name and contains not printable characters */
    public static String m9670(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩳ᩶ۖ, reason: not valid java name and contains not printable characters */
    public static int m9671(Object obj) {
        return ((String) obj).length();
    }

    /* JADX INFO: renamed from: ᩷ܰܽ, reason: not valid java name and contains not printable characters */
    public static long m9672(long j, long j2) {
        return C19143.m44353(j, j2);
    }

    /* JADX INFO: renamed from: ᩷᩸۫, reason: not valid java name and contains not printable characters */
    public static boolean m9673() {
        return C18978.m44078();
    }

    /* JADX INFO: renamed from: ᩷᩹ۖ, reason: not valid java name and contains not printable characters */
    public static void m9674(Object obj) {
        ((Thread) obj).start();
    }

    /* JADX INFO: renamed from: ᩺ۚۤ, reason: not valid java name and contains not printable characters */
    public static int m9675(Object obj) {
        return ((DataInputStream) obj).readInt();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Handler m9661(Looper looper) {
        return Handler.createAsync(looper);
    }
}
