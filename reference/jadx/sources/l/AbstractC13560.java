package l;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5EF */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13560 implements InterfaceC6503, InterfaceC22026, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Rect f44735;

    @Override // l.InterfaceC22026
    public final boolean collapseItemActionView(C12418 c12418, C23707 c23707) {
        return false;
    }

    @Override // l.InterfaceC22026
    public final boolean expandItemActionView(C12418 c12418, C23707 c23707) {
        return false;
    }

    @Override // l.InterfaceC22026
    public final int getId() {
        return 0;
    }

    @Override // l.InterfaceC22026
    public final void initForMenu(Context context, C12418 c12418) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23039(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23040(View view);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23041(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23042(C12418 c12418);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23043(boolean z);

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo23044(int i);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo23045(int i);

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo23046(boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33149(Rect rect) {
        this.f44735 = rect;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect m33148() {
        return this.f44735;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C20179) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C20179) listAdapter).f65504.performItemAction((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC8890) ? 0 : 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m33147(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }
}
