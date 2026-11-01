package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 85LT */
/* JADX INFO: loaded from: classes4.dex */
public final class C20179 extends BaseAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f65502;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f65503;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C12418 f65504;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LayoutInflater f65505;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f65506;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f65507 = -1;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C20179(C12418 c12418, LayoutInflater layoutInflater, boolean z, int i) {
        this.f65506 = z;
        this.f65505 = layoutInflater;
        this.f65504 = c12418;
        this.f65503 = i;
        m45612();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45613(boolean z) {
        this.f65502 = z;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean z = this.f65506;
        C12418 c12418 = this.f65504;
        ArrayList nonActionItems = z ? c12418.getNonActionItems() : c12418.getVisibleItems();
        if (this.f65507 < 0) {
            return nonActionItems.size();
        }
        return nonActionItems.size() - 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12418 m45614() {
        return this.f65504;
    }

    @Override // android.widget.Adapter
    public final C23707 getItem(int i) {
        boolean z = this.f65506;
        C12418 c12418 = this.f65504;
        ArrayList nonActionItems = z ? c12418.getNonActionItems() : c12418.getVisibleItems();
        int i2 = this.f65507;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C23707) nonActionItems.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f65505.inflate(this.f65503, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        C7478 c7478 = (C7478) view;
        c7478.m19972(this.f65504.isGroupDividerEnabled() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        InterfaceC0858 interfaceC0858 = (InterfaceC0858) view;
        if (this.f65502) {
            c7478.m19971();
        }
        interfaceC0858.initialize(getItem(i), 0);
        return view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45612() {
        C12418 c12418 = this.f65504;
        C23707 expandedItem = c12418.getExpandedItem();
        if (expandedItem != null) {
            ArrayList nonActionItems = c12418.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (((C23707) nonActionItems.get(i)) == expandedItem) {
                    this.f65507 = i;
                    return;
                }
            }
        }
        this.f65507 = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m45612();
        super.notifyDataSetChanged();
    }
}
