package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85LT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0204 extends BaseAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final LayoutInflater f1364;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f1365;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9898 f1366;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f1367;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f1368;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f1369 = -1;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C0204(C9898 c9898, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1368 = z;
        this.f1364 = layoutInflater;
        this.f1366 = c9898;
        this.f1365 = i;
        m1605();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1606(boolean z) {
        this.f1367 = z;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean z = this.f1368;
        C9898 c9898 = this.f1366;
        ArrayList nonActionItems = z ? c9898.getNonActionItems() : c9898.getVisibleItems();
        if (this.f1369 < 0) {
            return nonActionItems.size();
        }
        return nonActionItems.size() - 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9898 m1607() {
        return this.f1366;
    }

    @Override // android.widget.Adapter
    public final C8407 getItem(int i) {
        boolean z = this.f1368;
        C9898 c9898 = this.f1366;
        ArrayList nonActionItems = z ? c9898.getNonActionItems() : c9898.getVisibleItems();
        int i2 = this.f1369;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C8407) nonActionItems.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1364.inflate(this.f1365, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        C14373 c14373 = (C14373) view;
        c14373.m34813(this.f1366.isGroupDividerEnabled() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        InterfaceC1586 interfaceC1586 = (InterfaceC1586) view;
        if (this.f1367) {
            c14373.m34812();
        }
        interfaceC1586.initialize(getItem(i), 0);
        return view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1605() {
        C9898 c9898 = this.f1366;
        C8407 expandedItem = c9898.getExpandedItem();
        if (expandedItem != null) {
            ArrayList nonActionItems = c9898.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (((C8407) nonActionItems.get(i)) == expandedItem) {
                    this.f1369 = i;
                    return;
                }
            }
        }
        this.f1369 = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m1605();
        super.notifyDataSetChanged();
    }
}
