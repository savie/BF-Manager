package l;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: renamed from: l.ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84KN */
/* JADX INFO: loaded from: classes3.dex */
public final class C3933 extends ListView implements InterfaceC18849, InterfaceC11280, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int[] f13425 = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9898 f13426;

    public C3933(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public C3933(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C5204 c5204M15649 = C5204.m15649(context, attributeSet, f13425, i, 0);
        if (c5204M15649.m15655(0)) {
            setBackgroundDrawable(c5204M15649.m15669(0));
        }
        if (c5204M15649.m15655(1)) {
            setDivider(c5204M15649.m15669(1));
        }
        c5204M15649.m15664();
    }

    @Override // l.InterfaceC11280
    public final void initialize(C9898 c9898) {
        this.f13426 = c9898;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // l.InterfaceC18849
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo12636(C8407 c8407) {
        return this.f13426.performItemAction(c8407, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo12636((C8407) getAdapter().getItem(i));
    }
}
