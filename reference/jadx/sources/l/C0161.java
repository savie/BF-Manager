package l;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֡ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G9ZA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0161 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f1241 = C13488.m32998(C0161.class.getName());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f1242;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f1243 = new ConcurrentMapC13783(50);

    public C0161(String str) {
        this.f1242 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1270(long j) {
        Thread threadCurrentThread = Thread.currentThread();
        ConcurrentMapC13783 concurrentMapC13783 = this.f1243;
        if (((Semaphore) concurrentMapC13783.get(threadCurrentThread)) == null) {
            Semaphore semaphore = new Semaphore(1, true);
            semaphore.drainPermits();
            concurrentMapC13783.putIfAbsent(threadCurrentThread, semaphore);
        }
        try {
            ((Semaphore) concurrentMapC13783.get(threadCurrentThread)).tryAcquire(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            f1241.mo12120("Exception ", (Exception) e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1269() {
        Collection<Semaphore> collectionValues = this.f1243.values();
        for (Semaphore semaphore : collectionValues) {
            semaphore.release();
            collectionValues.remove(semaphore);
        }
    }

    public final String toString() {
        StringBuilder sbM40152 = C17214.m40152(1000, "Semaphore: ");
        sbM40152.append(this.f1242);
        ConcurrentMapC13783 concurrentMapC13783 = this.f1243;
        if (concurrentMapC13783.size() == 0) {
            sbM40152.append(" no semaphores.");
        } else {
            sbM40152.append(" semaphores:\n");
            for (Map.Entry entry : concurrentMapC13783.entrySet()) {
                sbM40152.append("\tThread: ");
                sbM40152.append(((Thread) entry.getKey()).getName());
                sbM40152.append(' ');
                sbM40152.append(entry.getValue());
                sbM40152.append('\n');
            }
        }
        return sbM40152.toString();
    }
}
