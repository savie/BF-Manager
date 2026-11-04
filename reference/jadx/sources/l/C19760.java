package l;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ᩴۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9T7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19760 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f63603;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Condition f63604;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Lock f63605;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Condition f63606;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f63607;

    public C19760(int i, ReentrantLock reentrantLock, Condition condition, Condition condition2, int[] iArr) {
        this.f63607 = i;
        this.f63605 = reentrantLock;
        this.f63606 = condition;
        this.f63604 = condition2;
        this.f63603 = iArr;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C19760[] m45518() {
        C19760[] c19760Arr = new C19760[2];
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition[] conditionArr = new Condition[2];
        for (int i = 0; i < 2; i++) {
            conditionArr[i] = reentrantLock.newCondition();
        }
        int[] iArr = {0};
        int i2 = 0;
        while (i2 < 2) {
            int i3 = i2 + 1;
            c19760Arr[i2] = new C19760(i2, reentrantLock, conditionArr[i2], i3 == 2 ? conditionArr[0] : conditionArr[i3], iArr);
            i2 = i3;
        }
        return c19760Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45519() throws InterruptedException {
        this.f63605.lock();
        if (this.f63603[0] % 2 != this.f63607) {
            this.f63606.await();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45520() {
        Lock lock = this.f63605;
        try {
            int[] iArr = this.f63603;
            iArr[0] = iArr[0] + 1;
            this.f63604.signal();
        } finally {
            lock.unlock();
        }
    }
}
