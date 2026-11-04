package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18942 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC2534 f61430;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C18942(ActivityC2534 activityC2534) {
        this.f61430 = activityC2534;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f61430.f8085.f80625.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        ActivityC2534 activityC2534 = this.f61430;
        if (view == null) {
            view = activityC2534.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C22744.m51280(view);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        textView.setText(((C1789) activityC2534.f8085.f80625.get(i)).m6250());
        return view;
    }
}
