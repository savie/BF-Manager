package l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4MC */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC14971 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC21320 f48877;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC14971(ViewOnKeyListenerC21320 viewOnKeyListenerC21320) {
        this.f48877 = viewOnKeyListenerC21320;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewOnKeyListenerC21320 viewOnKeyListenerC21320 = this.f48877;
        ViewTreeObserver viewTreeObserver = viewOnKeyListenerC21320.f69386;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewOnKeyListenerC21320.f69386 = view.getViewTreeObserver();
            }
            viewOnKeyListenerC21320.f69386.removeGlobalOnLayoutListener(viewOnKeyListenerC21320.f69378);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
