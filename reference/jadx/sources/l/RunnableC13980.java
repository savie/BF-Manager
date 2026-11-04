package l;

import android.os.IBinder;

/* JADX INFO: renamed from: l.۬ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC13980 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10953 f44326;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19904 f44327;

    public RunnableC13980(C10953 c10953, C19904 c19904) {
        this.f44326 = c10953;
        this.f44327 = c19904;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.f44327.f64055.getBinder();
        C23678 c23678 = (C23678) this.f44326.f34619.f42128.remove(binder);
        if (c23678 != null) {
            binder.unlinkToDeath(c23678, 0);
        }
    }
}
