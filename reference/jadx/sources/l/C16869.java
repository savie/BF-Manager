package l;

import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ܽ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16869 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f53965;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C16869(ActivityC3588 activityC3588) {
        this.f53965 = activityC3588;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.f53965.f13203.m30532(false);
    }
}
