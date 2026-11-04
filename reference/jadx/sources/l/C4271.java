package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6IL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4271 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21425 f15524;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C4271(C21425 c21425) {
        this.f15524 = c21425;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return ((ArrayList) this.f15524.f68247).size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return ((ArrayList) this.f15524.f68247).get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C21425 c21425 = this.f15524;
        if (view == null) {
            view = c21425.f68253.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector);
        C18463 c18463 = (C18463) ((ArrayList) c21425.f68247).get(i);
        textView.setText(c18463.f60092);
        textView2.setText(c18463.f60090);
        return view;
    }
}
