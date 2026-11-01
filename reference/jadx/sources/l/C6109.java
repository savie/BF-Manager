package l;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6109 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15844 m16608(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C15844 c15844M37669 = C15844.m37669(null, rootWindowInsets);
        c15844M37669.m37678(c15844M37669);
        c15844M37669.m37676(view.getRootView());
        return c15844M37669;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16609(View view, int i) {
        view.setScrollIndicators(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16610(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m16611(View view) {
        return view.getScrollIndicators();
    }
}
