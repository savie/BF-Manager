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

/* JADX INFO: renamed from: l.᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L5EF */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22469 implements InterfaceC16501, InterfaceC5315, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Rect f72708;

    @Override // l.InterfaceC5315
    public final boolean collapseItemActionView(C9898 c9898, C8407 c8407) {
        return false;
    }

    @Override // l.InterfaceC5315
    public final boolean expandItemActionView(C9898 c9898, C8407 c8407) {
        return false;
    }

    @Override // l.InterfaceC5315
    public final int getId() {
        return 0;
    }

    @Override // l.InterfaceC5315
    public final void initForMenu(Context context, C9898 c9898) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo50665(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo50667(View view);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo50668(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo50669(C9898 c9898);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo50670(boolean z);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public abstract void mo50671(int i);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo50672(int i);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo50673(boolean z);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50666(Rect rect) {
        this.f72708 = rect;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect m50664() {
        return this.f72708;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0204) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0204) listAdapter).f1366.performItemAction((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC24071) ? 0 : 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m50663(ListAdapter listAdapter, Context context, int i) {
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
