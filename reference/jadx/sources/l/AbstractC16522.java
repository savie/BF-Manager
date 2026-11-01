package l;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: l.ܽ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64UN */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16522 extends BaseAdapter implements SectionIndexer, InterfaceC23578 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final BaseAdapter f53083;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10878 f53084;

    public AbstractC16522(BaseAdapter baseAdapter) {
        this.f53083 = baseAdapter;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BaseAdapter m38884() {
        return this.f53083;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38885(AbsListView absListView) {
        mo30531(new C10878(absListView));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10878 m38886() {
        return this.f53084;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo30531(C10878 c10878) {
        this.f53084 = c10878;
        SpinnerAdapter spinnerAdapter = this.f53083;
        if (spinnerAdapter instanceof InterfaceC23578) {
            ((InterfaceC23578) spinnerAdapter).mo30531(c10878);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f53083.getCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f53083.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f53083.getItemId(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.f53083.getView(i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.f53083.areAllItemsEnabled();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return this.f53083.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return this.f53083.getItemViewType(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return this.f53083.getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return this.f53083.hasStableIds();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        return this.f53083.isEmpty();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return this.f53083.isEnabled(i);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.f53083.notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        this.f53083.notifyDataSetInvalidated();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f53083.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f53083.unregisterDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.SectionIndexer
    public final int getPositionForSection(int i) {
        SpinnerAdapter spinnerAdapter = this.f53083;
        if (spinnerAdapter instanceof SectionIndexer) {
            return ((SectionIndexer) spinnerAdapter).getPositionForSection(i);
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public final int getSectionForPosition(int i) {
        SpinnerAdapter spinnerAdapter = this.f53083;
        if (spinnerAdapter instanceof SectionIndexer) {
            return ((SectionIndexer) spinnerAdapter).getSectionForPosition(i);
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public final Object[] getSections() {
        Object[] objArr = new Object[0];
        SpinnerAdapter spinnerAdapter = this.f53083;
        return spinnerAdapter instanceof SectionIndexer ? ((SectionIndexer) spinnerAdapter).getSections() : objArr;
    }
}
