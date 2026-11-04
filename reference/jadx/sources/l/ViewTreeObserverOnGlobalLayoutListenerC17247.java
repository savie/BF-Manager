package l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C4MC */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC17247 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC23215 f56193;

    public ViewTreeObserverOnGlobalLayoutListenerC17247(ViewOnKeyListenerC23215 viewOnKeyListenerC23215) {
        this.f56193 = viewOnKeyListenerC23215;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewOnKeyListenerC23215 viewOnKeyListenerC23215 = this.f56193;
        C6520 c6520 = viewOnKeyListenerC23215.f75217;
        if (!viewOnKeyListenerC23215.isShowing() || c6520.m39950()) {
            return;
        }
        View view = viewOnKeyListenerC23215.f75221;
        if (view == null || !view.isShown()) {
            viewOnKeyListenerC23215.dismiss();
        } else {
            c6520.show();
        }
    }
}
