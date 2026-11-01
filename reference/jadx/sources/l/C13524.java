package l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R16R */
/* JADX INFO: loaded from: classes3.dex */
public final class C13524 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Context f44647;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2233 f44648;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C13524(C2233 c2233, Context context) {
        this.f44648 = c2233;
        this.f44647 = context;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C2233 c2233 = this.f44648;
        if (c2233.f8015 == null) {
            return 0;
        }
        return c2233.f8015.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f44648.f8015.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f44647).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        TextView textView = (TextView) ((ViewGroup) view).getChildAt(0);
        C2233 c2233 = this.f44648;
        textView.setText((CharSequence) c2233.f8015.get(i));
        TextUtils.TruncateAt truncateAt = c2233.f8016;
        if (truncateAt != null) {
            textView.setEllipsize(truncateAt);
        }
        return view;
    }
}
