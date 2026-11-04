package l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R16R */
/* JADX INFO: loaded from: classes5.dex */
public final class C19279 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Context f62334;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1380 f62335;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C19279(C1380 c1380, Context context) {
        this.f62335 = c1380;
        this.f62334 = context;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C1380 c1380 = this.f62335;
        if (c1380.f4923 == null) {
            return 0;
        }
        return c1380.f4923.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f62335.f4923.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f62334).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        TextView textView = (TextView) ((ViewGroup) view).getChildAt(0);
        C1380 c1380 = this.f62335;
        textView.setText((CharSequence) c1380.f4923.get(i));
        TextUtils.TruncateAt truncateAt = c1380.f4927;
        if (truncateAt != null) {
            textView.setEllipsize(truncateAt);
        }
        return view;
    }
}
