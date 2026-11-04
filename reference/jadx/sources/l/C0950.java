package l;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 495M */
/* JADX INFO: loaded from: classes.dex */
public final class C0950 {

    /* JADX INFO: renamed from: ֡᩸ۛ, reason: not valid java name and contains not printable characters */
    public static int f3488;

    /* JADX INFO: renamed from: ֨֨۟, reason: not valid java name and contains not printable characters */
    public static String m3780(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֫ۤ۫, reason: not valid java name and contains not printable characters */
    public static boolean m3781(Object obj, Object obj2, boolean z) {
        return ((InterfaceC9801) obj).getBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۘ᩻ۖ, reason: not valid java name and contains not printable characters */
    public static void m3782(Object obj, Object obj2, Object obj3) {
        ((C18872) obj).m43775((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۛ᩹ܽ, reason: not valid java name and contains not printable characters */
    public static int m3785() {
        return 0;
    }

    /* JADX INFO: renamed from: ۛ᩻ۚ, reason: not valid java name and contains not printable characters */
    public static String m3786(Object obj, Object obj2, Object obj3) {
        return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۜۚۧ, reason: not valid java name and contains not printable characters */
    public static String m3787(Object obj, char c, char c2) {
        return ((String) obj).replace(c, c2);
    }

    /* JADX INFO: renamed from: ۡ֨۫, reason: not valid java name and contains not printable characters */
    public static void m3788(Object obj, int i) {
        ((C24132) obj).mo52339(i);
    }

    /* JADX INFO: renamed from: ۢ۫᩹, reason: not valid java name and contains not printable characters */
    public static long m3789() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ۫ܽܿ, reason: not valid java name and contains not printable characters */
    public static void m3790(Object obj) {
        ((Activity) obj).finish();
    }

    /* JADX INFO: renamed from: ܰۢ᩹, reason: not valid java name and contains not printable characters */
    public static C10186 m3791(Object obj, Object obj2) {
        return C10186.m26305((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ܶۧ᩵, reason: not valid java name and contains not printable characters */
    public static int m3792(Object obj) {
        return ((View) obj).getId();
    }

    /* JADX INFO: renamed from: ܽܿۘ, reason: not valid java name and contains not printable characters */
    public static MenuItem m3793(Object obj, int i, int i2, int i3, int i4) {
        return ((Menu) obj).add(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ܿ֡֨, reason: not valid java name and contains not printable characters */
    public static C2361 m3794(Object obj) {
        return ((InterfaceC15712) obj).buildDialog();
    }

    /* JADX INFO: renamed from: ܿۘ۬, reason: not valid java name and contains not printable characters */
    public static byte[] m3795(Object obj, Object obj2, Object obj3) {
        return ((C22941) obj).m51731((C8002) obj2, (C3374) obj3);
    }

    /* JADX INFO: renamed from: ᩳ᩷ܺ, reason: not valid java name and contains not printable characters */
    public static Object m3796(Object obj) {
        return ((Iterator) obj).next();
    }

    /* JADX INFO: renamed from: ᩸ۤ᩺, reason: not valid java name and contains not printable characters */
    public static void m3797(Object obj) throws IOException {
        ((OutputStream) obj).close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3783(C9898 c9898, int i) {
        c9898.setHeaderTitleInt(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3784(C9898 c9898, CharSequence charSequence) {
        c9898.setHeaderTitleInt(charSequence);
    }
}
