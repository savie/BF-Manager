package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1GH */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC6071 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f20574;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC6071(View view) {
        this.f20574 = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.f20574;
        view2.removeOnAttachStateChangeListener(this);
        C5031.m14002(view2);
    }
}
