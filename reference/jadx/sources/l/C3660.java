package l;

import android.app.Activity;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeProvider;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4SO */
/* JADX INFO: loaded from: classes.dex */
public class C3660 {

    /* JADX INFO: renamed from: ۖۧ۬, reason: not valid java name and contains not printable characters */
    public static int f13403;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AccessibilityNodeProvider f13404;

    /* JADX INFO: renamed from: ֡᩶ۡ, reason: not valid java name and contains not printable characters */
    public static String m10776(Object obj, Object obj2) {
        return ((BaseBundle) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ֫ۧܿ, reason: not valid java name and contains not printable characters */
    public static Window m10777(Object obj) {
        return ((Activity) obj).getWindow();
    }

    /* JADX INFO: renamed from: ֫᩺۟, reason: not valid java name and contains not printable characters */
    public static int m10778(Object obj) {
        return ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX INFO: renamed from: ۖۛ۠, reason: not valid java name and contains not printable characters */
    public static void m10779(Object obj, Object obj2) {
        ((C22918) obj).m50725((String) obj2);
    }

    /* JADX INFO: renamed from: ۘ֫᩵, reason: not valid java name and contains not printable characters */
    public static void m10780(Object obj) {
        ((Closeable) obj).close();
    }

    /* JADX INFO: renamed from: ۘ᩹ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m10781(Object obj) {
        return ((C17367) obj).m40461();
    }

    /* JADX INFO: renamed from: ۙۖۢ, reason: not valid java name and contains not printable characters */
    public static long m10782(Object obj) {
        return ((C12107) obj).getSize();
    }

    /* JADX INFO: renamed from: ۠ۘۛ, reason: not valid java name and contains not printable characters */
    public static void m10783(Object obj) {
        ((InterfaceC17314) obj).apply();
    }

    /* JADX INFO: renamed from: ۡ᩸ܺ, reason: not valid java name and contains not printable characters */
    public static byte m10784(Object obj) {
        return ((C17367) obj).readByte();
    }

    /* JADX INFO: renamed from: ۨ᩻᩵, reason: not valid java name and contains not printable characters */
    public static MenuItem m10785(Object obj, int i) {
        return ((Menu) obj).findItem(i);
    }

    /* JADX INFO: renamed from: ۬۫ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m10786(Object obj) {
        return ((String) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ܰܿܽ, reason: not valid java name and contains not printable characters */
    public static void m10787(Object obj, int i, int i2) {
        ((ViewOnClickListenerC16028) obj).m38013(i, i2);
    }

    /* JADX INFO: renamed from: ܽۛܶ, reason: not valid java name and contains not printable characters */
    public static boolean m10788(Object obj, Object obj2) {
        return ((ArrayList) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ᩴۛܰ, reason: not valid java name and contains not printable characters */
    public static int m10789(Object obj) {
        return ((C7817) obj).m20572();
    }

    /* JADX INFO: renamed from: ᩺ۛۙ, reason: not valid java name and contains not printable characters */
    public static String m10790(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩻ۗۖ, reason: not valid java name and contains not printable characters */
    public static int m10791() {
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22006 mo10793(int i) {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo10794(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C22006 mo10795(int i) {
        return null;
    }

    public C3660() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13404 = new C12834(this);
        } else {
            this.f13404 = new C0838(this);
        }
    }

    public C3660(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f13404 = accessibilityNodeProvider;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m10792() {
        return this.f13404;
    }
}
