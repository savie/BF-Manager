package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֡۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1H0 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC0426 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C7884 f1974;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9902 f1975;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC0426(LayoutInflaterFactory2C7884 layoutInflaterFactory2C7884, C9902 c9902) {
        this.f1974 = layoutInflaterFactory2C7884;
        this.f1975 = c9902;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C9902 c9902 = this.f1975;
        ComponentCallbacksC11612 componentCallbacksC11612M25719 = c9902.m25719();
        c9902.m25725();
        AbstractC17997.m41958((ViewGroup) componentCallbacksC11612M25719.mView.getParent(), this.f1974.f26223).m41967();
    }
}
