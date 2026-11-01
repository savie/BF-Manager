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

/* JADX INFO: renamed from: l.᩶ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes4.dex */
public final class C20282 extends BaseAdapter implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Context f65731;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f65732;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C20282(AbstractActivityC12483 abstractActivityC12483, ArrayList arrayList) {
        this.f65731 = abstractActivityC12483;
        this.f65732 = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f65732.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f65732.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f65731).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        InterfaceC16049 interfaceC16049 = (InterfaceC16049) this.f65732.get(i);
        boolean zIsChecked = interfaceC16049.isChecked();
        CheckedTextView checkedTextView = (CheckedTextView) view;
        checkedTextView.setText(interfaceC16049.getName());
        if (checkedTextView.isChecked() != zIsChecked) {
            checkedTextView.setChecked(zIsChecked);
            return view;
        }
        checkedTextView.refreshDrawableState();
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        InterfaceC16049 interfaceC16049 = (InterfaceC16049) this.f65732.get(i);
        boolean z = !interfaceC16049.isChecked();
        ((CheckedTextView) view).setChecked(z);
        interfaceC16049.setChecked(z);
    }
}
