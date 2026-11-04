package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩹ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC23358 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3966 f75644;

    public ViewOnAttachStateChangeListenerC23358(C3966 c3966) {
        this.f75644 = c3966;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f75644.m12714(0L);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f75644.m12725();
    }
}
