package l;

import android.os.Bundle;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۖ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V7F9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2921 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9561;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9562;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9563;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9564;

    public /* synthetic */ RunnableC2921(Object obj, Object obj2, Object obj3, int i) {
        this.f9562 = i;
        this.f9564 = obj;
        this.f9563 = obj2;
        this.f9561 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9562) {
            case 0:
                C8887.m23767((C8887) this.f9564, (MenuItem[]) this.f9563, (RunnableC9632) this.f9561);
                break;
            default:
                ViewOnClickListenerC11499.m28917((C13511) this.f9564, (ViewOnClickListenerC11499) this.f9563, (Bundle) this.f9561);
                break;
        }
    }
}
