package l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۘܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79GJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4250 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Condition f15470;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC25186 f15471;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6488 f15472;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C24652 f15473;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Throwable f15474;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f15475;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f15476;

    public C4250(String str) {
        InterfaceC6488 interfaceC6488 = C12082.f38900;
        this.f15471 = C16980.m40037(C4250.class);
        this.f15476 = str;
        this.f15472 = interfaceC6488;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f15475 = reentrantLock;
        this.f15470 = reentrantLock.newCondition();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13572(C24652 c24652) {
        ReentrantLock reentrantLock = this.f15475;
        reentrantLock.lock();
        try {
            this.f15471.mo13701("Setting << {} >> to `{}`", this.f15476, c24652);
            this.f15473 = c24652;
            this.f15470.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13571(C9469 c9469) {
        ReentrantLock reentrantLock = this.f15475;
        reentrantLock.lock();
        try {
            this.f15474 = this.f15472.mo4586(c9469);
            this.f15470.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m13570(long j, TimeUnit timeUnit) throws Throwable {
        Object objM13574 = m13574(j, timeUnit);
        if (objM13574 != null) {
            return objM13574;
        }
        throw this.f15472.mo4586(new TimeoutException("Timeout expired"));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m13574(long j, TimeUnit timeUnit) {
        String str = this.f15476;
        InterfaceC25186 interfaceC25186 = this.f15471;
        ReentrantLock reentrantLock = this.f15475;
        reentrantLock.lock();
        try {
            try {
                Throwable th = this.f15474;
                if (th != null) {
                    throw th;
                }
                C24652 c24652 = this.f15473;
                if (c24652 != null) {
                    reentrantLock.unlock();
                    return c24652;
                }
                interfaceC25186.mo13716(str, "Awaiting << {} >>");
                Condition condition = this.f15470;
                if (j == 0) {
                    while (this.f15473 == null && this.f15474 == null) {
                        condition.await();
                    }
                } else if (!condition.await(j, timeUnit)) {
                    reentrantLock.unlock();
                    return null;
                }
                Throwable th2 = this.f15474;
                if (th2 != null) {
                    interfaceC25186.mo13718("<< {} >> woke to: {}", str, th2);
                    throw this.f15474;
                }
                C24652 c24653 = this.f15473;
                reentrantLock.unlock();
                return c24653;
            } catch (InterruptedException e) {
                throw this.f15472.mo4586(e);
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13573() {
        ReentrantLock reentrantLock = this.f15475;
        reentrantLock.lock();
        try {
            return this.f15474 == null && this.f15473 != null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String toString() {
        return this.f15476;
    }
}
