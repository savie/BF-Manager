package l;

import android.widget.ListView;

/* JADX INFO: renamed from: l.֨᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1444 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5061;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5062;

    public /* synthetic */ RunnableC1444(int i, Object obj) {
        this.f5061 = i;
        this.f5062 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5061) {
            case 0:
                ((C8156) this.f5062).n(Boolean.FALSE);
                break;
            case 1:
                ((C18316) this.f5062).m42725();
                break;
            case 2:
                C2589.m8655((Runnable) this.f5062);
                break;
            default:
                ListView listView = (ListView) this.f5062;
                listView.setSelector(C17423.m40908(listView.getContext()));
                break;
        }
    }
}
