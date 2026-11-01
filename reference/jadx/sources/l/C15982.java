package l;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ܺܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9FM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15982 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AtomicLong f51757 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Semaphore f51756 = new Semaphore(1);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long[] m37963(int i) {
        Semaphore semaphore = this.f51756;
        try {
            if (!semaphore.tryAcquire(i, 5000L, TimeUnit.MILLISECONDS)) {
                throw new C13865("Not enough credits (" + semaphore.availablePermits() + " available) to hand out " + i + " sequence numbers");
            }
            long j = i;
            long andAdd = this.f51757.getAndAdd(j);
            int i2 = (int) ((j + andAdd) - andAdd);
            long[] jArr = new long[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                jArr[i3] = ((long) i3) + andAdd;
            }
            return jArr;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            StringBuilder sbM40153 = C17214.m40153(i, "Got interrupted waiting for ", " to be available. Credits available at this moment: ");
            sbM40153.append(semaphore.availablePermits());
            throw new C13865(sbM40153.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37961() {
        return this.f51756.availablePermits();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37962(int i) {
        this.f51756.release(i);
    }
}
