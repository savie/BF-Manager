package l;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4MC */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC22732 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC21320 f74058;

    public ViewTreeObserverOnGlobalLayoutListenerC22732(ViewOnKeyListenerC21320 viewOnKeyListenerC21320) {
        this.f74058 = viewOnKeyListenerC21320;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewOnKeyListenerC21320 viewOnKeyListenerC21320 = this.f74058;
        C19723 c19723 = viewOnKeyListenerC21320.f69373;
        if (!viewOnKeyListenerC21320.isShowing() || c19723.m18837()) {
            return;
        }
        View view = viewOnKeyListenerC21320.f69375;
        if (view == null || !view.isShown()) {
            viewOnKeyListenerC21320.dismiss();
        } else {
            c19723.show();
        }
    }
}
