package l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes4.dex */
public final class C14867 extends BaseAdapter implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Context f48591;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f48592;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C14867(AbstractActivityC17204 abstractActivityC17204, ArrayList arrayList) {
        this.f48591 = abstractActivityC17204;
        this.f48592 = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f48592.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f48592.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f48591).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        InterfaceC4427 interfaceC4427 = (InterfaceC4427) this.f48592.get(i);
        boolean zIsChecked = interfaceC4427.isChecked();
        CheckedTextView checkedTextView = (CheckedTextView) view;
        checkedTextView.setText(interfaceC4427.getName());
        if (checkedTextView.isChecked() != zIsChecked) {
            checkedTextView.setChecked(zIsChecked);
            return view;
        }
        checkedTextView.refreshDrawableState();
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        InterfaceC4427 interfaceC4427 = (InterfaceC4427) this.f48592.get(i);
        boolean z = !interfaceC4427.isChecked();
        ((CheckedTextView) view).setChecked(z);
        interfaceC4427.setChecked(z);
    }
}
