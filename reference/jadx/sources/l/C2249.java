package l;

import android.app.Activity;
import android.os.BaseBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes.dex */
public final class C2249 {

    /* JADX INFO: renamed from: ᩶۫ۗ, reason: not valid java name and contains not printable characters */
    public static int f8050;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f8051;

    /* JADX INFO: renamed from: ֡᩶֨, reason: not valid java name and contains not printable characters */
    public static String m6902(Object obj, Object obj2) {
        return ((BaseBundle) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ۗ᩵۟, reason: not valid java name and contains not printable characters */
    public static int m6903(Object obj) {
        return ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX INFO: renamed from: ۨۜܰ, reason: not valid java name and contains not printable characters */
    public static boolean m6905(Object obj, Object obj2) {
        return ((ArrayList) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ܰܿܺ, reason: not valid java name and contains not printable characters */
    public static void m6906(Object obj) {
        ((InterfaceC17314) obj).apply();
    }

    /* JADX INFO: renamed from: ܰ᩵ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m6907(Object obj) {
        return ((C17367) obj).m40461();
    }

    /* JADX INFO: renamed from: ܽܽܺ, reason: not valid java name and contains not printable characters */
    public static void m6908(Object obj, int i, int i2) {
        ((ViewOnClickListenerC16028) obj).m38013(i, i2);
    }

    /* JADX INFO: renamed from: ܿۗۖ, reason: not valid java name and contains not printable characters */
    public static void m6909(Object obj, Object obj2) {
        ((C22918) obj).m50725((String) obj2);
    }

    /* JADX INFO: renamed from: ᩳ۬ۤ, reason: not valid java name and contains not printable characters */
    public static Window m6910(Object obj) {
        return ((Activity) obj).getWindow();
    }

    /* JADX INFO: renamed from: ᩳܶ۫, reason: not valid java name and contains not printable characters */
    public static boolean m6911(Object obj) {
        return ((String) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ᩴ᩵ۡ, reason: not valid java name and contains not printable characters */
    public static long m6912(Object obj) {
        return ((C12107) obj).getSize();
    }

    /* JADX INFO: renamed from: ᩵֫ۚ, reason: not valid java name and contains not printable characters */
    public static void m6913(Object obj) throws IOException {
        ((Closeable) obj).close();
    }

    /* JADX INFO: renamed from: ᩶ܳ᩵, reason: not valid java name and contains not printable characters */
    public static int m6914(Object obj) {
        return ((C7817) obj).m20572();
    }

    /* JADX INFO: renamed from: ᩷ۙܺ, reason: not valid java name and contains not printable characters */
    public static int m6915() {
        return 847096036;
    }

    /* JADX INFO: renamed from: ᩷᩹֫, reason: not valid java name and contains not printable characters */
    public static MenuItem m6916(Object obj, int i) {
        return ((Menu) obj).findItem(i);
    }

    /* JADX INFO: renamed from: ᩸ۙᩳ, reason: not valid java name and contains not printable characters */
    public static byte m6917(Object obj) {
        return ((C17367) obj).readByte();
    }

    /* JADX INFO: renamed from: ᩺᩻ܰ, reason: not valid java name and contains not printable characters */
    public static String m6918(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2249 m6904(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return new C2249(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
    }

    public C2249(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f8051 = collectionItemInfo;
    }
}
