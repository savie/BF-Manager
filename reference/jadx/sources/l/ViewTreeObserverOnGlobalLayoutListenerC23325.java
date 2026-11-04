package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23325 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC24071 f75557;

    public ViewTreeObserverOnGlobalLayoutListenerC23325(ViewOnKeyListenerC24071 viewOnKeyListenerC24071) {
        this.f75557 = viewOnKeyListenerC24071;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewOnKeyListenerC24071 viewOnKeyListenerC24071 = this.f75557;
        ArrayList arrayList = viewOnKeyListenerC24071.f77830;
        if (!viewOnKeyListenerC24071.isShowing() || arrayList.size() <= 0 || ((C6171) arrayList.get(0)).f21024.m39950()) {
            return;
        }
        View view = viewOnKeyListenerC24071.f77827;
        if (view == null || !view.isShown()) {
            viewOnKeyListenerC24071.dismiss();
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C6171) it.next()).f21024.show();
        }
    }
}
