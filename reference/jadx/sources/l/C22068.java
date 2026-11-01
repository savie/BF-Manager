package l;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* JADX INFO: renamed from: l.᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes.dex */
public final class C22068 extends ArrayAdapter {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6545 f71497;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21362 f71498;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22068(C6545 c6545, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, C21362 c21362) {
        super(contextThemeWrapper, i, R.id.text1, charSequenceArr);
        this.f71497 = c6545;
        this.f71498 = c21362;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f71497.f22046;
        if (zArr != null && zArr[i]) {
            this.f71498.setItemChecked(i, true);
        }
        return view2;
    }
}
