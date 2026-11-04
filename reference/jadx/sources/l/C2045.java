package l;

import android.widget.AbsListView;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes2.dex */
public final class C2045 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16960 f6802;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C2045(C16960 c16960) {
        this.f6802 = c16960;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C16960 c16960 = this.f6802;
        RunnableC25166 runnableC25166 = c16960.f55426;
        PopupWindow popupWindow = c16960.f55402;
        if (i != 1 || popupWindow.getInputMethodMode() == 2 || popupWindow.getContentView() == null) {
            return;
        }
        c16960.f55414.removeCallbacks(runnableC25166);
        runnableC25166.run();
    }
}
