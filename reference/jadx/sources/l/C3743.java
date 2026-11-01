package l;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۘۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: G3C1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3743 {

    /* JADX INFO: renamed from: ۧᩴ۠, reason: not valid java name and contains not printable characters */
    public static boolean f13569;

    /* JADX INFO: renamed from: ۖ֫ۨ, reason: not valid java name and contains not printable characters */
    public static C12731 m10950(Object obj, Object obj2) {
        return C12731.m31625((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۖܺ᩹, reason: not valid java name and contains not printable characters */
    public static String m10951(Object obj, Object obj2, Object obj3) {
        return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۖ᩸᩶, reason: not valid java name and contains not printable characters */
    public static String m10952(Object obj, int i, int i2) {
        return ((String) obj).substring(i, i2);
    }

    /* JADX INFO: renamed from: ۙᩳ۠, reason: not valid java name and contains not printable characters */
    public static void m10954(Object obj, int i) {
        C19328.m44317((TextInputLayout) obj, i);
    }

    /* JADX INFO: renamed from: ۚ֡ܶ, reason: not valid java name and contains not printable characters */
    public static void m10955(Object obj) {
        ((C3329) obj).close();
    }

    /* JADX INFO: renamed from: ۚܽۙ, reason: not valid java name and contains not printable characters */
    public static int m10956(Object obj) {
        return ((View) obj).getHeight();
    }

    /* JADX INFO: renamed from: ۡۛۚ, reason: not valid java name and contains not printable characters */
    public static View m10957(Object obj, int i) {
        return ((View) obj).findViewById(i);
    }

    /* JADX INFO: renamed from: ۢۤۜ, reason: not valid java name and contains not printable characters */
    public static boolean m10958(Object obj) {
        return ((C15073) obj).m36132();
    }

    /* JADX INFO: renamed from: ۫֫᩶, reason: not valid java name and contains not printable characters */
    public static String m10959(Object obj) {
        return ((AbstractC20745) obj).getName();
    }

    /* JADX INFO: renamed from: ܰܺ֡, reason: not valid java name and contains not printable characters */
    public static boolean m10960(Object obj, Object obj2) {
        return ((Bundle) obj).getBoolean((String) obj2);
    }

    /* JADX INFO: renamed from: ܶܶۜ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2916 m10961(Object obj) {
        return ((C6111) obj).m17000();
    }

    /* JADX INFO: renamed from: ᩳ᩻ۚ, reason: not valid java name and contains not printable characters */
    public static C18419 m10962(Object obj) {
        return ((ActivityC5760) obj).f19568;
    }

    /* JADX INFO: renamed from: ᩴ֡ܽ, reason: not valid java name and contains not printable characters */
    public static void m10963(Object obj, int i) {
        ((C22918) obj).m50733(i);
    }

    /* JADX INFO: renamed from: ᩷ۧ᩹, reason: not valid java name and contains not printable characters */
    public static String m10964(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩸֨ܰ, reason: not valid java name and contains not printable characters */
    public static void m10965(Object obj) {
        ((Thread) obj).start();
    }

    /* JADX INFO: renamed from: ᩺᩷ܿ, reason: not valid java name and contains not printable characters */
    public static int m10966() {
        return 165660272;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17855 m10953(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C17855.m41445(C12917.m32004(configuration)) : C17855.m41447(configuration.locale);
    }
}
