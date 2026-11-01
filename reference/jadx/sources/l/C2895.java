package l;

import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ۗ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2895 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13125 f10924;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C2895(ActivityC13125 activityC13125) {
        this.f10924 = activityC13125;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.f10924.f43711.m30532(false);
    }
}
