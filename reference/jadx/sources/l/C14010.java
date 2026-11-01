package l;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܰᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8CK */
/* JADX INFO: loaded from: classes3.dex */
public final class C14010 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f46032;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Condition f46033;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f46034 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f46035;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Condition f46036;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f46037;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile int f46038;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile double[] f46039;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile int f46040;

    public C14010() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f46037 = reentrantLock;
        this.f46036 = reentrantLock.newCondition();
        this.f46033 = reentrantLock.newCondition();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33873() {
        this.f46039 = new double[32768];
        this.f46035 = EnumC23529.f76192;
        this.f46032 = 65535;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m33876() {
        return (this.f46038 - this.f46040) & this.f46032;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33872(double[] dArr, int i, int i2) {
        double d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            this.f46037.lock();
            while (m33876() < 1) {
                try {
                    try {
                        this.f46033.await();
                    } catch (InterruptedException unused) {
                        this.f46037.unlock();
                        d = Double.NaN;
                    }
                } catch (Throwable th) {
                    this.f46037.unlock();
                    throw th;
                }
            }
            double d2 = this.f46039[this.f46040 & this.f46035];
            this.f46040 = (this.f46040 + 1) & this.f46032;
            this.f46037.unlock();
            if (this.f46034) {
                this.f46037.lock();
                this.f46036.signal();
                this.f46037.unlock();
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
    public final void m33874(double d) {
        if (this.f46034) {
            this.f46037.lock();
            while (m33876() == this.f46039.length) {
                try {
                    try {
                        this.f46036.await();
                    } catch (InterruptedException unused) {
                        this.f46037.unlock();
                        return;
                    }
                } catch (Throwable th) {
                    this.f46037.unlock();
                    throw th;
                }
            }
            this.f46039[this.f46038 & this.f46035] = d;
            this.f46038 = (this.f46038 + 1) & this.f46032;
            this.f46037.unlock();
        } else if (m33876() != this.f46039.length) {
            this.f46039[this.f46038 & this.f46035] = d;
            this.f46038 = (this.f46038 + 1) & this.f46032;
        }
        this.f46037.lock();
        this.f46033.signal();
        this.f46037.unlock();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33875(boolean z) {
        this.f46034 = z;
    }
}
