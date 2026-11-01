package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7047 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f23679;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16386 f23680;

    public RunnableC7047(C20453 c20453, ArrayList arrayList, C16386 c16386) {
        this.f23679 = arrayList;
        this.f23680 = c16386;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f23679;
        C16386 c16386 = this.f23680;
        if (arrayList.contains(c16386)) {
            arrayList.remove(c16386);
            c16386.m38577().m1255(c16386.m38571().mView);
        }
    }
}
