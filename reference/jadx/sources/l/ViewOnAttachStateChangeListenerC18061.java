package l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC18061 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC8890 f57764;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC18061(ViewOnKeyListenerC8890 viewOnKeyListenerC8890) {
        this.f57764 = viewOnKeyListenerC8890;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewOnKeyListenerC8890 viewOnKeyListenerC8890 = this.f57764;
        ViewTreeObserver viewTreeObserver = viewOnKeyListenerC8890.f30475;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewOnKeyListenerC8890.f30475 = view.getViewTreeObserver();
            }
            viewOnKeyListenerC8890.f30475.removeGlobalOnLayoutListener(viewOnKeyListenerC8890.f30460);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
