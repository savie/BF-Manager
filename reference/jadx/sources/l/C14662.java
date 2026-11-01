package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: renamed from: l.ܳܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes4.dex */
public final class C14662 extends BaseAdapter {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f47926;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public DateFormat f47927 = DateFormat.getDateTimeInstance();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4452 f47928;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C14662(C4452 c4452, ActivityC5677 activityC5677) {
        this.f47928 = c4452;
        this.f47926 = activityC5677;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return ((ArrayList) this.f47928.f15847).size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f47926).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        TextView textView = (TextView) viewGroup2.getChildAt(0);
        TextView textView2 = (TextView) viewGroup2.getChildAt(1);
        C20306 c20306 = (C20306) ((ArrayList) this.f47928.f15847).get(i);
        textView.setText(c20306.f65781);
        textView2.setText(this.f47927.format(new Date(c20306.f65780)));
        return view;
    }
}
