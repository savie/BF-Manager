package l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 515Z */
/* JADX INFO: loaded from: classes3.dex */
public class C3054 extends C19131 {
    /* JADX INFO: renamed from: ۙ */
    public void mo8126(TextView textView, boolean z) {
    }

    public C3054(Context context) {
        super(R.layout.MT_Protector, context, new ArrayList());
    }

    public C3054(Context context, List list) {
        super(R.layout.MT_Protector, context, list);
    }

    @Override // l.C19131, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getView(i, view, viewGroup);
        mo9928(textView, i, false);
        return textView;
    }

    @Override // l.C19131, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getDropDownView(i, view, viewGroup);
        textView.setTextColor(C3296.f10751);
        mo9928(textView, i, true);
        return textView;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo9928(TextView textView, int i, boolean z) {
        mo8126(textView, z);
    }

    public C3054(Context context, Object[] objArr) {
        super(R.layout.MT_Protector, context, Arrays.asList(objArr));
    }
}
