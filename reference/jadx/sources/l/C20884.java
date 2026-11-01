package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 85OU */
/* JADX INFO: loaded from: classes4.dex */
public final class C20884 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f67823 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15946 f67824;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C20884(C15946 c15946) {
        this.f67824 = c15946;
        m46936();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C15946 c15946 = this.f67824;
        int size = c15946.f51647.getNonActionItems().size();
        c15946.getClass();
        return this.f67823 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final C23707 getItem(int i) {
        C15946 c15946 = this.f67824;
        ArrayList nonActionItems = c15946.f51647.getNonActionItems();
        c15946.getClass();
        int i2 = this.f67823;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C23707) nonActionItems.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            C15946 c15946 = this.f67824;
            LayoutInflater layoutInflater = c15946.f51649;
            c15946.getClass();
            view = layoutInflater.inflate(R.layout.MT_Protector, viewGroup, false);
        }
        ((InterfaceC0858) view).initialize(getItem(i), 0);
        return view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46936() {
        C15946 c15946 = this.f67824;
        C23707 expandedItem = c15946.f51647.getExpandedItem();
        if (expandedItem != null) {
            ArrayList nonActionItems = c15946.f51647.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (((C23707) nonActionItems.get(i)) == expandedItem) {
                    this.f67823 = i;
                    return;
                }
            }
        }
        this.f67823 = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m46936();
        super.notifyDataSetChanged();
    }
}
