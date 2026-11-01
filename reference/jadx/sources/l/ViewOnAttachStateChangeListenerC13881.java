package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܰܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC13881 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f45742;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC22591 f45743;

    public ViewOnAttachStateChangeListenerC13881(AbstractActivityC12483 abstractActivityC12483, InterfaceC22591 interfaceC22591) {
        this.f45742 = abstractActivityC12483;
        this.f45743 = interfaceC22591;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f45742.getLifecycle().mo9171(this.f45743);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f45742.getLifecycle().mo9172(this.f45743);
    }
}
