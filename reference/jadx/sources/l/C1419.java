package l;

import android.content.Intent;
import android.graphics.drawable.LayerDrawable;
import android.os.SystemClock;
import android.view.View;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F5X2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1419 {

    /* JADX INFO: renamed from: ۬᩺ܰ, reason: not valid java name and contains not printable characters */
    public static int f5860;

    /* JADX INFO: renamed from: ֨ۘۗ, reason: not valid java name and contains not printable characters */
    public static void m4962(Object obj, Object obj2) {
        ((C19722) obj).m44846((String[]) obj2);
    }

    /* JADX INFO: renamed from: ۖۤܳ, reason: not valid java name and contains not printable characters */
    public static void m4963(Object obj, Object obj2) {
        ((C6938) obj).setSubtitle((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۗ᩷ۛ, reason: not valid java name and contains not printable characters */
    public static boolean m4964(Object obj) {
        return ((ArrayList) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ۟ۙ۬, reason: not valid java name and contains not printable characters */
    public static C3040 m4966(Object obj) {
        return ((ActivityC4471) obj).f15887;
    }

    /* JADX INFO: renamed from: ۠᩸ܿ, reason: not valid java name and contains not printable characters */
    public static Object m4967(Object obj, int i) {
        return ((ArrayList) obj).get(i);
    }

    /* JADX INFO: renamed from: ۡܽۗ, reason: not valid java name and contains not printable characters */
    public static void m4968(Object obj, Object obj2) {
        ((C6111) obj).mo16989((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۧۖܿ, reason: not valid java name and contains not printable characters */
    public static String m4969(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ۫۫, reason: not valid java name and contains not printable characters */
    public static Object m4970(Object obj) {
        return C13638.requireNonNull(obj);
    }

    /* JADX INFO: renamed from: ۨۛܿ, reason: not valid java name and contains not printable characters */
    public static int m4971(Object obj) {
        return ((InterfaceC4685) obj).mo1140();
    }

    /* JADX INFO: renamed from: ۬ܽ᩻, reason: not valid java name and contains not printable characters */
    public static long m4972() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ܳۤۖ, reason: not valid java name and contains not printable characters */
    public static boolean m4973() {
        return false;
    }

    /* JADX INFO: renamed from: ܳ᩵ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m4974(Object obj) {
        return ((AbstractC20745) obj).mo33974();
    }

    /* JADX INFO: renamed from: ᩴ֡֫, reason: not valid java name and contains not printable characters */
    public static void m4975(Object obj) throws IOException {
        ((OutputStream) obj).close();
    }

    /* JADX INFO: renamed from: ᩴ֨᩷, reason: not valid java name and contains not printable characters */
    public static View m4976(Object obj, int i) {
        return ((AbstractActivityC12483) obj).m30995(i);
    }

    /* JADX INFO: renamed from: ᩷ܽᩴ, reason: not valid java name and contains not printable characters */
    public static void m4977(Object obj, Object obj2) {
        ((InterfaceC17421) obj).startActivity((Intent) obj2);
    }

    /* JADX INFO: renamed from: ᩹ܽۧ, reason: not valid java name and contains not printable characters */
    public static void m4978(Object obj) {
        ((C17485) obj).m40694();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4965(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
        layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
        layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
        layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
        layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
        layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
        layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
        layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
        layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
        layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
    }
}
