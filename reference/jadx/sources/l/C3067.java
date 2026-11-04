package l;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۗ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8CK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3067 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f9937 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f9938;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile int f9939;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f9940;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f9941;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile int f9942;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Condition f9943;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile double[] f9944;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Condition f9945;

    public C3067() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f9940 = reentrantLock;
        this.f9943 = reentrantLock.newCondition();
        this.f9945 = reentrantLock.newCondition();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9999() {
        this.f9944 = new double[32768];
        this.f9938 = EnumC6121.f20881;
        this.f9941 = 65535;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m10002() {
        return (this.f9939 - this.f9942) & this.f9941;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m9998(double[] dArr, int i, int i2) {
        double d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            this.f9940.lock();
            while (m10002() < 1) {
                try {
                    try {
                        this.f9945.await();
                    } catch (InterruptedException unused) {
                        this.f9940.unlock();
                        d = Double.NaN;
                    }
                } catch (Throwable th) {
                    this.f9940.unlock();
                    throw th;
                }
            }
            double d2 = this.f9944[this.f9942 & this.f9938];
            this.f9942 = (this.f9942 + 1) & this.f9941;
            this.f9940.unlock();
            if (this.f9937) {
                this.f9940.lock();
                this.f9943.signal();
                this.f9940.unlock();
            }
            d = d2;
            if (Double.isNaN(d)) {
                break;
            }
            dArr[i4 + i] = d;
            i3++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10000(double d) {
        if (this.f9937) {
            this.f9940.lock();
            while (m10002() == this.f9944.length) {
                try {
                    try {
                        this.f9943.await();
                    } catch (InterruptedException unused) {
                        this.f9940.unlock();
                        return;
                    }
                } catch (Throwable th) {
                    this.f9940.unlock();
                    throw th;
                }
            }
            this.f9944[this.f9939 & this.f9938] = d;
            this.f9939 = (this.f9939 + 1) & this.f9941;
            this.f9940.unlock();
        } else if (m10002() != this.f9944.length) {
            this.f9944[this.f9939 & this.f9938] = d;
            this.f9939 = (this.f9939 + 1) & this.f9941;
        }
        this.f9940.lock();
        this.f9945.signal();
        this.f9940.unlock();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10001(boolean z) {
        this.f9937 = z;
    }
}
