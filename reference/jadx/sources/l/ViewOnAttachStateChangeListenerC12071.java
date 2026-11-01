package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.۫֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1H0 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC12071 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C17009 f40404;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23711 f40405;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC12071(LayoutInflaterFactory2C17009 layoutInflaterFactory2C17009, C23711 c23711) {
        this.f40404 = layoutInflaterFactory2C17009;
        this.f40405 = c23711;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C23711 c23711 = this.f40405;
        ComponentCallbacksC22654 componentCallbacksC22654M52206 = c23711.m52206();
        c23711.m52211();
        AbstractC12153.m30220((ViewGroup) componentCallbacksC22654M52206.mView.getParent(), this.f40404.f54360).m30233();
    }
}
