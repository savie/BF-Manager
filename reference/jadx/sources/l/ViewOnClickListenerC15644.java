package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC15644 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16390 f50800;

    public ViewOnClickListenerC15644(C16390 c16390) {
        this.f50800 = c16390;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f50800.collapseActionView();
    }
}
