package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 29SR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7438 extends BaseAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16611 f24810;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f24811;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f24812;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C7438(C16611 c16611) {
        this.f24810 = c16611;
        ArrayList arrayList = new ArrayList();
        this.f24812 = arrayList;
        arrayList.addAll(c16611.f53308);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19921(String str) {
        String lowerCase = str.toLowerCase();
        this.f24811 = lowerCase;
        C16611 c16611 = this.f24810;
        ArrayList arrayList = this.f24812;
        if (lowerCase == null || lowerCase.isEmpty()) {
            arrayList.clear();
            arrayList.addAll(c16611.f53308);
            notifyDataSetChanged();
            return;
        }
        arrayList.clear();
        String str2 = this.f24811;
        for (C20139 c20139 : (ArrayList) c16611.f53308) {
            C14459 c14459 = c20139.f65379;
            if (c14459.f47427.toLowerCase().contains(str2) || String.valueOf(c14459.f47424).contains(str2) || (c14459.f47426 != null && c14459.m34862().toLowerCase().contains(str2))) {
                arrayList.add(c20139);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f24812.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C20844 c20844;
        if (view != null) {
            c20844 = (C20844) view.getTag();
        } else {
            view = C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c20844 = new C20844();
            c20844.f67726 = (TextView) view.findViewById(R.id.textView);
            c20844.f67725 = (TextView) view.findViewById(R.id.textView2);
            c20844.f67727 = (ImageView) view.findViewById(R.id.icon);
            c20844.f67724 = (RadioButton) view.findViewById(R.id.MT_Protector);
            view.setTag(c20844);
        }
        C20139 c20139 = (C20139) this.f24812.get(i);
        C14459 c14459 = c20139.f65379;
        c20844.f67726.setText(c14459.toString());
        c20844.f67724.setChecked(c20139.f65374 == this.f24810.f53313);
        if (c14459.f47426 == null) {
            c20844.f67725.setText(R.string.MT_Protector);
        } else {
            c20844.f67725.setText(c14459.m34862());
        }
        ImageView imageView = c20844.f67727;
        if (c20139.f65379.f47426 == null) {
            imageView.setImageDrawable(c20139.f65376.f53314);
        } else {
            c20139.f65375 = true;
            imageView.setImageDrawable(c20139.f65378);
            if (c20139.f65377) {
                synchronized (c20139.f65376.f53307) {
                    c20139.f65376.f53307.addLast(c20139);
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = this.f24810.f53311.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
