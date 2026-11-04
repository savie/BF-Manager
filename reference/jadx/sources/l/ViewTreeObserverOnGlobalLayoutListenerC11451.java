package l;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ۧۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC11451 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f35972;

    public ViewTreeObserverOnGlobalLayoutListenerC11451(C24132 c24132) {
        this.f35972 = c24132;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C18207 c18207 = this.f35972.f78120;
        if (c18207 != null) {
            c18207.f59454.invalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        C24132 c24132 = this.f35972;
        C18207 c18207 = c24132.f78120;
        if (c18207 != null) {
            c18207.f59454.invalidate();
        }
        c24132.m53970();
    }
}
