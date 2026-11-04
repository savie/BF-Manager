package l;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.material.slider.BasicLabelFormatter;

/* JADX INFO: renamed from: l.᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes.dex */
public final class C25100 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedCallback m55960(Object obj, final LayoutInflaterFactory2C24354 layoutInflaterFactory2C24354) {
        C17359.requireNonNull(layoutInflaterFactory2C24354);
        OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: l.ۧܳ
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                layoutInflaterFactory2C24354.m54423();
            }
        };
        C7376.m20247(obj).registerOnBackInvokedCallback(BasicLabelFormatter.MILLION, onBackInvokedCallback);
        return onBackInvokedCallback;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55962(Object obj, Object obj2) {
        C7376.m20247(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedDispatcher m55961(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
