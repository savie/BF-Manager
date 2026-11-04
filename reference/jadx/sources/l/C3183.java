package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3183 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6167 f10331;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C3183(ActivityC6167 activityC6167) {
        this.f10331 = activityC6167;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f10331.f21011.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C20337 c20337;
        ActivityC6167 activityC6167 = this.f10331;
        if (view == null) {
            view = activityC6167.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c20337 = new C20337(view);
            view.setTag(c20337);
        } else {
            c20337 = (C20337) view.getTag();
        }
        c20337.f65244.setText((CharSequence) activityC6167.f21011.get(i));
        return view;
    }
}
