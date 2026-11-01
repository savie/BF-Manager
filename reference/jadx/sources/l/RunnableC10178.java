package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10178 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f34763;

    public RunnableC10178(ViewGroup viewGroup) {
        this.f34763 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34763.setNestedScrollingEnabled(true);
    }
}
