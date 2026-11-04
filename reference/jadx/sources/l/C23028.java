package l;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩸᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9FM */
/* JADX INFO: loaded from: classes.dex */
public final class C23028 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AtomicLong f74731 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Semaphore f74730 = new Semaphore(1);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long[] m51929(int i) {
        Semaphore semaphore = this.f74730;
        try {
            if (!semaphore.tryAcquire(i, 5000L, TimeUnit.MILLISECONDS)) {
                throw new C12082("Not enough credits (" + semaphore.availablePermits() + " available) to hand out " + i + " sequence numbers");
            }
            long j = i;
            long andAdd = this.f74731.getAndAdd(j);
            int i2 = (int) ((j + andAdd) - andAdd);
            long[] jArr = new long[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                jArr[i3] = ((long) i3) + andAdd;
            }
            return jArr;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            StringBuilder sbM12235 = C3769.m12235(i, "Got interrupted waiting for ", " to be available. Credits available at this moment: ");
            sbM12235.append(semaphore.availablePermits());
            throw new C12082(sbM12235.toString());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51927() {
        return this.f74730.availablePermits();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51928(int i) {
        this.f74730.release(i);
    }
}
