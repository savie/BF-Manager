package l;

import android.view.View;

/* JADX INFO: renamed from: l.۟۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7763 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25548;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25549;

    public /* synthetic */ RunnableC7763(int i, Object obj) {
        this.f25548 = i;
        this.f25549 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25548) {
            case 0:
                ServiceC10702.m27284((ServiceC10702) this.f25549);
                break;
            default:
                ((View) this.f25549).requestLayout();
                break;
        }
    }
}
