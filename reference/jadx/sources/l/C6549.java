package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6549 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC24449 f21991;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C6549(ActivityC24449 activityC24449) {
        this.f21991 = activityC24449;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f21991.f79376.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        ActivityC24449 activityC24449 = this.f21991;
        if (view == null) {
            view = activityC24449.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C22744.m51280(view);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        textView.setText(((C18099) activityC24449.f79376.get(i)).m42221());
        return view;
    }
}
