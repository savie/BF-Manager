package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۖ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6HO */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC2521 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6996 f8063;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC2521(C6996 c6996) {
        this.f8063 = c6996;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f8063.finish();
    }
}
