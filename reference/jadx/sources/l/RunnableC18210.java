package l;

import android.os.IBinder;

/* JADX INFO: renamed from: l.ᩳᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18210 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19622 f58167;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10450 f58168;

    public RunnableC18210(C19622 c19622, C10450 c10450) {
        this.f58167 = c19622;
        this.f58168 = c10450;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.f58168.f35674.getBinder();
        C11260 c11260 = (C11260) this.f58167.f62983.f68499.remove(binder);
        if (c11260 != null) {
            binder.unlinkToDeath(c11260, 0);
        }
    }
}
