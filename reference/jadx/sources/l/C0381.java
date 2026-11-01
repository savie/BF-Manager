package l;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: l.֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0381 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0381 f1861 = new C0381();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OnBackInvokedCallback m2115(final InterfaceC4871 interfaceC4871) {
        C13465.m32966(interfaceC4871, "onBackInvoked");
        return new OnBackInvokedCallback() { // from class: l.᩶ۨ
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                interfaceC4871.mo3788();
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2116(Object obj, int i, Object obj2) {
        C13465.m32966(obj, "dispatcher");
        C13465.m32966(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2117(Object obj, Object obj2) {
        C13465.m32966(obj, "dispatcher");
        C13465.m32966(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
