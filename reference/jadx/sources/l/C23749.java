package l;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public final class C23749 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52303(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52300(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m52305(View view) {
        return view.getNextClusterForwardId();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m52308(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m52295(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m52309(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m52304(View view) {
        return view.isFocusedByDefault();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52302(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static View m52297(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52301(View view, Collection collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean m52306(View view) {
        return view.restoreDefaultFocus();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m52296(View view) {
        return view.hasExplicitFocusable();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m52307(View view) {
        return view.getImportantForAutofill();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52299(View view, int i) {
        view.setImportantForAutofill(i);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m52310(View view) {
        return view.isImportantForAutofill();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AutofillId m52298(View view) {
        return view.getAutofillId();
    }
}
