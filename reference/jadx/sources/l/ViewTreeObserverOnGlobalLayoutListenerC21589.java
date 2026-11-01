package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC21589 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC8890 f70049;

    public ViewTreeObserverOnGlobalLayoutListenerC21589(ViewOnKeyListenerC8890 viewOnKeyListenerC8890) {
        this.f70049 = viewOnKeyListenerC8890;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewOnKeyListenerC8890 viewOnKeyListenerC8890 = this.f70049;
        ArrayList arrayList = viewOnKeyListenerC8890.f30466;
        if (!viewOnKeyListenerC8890.isShowing() || arrayList.size() <= 0 || ((C19473) arrayList.get(0)).f62691.m18837()) {
            return;
        }
        View view = viewOnKeyListenerC8890.f30457;
        if (view == null || !view.isShown()) {
            viewOnKeyListenerC8890.dismiss();
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C19473) it.next()).f62691.show();
        }
    }
}
