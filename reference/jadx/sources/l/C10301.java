package l;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: renamed from: l.ۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 84KN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10301 extends ListView implements InterfaceC16651, InterfaceC12854, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int[] f35335 = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C12418 f35336;

    public C10301(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public C10301(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C1977 c1977M6353 = C1977.m6353(context, attributeSet, f35335, i, 0);
        if (c1977M6353.m6383(0)) {
            setBackgroundDrawable(c1977M6353.m6370(0));
        }
        if (c1977M6353.m6383(1)) {
            setDivider(c1977M6353.m6370(1));
        }
        c1977M6353.m6379();
    }

    @Override // l.InterfaceC12854
    public final void initialize(C12418 c12418) {
        this.f35336 = c12418;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // l.InterfaceC16651
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo26120(C23707 c23707) {
        return this.f35336.performItemAction(c23707, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo26120((C23707) getAdapter().getItem(i));
    }
}
