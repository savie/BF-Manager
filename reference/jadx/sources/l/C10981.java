package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X992 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10981 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f34686;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13219 f34687;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f34688;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C10981(C13219 c13219) {
        this.f34687 = c13219;
        ArrayList arrayList = new ArrayList();
        this.f34688 = arrayList;
        arrayList.addAll(c13219.f42199);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27826(String str) {
        String lowerCase = str.toLowerCase();
        this.f34686 = lowerCase;
        C13219 c13219 = this.f34687;
        ArrayList arrayList = this.f34688;
        if (lowerCase == null || lowerCase.isEmpty()) {
            arrayList.clear();
            arrayList.addAll(c13219.f42199);
            notifyDataSetChanged();
            return;
        }
        arrayList.clear();
        String str2 = this.f34686;
        for (C15456 c15456 : (ArrayList) c13219.f42199) {
            if (c15456.f50314.toLowerCase().contains(str2) || c15456.f50317.packageName.toLowerCase().contains(str2)) {
                arrayList.add(c15456);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f34688.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C22916 c22916;
        if (view != null) {
            c22916 = (C22916) view.getTag();
        } else {
            view = C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c22916 = new C22916();
            c22916.f74479 = (TextView) view.findViewById(R.id.textView);
            c22916.f74478 = (TextView) view.findViewById(R.id.textView2);
            c22916.f74477 = (ImageView) view.findViewById(R.id.icon);
            c22916.f74476 = (CheckBox) view.findViewById(R.id.MT_Protector);
            view.setTag(c22916);
        }
        C15456 c15456 = (C15456) this.f34688.get(i);
        c22916.f74479.setText(c15456.f50314);
        c22916.f74478.setText(c15456.f50317.packageName);
        c22916.f74476.setChecked(c15456.f50315);
        ImageView imageView = c22916.f74477;
        c15456.f50319 = true;
        imageView.setImageDrawable(c15456.f50320);
        if (c15456.f50318) {
            synchronized (c15456.f50316.f42200) {
                c15456.f50316.f42200.addLast(c15456);
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = this.f34687.f42204.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
