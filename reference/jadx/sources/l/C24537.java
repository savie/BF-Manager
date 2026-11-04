package l;

import android.widget.AbsListView;

/* JADX INFO: renamed from: l.᩺᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes.dex */
public final class C24537 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f79560;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C24537(ActivityC22957 activityC22957) {
        this.f79560 = activityC22957;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.f79560.f74574.m36199(false);
    }
}
