package l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7277 extends BaseAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final LayoutInflater f24200;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f24201;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f24202;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C7277(AbstractActivityC12483 abstractActivityC12483) {
        this.f24201 = abstractActivityC12483;
        this.f24200 = LayoutInflater.from(abstractActivityC12483);
        m19413();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19413() {
        this.f24202 = ServiceC4538.m12665();
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return !this.f24202.isEmpty();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f24202.isEmpty()) {
            return 1;
        }
        return this.f24202.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (this.f24202.isEmpty()) {
            return null;
        }
        return this.f24202.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return !this.f24202.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19412() {
        return this.f24202.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11884 m19411(int i) {
        return (C11884) this.f24202.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String strM14739;
        if (view == null) {
            view = this.f24200.inflate(R.layout.MT_Protector, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector);
        if (this.f24202.isEmpty()) {
            textView.setText(R.string.MT_Protector);
            textView2.setVisibility(8);
            return view;
        }
        C11884 c11884 = (C11884) this.f24202.get(i);
        String strM29639 = c11884.m29639();
        boolean zIsEmpty = TextUtils.isEmpty(strM29639);
        AbstractActivityC12483 abstractActivityC12483 = this.f24201;
        if (zIsEmpty) {
            strM29639 = abstractActivityC12483.getString(R.string.MT_Protector);
        }
        textView.setText(strM29639);
        String string = abstractActivityC12483.getString(c11884.m29634() ? R.string.MT_Protector : R.string.MT_Protector);
        long jM29635 = c11884.m29635();
        if (jM29635 <= 0) {
            strM14739 = abstractActivityC12483.getString(R.string.MT_Protector);
        } else {
            strM14739 = C5319.m14739(jM29635);
        }
        textView2.setText(abstractActivityC12483.getString(R.string.MT_Protector, string, strM14739));
        textView2.setVisibility(0);
        return view;
    }
}
