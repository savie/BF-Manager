package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC1916 implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: ۜ᩶ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f7262;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2746 f7263;

    /* JADX INFO: renamed from: ֡ۧ۟, reason: not valid java name and contains not printable characters */
    public static Object m6228(Object obj, Object obj2, Object obj3) {
        return ((IdentityHashMap) obj).put(obj2, obj3);
    }

    /* JADX INFO: renamed from: ֨ۗܿ, reason: not valid java name and contains not printable characters */
    public static boolean m6229(Object obj) {
        return ((CompoundButton) obj).isChecked();
    }

    /* JADX INFO: renamed from: ۖܰۘ, reason: not valid java name and contains not printable characters */
    public static void m6230(Object obj, boolean z) {
        ((CompoundButton) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ۙ֡ۛ, reason: not valid java name and contains not printable characters */
    public static boolean m6231(Object obj, Object obj2) {
        return ((List) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ۚۗ᩵, reason: not valid java name and contains not printable characters */
    public static Throwable m6232(Object obj) {
        return ((Throwable) obj).getCause();
    }

    /* JADX INFO: renamed from: ۠ܰᩴ, reason: not valid java name and contains not printable characters */
    public static int m6233() {
        return 0;
    }

    /* JADX INFO: renamed from: ۢۤܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5046 m6234(Object obj) {
        return C9030.stream((Collection) obj);
    }

    /* JADX INFO: renamed from: ۬ܺۡ, reason: not valid java name and contains not printable characters */
    public static C12107 m6235(Object obj, Object obj2) {
        return ((C2455) obj).getEntry((String) obj2);
    }

    /* JADX INFO: renamed from: ܺ᩺᩻, reason: not valid java name and contains not printable characters */
    public static String m6236(Object obj) {
        return ((AbstractC20745) obj).mo33986();
    }

    /* JADX INFO: renamed from: ܿۗ۠, reason: not valid java name and contains not printable characters */
    public static void m6237(Object obj, int i) {
        ((View) obj).setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: ܿᩳ᩶, reason: not valid java name and contains not printable characters */
    public static int m6238(Object obj) {
        return ((AtomicInteger) obj).get();
    }

    /* JADX INFO: renamed from: ܿ᩵᩻, reason: not valid java name and contains not printable characters */
    public static boolean m6239(Object obj) {
        return ((List) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ᩳܺۢ, reason: not valid java name and contains not printable characters */
    public static boolean m6240(Object obj) {
        return ((ArrayDeque) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ᩶֫ۙ, reason: not valid java name and contains not printable characters */
    public static String m6241(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩹ۛۙ, reason: not valid java name and contains not printable characters */
    public static void m6242(Object obj, Object obj2) {
        ((Throwable) obj).addSuppressed((Throwable) obj2);
    }

    /* JADX INFO: renamed from: ᩹᩷ۧ, reason: not valid java name and contains not printable characters */
    public static void m6243(Object obj) {
        C13465.m32962(obj);
    }

    public ViewGroupOnHierarchyChangeListenerC1916(C2746 c2746) {
        this.f7263 = c2746;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f7263.mOnHierarchyChangeListener;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        C2746 c2746 = this.f7263;
        c2746.onChildViewsChanged(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = c2746.mOnHierarchyChangeListener;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
