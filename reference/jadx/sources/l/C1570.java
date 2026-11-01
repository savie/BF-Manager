package l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1570 extends BaseAdapter {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f6316;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f6317;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4475 f6318;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f6319 = new ArrayList();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f6315 = C4475.f15919;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C1570(C4475 c4475) {
        this.f6318 = c4475;
        float[] fArr = new float[3];
        C3057.m9161(C20368.f65970, fArr);
        fArr[2] = fArr[2] * 1.2f;
        this.f6316 = Color.HSVToColor(fArr);
        C3057.m9161(C20368.f66007, fArr);
        fArr[2] = C20368.m45982(1.2f, 0.95f) * fArr[2];
        this.f6317 = Color.HSVToColor(fArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5371(String str) {
        if (str == null || str.isEmpty()) {
            this.f6315 = C4475.f15919;
            notifyDataSetChanged();
            return;
        }
        ArrayList arrayList = this.f6319;
        arrayList.clear();
        for (C2981 c2981 : C4475.f15919) {
            if (C6851.m18463(c2981.f11187, (CharSequence) str) || C6851.m18463(c2981.f11186, (CharSequence) str)) {
                arrayList.add(new C2981(c2981.f11187, c2981.f11186, str, this.f6316, this.f6317));
            }
        }
        this.f6315 = arrayList;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f6315.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C9333 c9333;
        if (view != null) {
            c9333 = (C9333) view.getTag();
        } else {
            view = C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c9333 = new C9333();
            c9333.f31683 = (TextView) view.findViewById(R.id.textView);
            c9333.f31682 = (TextView) view.findViewById(R.id.textView2);
            view.setTag(c9333);
        }
        C2981 c2981 = (C2981) this.f6315.get(i);
        c9333.f31683.setText(c2981.f11187);
        c9333.f31682.setText(c2981.f11186);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = this.f6318.f15923.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
