package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes.dex */
public final class C25232 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17026 f81498;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23740 f81499;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3602 f81500;

    public C25232(C17026 c17026, C23740 c23740, C3602 c3602) {
        this.f81498 = c17026;
        this.f81499 = c23740;
        this.f81500 = c3602;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C17026 c17026 = this.f81498;
        boolean[] zArr = c17026.f55646;
        C23740 c23740 = this.f81499;
        if (zArr != null) {
            zArr[i] = c23740.isItemChecked(i);
        }
        c17026.f55638.onClick(this.f81500.f12350, i, c23740.isItemChecked(i));
    }
}
