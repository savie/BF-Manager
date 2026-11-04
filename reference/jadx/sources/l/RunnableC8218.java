package l;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: l.۟᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAHW */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8218 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (C10454.class) {
            for (Map.Entry entry : C10454.f33265.entrySet()) {
                if (((WeakReference) entry.getKey()).get() == null) {
                    C10454.f33264.remove((Runnable) entry.getValue());
                    C10454.f33265.remove(entry.getKey());
                }
            }
            if (C10454.f33265.isEmpty() && C10454.f33264 != null) {
                C10454.f33264.shutdown();
                C10454.f33264.setCorePoolSize(0);
                C10454.f33264 = null;
            }
        }
    }
}
