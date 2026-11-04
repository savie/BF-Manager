package l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC3187 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC24071 f10383;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC3187(ViewOnKeyListenerC24071 viewOnKeyListenerC24071) {
        this.f10383 = viewOnKeyListenerC24071;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewOnKeyListenerC24071 viewOnKeyListenerC24071 = this.f10383;
        ViewTreeObserver viewTreeObserver = viewOnKeyListenerC24071.f77849;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewOnKeyListenerC24071.f77849 = view.getViewTreeObserver();
            }
            viewOnKeyListenerC24071.f77849.removeGlobalOnLayoutListener(viewOnKeyListenerC24071.f77835);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
