package l;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: l.֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3XU */
/* JADX INFO: loaded from: classes.dex */
public final class C1937 {

    /* JADX INFO: renamed from: ֡ᩴܶ, reason: not valid java name and contains not printable characters */
    public static int f7317;

    /* JADX INFO: renamed from: ֨᩻֡, reason: not valid java name and contains not printable characters */
    public static void m6275(Object obj) {
        ((AbstractActivityC12483) obj).m31017();
    }

    /* JADX INFO: renamed from: ۗۤܰ, reason: not valid java name and contains not printable characters */
    public static int m6276(Object obj) {
        return ((List) obj).size();
    }

    /* JADX INFO: renamed from: ۚۗ۟, reason: not valid java name and contains not printable characters */
    public static void m6278(Object obj, Object obj2) {
        ((ViewGroup) obj).addView((View) obj2);
    }

    /* JADX INFO: renamed from: ۟ۗܳ, reason: not valid java name and contains not printable characters */
    public static int m6279() {
        return -143612460;
    }

    /* JADX INFO: renamed from: ۠ۧ᩶, reason: not valid java name and contains not printable characters */
    public static MenuItem m6280(Object obj, boolean z) {
        return ((MenuItem) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ۡۚ᩹, reason: not valid java name and contains not printable characters */
    public static String m6281(Object obj) {
        return ((C18419) obj).m42711();
    }

    /* JADX INFO: renamed from: ۢۚ᩸, reason: not valid java name and contains not printable characters */
    public static void m6282(Object obj, Object obj2, Object obj3) {
        ((AbstractC19769) obj).m44959((InterfaceC1423) obj2, (InterfaceC10597) obj3);
    }

    /* JADX INFO: renamed from: ۤ۫ᩳ, reason: not valid java name and contains not printable characters */
    public static void m6283(Object obj, boolean z) {
        ((C12562) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ۤ᩹ۖ, reason: not valid java name and contains not printable characters */
    public static C2519 m6284(long j) {
        return C2519.m7824(j);
    }

    /* JADX INFO: renamed from: ܶܿܳ, reason: not valid java name and contains not printable characters */
    public static int m6285(Object obj) {
        return ((MenuItem) obj).getItemId();
    }

    /* JADX INFO: renamed from: ܺ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static void m6286(Object obj, Object obj2) {
        C13465.m32967(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ܿ֡۠, reason: not valid java name and contains not printable characters */
    public static Intent m6287(Object obj) {
        return ((Activity) obj).getIntent();
    }

    /* JADX INFO: renamed from: ᩴ᩸ۗ, reason: not valid java name and contains not printable characters */
    public static String m6288(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩷᩺ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11462 m6289(Object obj) {
        return ((C11545) obj).m28817();
    }

    /* JADX INFO: renamed from: ᩸ۙ᩻, reason: not valid java name and contains not printable characters */
    public static String m6290(Object obj) {
        return ((String) obj).trim();
    }

    /* JADX INFO: renamed from: ᩸᩷ܽ, reason: not valid java name and contains not printable characters */
    public static void m6291(Object obj, Object obj2) {
        ((View) obj).setOnClickListener((View.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6277(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }
}
