package l;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܽ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9ZA */
/* JADX INFO: loaded from: classes4.dex */
public final class C17898 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f58633 = C16980.m40038(C17898.class.getName());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f58634;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f58635 = new ConcurrentMapC17249(50);

    public C17898(String str) {
        this.f58634 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41751(long j) {
        Thread threadCurrentThread = Thread.currentThread();
        ConcurrentMapC17249 concurrentMapC17249 = this.f58635;
        if (((Semaphore) concurrentMapC17249.get(threadCurrentThread)) == null) {
            Semaphore semaphore = new Semaphore(1, true);
            semaphore.drainPermits();
            concurrentMapC17249.putIfAbsent(threadCurrentThread, semaphore);
        }
        try {
            ((Semaphore) concurrentMapC17249.get(threadCurrentThread)).tryAcquire(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            f58633.mo13711("Exception ", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41750() {
        Collection<Semaphore> collectionValues = this.f58635.values();
        for (Semaphore semaphore : collectionValues) {
            semaphore.release();
            collectionValues.remove(semaphore);
        }
    }

    public final String toString() {
        StringBuilder sbM3018 = C0703.m3018(1000, "Semaphore: ");
        sbM3018.append(this.f58634);
        ConcurrentMapC17249 concurrentMapC17249 = this.f58635;
        if (concurrentMapC17249.size() == 0) {
            sbM3018.append(" no semaphores.");
        } else {
            sbM3018.append(" semaphores:\n");
            for (Map.Entry entry : concurrentMapC17249.entrySet()) {
                sbM3018.append("\tThread: ");
                sbM3018.append(((Thread) entry.getKey()).getName());
                sbM3018.append(' ');
                sbM3018.append(entry.getValue());
                sbM3018.append('\n');
            }
        }
        return sbM3018.toString();
    }
}
