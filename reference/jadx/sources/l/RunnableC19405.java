package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩳ᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAHW */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC19405 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakReference f62717;

    public RunnableC19405(WeakReference weakReference) {
        this.f62717 = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference = this.f62717;
        Runnable runnable = (Runnable) weakReference.get();
        if (runnable == null) {
            C10454.f33264.remove(this);
            C10454.f33265.remove(weakReference);
        } else {
            runnable.run();
        }
    }
}
