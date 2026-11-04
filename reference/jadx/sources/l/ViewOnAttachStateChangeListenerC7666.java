package l;

import android.view.View;

/* JADX INFO: renamed from: l.۟ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1GH */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC7666 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f25240;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC7666(View view) {
        this.f25240 = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.f25240;
        view2.removeOnAttachStateChangeListener(this);
        C22666.m51079(view2);
    }
}
