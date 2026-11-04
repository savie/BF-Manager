package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85OU */
/* JADX INFO: loaded from: classes5.dex */
public final class C21087 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f67365 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18103 f67366;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C21087(C18103 c18103) {
        this.f67366 = c18103;
        m48152();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C18103 c18103 = this.f67366;
        int size = c18103.f59251.getNonActionItems().size();
        c18103.getClass();
        return this.f67365 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final C8407 getItem(int i) {
        C18103 c18103 = this.f67366;
        ArrayList nonActionItems = c18103.f59251.getNonActionItems();
        c18103.getClass();
        int i2 = this.f67365;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C8407) nonActionItems.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            C18103 c18103 = this.f67366;
            view = c18103.f59246.inflate(c18103.f59247, viewGroup, false);
        }
        ((InterfaceC1586) view).initialize(getItem(i), 0);
        return view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48152() {
        C18103 c18103 = this.f67366;
        C8407 expandedItem = c18103.f59251.getExpandedItem();
        if (expandedItem != null) {
            ArrayList nonActionItems = c18103.f59251.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (((C8407) nonActionItems.get(i)) == expandedItem) {
                    this.f67365 = i;
                    return;
                }
            }
        }
        this.f67365 = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m48152();
        super.notifyDataSetChanged();
    }
}
