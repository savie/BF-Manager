package l;

import android.app.NotificationManager;
import android.content.Context;

/* JADX INFO: renamed from: l.۟۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAJ2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7909 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26270;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26271;

    public /* synthetic */ RunnableC7909(int i, Object obj) {
        this.f26270 = i;
        this.f26271 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26270) {
            case 0:
                ((ServiceC19096) this.f26271).m44210();
                break;
            case 1:
                AbstractC1365.m5021((Context) this.f26271);
                break;
            case 2:
                ((C4146) this.f26271).m13281(false);
                break;
            case 3:
                C20244.m46520((InterfaceC1278) this.f26271);
                break;
            default:
                ServiceC3107 serviceC3107 = (ServiceC3107) this.f26271;
                ((NotificationManager) serviceC3107.getSystemService("notification")).notify(1007, serviceC3107.m10154());
                break;
        }
    }
}
