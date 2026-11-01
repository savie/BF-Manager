package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC14990 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48914;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f48915;

    public /* synthetic */ RunnableC14990(int i, Object obj) {
        this.f48914 = i;
        this.f48915 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48914) {
            case 0:
                C11545.m28752((C11545) this.f48915);
                break;
            case 1:
                Iterator it = ((List) this.f48915).iterator();
                while (it.hasNext()) {
                    ((C7817) it.next()).m20577();
                }
                break;
            case 2:
                ServiceC12465.m30969((ServiceC12465) this.f48915);
                break;
            case 3:
                C8765.m22795((C8765) this.f48915);
                break;
            case 4:
                C0103.m1103((C0103) this.f48915);
                break;
            default:
                ((C7236) this.f48915).m19334();
                break;
        }
    }
}
