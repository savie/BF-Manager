package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes2.dex */
public final class C1379 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC23253 f5757;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f5758;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C1379(ViewOnClickListenerC23253 viewOnClickListenerC23253, ArrayList arrayList) {
        this.f5757 = viewOnClickListenerC23253;
        this.f5758 = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f5758.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C15948 c15948;
        if (view == null) {
            view = this.f5757.f75435.m30995(R.layout.MT_Protector);
            c15948 = new C15948(view);
            c15948.f51656.setSingleLine(false);
            TextView textView = c15948.f51655;
            textView.setVisibility(4);
            textView.setText((CharSequence) null);
            TextView textView2 = c15948.f51657;
            textView2.setBackgroundColor(0);
            textView2.setTextColor(C20368.f66009);
            textView2.setSingleLine(false);
            textView2.setMaxLines(3);
            view.setTag(c15948);
        } else {
            c15948 = (C15948) view.getTag();
        }
        C10946 c10946 = (C10946) this.f5758.get(i);
        c15948.f51656.setText(((InterfaceC3609) c10946.f37217).getPath());
        c15948.f51657.setText((CharSequence) c10946.f37218);
        return view;
    }
}
