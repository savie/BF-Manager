package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19818 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0061 f63619;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C19818(ActivityC0061 activityC0061) {
        this.f63619 = activityC0061;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f63619.f945.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        ActivityC0061 activityC0061 = this.f63619;
        if (view == null) {
            view = activityC0061.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C2766.m8438(view);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        textView.setText(((C0176) activityC0061.f945.get(i)).m1373());
        return view;
    }
}
