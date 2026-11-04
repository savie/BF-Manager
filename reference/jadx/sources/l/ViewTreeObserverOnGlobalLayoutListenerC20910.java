package l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC20910 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10467 f66921;

    public ViewTreeObserverOnGlobalLayoutListenerC20910(C10467 c10467) {
        this.f66921 = c10467;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C10467 c10467 = this.f66921;
        if (!c10467.m26891().isShowing()) {
            c10467.m26892();
        }
        ViewTreeObserver viewTreeObserver = c10467.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
