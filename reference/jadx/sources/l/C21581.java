package l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes.dex */
public final class C21581 extends BaseAdapter implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean[] f68941;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CharSequence[] f68942;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Context f68943;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C21581(Context context, boolean[] zArr, CharSequence[] charSequenceArr) {
        this.f68943 = context;
        this.f68941 = zArr;
        this.f68942 = charSequenceArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f68941.length;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f68943).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        CheckedTextView checkedTextView = (CheckedTextView) view;
        checkedTextView.setText(this.f68942[i]);
        boolean zIsChecked = checkedTextView.isChecked();
        boolean z = this.f68941[i];
        if (zIsChecked != z) {
            checkedTextView.setChecked(z);
            return view;
        }
        checkedTextView.refreshDrawableState();
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean[] zArr = this.f68941;
        boolean z = !zArr[i];
        zArr[i] = z;
        ((CheckedTextView) view).setChecked(z);
    }
}
