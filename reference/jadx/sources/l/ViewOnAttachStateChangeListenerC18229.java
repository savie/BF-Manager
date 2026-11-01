package l;

import android.view.View;

/* JADX INFO: renamed from: l.ᩳᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC18229 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8352 f58207;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC18229(C8352 c8352) {
        this.f58207 = c8352;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C8352 c8352 = this.f58207;
        c8352.f28950.removeOnAttachStateChangeListener(this);
        c8352.f28944 = null;
        c8352.f28945.post(new RunnableC1212(1, c8352));
    }
}
