package l;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;

/* JADX INFO: renamed from: l.᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A513 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewTreeObserverOnPreDrawListenerC20428 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f66208;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ListView f66209;

    public ViewTreeObserverOnPreDrawListenerC20428(ListView listView, View view) {
        this.f66209 = listView;
        this.f66208 = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f66208;
        ListView listView = this.f66209;
        if (!C0671.m3014(listView, view)) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = listView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        return true;
    }
}
