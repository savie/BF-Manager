package l;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* JADX INFO: renamed from: l.ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes3.dex */
public final class C5840 extends ArrayAdapter {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17026 f20063;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23740 f20064;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5840(C17026 c17026, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, C23740 c23740) {
        super(contextThemeWrapper, i, R.id.text1, charSequenceArr);
        this.f20063 = c17026;
        this.f20064 = c23740;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f20063.f55646;
        if (zArr != null && zArr[i]) {
            this.f20064.setItemChecked(i, true);
        }
        return view2;
    }
}
