package l;

import android.app.PendingIntent;
import android.view.MenuItem;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O220 */
/* JADX INFO: loaded from: classes.dex */
public class C1542 {

    /* JADX INFO: renamed from: ֫ۙۖ, reason: not valid java name and contains not printable characters */
    public static int f5343;

    /* JADX INFO: renamed from: ֡۠۫, reason: not valid java name and contains not printable characters */
    public static MenuItem m5456(Object obj, boolean z) {
        return ((MenuItem) obj).setEnabled(z);
    }

    /* JADX INFO: renamed from: ֡ۡۚ, reason: not valid java name and contains not printable characters */
    public static Object m5457(Object obj, int i) {
        return ((ArrayList) obj).get(i);
    }

    /* JADX INFO: renamed from: ֨᩸۟, reason: not valid java name and contains not printable characters */
    public static boolean m5458(Object obj) {
        return ((C12187) obj).m30474();
    }

    /* JADX INFO: renamed from: ۗۙۧ, reason: not valid java name and contains not printable characters */
    public static int m5459() {
        return -676920249;
    }

    /* JADX INFO: renamed from: ۗ᩶ۢ, reason: not valid java name and contains not printable characters */
    public static Long m5460(long j) {
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ۚܰۡ, reason: not valid java name and contains not printable characters */
    public static String m5463(Object obj) {
        return ((String) obj).toLowerCase();
    }

    /* JADX INFO: renamed from: ۚ᩺ܰ, reason: not valid java name and contains not printable characters */
    public static void m5464(Object obj) {
        ((C2935) obj).m9584();
    }

    /* JADX INFO: renamed from: ۛۢܽ, reason: not valid java name and contains not printable characters */
    public static boolean m5465(Object obj) {
        return ((DialogInterfaceC8327) obj).m22434();
    }

    /* JADX INFO: renamed from: ۠ۚ᩶, reason: not valid java name and contains not printable characters */
    public static void m5466(Object obj, int i, int i2) {
        ((ViewOnClickListenerC23411) obj).m52603(i, i2);
    }

    /* JADX INFO: renamed from: ۤᩳܿ, reason: not valid java name and contains not printable characters */
    public static void m5467(Object obj) {
        ((ReentrantLock) obj).lock();
    }

    /* JADX INFO: renamed from: ۫۟᩻, reason: not valid java name and contains not printable characters */
    public static void m5468(Object obj, Object obj2) {
        ((AbstractActivityC17204) obj).m40420((String) obj2);
    }

    /* JADX INFO: renamed from: ܰۨ۟, reason: not valid java name and contains not printable characters */
    public static JSONObject m5469(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).add((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ܶ᩸ܶ, reason: not valid java name and contains not printable characters */
    public static int m5470(Object obj) {
        return ((InterfaceC15872) obj).readInt();
    }

    /* JADX INFO: renamed from: ܺۜᩴ, reason: not valid java name and contains not printable characters */
    public static String m5471(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩵ۖۚ, reason: not valid java name and contains not printable characters */
    public static C11192 m5472(Object obj) {
        return ((ActivityC20779) obj).f66576;
    }

    /* JADX INFO: renamed from: ᩻ۚ᩻, reason: not valid java name and contains not printable characters */
    public static Object m5473(Object obj, int i) {
        return ((List) obj).get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5271 m5461(AbstractC3290 abstractC3290) {
        C5271 c5271 = new C5271();
        c5271.f18572 = (C9545) abstractC3290.m10842(c5271.f18572);
        c5271.f18569 = abstractC3290.m10840(2, c5271.f18569);
        c5271.f18571 = abstractC3290.m10840(3, c5271.f18571);
        c5271.f18567 = (PendingIntent) abstractC3290.m10839(c5271.f18567, 4);
        c5271.f18568 = abstractC3290.m10849(5, c5271.f18568);
        c5271.f18570 = abstractC3290.m10849(6, c5271.f18570);
        return c5271;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5462(C5271 c5271, AbstractC3290 abstractC3290) {
        abstractC3290.getClass();
        abstractC3290.m10866(c5271.f18572);
        abstractC3290.m10862(2, c5271.f18569);
        abstractC3290.m10862(3, c5271.f18571);
        abstractC3290.m10865(c5271.f18567, 4);
        abstractC3290.m10864(5, c5271.f18568);
        abstractC3290.m10864(6, c5271.f18570);
    }
}
