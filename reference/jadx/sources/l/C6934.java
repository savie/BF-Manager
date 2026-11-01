package l;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۜᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: SAHW */
/* JADX INFO: loaded from: classes2.dex */
public final class C6934 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ScheduledThreadPoolExecutor f23308;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final HashMap f23309 = new HashMap();

    public final String toString() {
        return "EvictionTimer []";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m18591(RunnableC2099 runnableC2099, C21813 c21813, C21813 c21814) {
        if (f23308 == null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1289(0));
            f23308 = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
            f23308.scheduleAtFixedRate(new RunnableC13285(), c21813.toMillis(), c21814.toMillis(), TimeUnit.MILLISECONDS);
        }
        WeakReference weakReference = new WeakReference(runnableC2099);
        RunnableC4111 runnableC4111 = new RunnableC4111(weakReference);
        runnableC2099.m6646(f23308.scheduleWithFixedDelay(runnableC4111, c21813.toMillis(), c21814.toMillis(), TimeUnit.MILLISECONDS));
        f23309.put(weakReference, runnableC4111);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m18592(RunnableC2099 runnableC2099, C21813 c21813, boolean z) {
        if (runnableC2099 != null) {
            try {
                runnableC2099.m6645();
                m18590(runnableC2099);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z && f23308 != null && f23309.isEmpty()) {
            f23308.shutdown();
            try {
                f23308.awaitTermination(c21813.toMillis(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
            f23308.setCorePoolSize(0);
            f23308 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18590(RunnableC2099 runnableC2099) {
        HashMap map = f23309;
        for (Map.Entry entry : map.entrySet()) {
            if (((WeakReference) entry.getKey()).get() == runnableC2099) {
                f23308.remove((Runnable) entry.getValue());
                map.remove(entry.getKey());
                return;
            }
        }
    }
}
