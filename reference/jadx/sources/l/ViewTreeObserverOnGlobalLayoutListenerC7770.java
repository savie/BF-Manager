package l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC7770 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16237 f25629;

    public ViewTreeObserverOnGlobalLayoutListenerC7770(C16237 c16237) {
        this.f25629 = c16237;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C16237 c16237 = this.f25629;
        if (!c16237.m38354(c16237.f52382)) {
            c16237.dismiss();
        } else {
            c16237.m38355();
            c16237.show();
        }
    }
}
