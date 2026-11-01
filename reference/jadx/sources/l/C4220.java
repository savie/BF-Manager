package l;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.material.slider.BasicLabelFormatter;

/* JADX INFO: renamed from: l.ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C4220 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedCallback m11880(Object obj, final LayoutInflaterFactory2C9161 layoutInflaterFactory2C9161) {
        C13638.requireNonNull(layoutInflaterFactory2C9161);
        OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: l.۬᩹
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                layoutInflaterFactory2C9161.m23573();
            }
        };
        C9023.m23353(obj).registerOnBackInvokedCallback(BasicLabelFormatter.MILLION, onBackInvokedCallback);
        return onBackInvokedCallback;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11882(Object obj, Object obj2) {
        C9023.m23353(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedDispatcher m11881(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
