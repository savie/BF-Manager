package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17320 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23288 f56409;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C17320(ActivityC23288 activityC23288) {
        this.f56409 = activityC23288;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ActivityC23288 activityC23288 = this.f56409;
        boolean z = activityC23288.f75446.f51482;
        C15828 c15828 = activityC23288.f75446;
        return z ? c15828.f51487 : c15828.f51488.f48832.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        ActivityC23288 activityC23288 = this.f56409;
        if (view == null) {
            view = activityC23288.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        if (activityC23288.f75446.f51482) {
            textView.setText(activityC23288.f75446.f51488.f48832.m15441(activityC23288.f75446.f51489[i]));
            return view;
        }
        textView.setText(activityC23288.f75446.f51488.f48832.m15441(i));
        return view;
    }
}
