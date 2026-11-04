package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes.dex */
public final class C22946 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC2063 f74556;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f74557;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C22946(ViewOnClickListenerC2063 viewOnClickListenerC2063, ArrayList arrayList) {
        this.f74556 = viewOnClickListenerC2063;
        this.f74557 = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f74557.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C12154 c12154;
        if (view == null) {
            view = this.f74556.f6863.m40395(R.layout.MT_Protector);
            c12154 = new C12154(view);
            c12154.f39077.setSingleLine(false);
            TextView textView = c12154.f39076;
            textView.setVisibility(4);
            textView.setText((CharSequence) null);
            TextView textView2 = c12154.f39078;
            textView2.setBackgroundColor(0);
            textView2.setTextColor(C3296.f10779);
            textView2.setSingleLine(false);
            textView2.setMaxLines(3);
            view.setTag(c12154);
        } else {
            c12154 = (C12154) view.getTag();
        }
        C2310 c2310 = (C2310) this.f74557.get(i);
        c12154.f39077.setText(((InterfaceC8697) c2310.f7473).getPath());
        c12154.f39078.setText((CharSequence) c2310.f7474);
        return view;
    }
}
