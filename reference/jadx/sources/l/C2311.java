package l;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: renamed from: l.ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes2.dex */
public final class C2311 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f8225;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f8226;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C2311(View view, View view2) {
        this.f8226 = view;
        this.f8225 = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C17834.m41409(absListView, this.f8226, this.f8225);
    }
}
