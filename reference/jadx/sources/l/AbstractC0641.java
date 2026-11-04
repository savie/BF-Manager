package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import bin.mt.plus.Main;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L1DC */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0641 {

    /* JADX INFO: renamed from: ۤܳ۬, reason: not valid java name and contains not printable characters */
    public static int f2496;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f2497;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f2499 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f2498 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f2500 = null;

    /* JADX INFO: renamed from: ֡ۘ᩷, reason: not valid java name and contains not printable characters */
    public static void m2810(Object obj, Object obj2) {
        ((CompoundButton) obj).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj2);
    }

    /* JADX INFO: renamed from: ۙۛۗ, reason: not valid java name and contains not printable characters */
    public static Iterator m2811(Object obj) {
        return ((Set) obj).iterator();
    }

    /* JADX INFO: renamed from: ۚۢܶ, reason: not valid java name and contains not printable characters */
    public static View m2812(Object obj, int i) {
        return ((AbstractActivityC17204) obj).m40395(i);
    }

    /* JADX INFO: renamed from: ۠۫ۚ, reason: not valid java name and contains not printable characters */
    public static int m2813() {
        return 1926485896;
    }

    /* JADX INFO: renamed from: ۤܳۜ, reason: not valid java name and contains not printable characters */
    public static void m2814(Object obj, Object obj2, Object obj3) {
        ((AbstractActivityC17204) obj).m40401((Throwable) obj2, (DialogInterface.OnDismissListener) obj3);
    }

    /* JADX INFO: renamed from: ۧ֡᩻, reason: not valid java name and contains not printable characters */
    public static int m2815(Object obj) {
        return ((C13778) obj).m33681();
    }

    /* JADX INFO: renamed from: ۨۗ᩺, reason: not valid java name and contains not printable characters */
    public static Main m2816(Object obj) {
        return ((C8614) obj).m23233();
    }

    /* JADX INFO: renamed from: ۨ᩻᩺, reason: not valid java name and contains not printable characters */
    public static Button m2817(Object obj) {
        return ((DialogInterfaceC8327) obj).m22436();
    }

    /* JADX INFO: renamed from: ܳᩳ֫, reason: not valid java name and contains not printable characters */
    public static MenuItem m2818(Object obj, boolean z) {
        return ((MenuItem) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ܶۡᩴ, reason: not valid java name and contains not printable characters */
    public static void m2819(Object obj, Object obj2) {
        ((C3374) obj).m11078((InterfaceC17544) obj2);
    }

    /* JADX INFO: renamed from: ܽۛܰ, reason: not valid java name and contains not printable characters */
    public static String m2820(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܽܶۗ, reason: not valid java name and contains not printable characters */
    public static void m2821(Object obj) {
        ((Closeable) obj).close();
    }

    /* JADX INFO: renamed from: ܿ᩻ۚ, reason: not valid java name and contains not printable characters */
    public static String m2822(Object obj) {
        return C18282.m42441((AbstractC22044) obj);
    }

    /* JADX INFO: renamed from: ᩵ܽܶ, reason: not valid java name and contains not printable characters */
    public static String m2823(Object obj) {
        return ((InterfaceC4859) obj).getName();
    }

    /* JADX INFO: renamed from: ᩹۠᩷, reason: not valid java name and contains not printable characters */
    public static String m2824(Object obj, int i) {
        return ((String) obj).substring(i);
    }

    /* JADX INFO: renamed from: ᩻ܿ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m2825(Object obj) {
        return ((AbstractC22044) obj).mo4304();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo2826(Context context, AttributeSet attributeSet);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo2827(HashMap map);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo2828(HashSet hashSet);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo2829(HashMap map) {
    }
}
