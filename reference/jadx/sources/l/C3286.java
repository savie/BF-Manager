package l;

import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowInsetsController;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public final class C3286 {

    /* JADX INFO: renamed from: ۤᩴۗ, reason: not valid java name and contains not printable characters */
    public static boolean f12186;

    /* JADX INFO: renamed from: ֫ܽۢ, reason: not valid java name and contains not printable characters */
    public static Object m9779(Object obj) {
        return C13638.requireNonNull(obj);
    }

    /* JADX INFO: renamed from: ۖ۟᩹, reason: not valid java name and contains not printable characters */
    public static int m9781(Object obj) {
        return ((InterfaceC4685) obj).mo1140();
    }

    /* JADX INFO: renamed from: ۖ۠ۡ, reason: not valid java name and contains not printable characters */
    public static C3040 m9782(Object obj) {
        return ((ActivityC4471) obj).f15887;
    }

    /* JADX INFO: renamed from: ۘۛ۟, reason: not valid java name and contains not printable characters */
    public static void m9783(Object obj, Object obj2) {
        ((C19722) obj).m44846((String[]) obj2);
    }

    /* JADX INFO: renamed from: ۚ֨۟, reason: not valid java name and contains not printable characters */
    public static View m9787(Object obj, int i) {
        return ((AbstractActivityC12483) obj).m30995(i);
    }

    /* JADX INFO: renamed from: ۡܿۘ, reason: not valid java name and contains not printable characters */
    public static String m9788(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۤۨ۠, reason: not valid java name and contains not printable characters */
    public static boolean m9789(Object obj) {
        return ((ArrayList) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ۤܽۤ, reason: not valid java name and contains not printable characters */
    public static long m9790() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ۤ᩵ۡ, reason: not valid java name and contains not printable characters */
    public static void m9791(Object obj, Object obj2) {
        ((C6938) obj).setSubtitle((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܺ᩵ۜ, reason: not valid java name and contains not printable characters */
    public static void m9794(Object obj) throws IOException {
        ((OutputStream) obj).close();
    }

    /* JADX INFO: renamed from: ܽܳۡ, reason: not valid java name and contains not printable characters */
    public static void m9795(Object obj) {
        ((C17485) obj).m40694();
    }

    /* JADX INFO: renamed from: ܿۙۧ, reason: not valid java name and contains not printable characters */
    public static Object m9796(Object obj, int i) {
        return ((ArrayList) obj).get(i);
    }

    /* JADX INFO: renamed from: ᩴۜۡ, reason: not valid java name and contains not printable characters */
    public static void m9797(Object obj, Object obj2) {
        ((C6111) obj).mo16989((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩵ܽ۟, reason: not valid java name and contains not printable characters */
    public static int m9798() {
        return 1083118966;
    }

    /* JADX INFO: renamed from: ᩸ܰۘ, reason: not valid java name and contains not printable characters */
    public static boolean m9799(Object obj) {
        return ((AbstractC20745) obj).mo33974();
    }

    /* JADX INFO: renamed from: ᩺ܿۧ, reason: not valid java name and contains not printable characters */
    public static void m9800(Object obj, Object obj2) {
        ((InterfaceC17421) obj).startActivity((Intent) obj2);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C5965 m9792(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return C5965.m16252(windowInsetsController);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9786(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static CharSequence m9793(View view) {
        return view.getStateDescription();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9785(View view, int i) {
        view.setImportantForContentCapture(i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m9780(View view) {
        return view.isImportantForContentCapture();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m9784(View view) {
        return view.getImportantForContentCapture();
    }
}
