package l;

import android.view.MenuItem;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes.dex */
public final class C3690 {

    /* JADX INFO: renamed from: ۧ۫ᩴ, reason: not valid java name and contains not printable characters */
    public static int f12684;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC25320 f12685;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC18606 f12686;

    /* JADX INFO: renamed from: ֫ۙ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m11987() {
        return false;
    }

    /* JADX INFO: renamed from: ֫᩶ۨ, reason: not valid java name and contains not printable characters */
    public static void m11988(Object obj, Object obj2) {
        ((AbstractActivityC17204) obj).m40420((String) obj2);
    }

    /* JADX INFO: renamed from: ۘۗ֫, reason: not valid java name and contains not printable characters */
    public static C11192 m11989(Object obj) {
        return ((ActivityC20779) obj).f66576;
    }

    /* JADX INFO: renamed from: ۙ۫ۧ, reason: not valid java name and contains not printable characters */
    public static Object m11990(Object obj, int i) {
        return ((ArrayList) obj).get(i);
    }

    /* JADX INFO: renamed from: ۚ֨ܰ, reason: not valid java name and contains not printable characters */
    public static int m11991(Object obj) {
        return ((InterfaceC15872) obj).readInt();
    }

    /* JADX INFO: renamed from: ۟ۛۚ, reason: not valid java name and contains not printable characters */
    public static MenuItem m11992(Object obj, boolean z) {
        return ((MenuItem) obj).setEnabled(z);
    }

    /* JADX INFO: renamed from: ۟ܰۢ, reason: not valid java name and contains not printable characters */
    public static void m11993(Object obj) {
        ((C2935) obj).m9584();
    }

    /* JADX INFO: renamed from: ۡۖ֨, reason: not valid java name and contains not printable characters */
    public static boolean m11994(Object obj) {
        return ((C12187) obj).m30474();
    }

    /* JADX INFO: renamed from: ۤۢ᩷, reason: not valid java name and contains not printable characters */
    public static String m11995(Object obj) {
        return ((String) obj).toLowerCase();
    }

    /* JADX INFO: renamed from: ۫ᩳۡ, reason: not valid java name and contains not printable characters */
    public static String m11996(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۫᩸ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m11997(Object obj) {
        return ((DialogInterfaceC8327) obj).m22434();
    }

    /* JADX INFO: renamed from: ܰ֫ۢ, reason: not valid java name and contains not printable characters */
    public static Object m11998(Object obj, int i) {
        return ((List) obj).get(i);
    }

    /* JADX INFO: renamed from: ܶᩳܰ, reason: not valid java name and contains not printable characters */
    public static JSONObject m11999(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).add((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ܽۢ᩷, reason: not valid java name and contains not printable characters */
    public static void m12000(Object obj, int i, int i2) {
        ((ViewOnClickListenerC23411) obj).m52603(i, i2);
    }

    /* JADX INFO: renamed from: ܽܰۗ, reason: not valid java name and contains not printable characters */
    public static Long m12001(long j) {
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ᩴ۠ܰ, reason: not valid java name and contains not printable characters */
    public static void m12002(Object obj) {
        ((ReentrantLock) obj).lock();
    }

    public C3690(AbstractC18606 abstractC18606, InterfaceC25320 interfaceC25320) {
        this.f12685 = interfaceC25320;
        this.f12686 = abstractC18606;
    }
}
