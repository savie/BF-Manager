package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes3.dex */
public final class C12896 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6545 f42872;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17834 f42873;

    public C12896(C6545 c6545, C17834 c17834) {
        this.f42872 = c6545;
        this.f42873 = c17834;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C6545 c6545 = this.f42872;
        DialogInterface.OnClickListener onClickListener = c6545.f22071;
        C17834 c17834 = this.f42873;
        onClickListener.onClick(c17834.f56483, i);
        if (c6545.f22078) {
            return;
        }
        c17834.f56483.dismiss();
    }
}
