package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T5WJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11408 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22597 f35878;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f35879;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16629 f35880;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C11408(C16629 c16629, ActivityC22597 activityC22597, boolean[] zArr) {
        this.f35880 = c16629;
        this.f35878 = activityC22597;
        this.f35879 = zArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f35880.f53766.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C12154 c12154;
        ActivityC22597 activityC22597 = this.f35878;
        if (view == null) {
            view = activityC22597.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            c12154 = new C12154(view);
            c12154.f39077.setSingleLine();
            view.setTag(c12154);
        } else {
            c12154 = (C12154) view.getTag();
        }
        c12154.f39078.setVisibility(8);
        c12154.f39078.setText((CharSequence) null);
        C13304 c13304 = (C13304) this.f35880.f53766.get(i);
        c12154.f39076.setText(String.format("%04X", Integer.valueOf(c13304.mo23383())));
        C17593.m41257(activityC22597.f73046, c13304, c12154);
        view.setBackgroundColor(this.f35879[i] ? C3296.f10761 : 0);
        return view;
    }
}
