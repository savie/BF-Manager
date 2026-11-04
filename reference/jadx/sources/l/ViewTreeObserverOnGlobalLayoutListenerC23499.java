package l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23499 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14547 f75977;

    public ViewTreeObserverOnGlobalLayoutListenerC23499(C14547 c14547) {
        this.f75977 = c14547;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C14547 c14547 = this.f75977;
        if (c14547.m35100().f55402.isShowing()) {
            if (!c14547.isShown()) {
                c14547.m35100().dismiss();
            } else {
                c14547.m35100().show();
            }
        }
    }
}
