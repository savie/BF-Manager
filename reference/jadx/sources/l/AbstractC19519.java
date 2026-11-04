package l;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: l.ᩴۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64UN */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19519 extends BaseAdapter implements SectionIndexer, InterfaceC1620 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final BaseAdapter f62976;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7172 f62977;

    public AbstractC19519(BaseAdapter baseAdapter) {
        this.f62976 = baseAdapter;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BaseAdapter m45064() {
        return this.f62976;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45065(AbsListView absListView) {
        mo5718(new C7172(absListView));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7172 m45066() {
        return this.f62977;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo5718(C7172 c7172) {
        this.f62977 = c7172;
        SpinnerAdapter spinnerAdapter = this.f62976;
        if (spinnerAdapter instanceof InterfaceC1620) {
            ((InterfaceC1620) spinnerAdapter).mo5718(c7172);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f62976.getCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f62976.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f62976.getItemId(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.f62976.getView(i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.f62976.areAllItemsEnabled();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return this.f62976.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return this.f62976.getItemViewType(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return this.f62976.getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return this.f62976.hasStableIds();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        return this.f62976.isEmpty();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return this.f62976.isEnabled(i);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.f62976.notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        this.f62976.notifyDataSetInvalidated();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f62976.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f62976.unregisterDataSetObserver(dataSetObserver);
    }

    @Override // android.widget.SectionIndexer
    public final int getPositionForSection(int i) {
        SpinnerAdapter spinnerAdapter = this.f62976;
        if (spinnerAdapter instanceof SectionIndexer) {
            return ((SectionIndexer) spinnerAdapter).getPositionForSection(i);
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public final int getSectionForPosition(int i) {
        SpinnerAdapter spinnerAdapter = this.f62976;
        if (spinnerAdapter instanceof SectionIndexer) {
            return ((SectionIndexer) spinnerAdapter).getSectionForPosition(i);
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public final Object[] getSections() {
        Object[] objArr = new Object[0];
        SpinnerAdapter spinnerAdapter = this.f62976;
        return spinnerAdapter instanceof SectionIndexer ? ((SectionIndexer) spinnerAdapter).getSections() : objArr;
    }
}
