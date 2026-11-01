package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17673 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22342 f56140;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C17673(C22342 c22342) {
        this.f56140 = c22342;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return ((ArrayList) this.f56140.f72942).size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return ((ArrayList) this.f56140.f72942).get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        TextView textView2;
        C22342 c22342 = this.f56140;
        if (view == null) {
            view = c22342.f72939.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            textView = (TextView) view.findViewById(R.id.MT_Protector);
            textView2 = (TextView) view.findViewById(R.id.MT_Protector);
            view.setTag(textView);
            textView.setTag(textView2);
        } else {
            textView = (TextView) view.getTag();
            textView2 = (TextView) textView.getTag();
        }
        C1174 c1174 = (C1174) ((ArrayList) c22342.f72942).get(i);
        textView.setText(c1174.f5233);
        textView2.setText(c1174.f5231);
        return view;
    }
}
