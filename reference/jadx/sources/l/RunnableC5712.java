package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5712 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f19714;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20981 f19715;

    public RunnableC5712(C4220 c4220, ArrayList arrayList, C20981 c20981) {
        this.f19714 = arrayList;
        this.f19715 = c20981;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f19714;
        C20981 c20981 = this.f19715;
        if (arrayList.contains(c20981)) {
            arrayList.remove(c20981);
            c20981.m47959().m34601(c20981.m47964().mView);
        }
    }
}
