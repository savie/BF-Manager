package l;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0464 {

    /* JADX INFO: renamed from: ֡۠ۧ, reason: not valid java name and contains not printable characters */
    public static int f2088;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Class f2089;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f2090;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f2091;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f2092;

    /* JADX INFO: renamed from: ۗ۠᩹, reason: not valid java name and contains not printable characters */
    public static void m2301(Object obj, float f) {
        ((View) obj).setAlpha(f);
    }

    /* JADX INFO: renamed from: ۙ᩵᩺, reason: not valid java name and contains not printable characters */
    public static byte[] m2302(Object obj) {
        return ((AbstractC20745) obj).m46727();
    }

    /* JADX INFO: renamed from: ۙ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static JSONObject m2303(Object obj, Object obj2, int i) {
        return ((JSONObject) obj).add((String) obj2, i);
    }

    /* JADX INFO: renamed from: ۛۤ۠, reason: not valid java name and contains not printable characters */
    public static int m2304(float f) {
        return C13932.m33769(f);
    }

    /* JADX INFO: renamed from: ۡ֡ۛ, reason: not valid java name and contains not printable characters */
    public static ActivityC19126 m2305(Object obj) {
        return ((ComponentCallbacksC22654) obj).requireActivity();
    }

    /* JADX INFO: renamed from: ۫۬᩺, reason: not valid java name and contains not printable characters */
    public static String[] m2306(Object obj, Object obj2) {
        return ((String) obj).split((String) obj2);
    }

    /* JADX INFO: renamed from: ܰܰᩳ, reason: not valid java name and contains not printable characters */
    public static C5202 m2307() {
        return C5202.m14378();
    }

    /* JADX INFO: renamed from: ܶۘۙ, reason: not valid java name and contains not printable characters */
    public static String m2308(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܺ᩻ۢ, reason: not valid java name and contains not printable characters */
    public static void m2309(Object obj, int i, Object obj2) {
        ((C8067) obj).m21251(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ᩵ۙ۫, reason: not valid java name and contains not printable characters */
    public static Button m2310(Object obj) {
        return ((DialogInterfaceC19356) obj).m44361();
    }

    /* JADX INFO: renamed from: ᩵۠ۗ, reason: not valid java name and contains not printable characters */
    public static long m2311() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ᩷֡ۜ, reason: not valid java name and contains not printable characters */
    public static C1003 m2312() {
        return C12999.m32142();
    }

    /* JADX INFO: renamed from: ᩷ܰۗ, reason: not valid java name and contains not printable characters */
    public static int m2313() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩷ᩴ᩷, reason: not valid java name and contains not printable characters */
    public static void m2314(Object obj, Object obj2, boolean z) {
        ((Bundle) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ᩷᩹᩻, reason: not valid java name and contains not printable characters */
    public static boolean m2315(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ᩹ۗۗ, reason: not valid java name and contains not printable characters */
    public static void m2316(Object obj, Object obj2, Object obj3) {
        ((C22918) obj).m50728((C12107) obj2, (C2455) obj3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object mo2317(View view);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo2318(View view, Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo2319(Object obj, Object obj2);

    public AbstractC0464(int i, int i2, int i3, Class cls) {
        this.f2091 = i;
        this.f2089 = cls;
        this.f2090 = i2;
        this.f2092 = i3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m2320(View view) {
        if (Build.VERSION.SDK_INT >= this.f2092) {
            return mo2317(view);
        }
        Object tag = view.getTag(this.f2091);
        if (this.f2089.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m2321(View view, Object obj) {
        if (Build.VERSION.SDK_INT >= this.f2092) {
            mo2318(view, obj);
            return;
        }
        if (mo2319(m2320(view), obj)) {
            C12025 c12025M14007 = C5031.m14007(view);
            if (c12025M14007 == null) {
                c12025M14007 = new C12025();
            }
            C5031.m13990(view, c12025M14007);
            view.setTag(this.f2091, obj);
            C5031.m13981(this.f2090, view);
        }
    }
}
