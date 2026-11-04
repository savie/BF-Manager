package l;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: l.۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7814 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C7814 f26033 = new C7814();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OnBackInvokedCallback m21285(final InterfaceC19479 interfaceC19479) {
        C15243.m36590(interfaceC19479, "onBackInvoked");
        return new OnBackInvokedCallback() { // from class: l.֡ۤ
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                interfaceC19479.mo4064();
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21286(Object obj, int i, Object obj2) {
        C15243.m36590(obj, "dispatcher");
        C15243.m36590(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21287(Object obj, Object obj2) {
        C15243.m36590(obj, "dispatcher");
        C15243.m36590(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
