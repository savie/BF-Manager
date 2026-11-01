package l;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۚ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: N9T7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5589 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f19182;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f19183;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Lock f19184;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Condition f19185;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Condition f19186;

    public C5589(int i, ReentrantLock reentrantLock, Condition condition, Condition condition2, int[] iArr) {
        this.f19182 = i;
        this.f19184 = reentrantLock;
        this.f19186 = condition;
        this.f19185 = condition2;
        this.f19183 = iArr;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C5589[] m15459() {
        C5589[] c5589Arr = new C5589[2];
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition[] conditionArr = new Condition[2];
        for (int i = 0; i < 2; i++) {
            conditionArr[i] = reentrantLock.newCondition();
        }
        int[] iArr = {0};
        int i2 = 0;
        while (i2 < 2) {
            int i3 = i2 + 1;
            c5589Arr[i2] = new C5589(i2, reentrantLock, conditionArr[i2], i3 == 2 ? conditionArr[0] : conditionArr[i3], iArr);
            i2 = i3;
        }
        return c5589Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15460() throws InterruptedException {
        this.f19184.lock();
        if (this.f19183[0] % 2 != this.f19182) {
            this.f19186.await();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15461() {
        Lock lock = this.f19184;
        try {
            int[] iArr = this.f19183;
            iArr[0] = iArr[0] + 1;
            this.f19185.signal();
        } finally {
            lock.unlock();
        }
    }
}
