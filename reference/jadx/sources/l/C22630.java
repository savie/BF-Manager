package l;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩸ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9B2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22630 implements InterfaceC19510 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f73228 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile int f73230 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f73229 = 21320;

    @Override // l.InterfaceC19510
    /* JADX INFO: renamed from: ۙ */
    public final void mo14218(int i, int i2) {
        if (this.f73229 != i) {
            return;
        }
        this.f73230 = i2;
        this.f73228.countDown();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50985(long j) {
        CountDownLatch countDownLatch = this.f73228;
        try {
            if (j > 0) {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
                return true;
            }
            countDownLatch.await();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m50986() {
        return this.f73230 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50984() {
        return this.f73230 == -1;
    }
}
