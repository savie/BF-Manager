package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes3.dex */
public final class C13737 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11620 f45292;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C13737(ActivityC11620 activityC11620) {
        this.f45292 = activityC11620;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f45292.f39034.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        ActivityC11620 activityC11620 = this.f45292;
        if (view == null) {
            view = activityC11620.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C2766.m8438(view);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        textView.setText((CharSequence) activityC11620.f39034.get(i));
        return view;
    }
}
