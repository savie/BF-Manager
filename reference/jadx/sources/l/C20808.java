package l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20808 extends BaseAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24538 f66633;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f66634;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f66635;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f66637 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f66636 = C24538.f79563;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C20808(C24538 c24538) {
        this.f66633 = c24538;
        float[] fArr = new float[3];
        C8420.m22613(C3296.f10738, fArr);
        fArr[2] = fArr[2] * 1.2f;
        this.f66634 = Color.HSVToColor(fArr);
        C8420.m22613(C3296.f10758, fArr);
        fArr[2] = C3296.m10870(1.2f, 0.95f) * fArr[2];
        this.f66635 = Color.HSVToColor(fArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47601(String str) {
        if (str == null || str.isEmpty()) {
            this.f66636 = C24538.f79563;
            notifyDataSetChanged();
            return;
        }
        ArrayList arrayList = this.f66637;
        arrayList.clear();
        for (C6638 c6638 : C24538.f79563) {
            if (C24276.m54287(c6638.f22165, str) || C24276.m54287(c6638.f22164, str)) {
                arrayList.add(new C6638(c6638.f22165, c6638.f22164, str, this.f66634, this.f66635));
            }
        }
        this.f66636 = arrayList;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f66636.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C12603 c12603;
        if (view != null) {
            c12603 = (C12603) view.getTag();
        } else {
            view = C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c12603 = new C12603();
            c12603.f40445 = (TextView) view.findViewById(R.id.textView);
            c12603.f40444 = (TextView) view.findViewById(R.id.textView2);
            view.setTag(c12603);
        }
        C6638 c6638 = (C6638) this.f66636.get(i);
        c12603.f40445.setText(c6638.f22165);
        c12603.f40444.setText(c6638.f22164);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = this.f66633.f79565.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
