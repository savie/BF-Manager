package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10036 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12153 f34256;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20619 f34257;

    public RunnableC10036(AbstractC12153 abstractC12153, C20619 c20619) {
        this.f34256 = abstractC12153;
        this.f34257 = c20619;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC12153 abstractC12153 = this.f34256;
        ArrayList arrayList = abstractC12153.f40671;
        C20619 c20619 = this.f34257;
        arrayList.remove(c20619);
        abstractC12153.f40673.remove(c20619);
    }
}
