package l;

import android.widget.ListView;

/* JADX INFO: renamed from: l.ᩳۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17796 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7919 f56412;

    public RunnableC17796(C7919 c7919) {
        this.f56412 = c7919;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListView listView = this.f56412.f26004;
        listView.focusableViewAvailable(listView);
    }
}
