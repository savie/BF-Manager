package l;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5TS */
/* JADX INFO: loaded from: classes.dex */
public final class C2642 {

    /* JADX INFO: renamed from: ܳ۠᩹, reason: not valid java name and contains not printable characters */
    public static int f10294;

    /* JADX INFO: renamed from: ֡۟۟, reason: not valid java name and contains not printable characters */
    public static void m8157(Object obj, int i) {
        ((C22918) obj).m50733(i);
    }

    /* JADX INFO: renamed from: ֨ۤۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2916 m8158(Object obj) {
        return ((C6111) obj).m17000();
    }

    /* JADX INFO: renamed from: ۖܺ᩶, reason: not valid java name and contains not printable characters */
    public static C12731 m8159(Object obj, Object obj2) {
        return C12731.m31625((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۗܶۗ, reason: not valid java name and contains not printable characters */
    public static String m8160(Object obj) {
        return ((AbstractC20745) obj).getName();
    }

    /* JADX INFO: renamed from: ۘ᩷ܰ, reason: not valid java name and contains not printable characters */
    public static String m8161(Object obj, Object obj2, Object obj3) {
        return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۚܿܶ, reason: not valid java name and contains not printable characters */
    public static C18419 m8162(Object obj) {
        return ((ActivityC5760) obj).f19568;
    }

    /* JADX INFO: renamed from: ۟֨֫, reason: not valid java name and contains not printable characters */
    public static boolean m8163(Object obj, Object obj2) {
        return ((Bundle) obj).getBoolean((String) obj2);
    }

    /* JADX INFO: renamed from: ۠᩹ۖ, reason: not valid java name and contains not printable characters */
    public static String m8164(Object obj, int i, int i2) {
        return ((String) obj).substring(i, i2);
    }

    /* JADX INFO: renamed from: ۢ᩹۠, reason: not valid java name and contains not printable characters */
    public static void m8165(Object obj) {
        ((Thread) obj).start();
    }

    /* JADX INFO: renamed from: ۧ᩷ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m8166(Object obj) {
        return ((C15073) obj).m36132();
    }

    /* JADX INFO: renamed from: ۨ᩷ܰ, reason: not valid java name and contains not printable characters */
    public static View m8167(Object obj, int i) {
        return ((View) obj).findViewById(i);
    }

    /* JADX INFO: renamed from: ۫᩹ܰ, reason: not valid java name and contains not printable characters */
    public static void m8168(Object obj) {
        ((C3329) obj).close();
    }

    /* JADX INFO: renamed from: ۫᩺۠, reason: not valid java name and contains not printable characters */
    public static int m8169(Object obj) {
        return ((View) obj).getHeight();
    }

    /* JADX INFO: renamed from: ۬֫ܰ, reason: not valid java name and contains not printable characters */
    public static void m8170(Object obj, int i) {
        C19328.m44317((TextInputLayout) obj, i);
    }

    /* JADX INFO: renamed from: ᩷۬ۢ, reason: not valid java name and contains not printable characters */
    public static int m8171() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩸ᩴ᩵, reason: not valid java name and contains not printable characters */
    public static String m8172(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
