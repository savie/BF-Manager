package l;

import android.app.NotificationManager;

/* JADX INFO: renamed from: l.ۖ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B13Z */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3003 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9761;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9762;

    public /* synthetic */ RunnableC3003(int i, Object obj) {
        this.f9761 = i;
        this.f9762 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9761;
        Object obj = this.f9762;
        switch (i) {
            case 0:
                C8614 c8614 = (C8614) obj;
                c8614.m23221();
                c8614.m23236().m23221();
                break;
            case 1:
                int i2 = ActivityC5440.f18993;
                ((ActivityC5440) obj).m16263(true);
                break;
            case 2:
                ServiceC22717 serviceC22717 = (ServiceC22717) obj;
                ((NotificationManager) serviceC22717.getSystemService("notification")).notify(1004, serviceC22717.m51235());
                break;
            default:
                ((AbstractC12881) obj).cancel();
                break;
        }
    }
}
