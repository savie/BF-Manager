package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.ۢܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10251 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f32738;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32739;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10953 f32740;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32741;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19904 f32742;

    public RunnableC10251(int i, int i2, Bundle bundle, C10953 c10953, C19904 c19904, String str) {
        this.f32740 = c10953;
        this.f32742 = c19904;
        this.f32738 = str;
        this.f32741 = i;
        this.f32739 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C19904 c19904 = this.f32742;
        IBinder binder = c19904.f64055.getBinder();
        C10953 c10953 = this.f32740;
        c10953.f34619.f42128.remove(binder);
        AbstractServiceC13191 abstractServiceC13191 = c10953.f34619;
        C23678 c23678 = new C23678(abstractServiceC13191, this.f32738, this.f32741, this.f32739, c19904);
        if (abstractServiceC13191.m32706() == null) {
            try {
                c19904.m45831();
            } catch (RemoteException unused) {
            }
        } else {
            try {
                abstractServiceC13191.f42128.put(binder, c23678);
                binder.linkToDeath(c23678, 0);
            } catch (RemoteException unused2) {
                abstractServiceC13191.f42128.remove(binder);
            }
        }
    }
}
