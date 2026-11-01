package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12098 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23387 f40465;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C12098(ActivityC23387 activityC23387) {
        this.f40465 = activityC23387;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f40465.f75770.f73861.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        ActivityC23387 activityC23387 = this.f40465;
        if (view == null) {
            view = activityC23387.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C2766.m8438(view);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        textView.setText(((C3629) activityC23387.f75770.f73861.get(i)).m10730());
        return view;
    }
}
