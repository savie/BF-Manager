package l;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: renamed from: l.᩷ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes4.dex */
public final class C20987 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f68335;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f68336;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C20987(View view, View view2) {
        this.f68336 = view;
        this.f68335 = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C16754.m39312((View) absListView, this.f68336, this.f68335);
    }
}
