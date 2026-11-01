package l;

import android.app.NotificationManager;

/* JADX INFO: renamed from: l.᩸ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC21384 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69530;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69531;

    public /* synthetic */ RunnableC21384(int i, Object obj) {
        this.f69530 = i;
        this.f69531 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f69530) {
            case 0:
                DialogInterfaceC19356 dialogInterfaceC19356 = ((DialogInterfaceC19356[]) this.f69531)[0];
                if (dialogInterfaceC19356 != null) {
                    dialogInterfaceC19356.dismiss();
                }
                break;
            case 1:
                ((InterfaceC6363) this.f69531).mo17468();
                break;
            case 2:
                C5095.m14187((C5095) this.f69531);
                break;
            case 3:
                ServiceC7629 serviceC7629 = (ServiceC7629) this.f69531;
                ((NotificationManager) serviceC7629.getSystemService("notification")).notify(1004, serviceC7629.m20171());
                break;
            default:
                ViewOnLayoutChangeListenerC3333.m9917((ViewOnLayoutChangeListenerC3333) this.f69531);
                break;
        }
    }
}
