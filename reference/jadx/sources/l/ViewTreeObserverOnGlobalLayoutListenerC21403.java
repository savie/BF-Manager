package l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC21403 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7292 f69590;

    public ViewTreeObserverOnGlobalLayoutListenerC21403(C7292 c7292) {
        this.f69590 = c7292;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C7292 c7292 = this.f69590;
        if (c7292.m19436().f23602.isShowing()) {
            if (!c7292.isShown()) {
                c7292.m19436().dismiss();
            } else {
                c7292.m19436().show();
            }
        }
    }
}
