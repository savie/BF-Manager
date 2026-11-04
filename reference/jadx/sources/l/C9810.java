package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9810 {
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C3977 m25566(View view) {
        return C19639.m45286(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3977 m25551(View view, C3977 c3977, Rect rect) {
        WindowInsets windowInsetsM12827 = c3977.m12827();
        if (windowInsetsM12827 != null) {
            return C3977.m12812(view, view.computeSystemWindowInsets(windowInsetsM12827, rect));
        }
        rect.setEmpty();
        return c3977;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25556(View view, InterfaceC22491 interfaceC22491) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.MT_Protector, interfaceC22491);
        }
        if (interfaceC22491 == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.MT_Protector));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC18761(view, interfaceC22491));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25557(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.MT_Protector);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static float m25561(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m25560(View view, float f) {
        view.setZ(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25552(View view, float f) {
        view.setElevation(f);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m25565(View view, float f) {
        view.setTranslationZ(f);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static float m25562(View view) {
        return view.getTranslationZ();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25555(View view, String str) {
        view.setTransitionName(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static float m25559(View view) {
        return view.getElevation();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m25563(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25553(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m25550(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m25564(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25554(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m25558(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25549(View view) {
        view.stopNestedScroll();
    }
}
