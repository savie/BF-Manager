package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 29SR */
/* JADX INFO: loaded from: classes2.dex */
public final class C3524 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f12107;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4270 f12108;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f12109;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C3524(C4270 c4270) {
        this.f12108 = c4270;
        ArrayList arrayList = new ArrayList();
        this.f12109 = arrayList;
        arrayList.addAll(c4270.f15523);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11541(String str) {
        String lowerCase = str.toLowerCase();
        this.f12107 = lowerCase;
        C4270 c4270 = this.f12108;
        ArrayList arrayList = this.f12109;
        if (lowerCase == null || lowerCase.isEmpty()) {
            arrayList.clear();
            arrayList.addAll(c4270.f15523);
            notifyDataSetChanged();
            return;
        }
        arrayList.clear();
        String str2 = this.f12107;
        for (C6508 c6508 : (ArrayList) c4270.f15523) {
            C11441 c11441 = c6508.f21849;
            if (c11441.f35957.toLowerCase().contains(str2) || String.valueOf(c11441.f35958).contains(str2) || (c11441.f35956 != null && c11441.m28799().toLowerCase().contains(str2))) {
                arrayList.add(c6508);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f12109.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C20678 c20678;
        if (view != null) {
            c20678 = (C20678) view.getTag();
        } else {
            view = C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c20678 = new C20678();
            c20678.f66295 = (TextView) view.findViewById(R.id.textView);
            c20678.f66294 = (TextView) view.findViewById(R.id.textView2);
            c20678.f66296 = (ImageView) view.findViewById(R.id.icon);
            c20678.f66297 = (RadioButton) view.findViewById(R.id.MT_Protector);
            view.setTag(c20678);
        }
        C6508 c6508 = (C6508) this.f12109.get(i);
        C11441 c11441 = c6508.f21849;
        c20678.f66295.setText(c11441.toString());
        c20678.f66297.setChecked(c6508.f21852 == this.f12108.f15517);
        if (c11441.f35956 == null) {
            c20678.f66294.setText(R.string.MT_Protector);
        } else {
            c20678.f66294.setText(c11441.m28799());
        }
        ImageView imageView = c20678.f66296;
        if (c6508.f21849.f35956 == null) {
            imageView.setImageDrawable(c6508.f21850.f15522);
        } else {
            c6508.f21847 = true;
            imageView.setImageDrawable(c6508.f21851);
            if (c6508.f21848) {
                synchronized (c6508.f21850.f15519) {
                    c6508.f21850.f15519.addLast(c6508);
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = this.f12108.f15521.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
