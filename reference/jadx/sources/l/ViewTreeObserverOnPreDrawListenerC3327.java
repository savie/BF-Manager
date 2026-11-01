package l;

import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC3327 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ۨ᩺۠, reason: not valid java name and contains not printable characters */
    public static int f12317;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2746 f12318;

    /* JADX INFO: renamed from: ֡ۙۚ, reason: not valid java name and contains not printable characters */
    public static Iterator m9863(Object obj) {
        return ((ArrayList) obj).iterator();
    }

    /* JADX INFO: renamed from: ֫ᩴ۬, reason: not valid java name and contains not printable characters */
    public static Editable m9864(Object obj) {
        return ((EditText) obj).getText();
    }

    /* JADX INFO: renamed from: ۖۗܺ, reason: not valid java name and contains not printable characters */
    public static String m9865(Object obj, Object obj2) {
        return ((String) obj).concat((String) obj2);
    }

    /* JADX INFO: renamed from: ۘܺۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9866(Object obj) {
        return ((InterfaceC5614) obj).mo2357();
    }

    /* JADX INFO: renamed from: ۜܰ᩸, reason: not valid java name and contains not printable characters */
    public static void m9867(Object obj, Object obj2, Object obj3) {
        ((C5013) obj).m13907((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۤ᩵᩸, reason: not valid java name and contains not printable characters */
    public static StringBuilder m9868(Object obj, long j) {
        return ((StringBuilder) obj).append(j);
    }

    /* JADX INFO: renamed from: ۬ۨܰ, reason: not valid java name and contains not printable characters */
    public static String m9869(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܰۡ֨, reason: not valid java name and contains not printable characters */
    public static boolean m9870(Object obj) {
        return ((Activity) obj).isFinishing();
    }

    /* JADX INFO: renamed from: ܶܳۘ, reason: not valid java name and contains not printable characters */
    public static void m9871(Object obj) {
        ((AbstractC20745) obj).m46739();
    }

    /* JADX INFO: renamed from: ᩳۗۚ, reason: not valid java name and contains not printable characters */
    public static View m9872(Object obj, int i) {
        return ((ViewGroup) obj).getChildAt(i);
    }

    /* JADX INFO: renamed from: ᩴۡܺ, reason: not valid java name and contains not printable characters */
    public static boolean m9873(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: ᩴۤ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9874() {
        return false;
    }

    /* JADX INFO: renamed from: ᩵֫ᩴ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9875() {
        return JSON.object();
    }

    /* JADX INFO: renamed from: ᩹᩶᩵, reason: not valid java name and contains not printable characters */
    public static boolean m9876(Object obj) {
        return ((AbstractC20745) obj).mo33971();
    }

    /* JADX INFO: renamed from: ᩻֡ۗ, reason: not valid java name and contains not printable characters */
    public static Long m9877(long j) {
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ᩻᩷ܶ, reason: not valid java name and contains not printable characters */
    public static int m9878(Object obj, int i) {
        return ((String) obj).indexOf(i);
    }

    public ViewTreeObserverOnPreDrawListenerC3327(C2746 c2746) {
        this.f12318 = c2746;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f12318.onChildViewsChanged(0);
        return true;
    }
}
