package l;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܽۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9B2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16575 implements InterfaceC23342 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f53212 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile int f53214 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f53213 = 21320;

    @Override // l.InterfaceC23342
    /* JADX INFO: renamed from: ۙ */
    public final void mo7537(int i, int i2) {
        if (this.f53213 != i) {
            return;
        }
        this.f53214 = i2;
        this.f53212.countDown();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38986(long j) {
        CountDownLatch countDownLatch = this.f53212;
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m38987() {
        return this.f53214 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m38985() {
        return this.f53214 == -1;
    }
}
