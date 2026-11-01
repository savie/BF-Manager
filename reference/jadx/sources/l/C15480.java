package l;

import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ܶ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15480 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7718 f50432;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C15480(ActivityC7718 activityC7718) {
        this.f50432 = activityC7718;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.f50432.f25531.m30532(false);
    }
}
