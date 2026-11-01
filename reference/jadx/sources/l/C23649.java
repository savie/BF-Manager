package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23649 extends BaseAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f76575;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence[] f76576;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C23649(CharSequence[] charSequenceArr, boolean[] zArr) {
        this.f76576 = charSequenceArr;
        this.f76575 = zArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f76576.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f76576[i];
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        CheckedTextView checkedTextView = (CheckedTextView) view;
        if (checkedTextView == null) {
            checkedTextView = (CheckedTextView) C9576.m24439(viewGroup, R.layout.MT_Protector, viewGroup, false);
        }
        checkedTextView.setText(this.f76576[i]);
        boolean zIsChecked = checkedTextView.isChecked();
        boolean z = this.f76575[i];
        if (zIsChecked != z) {
            checkedTextView.setChecked(z);
            return checkedTextView;
        }
        checkedTextView.refreshDrawableState();
        return checkedTextView;
    }
}
