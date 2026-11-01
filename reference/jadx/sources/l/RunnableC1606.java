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

/* JADX INFO: renamed from: l.֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1606 implements Runnable {

    /* JADX INFO: renamed from: ܽ۠᩹, reason: not valid java name and contains not printable characters */
    public static int f6488;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C9161 f6489;

    /* JADX INFO: renamed from: ֨ۨۜ, reason: not valid java name and contains not printable characters */
    public static void m5466(Object obj, Object obj2, Object obj3) {
        ((InterfaceC9380) obj).mo24061((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ֨ܺۖ, reason: not valid java name and contains not printable characters */
    public static void m5467(Object obj, Object obj2) {
        ((Context) obj).startActivity((Intent) obj2);
    }

    /* JADX INFO: renamed from: ֫ۛۙ, reason: not valid java name and contains not printable characters */
    public static int m5468(Object obj) {
        return ((C6111) obj).m17020();
    }

    /* JADX INFO: renamed from: ۖۘ۫, reason: not valid java name and contains not printable characters */
    public static void m5469(Object obj) {
        ((ObjectAnimator) obj).start();
    }

    /* JADX INFO: renamed from: ۖܳۖ, reason: not valid java name and contains not printable characters */
    public static Iterator m5470(Object obj) {
        return ((Collection) obj).iterator();
    }

    /* JADX INFO: renamed from: ۗۚۧ, reason: not valid java name and contains not printable characters */
    public static Main m5471(Object obj) {
        return ((C11545) obj).m28824();
    }

    /* JADX INFO: renamed from: ۗܿ᩵, reason: not valid java name and contains not printable characters */
    public static void m5472(Object obj, Object obj2) throws IOException {
        ((C22918) obj).write((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ۙ᩵ۤ, reason: not valid java name and contains not printable characters */
    public static int m5473() {
        return 0;
    }

    /* JADX INFO: renamed from: ۜۗ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m5474(Object obj) {
        return ((C6111) obj).m16809();
    }

    /* JADX INFO: renamed from: ۜ۟ۘ, reason: not valid java name and contains not printable characters */
    public static void m5475(Object obj, int i) {
        ((InterfaceC16662) obj).writeInt(i);
    }

    /* JADX INFO: renamed from: ܶۡۤ, reason: not valid java name and contains not printable characters */
    public static String m5476(Object obj) {
        return ((C1313) obj).m4683();
    }

    /* JADX INFO: renamed from: ܶܺܽ, reason: not valid java name and contains not printable characters */
    public static void m5477(Object obj, boolean z) {
        ((View) obj).setEnabled(z);
    }

    /* JADX INFO: renamed from: ᩳۨ۬, reason: not valid java name and contains not printable characters */
    public static Object m5478(Object obj, int i) {
        return ((List) obj).get(i);
    }

    /* JADX INFO: renamed from: ᩳܶ֡, reason: not valid java name and contains not printable characters */
    public static String m5479(Object obj, Object obj2) {
        return ((JSONObject) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ᩷۟᩵, reason: not valid java name and contains not printable characters */
    public static int m5480(Object obj) {
        return ((C6111) obj).m16814();
    }

    /* JADX INFO: renamed from: ᩸ܺ᩷, reason: not valid java name and contains not printable characters */
    public static String m5481(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    public RunnableC1606(LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161) {
        this.f6489 = layoutInflaterFactory2C9161;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161 = this.f6489;
        layoutInflaterFactory2C9161.f31162.showAtLocation(layoutInflaterFactory2C9161.f31181, 55, 0, 0);
        C20554 c20554 = layoutInflaterFactory2C9161.f31169;
        if (c20554 != null) {
            c20554.m46322();
        }
        if (layoutInflaterFactory2C9161.m23533()) {
            layoutInflaterFactory2C9161.f31181.setAlpha(0.0f);
            C20554 c20554M13980 = C5031.m13980(layoutInflaterFactory2C9161.f31181);
            c20554M13980.m46323(1.0f);
            layoutInflaterFactory2C9161.f31169 = c20554M13980;
            c20554M13980.m46326(new C14308(this));
            return;
        }
        layoutInflaterFactory2C9161.f31181.setAlpha(1.0f);
        layoutInflaterFactory2C9161.f31181.setVisibility(0);
    }
}
