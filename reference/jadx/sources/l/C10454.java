package l;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۢ᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: SAHW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10454 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ScheduledThreadPoolExecutor f33264;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final HashMap f33265 = new HashMap();

    public final String toString() {
        return "EvictionTimer []";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m26878(RunnableC3743 runnableC3743, C18257 c18257, C18257 c18258) {
        if (f33264 == null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0760(0));
            f33264 = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
            f33264.scheduleAtFixedRate(new RunnableC8218(), c18257.toMillis(), c18258.toMillis(), TimeUnit.MILLISECONDS);
        }
        WeakReference weakReference = new WeakReference(runnableC3743);
        RunnableC19405 runnableC19405 = new RunnableC19405(weakReference);
        runnableC3743.m12169(f33264.scheduleWithFixedDelay(runnableC19405, c18257.toMillis(), c18258.toMillis(), TimeUnit.MILLISECONDS));
        f33265.put(weakReference, runnableC19405);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m26879(RunnableC3743 runnableC3743, C18257 c18257, boolean z) {
        if (runnableC3743 != null) {
            try {
                runnableC3743.m12168();
                m26877(runnableC3743);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z && f33264 != null && f33265.isEmpty()) {
            f33264.shutdown();
            try {
                f33264.awaitTermination(c18257.toMillis(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
            f33264.setCorePoolSize(0);
            f33264 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26877(RunnableC3743 runnableC3743) {
        HashMap map = f33265;
        for (Map.Entry entry : map.entrySet()) {
            if (((WeakReference) entry.getKey()).get() == runnableC3743) {
                f33264.remove((Runnable) entry.getValue());
                map.remove(entry.getKey());
                return;
            }
        }
    }
}
