package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9130 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7718 f31071;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C9130(ActivityC7718 activityC7718) {
        this.f31071 = activityC7718;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ActivityC7718 activityC7718 = this.f31071;
        boolean z = activityC7718.f25533.f36086;
        C10541 c10541 = activityC7718.f25533;
        return z ? c10541.f36089 : c10541.f36085.f68265.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        ActivityC7718 activityC7718 = this.f31071;
        if (view == null) {
            view = activityC7718.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        if (activityC7718.f25533.f36086) {
            textView.setText(activityC7718.f25533.f36085.f68265.m10939(activityC7718.f25533.f36084[i]));
            return view;
        }
        textView.setText(activityC7718.f25533.f36085.f68265.m10939(i));
        return view;
    }
}
