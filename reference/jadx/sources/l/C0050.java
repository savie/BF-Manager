package l;

import android.app.Application;
import android.content.ComponentName;
import android.content.res.Resources;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: G3SY */
/* JADX INFO: loaded from: classes.dex */
public final class C0050 {

    /* JADX INFO: renamed from: ᩶ۤ۠, reason: not valid java name and contains not printable characters */
    public static int f912;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ComponentName f913;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final IBinder f914;

    /* JADX INFO: renamed from: ֨֨۟, reason: not valid java name and contains not printable characters */
    public static String m931(Object obj, int i) {
        return ((String) obj).substring(i);
    }

    /* JADX INFO: renamed from: ۙ֫֨, reason: not valid java name and contains not printable characters */
    public static void m932(int i, int i2, Object obj) {
        C15157.m36338(i, i2, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ۙۗۛ, reason: not valid java name and contains not printable characters */
    public static void m933(Object obj, int i) {
        ((C8067) obj).m21274(i);
    }

    /* JADX INFO: renamed from: ۚܰܽ, reason: not valid java name and contains not printable characters */
    public static void m934(Object obj, int i) {
        ((AbstractC17902) obj).m41591(i);
    }

    /* JADX INFO: renamed from: ۛܰ֨, reason: not valid java name and contains not printable characters */
    public static void m935(Object obj, Object obj2) {
        ((C11092) obj).append((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۟᩷ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m936(Object obj, Object obj2) {
        return ((Set) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ۠֫ۘ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m937(Object obj) {
        return C14952.m35859((AbstractC20745) obj);
    }

    /* JADX INFO: renamed from: ۢۡۜ, reason: not valid java name and contains not printable characters */
    public static int m938(Object obj) {
        return ((ArrayList) obj).size();
    }

    /* JADX INFO: renamed from: ۢܶܳ, reason: not valid java name and contains not printable characters */
    public static Application m939() {
        return C16737.m39277();
    }

    /* JADX INFO: renamed from: ۨܶ᩷, reason: not valid java name and contains not printable characters */
    public static String m940(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۬ۛۧ, reason: not valid java name and contains not printable characters */
    public static Set m941(Object obj) {
        return ((IdentityHashMap) obj).keySet();
    }

    /* JADX INFO: renamed from: ᩳۘܳ, reason: not valid java name and contains not printable characters */
    public static int m942(Object obj, int i) {
        return C16135.m38193((Resources.Theme) obj, i);
    }

    /* JADX INFO: renamed from: ᩷ܳ᩻, reason: not valid java name and contains not printable characters */
    public static Iterator m943(Object obj) {
        return ((Set) obj).iterator();
    }

    /* JADX INFO: renamed from: ᩹ۨܿ, reason: not valid java name and contains not printable characters */
    public static void m944(Object obj) {
        C19431.m44468((AutoCloseable) obj);
    }

    /* JADX INFO: renamed from: ᩹ᩳ֨, reason: not valid java name and contains not printable characters */
    public static long m945(long j, long j2) {
        return Math.min(j, j2);
    }

    /* JADX INFO: renamed from: ᩹᩻ۚ, reason: not valid java name and contains not printable characters */
    public static int m946() {
        return 1833354814;
    }

    public C0050(ComponentName componentName, IBinder iBinder) {
        this.f913 = componentName;
        this.f914 = iBinder;
    }
}
