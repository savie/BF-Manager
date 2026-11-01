package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.۬ᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13272 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44060;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44061;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19622 f44062;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f44063;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10450 f44064;

    public RunnableC13272(int i, int i2, Bundle bundle, C19622 c19622, C10450 c10450, String str) {
        this.f44062 = c19622;
        this.f44064 = c10450;
        this.f44063 = str;
        this.f44060 = i;
        this.f44061 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10450 c10450 = this.f44064;
        IBinder binder = c10450.f35674.getBinder();
        C19622 c19622 = this.f44062;
        c19622.f62983.f68499.remove(binder);
        AbstractServiceC21032 abstractServiceC21032 = c19622.f62983;
        C11260 c11260 = new C11260(abstractServiceC21032, this.f44063, this.f44060, this.f44061, c10450);
        if (abstractServiceC21032.m47409() == null) {
            try {
                c10450.m26396();
            } catch (RemoteException unused) {
            }
        } else {
            try {
                abstractServiceC21032.f68499.put(binder, c11260);
                binder.linkToDeath(c11260, 0);
            } catch (RemoteException unused2) {
                abstractServiceC21032.f68499.remove(binder);
            }
        }
    }
}
