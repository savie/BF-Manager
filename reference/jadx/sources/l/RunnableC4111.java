package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۘᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: SAHW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4111 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final WeakReference f15069;

    public RunnableC4111(WeakReference weakReference) {
        this.f15069 = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference = this.f15069;
        Runnable runnable = (Runnable) weakReference.get();
        if (runnable == null) {
            C6934.f23308.remove(this);
            C6934.f23309.remove(weakReference);
        } else {
            runnable.run();
        }
    }
}
