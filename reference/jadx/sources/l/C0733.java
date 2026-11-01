package l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 515Z */
/* JADX INFO: loaded from: classes3.dex */
public class C0733 extends C4406 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3189(TextView textView, boolean z) {
    }

    public C0733(Context context) {
        super(R.layout.MT_Protector, context, new ArrayList());
    }

    public C0733(Context context, List list) {
        super(R.layout.MT_Protector, context, list);
    }

    @Override // l.C4406, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getView(i, view, viewGroup);
        mo3188(textView, i, false);
        return textView;
    }

    @Override // l.C4406, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getDropDownView(i, view, viewGroup);
        textView.setTextColor(C20368.f65976);
        mo3188(textView, i, true);
        return textView;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3188(TextView textView, int i, boolean z) {
        mo3189(textView, z);
    }

    public C0733(Context context, Object[] objArr) {
        super(R.layout.MT_Protector, context, Arrays.asList(objArr));
    }
}
