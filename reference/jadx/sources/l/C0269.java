package l;

import android.content.res.Resources;
import android.os.Handler;
import android.widget.Button;
import bin.mt.json.JSONObject;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes.dex */
public final class C0269 {

    /* JADX INFO: renamed from: ᩶᩺ܰ, reason: not valid java name and contains not printable characters */
    public static int f1558;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Resources f1559;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Resources.Theme f1560;

    /* JADX INFO: renamed from: ֡ۗᩴ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m1774(Object obj, Object obj2) {
        return ((AbstractC22044) obj).m49876((String) obj2);
    }

    /* JADX INFO: renamed from: ۚۙܺ, reason: not valid java name and contains not printable characters */
    public static int m1775() {
        return 525736253;
    }

    /* JADX INFO: renamed from: ۛܳܳ, reason: not valid java name and contains not printable characters */
    public static InputStream m1776(Object obj, Object obj2) {
        return ((C22941) obj).m51727((C8002) obj2);
    }

    /* JADX INFO: renamed from: ۟۠ۛ, reason: not valid java name and contains not printable characters */
    public static byte[] m1777(Object obj) {
        return ((MessageDigest) obj).digest();
    }

    /* JADX INFO: renamed from: ۟ۢܺ, reason: not valid java name and contains not printable characters */
    public static void m1778(Object obj, Object obj2) {
        ((C18459) obj).m43010((String) obj2);
    }

    /* JADX INFO: renamed from: ۤ֫ܺ, reason: not valid java name and contains not printable characters */
    public static Object m1779(Object obj, Object obj2) {
        return ((HashMap) obj).get(obj2);
    }

    /* JADX INFO: renamed from: ۤۡܶ, reason: not valid java name and contains not printable characters */
    public static String m1780(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۧۧ۬, reason: not valid java name and contains not printable characters */
    public static void m1781(Object obj, Object obj2) {
        C15243.m36591(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۫ۚۘ, reason: not valid java name and contains not printable characters */
    public static Button m1782(Object obj) {
        return ((DialogInterfaceC8327) obj).m22440();
    }

    /* JADX INFO: renamed from: ܺۤۗ, reason: not valid java name and contains not printable characters */
    public static void m1783(Object obj, Object obj2) {
        ((AbstractC18900) obj).mo29447((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩳۜۘ, reason: not valid java name and contains not printable characters */
    public static String m1784(Object obj) {
        return ((C18300) obj).m42672();
    }

    /* JADX INFO: renamed from: ᩳۧܳ, reason: not valid java name and contains not printable characters */
    public static String m1785(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩴۖ᩺, reason: not valid java name and contains not printable characters */
    public static void m1786(Object obj, Object obj2) {
        ((C24132) obj).mo52335((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩸᩶᩶, reason: not valid java name and contains not printable characters */
    public static void m1787(Object obj, int i) {
        ((Handler) obj).removeMessages(i);
    }

    /* JADX INFO: renamed from: ᩹ۚۧ, reason: not valid java name and contains not printable characters */
    public static void m1788(Object obj, int i, Object obj2) {
        ((C2375) obj).m8077(i, obj2);
    }

    /* JADX INFO: renamed from: ᩹᩹֫, reason: not valid java name and contains not printable characters */
    public static void m1789(Object obj, Object obj2, Object obj3) {
        ((AbstractC17184) obj).m40350((InterfaceC11217) obj2, (InterfaceC16438) obj3);
    }

    public C0269(Resources resources, Resources.Theme theme) {
        this.f1559 = resources;
        this.f1560 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0269.class == obj.getClass()) {
            C0269 c0269 = (C0269) obj;
            if (this.f1559.equals(c0269.f1559) && C17359.equals(this.f1560, c0269.f1560)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(this.f1559, this.f1560);
    }
}
