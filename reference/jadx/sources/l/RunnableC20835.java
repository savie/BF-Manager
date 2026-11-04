package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩵᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC20835 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f66714;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66715;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f66716;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25227 f66717;

    public /* synthetic */ RunnableC20835(C25227 c25227, View view, View view2, int i) {
        this.f66715 = i;
        this.f66717 = c25227;
        this.f66716 = view;
        this.f66714 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f66715;
        View view = this.f66714;
        View view2 = this.f66716;
        C25227 c25227 = this.f66717;
        switch (i) {
            case 0:
                C18597.m43177((View) c25227, view2, view);
                break;
            default:
                int i2 = ViewOnClickListenerC5914.f20235;
                view2.setVisibility((c25227.canScrollVertically(1) || view2.getTop() < view.getBottom()) ? 0 : 4);
                break;
        }
    }
}
