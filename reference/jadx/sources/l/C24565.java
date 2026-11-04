package l;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: renamed from: l.᩺᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes.dex */
public final class C24565 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f79621;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f79622;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C24565(View view, View view2) {
        this.f79622 = view;
        this.f79621 = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C18597.m43177((View) absListView, this.f79622, this.f79621);
    }
}
