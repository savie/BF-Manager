package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes.dex */
public final class C21883 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10694 f69736;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C21883(ActivityC10694 activityC10694) {
        this.f69736 = activityC10694;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f69736.f33934.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        ActivityC10694 activityC10694 = this.f69736;
        if (view == null) {
            view = activityC10694.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C22744.m51280(view);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        textView.setText((CharSequence) activityC10694.f33934.get(i));
        return view;
    }
}
