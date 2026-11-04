package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܺܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CIUF */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC16949 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17695 f55371;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20733 f55372;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC16949(C17695 c17695, C20733 c20733) {
        this.f55371 = c17695;
        this.f55372 = c20733;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        final C20733 c20733 = this.f55372;
        C21576.m49068(new Runnable() { // from class: l.᩻ܺܳ
            @Override // java.lang.Runnable
            public final void run() {
                C17695 c17695 = this.f81307.f55371;
                C20733 c20734 = c17695.f58165;
                C20733 c20735 = c20733;
                if (c20734 != c20735 || c20735.m47429()) {
                    return;
                }
                c17695.m41442();
            }
        });
    }
}
