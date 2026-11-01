package l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ۤܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC10345 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f35470;

    public ViewTreeObserverOnGlobalLayoutListenerC10345(C6111 c6111) {
        this.f35470 = c6111;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C2147 c2147 = this.f35470.f20731;
        if (c2147 != null) {
            c2147.f7816.invalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        C6111 c6111 = this.f35470;
        C2147 c2147 = c6111.f20731;
        if (c2147 != null) {
            c2147.f7816.invalidate();
        }
        c6111.m16915();
    }
}
