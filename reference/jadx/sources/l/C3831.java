package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3831 extends BaseAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f13063;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence[] f13064;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C3831(CharSequence[] charSequenceArr, boolean[] zArr) {
        this.f13064 = charSequenceArr;
        this.f13063 = zArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f13064.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f13064[i];
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        CheckedTextView checkedTextView = (CheckedTextView) view;
        if (checkedTextView == null) {
            checkedTextView = (CheckedTextView) C7750.m21092(viewGroup, R.layout.MT_Protector, viewGroup, false);
        }
        checkedTextView.setText(this.f13064[i]);
        boolean zIsChecked = checkedTextView.isChecked();
        boolean z = this.f13063[i];
        if (zIsChecked != z) {
            checkedTextView.setChecked(z);
            return checkedTextView;
        }
        checkedTextView.refreshDrawableState();
        return checkedTextView;
    }
}
