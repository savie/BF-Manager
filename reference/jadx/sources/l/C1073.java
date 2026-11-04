package l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1073 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f3850;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final LayoutInflater f3851;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f3852;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C1073(AbstractActivityC17204 abstractActivityC17204) {
        this.f3850 = abstractActivityC17204;
        this.f3851 = LayoutInflater.from(abstractActivityC17204);
        m4033();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4033() {
        this.f3852 = ServiceC3107.m10155();
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return !this.f3852.isEmpty();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f3852.isEmpty()) {
            return 1;
        }
        return this.f3852.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (this.f3852.isEmpty()) {
            return null;
        }
        return this.f3852.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return !this.f3852.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4032() {
        return this.f3852.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4071 m4031(int i) {
        return (C4071) this.f3852.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String strM50713;
        if (view == null) {
            view = this.f3851.inflate(R.layout.MT_Protector, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector);
        if (this.f3852.isEmpty()) {
            textView.setText(R.string.MT_Protector);
            textView2.setVisibility(8);
            return view;
        }
        C4071 c4071 = (C4071) this.f3852.get(i);
        String strM13148 = c4071.m13148();
        boolean zIsEmpty = TextUtils.isEmpty(strM13148);
        AbstractActivityC17204 abstractActivityC17204 = this.f3850;
        if (zIsEmpty) {
            strM13148 = abstractActivityC17204.getString(R.string.MT_Protector);
        }
        textView.setText(strM13148);
        String string = abstractActivityC17204.getString(c4071.m13145() ? R.string.MT_Protector : R.string.MT_Protector);
        long jM13149 = c4071.m13149();
        if (jM13149 <= 0) {
            strM50713 = abstractActivityC17204.getString(R.string.MT_Protector);
        } else {
            strM50713 = C22482.m50713(jM13149);
        }
        textView2.setText(abstractActivityC17204.getString(R.string.MT_Protector, string, strM50713));
        textView2.setVisibility(0);
        return view;
    }
}
