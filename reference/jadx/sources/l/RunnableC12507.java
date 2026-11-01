package l;

import android.app.NotificationManager;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.۫ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12507 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41848;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f41849;

    public /* synthetic */ RunnableC12507(int i, Object obj) {
        this.f41848 = i;
        this.f41849 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41848) {
            case 0:
                ((ViewOnLayoutChangeListenerC3333) this.f41849).f12352.m35348();
                break;
            case 1:
                C12375.f41359.remove((String) this.f41849);
                break;
            case 2:
                ServiceC4538 serviceC4538 = (ServiceC4538) this.f41849;
                ((NotificationManager) serviceC4538.getSystemService("notification")).notify(1007, serviceC4538.m12675());
                break;
            default:
                ((SearchView) this.f41849).show();
                break;
        }
    }
}
