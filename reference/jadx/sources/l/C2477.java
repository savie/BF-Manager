package l;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import bin.mt.plus.Main;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5X0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2477 {

    /* JADX INFO: renamed from: ܺۚۖ, reason: not valid java name and contains not printable characters */
    public static int f9839;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5300[] f9840;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f9841;

    /* JADX INFO: renamed from: ۗ᩵ܺ, reason: not valid java name and contains not printable characters */
    public static Main m7591(Object obj) {
        return ((C11545) obj).m28824();
    }

    /* JADX INFO: renamed from: ۘ۟ᩴ, reason: not valid java name and contains not printable characters */
    public static Object m7592(Object obj, int i) {
        return ((List) obj).get(i);
    }

    /* JADX INFO: renamed from: ۢۜۚ, reason: not valid java name and contains not printable characters */
    public static int m7593() {
        return -517702108;
    }

    /* JADX INFO: renamed from: ۤ᩷ܳ, reason: not valid java name and contains not printable characters */
    public static void m7594(Object obj) {
        ((ObjectAnimator) obj).start();
    }

    /* JADX INFO: renamed from: ۧܰᩴ, reason: not valid java name and contains not printable characters */
    public static void m7595(Object obj, int i) {
        ((InterfaceC16662) obj).writeInt(i);
    }

    /* JADX INFO: renamed from: ۧ᩺ۚ, reason: not valid java name and contains not printable characters */
    public static int m7596(Object obj) {
        return ((C6111) obj).m16814();
    }

    /* JADX INFO: renamed from: ۫ܿۖ, reason: not valid java name and contains not printable characters */
    public static boolean m7597(Object obj) {
        return ((C6111) obj).m16809();
    }

    /* JADX INFO: renamed from: ܳۘ֨, reason: not valid java name and contains not printable characters */
    public static int m7598(Object obj) {
        return ((C6111) obj).m17020();
    }

    /* JADX INFO: renamed from: ܳۨۡ, reason: not valid java name and contains not printable characters */
    public static void m7599(Object obj, Object obj2) {
        ((Context) obj).startActivity((Intent) obj2);
    }

    /* JADX INFO: renamed from: ܺܶ۟, reason: not valid java name and contains not printable characters */
    public static String m7600(Object obj, Object obj2) {
        return ((JSONObject) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ᩴ۫ܿ, reason: not valid java name and contains not printable characters */
    public static String m7601(Object obj) {
        return ((C1313) obj).m4683();
    }

    /* JADX INFO: renamed from: ᩴܶܿ, reason: not valid java name and contains not printable characters */
    public static void m7602(Object obj, Object obj2) throws IOException {
        ((C22918) obj).write((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ᩵ۨ֫, reason: not valid java name and contains not printable characters */
    public static void m7603(Object obj, boolean z) {
        ((View) obj).setEnabled(z);
    }

    /* JADX INFO: renamed from: ᩶ܽܽ, reason: not valid java name and contains not printable characters */
    public static String m7604(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩷ܽ᩶, reason: not valid java name and contains not printable characters */
    public static Iterator m7605(Object obj) {
        return ((Collection) obj).iterator();
    }

    /* JADX INFO: renamed from: ᩸۟ۛ, reason: not valid java name and contains not printable characters */
    public static void m7606(Object obj, Object obj2, Object obj3) {
        ((InterfaceC9380) obj).mo24061((String) obj2, (String) obj3);
    }

    @Deprecated
    public C2477(int i, C5300[] c5300Arr) {
        this.f9841 = i;
        this.f9840 = c5300Arr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m7608() {
        return this.f9841;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5300[] m7607() {
        return this.f9840;
    }
}
