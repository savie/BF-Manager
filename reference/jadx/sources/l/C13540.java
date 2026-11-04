package l;

import android.view.View;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: l.۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13540 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C18893 m33244(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return C18893.m43810(windowInsetsController);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33243(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static CharSequence m33242(View view) {
        return view.getStateDescription();
    }
}
