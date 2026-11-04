package l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C4MC */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC15755 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC23215 f51229;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC15755(ViewOnKeyListenerC23215 viewOnKeyListenerC23215) {
        this.f51229 = viewOnKeyListenerC23215;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewOnKeyListenerC23215 viewOnKeyListenerC23215 = this.f51229;
        ViewTreeObserver viewTreeObserver = viewOnKeyListenerC23215.f75218;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewOnKeyListenerC23215.f75218 = view.getViewTreeObserver();
            }
            viewOnKeyListenerC23215.f75218.removeGlobalOnLayoutListener(viewOnKeyListenerC23215.f75207);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
