package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import bin.mt.plus.R;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public final class C1875 {

    /* JADX INFO: renamed from: ᩶ۧۛ, reason: not valid java name and contains not printable characters */
    public static int f7103;

    /* JADX INFO: renamed from: ֨᩷֨, reason: not valid java name and contains not printable characters */
    public static String m6085(int i) {
        return C16737.m39288(i);
    }

    /* JADX INFO: renamed from: ֫᩺᩹, reason: not valid java name and contains not printable characters */
    public static int m6086() {
        return 0;
    }

    /* JADX INFO: renamed from: ֫᩻֡, reason: not valid java name and contains not printable characters */
    public static int m6087(Object obj) {
        return ((C6111) obj).m16978();
    }

    /* JADX INFO: renamed from: ۘ᩹᩹, reason: not valid java name and contains not printable characters */
    public static C21136 m6088(Object obj) {
        return ((ActivityC20431) obj).f66235;
    }

    /* JADX INFO: renamed from: ۛۡ᩺, reason: not valid java name and contains not printable characters */
    public static void m6095(Object obj, Object obj2) {
        ((C8067) obj).m21261((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۡܽ᩵, reason: not valid java name and contains not printable characters */
    public static int m6096(Object obj) {
        return ((CharSequence) obj).length();
    }

    /* JADX INFO: renamed from: ۡܿ᩶, reason: not valid java name and contains not printable characters */
    public static int m6097(Object obj) {
        return ((C17367) obj).m40462();
    }

    /* JADX INFO: renamed from: ܳܳۗ, reason: not valid java name and contains not printable characters */
    public static void m6102(Object obj, Object obj2, Object obj3) {
        ((AbstractActivityC12483) obj).m31002((Throwable) obj2, (DialogInterface.OnDismissListener) obj3);
    }

    /* JADX INFO: renamed from: ܽۜܰ, reason: not valid java name and contains not printable characters */
    public static boolean m6103(Object obj, Object obj2) {
        return ((HashSet) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ᩳۗۖ, reason: not valid java name and contains not printable characters */
    public static String m6104(Object obj, int i, Object obj2) {
        return ((Context) obj).getString(i, (Object[]) obj2);
    }

    /* JADX INFO: renamed from: ᩵ۘ᩵, reason: not valid java name and contains not printable characters */
    public static String m6105(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩵ۛۤ, reason: not valid java name and contains not printable characters */
    public static int m6106(Object obj, Object obj2) {
        return ((JSONObject) obj).getInt((String) obj2);
    }

    /* JADX INFO: renamed from: ᩶ܿ۬, reason: not valid java name and contains not printable characters */
    public static void m6107(Object obj) {
        ((Lock) obj).unlock();
    }

    /* JADX INFO: renamed from: ᩶ᩴܰ, reason: not valid java name and contains not printable characters */
    public static String m6108(Object obj) {
        return ((InterfaceC19133) obj).getTypeName();
    }

    /* JADX INFO: renamed from: ᩸᩸֨, reason: not valid java name and contains not printable characters */
    public static String m6109() {
        return C1709.m5696();
    }

    /* JADX INFO: renamed from: ᩺᩻᩺, reason: not valid java name and contains not printable characters */
    public static void m6110(Object obj, Object obj2) {
        ((AbstractC3492) obj).m10245((AbstractActivityC12483) obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m6090(View view, int i) {
        return view.requireViewById(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static CharSequence m6089(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6091(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6094(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m6101(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6098(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m6100(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6092(View view, final InterfaceC11382 interfaceC11382) {
        C12274 c12274 = (C12274) view.getTag(R.id.MT_Protector);
        if (c12274 == null) {
            c12274 = new C12274();
            view.setTag(R.id.MT_Protector, c12274);
        }
        C13638.requireNonNull(interfaceC11382);
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: l.ܳܳ
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                return interfaceC11382.m28490();
            }
        };
        c12274.put(interfaceC11382, onUnhandledKeyEventListener);
        view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m6099(View view, InterfaceC11382 interfaceC11382) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C12274 c12274 = (C12274) view.getTag(R.id.MT_Protector);
        if (c12274 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c12274.getOrDefault(interfaceC11382, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6093(View view, C20595 c20595) {
        view.setAutofillId(null);
    }
}
