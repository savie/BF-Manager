package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: l.ܳܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6DR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15435 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2012 f50281;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50282;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f50283;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    public C15435(C2012 c2012, ArrayList arrayList, int i) {
        this.f50281 = c2012;
        this.f50283 = arrayList;
        this.f50282 = i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f50283.size() + 1;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        ArrayList arrayList = this.f50283;
        if (i < arrayList.size()) {
            return arrayList.get(i);
        }
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return i < this.f50283.size() ? 0 : 1;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ArrayList arrayList = this.f50283;
        int size = arrayList.size();
        C2012 c2012 = this.f50281;
        if (i != size) {
            C5741 c5741 = view instanceof C5741 ? (C5741) view : new C5741(c2012);
            c5741.m16801((Map.Entry) arrayList.get(i));
            return c5741;
        }
        if (view != null) {
            return view;
        }
        LinearLayout linearLayout = new LinearLayout(c2012.getContext());
        C17717 c17717 = c2012.f6700;
        int i2 = c2012.f6716 ? R.string.MT_Protector : R.string.MT_Protector;
        final int i3 = this.f50282;
        c17717.m41489(linearLayout, i2, new Runnable() { // from class: l.ᩴܶܳ
            @Override // java.lang.Runnable
            public final void run() {
                C2012 c2013 = this.f64061.f50281;
                c2013.f6716 = !c2013.f6716;
                c2013.m6913(i3);
            }
        });
        c2012.f6700.m41489(linearLayout, R.string.MT_Protector, new RunnableC13815(2, arrayList));
        return linearLayout;
    }
}
