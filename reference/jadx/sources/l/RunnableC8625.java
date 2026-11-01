package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8625 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12153 f29767;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20619 f29768;

    public RunnableC8625(AbstractC12153 abstractC12153, C20619 c20619) {
        this.f29767 = abstractC12153;
        this.f29768 = c20619;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f29767.f40671;
        C20619 c20619 = this.f29768;
        if (arrayList.contains(c20619)) {
            c20619.m38577().m1255(c20619.m38571().mView);
        }
    }
}
