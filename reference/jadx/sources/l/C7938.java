package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7938 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10055 f26098;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C7938(ActivityC10055 activityC10055) {
        this.f26098 = activityC10055;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f26098.f34361.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C19227 c19227;
        ActivityC10055 activityC10055 = this.f26098;
        if (view == null) {
            view = activityC10055.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c19227 = new C19227(view);
            view.setTag(c19227);
        } else {
            c19227 = (C19227) view.getTag();
        }
        c19227.f62122.setText((CharSequence) activityC10055.f34361.get(i));
        return view;
    }
}
