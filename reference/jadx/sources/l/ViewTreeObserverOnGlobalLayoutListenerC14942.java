package l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC14942 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18672 f48806;

    public ViewTreeObserverOnGlobalLayoutListenerC14942(C18672 c18672) {
        this.f48806 = c18672;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C18672 c18672 = this.f48806;
        if (!c18672.m43423(c18672.f60715)) {
            c18672.dismiss();
        } else {
            c18672.m43424();
            c18672.show();
        }
    }
}
