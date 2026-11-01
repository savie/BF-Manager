package l;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: SAHW */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13285 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (C6934.class) {
            for (Map.Entry entry : C6934.f23309.entrySet()) {
                if (((WeakReference) entry.getKey()).get() == null) {
                    C6934.f23308.remove((Runnable) entry.getValue());
                    C6934.f23309.remove(entry.getKey());
                }
            }
            if (C6934.f23309.isEmpty() && C6934.f23308 != null) {
                C6934.f23308.shutdown();
                C6934.f23308.setCorePoolSize(0);
                C6934.f23308 = null;
            }
        }
    }
}
