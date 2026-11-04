package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3081 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17997 f10002;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6065 f10003;

    public RunnableC3081(AbstractC17997 abstractC17997, C6065 c6065) {
        this.f10002 = abstractC17997;
        this.f10003 = c6065;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f10002.f58946;
        C6065 c6065 = this.f10003;
        if (arrayList.contains(c6065)) {
            c6065.m47959().m34601(c6065.m47964().mView);
        }
    }
}
