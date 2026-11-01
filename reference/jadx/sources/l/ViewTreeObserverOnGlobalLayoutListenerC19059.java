package l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC19059 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12709 f61625;

    public ViewTreeObserverOnGlobalLayoutListenerC19059(C12709 c12709) {
        this.f61625 = c12709;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C12709 c12709 = this.f61625;
        if (!c12709.m31554().isShowing()) {
            c12709.m31555();
        }
        ViewTreeObserver viewTreeObserver = c12709.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
