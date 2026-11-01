package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5WJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18063 extends BaseAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f57769;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13125 f57770;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8186 f57771;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C18063(C8186 c8186, ActivityC13125 activityC13125, boolean[] zArr) {
        this.f57771 = c8186;
        this.f57770 = activityC13125;
        this.f57769 = zArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f57771.f28538.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C15948 c15948;
        ActivityC13125 activityC13125 = this.f57770;
        if (view == null) {
            view = activityC13125.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c15948 = new C15948(view);
            c15948.f51656.setSingleLine();
            view.setTag(c15948);
        } else {
            c15948 = (C15948) view.getTag();
        }
        c15948.f51657.setVisibility(8);
        c15948.f51657.setText((CharSequence) null);
        C18551 c18551 = (C18551) this.f57771.f28538.get(i);
        c15948.f51655.setText(String.format("%04X", Integer.valueOf(c18551.mo10691())));
        C18418.m42709(activityC13125.f43713, c18551, c15948);
        view.setBackgroundColor(this.f57769[i] ? C20368.f65992 : 0);
        return view;
    }
}
