package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes3.dex */
public final class C11805 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17026 f38124;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3602 f38125;

    public C11805(C17026 c17026, C3602 c3602) {
        this.f38124 = c17026;
        this.f38125 = c3602;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C17026 c17026 = this.f38124;
        DialogInterface.OnClickListener onClickListener = c17026.f55612;
        C3602 c3602 = this.f38125;
        onClickListener.onClick(c3602.f12350, i);
        if (c17026.f55637) {
            return;
        }
        c3602.f12350.dismiss();
    }
}
