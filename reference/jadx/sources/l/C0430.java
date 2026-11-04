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

/* JADX INFO: renamed from: l.֡۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes2.dex */
public final class C0430 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public DateFormat f1983 = DateFormat.getDateTimeInstance();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f1984;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1176 f1985;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C0430(C1176 c1176, ActivityC0848 activityC0848) {
        this.f1985 = c1176;
        this.f1984 = activityC0848;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return ((ArrayList) this.f1985.f4308).size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f1984).inflate(R.layout.MT_Protector, viewGroup, false);
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        TextView textView = (TextView) viewGroup2.getChildAt(0);
        TextView textView2 = (TextView) viewGroup2.getChildAt(1);
        C20567 c20567 = (C20567) ((ArrayList) this.f1985.f4308).get(i);
        textView.setText(c20567.f65866);
        textView2.setText(this.f1983.format(new Date(c20567.f65863)));
        return view;
    }
}
