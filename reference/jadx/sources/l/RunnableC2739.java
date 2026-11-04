package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۖܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2739 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f9099;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f9100;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f9101;

    public /* synthetic */ RunnableC2739(C23255 c23255, C23255 c23256, View view) {
        this.f9099 = c23255;
        this.f9101 = c23256;
        this.f9100 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = ActivityC5440.f18993;
        int visibility = this.f9099.getVisibility();
        View view = this.f9100;
        if (visibility == 0 || this.f9101.getVisibility() == 0) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }
}
