package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۤۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC10563 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f33573;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC22406 f33574;

    public ViewOnAttachStateChangeListenerC10563(AbstractActivityC17204 abstractActivityC17204, InterfaceC22406 interfaceC22406) {
        this.f33573 = abstractActivityC17204;
        this.f33574 = interfaceC22406;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f33573.getLifecycle().mo23077(this.f33574);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f33573.getLifecycle().mo23078(this.f33574);
    }
}
