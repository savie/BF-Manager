package l;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.view.MenuItem;
import bin.mt.json.JSONObject;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5X0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1066 {

    /* JADX INFO: renamed from: ֫۠֡, reason: not valid java name and contains not printable characters */
    public static int f4915;

    /* JADX INFO: renamed from: ֨᩸ܿ, reason: not valid java name and contains not printable characters */
    public static int m4023() {
        return 724240180;
    }

    /* JADX INFO: renamed from: ۗܳۧ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m4024(Object obj, Object obj2, Object obj3) {
        return ObjectAnimator.ofFloat(obj, (String) obj2, (float[]) obj3);
    }

    /* JADX INFO: renamed from: ۘ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public static void m4025(Object obj, int i, Object obj2) {
        ((C8067) obj).m21275(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۙۜۧ, reason: not valid java name and contains not printable characters */
    public static void m4028(Object obj, Object obj2) {
        ((C11545) obj).m28763((String) obj2);
    }

    /* JADX INFO: renamed from: ۛۙۘ, reason: not valid java name and contains not printable characters */
    public static void m4029(Object obj, Object obj2, boolean z) {
        ((C10142) obj).m25769((String) obj2, z);
    }

    /* JADX INFO: renamed from: ۜܺۙ, reason: not valid java name and contains not printable characters */
    public static float m4030(Object obj) {
        return ((Paint) obj).getTextSize();
    }

    /* JADX INFO: renamed from: ۤܿۛ, reason: not valid java name and contains not printable characters */
    public static void m4031(Object obj) {
        ((C2455) obj).close();
    }

    /* JADX INFO: renamed from: ۨ᩸ᩴ, reason: not valid java name and contains not printable characters */
    public static MenuItem m4032(Object obj, int i) {
        return ((MenuItem) obj).setIcon(i);
    }

    /* JADX INFO: renamed from: ܰۡ᩺, reason: not valid java name and contains not printable characters */
    public static InterfaceC17314 m4033(Object obj, Object obj2, boolean z) {
        return ((InterfaceC17314) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ᩳ֨ܶ, reason: not valid java name and contains not printable characters */
    public static void m4034(Object obj, int i, Object obj2) {
        ((C8067) obj).m21271(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ᩳ᩷ᩳ, reason: not valid java name and contains not printable characters */
    public static C12731 m4035(Object obj, Object obj2) {
        return C12731.m31630((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ᩵ۘۖ, reason: not valid java name and contains not printable characters */
    public static int m4036(Object obj) {
        return ((InterfaceC0433) obj).readInt();
    }

    /* JADX INFO: renamed from: ᩹ۙܽ, reason: not valid java name and contains not printable characters */
    public static InputStream m4037(Object obj, Object obj2) {
        return ((C7817) obj).m20570((String) obj2);
    }

    /* JADX INFO: renamed from: ᩺ۜۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m4038(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).add((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩻ۚ۬, reason: not valid java name and contains not printable characters */
    public static boolean m4039(Object obj, Object obj2, boolean z) {
        return ((SharedPreferences) obj).getBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ᩻᩵᩵, reason: not valid java name and contains not printable characters */
    public static String m4040(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2477 m4027(Context context, C14329 c14329) {
        return C23501.m51755(context, c14329);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Typeface m4026(Context context, C14329 c14329, int i, boolean z, int i2, Handler handler, C1252 c1252) {
        C20678 c20678 = new C20678(c1252, handler);
        if (z) {
            return C11651.m29106(context, c14329, c20678, i, i2);
        }
        return C11651.m29105(context, c14329, i, c20678);
    }
}
