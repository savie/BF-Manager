package l;

import android.widget.ListView;

/* JADX INFO: renamed from: l.ܺ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16505 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15759 f53472;

    public RunnableC16505(C15759 c15759) {
        this.f53472 = c15759;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListView listView = this.f53472.f51299;
        listView.focusableViewAvailable(listView);
    }
}
