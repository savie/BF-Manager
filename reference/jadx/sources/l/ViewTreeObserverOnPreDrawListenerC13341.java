package l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.۫᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC13341 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25276 f42550;

    public ViewTreeObserverOnPreDrawListenerC13341(C25276 c25276) {
        this.f42550 = c25276;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f42550.onChildViewsChanged(0);
        return true;
    }
}
