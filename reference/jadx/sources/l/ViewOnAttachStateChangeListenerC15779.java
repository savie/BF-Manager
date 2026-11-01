package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܺۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC15779 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5900 f51098;

    public ViewOnAttachStateChangeListenerC15779(C5900 c5900) {
        this.f51098 = c5900;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f51098.m16141(0L);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f51098.m16137();
    }
}
