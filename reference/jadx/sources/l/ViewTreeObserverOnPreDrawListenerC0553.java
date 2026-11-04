package l;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;

/* JADX INFO: renamed from: l.֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A513 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC0553 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f2285;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ListView f2286;

    public ViewTreeObserverOnPreDrawListenerC0553(ListView listView, View view) {
        this.f2286 = listView;
        this.f2285 = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f2285;
        ListView listView = this.f2286;
        if (!C19198.m44472(listView, view)) {
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
