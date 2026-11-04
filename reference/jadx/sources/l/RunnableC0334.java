package l;

import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB27 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0334 implements Runnable {

    /* JADX INFO: renamed from: ۟֡᩻, reason: not valid java name and contains not printable characters */
    public static int f1808;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17004 f1809;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1810;

    /* JADX INFO: renamed from: ֡֨ۛ, reason: not valid java name and contains not printable characters */
    public static String m2049(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֡ܳ᩸, reason: not valid java name and contains not printable characters */
    public static void m2050(Object obj, boolean z) {
        ((CompoundButton) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ֫ۡᩳ, reason: not valid java name and contains not printable characters */
    public static int m2051(Object obj) {
        return ((AtomicInteger) obj).get();
    }

    /* JADX INFO: renamed from: ֫ܳۚ, reason: not valid java name and contains not printable characters */
    public static void m2052(Object obj) {
        ((ObjectAnimator) obj).start();
    }

    /* JADX INFO: renamed from: ۖۨ۬, reason: not valid java name and contains not printable characters */
    public static C12187 m2053() {
        return C12187.m30469();
    }

    /* JADX INFO: renamed from: ۗܶᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m2054(Object obj, Object obj2) {
        return ((ArrayList) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ۛܽ۠, reason: not valid java name and contains not printable characters */
    public static void m2055(Object obj, Object obj2) {
        ((C2361) obj).m8008((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۡܰۢ, reason: not valid java name and contains not printable characters */
    public static Object m2056(Object obj, Object obj2, Object obj3) {
        return ((HashMap) obj).put(obj2, obj3);
    }

    /* JADX INFO: renamed from: ᩵ܿ֫, reason: not valid java name and contains not printable characters */
    public static void m2057() {
        C6331.m18055();
    }

    /* JADX INFO: renamed from: ᩵᩹ܰ, reason: not valid java name and contains not printable characters */
    public static String m2058(Object obj) {
        return ((InterfaceC15344) obj).getTypeName();
    }

    /* JADX INFO: renamed from: ᩶ۧ۬, reason: not valid java name and contains not printable characters */
    public static boolean m2059(Object obj) {
        return ((C10745) obj).m27399();
    }

    /* JADX INFO: renamed from: ᩶ܺ᩵, reason: not valid java name and contains not printable characters */
    public static void m2060(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX INFO: renamed from: ᩷ᩴۗ, reason: not valid java name and contains not printable characters */
    public static View m2061(Object obj, int i, Object obj2, boolean z) {
        return ((LayoutInflater) obj).inflate(i, (ViewGroup) obj2, z);
    }

    /* JADX INFO: renamed from: ᩸ܿܺ, reason: not valid java name and contains not printable characters */
    public static MenuItem m2062(Object obj, int i) {
        return ((Menu) obj).findItem(i);
    }

    /* JADX INFO: renamed from: ᩺֡᩸, reason: not valid java name and contains not printable characters */
    public static boolean m2063() {
        return false;
    }

    /* JADX INFO: renamed from: ᩺᩺֨, reason: not valid java name and contains not printable characters */
    public static C5408 m2064(Object obj, Object obj2) {
        return ((C5408) obj).m16113((C5408) obj2);
    }

    public RunnableC0334(C17004 c17004, int i) {
        this.f1809 = c17004;
        this.f1810 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1809.m40074(this.f1810);
    }
}
