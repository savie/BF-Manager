package l;

import android.content.ComponentName;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G135 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7401 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20807 f24594;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C7401(ActivityC20807 activityC20807) {
        this.f24594 = activityC20807;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f24594.f67640.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ActivityC20807 activityC20807 = this.f24594;
        if (view == null) {
            view = activityC20807.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C2766.m8438(view);
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        TextView textView = (TextView) viewGroup2.getChildAt(0);
        TextView textView2 = (TextView) viewGroup2.getChildAt(1);
        C21512 c21512 = (C21512) activityC20807.f67640.get(i);
        Boolean boolValueOf = (Boolean) activityC20807.f67642.m40144(i, (Integer) null);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(c21512.m48179());
            activityC20807.f67642.m40149(i, boolValueOf);
        }
        textView.setText(c21512.m48176());
        StringBuilder sb = new StringBuilder();
        if (c21512.m48177() != null) {
            sb.append(activityC20807.getString(R.string.MT_Protector));
            sb.append(" - ");
            sb.append(c21512.m48177().m18081());
        } else {
            ComponentName componentNameMo16277 = c21512.m48182().mo16277();
            sb.append(componentNameMo16277.getPackageName());
            sb.append("/");
            sb.append(componentNameMo16277.getShortClassName());
        }
        textView2.setText(sb.toString());
        textView2.setTextColor(boolValueOf.booleanValue() ? C20368.f66007 : C20368.f65966);
        return view;
    }
}
