package l;

import android.widget.ListView;

/* JADX INFO: renamed from: l.ۜۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5GK */
/* JADX INFO: loaded from: classes3.dex */
public final class C6528 extends AbstractViewOnTouchListenerC2955 {

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final ListView f21987;

    public C6528(ListView listView) {
        super(listView);
        this.f21987 = listView;
    }

    @Override // l.AbstractViewOnTouchListenerC2955
    /* JADX INFO: renamed from: ܰ */
    public final void mo8783(int i) {
        this.f21987.scrollListBy(i);
    }

    @Override // l.AbstractViewOnTouchListenerC2955
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8782(int i) {
        ListView listView = this.f21987;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
