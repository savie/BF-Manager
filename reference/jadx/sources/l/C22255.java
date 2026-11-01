package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X992 */
/* JADX INFO: loaded from: classes.dex */
public final class C22255 extends BaseAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6732 f72751;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f72752;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f72753;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C22255(C6732 c6732) {
        this.f72751 = c6732;
        ArrayList arrayList = new ArrayList();
        this.f72753 = arrayList;
        arrayList.addAll(c6732.f22662);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49428(String str) {
        String lowerCase = str.toLowerCase();
        this.f72752 = lowerCase;
        C6732 c6732 = this.f72751;
        ArrayList arrayList = this.f72753;
        if (lowerCase == null || lowerCase.isEmpty()) {
            arrayList.clear();
            arrayList.addAll(c6732.f22662);
            notifyDataSetChanged();
            return;
        }
        arrayList.clear();
        String str2 = this.f72752;
        for (C3909 c3909 : (ArrayList) c6732.f22662) {
            if (c3909.f14603.toLowerCase().contains(str2) || c3909.f14607.packageName.toLowerCase().contains(str2)) {
                arrayList.add(c3909);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f72753.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C1087 c1087;
        if (view != null) {
            c1087 = (C1087) view.getTag();
        } else {
            view = C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false);
            c1087 = new C1087();
            c1087.f4969 = (TextView) view.findViewById(R.id.textView);
            c1087.f4972 = (TextView) view.findViewById(R.id.textView2);
            c1087.f4971 = (ImageView) view.findViewById(R.id.icon);
            c1087.f4970 = (CheckBox) view.findViewById(R.id.MT_Protector);
            view.setTag(c1087);
        }
        C3909 c3909 = (C3909) this.f72753.get(i);
        c1087.f4969.setText(c3909.f14603);
        c1087.f4972.setText(c3909.f14607.packageName);
        c1087.f4970.setChecked(c3909.f14605);
        ImageView imageView = c1087.f4971;
        c3909.f14606 = true;
        imageView.setImageDrawable(c3909.f14602);
        if (c3909.f14604) {
            synchronized (c3909.f14601.f22658) {
                c3909.f14601.f22658.addLast(c3909);
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int width = this.f72751.f22659.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
