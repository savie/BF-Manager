package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۗ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC3730 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12679 f12813;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC3730(C12679 c12679) {
        this.f12813 = c12679;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C12679 c12679 = this.f12813;
        c12679.f40607.removeOnAttachStateChangeListener(this);
        c12679.f40616 = null;
        c12679.f40618.post(new RunnableC17834(1, c12679));
    }
}
