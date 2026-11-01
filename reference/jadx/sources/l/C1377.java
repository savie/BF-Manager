package l;

import android.app.Application;
import android.content.res.Resources;
import android.widget.AbsListView;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes.dex */
public final class C1377 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ۚۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean f5749;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7022 f5750;

    /* JADX INFO: renamed from: ۗ֫ܿ, reason: not valid java name and contains not printable characters */
    public static Application m4826() {
        return C16737.m39277();
    }

    /* JADX INFO: renamed from: ۗܰۘ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m4827(Object obj) {
        return C14952.m35859((AbstractC20745) obj);
    }

    /* JADX INFO: renamed from: ۙܺۧ, reason: not valid java name and contains not printable characters */
    public static Set m4828(Object obj) {
        return ((IdentityHashMap) obj).keySet();
    }

    /* JADX INFO: renamed from: ۛ᩶ۡ, reason: not valid java name and contains not printable characters */
    public static void m4829(Object obj) {
        C19431.m44468((AutoCloseable) obj);
    }

    /* JADX INFO: renamed from: ۡ֫ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m4830(Object obj, Object obj2) {
        return ((Set) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ۧᩳۘ, reason: not valid java name and contains not printable characters */
    public static Iterator m4831(Object obj) {
        return ((Set) obj).iterator();
    }

    /* JADX INFO: renamed from: ۫ۜܽ, reason: not valid java name and contains not printable characters */
    public static String m4832(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۬۟᩶, reason: not valid java name and contains not printable characters */
    public static int m4833() {
        return 0;
    }

    /* JADX INFO: renamed from: ܰ۟᩵, reason: not valid java name and contains not printable characters */
    public static void m4834(int i, int i2, Object obj) {
        C15157.m36338(i, i2, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ܶ᩷۬, reason: not valid java name and contains not printable characters */
    public static void m4835(Object obj, Object obj2) {
        ((C11092) obj).append((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܺܳۖ, reason: not valid java name and contains not printable characters */
    public static void m4836(Object obj, int i) {
        ((C8067) obj).m21274(i);
    }

    /* JADX INFO: renamed from: ᩵۫ᩳ, reason: not valid java name and contains not printable characters */
    public static int m4837(Object obj) {
        return ((ArrayList) obj).size();
    }

    /* JADX INFO: renamed from: ᩶۬᩹, reason: not valid java name and contains not printable characters */
    public static int m4838(Object obj, int i) {
        return C16135.m38193((Resources.Theme) obj, i);
    }

    /* JADX INFO: renamed from: ᩷ܺ֨, reason: not valid java name and contains not printable characters */
    public static long m4839(long j, long j2) {
        return Math.min(j, j2);
    }

    /* JADX INFO: renamed from: ᩷᩷ۛ, reason: not valid java name and contains not printable characters */
    public static String m4840(Object obj, int i) {
        return ((String) obj).substring(i);
    }

    /* JADX INFO: renamed from: ᩹ۖ᩺, reason: not valid java name and contains not printable characters */
    public static void m4841(Object obj, int i) {
        ((AbstractC17902) obj).m41591(i);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C1377(C7022 c7022) {
        this.f5750 = c7022;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C7022 c7022 = this.f5750;
        RunnableC4199 runnableC4199 = c7022.f23606;
        PopupWindow popupWindow = c7022.f23602;
        if (i != 1 || popupWindow.getInputMethodMode() == 2 || popupWindow.getContentView() == null) {
            return;
        }
        c7022.f23601.removeCallbacks(runnableC4199);
        runnableC4199.run();
    }
}
