package l;

import android.content.ComponentName;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G135 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19566 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15090 f63090;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C19566(ActivityC15090 activityC15090) {
        this.f63090 = activityC15090;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f63090.f49248.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ActivityC15090 activityC15090 = this.f63090;
        if (view == null) {
            view = activityC15090.getLayoutInflater().inflate(R.layout.MT_Protector, viewGroup, false);
            C22744.m51280(view);
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        TextView textView = (TextView) viewGroup2.getChildAt(0);
        TextView textView2 = (TextView) viewGroup2.getChildAt(1);
        C8969 c8969 = (C8969) activityC15090.f49248.get(i);
        C2375 c2375 = activityC15090.f49250;
        c2375.getClass();
        Boolean boolValueOf = (Boolean) C8341.m22446(c2375, i);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(c8969.m23970());
            activityC15090.f49250.m8077(i, boolValueOf);
        }
        textView.setText(c8969.m23974());
        StringBuilder sb = new StringBuilder();
        if (c8969.m23978() != null) {
            sb.append(activityC15090.getString(R.string.MT_Protector));
            sb.append(" - ");
            sb.append(c8969.m23978().m5370());
        } else {
            ComponentName componentNameMo39358 = c8969.m23973().mo39358();
            sb.append(componentNameMo39358.getPackageName());
            sb.append("/");
            sb.append(componentNameMo39358.getShortClassName());
        }
        textView2.setText(sb.toString());
        textView2.setTextColor(boolValueOf.booleanValue() ? C3296.f10758 : C3296.f10774);
        return view;
    }
}
