package l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۚۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 79GJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5089 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC11440 f17743;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f17744;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Condition f17745;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Throwable f17746;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4314 f17747;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f17748;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11771 f17749;

    public C5089(String str) {
        InterfaceC11440 interfaceC11440 = C13865.f45706;
        this.f17747 = C13488.m32997(C5089.class);
        this.f17744 = str;
        this.f17743 = interfaceC11440;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f17748 = reentrantLock;
        this.f17745 = reentrantLock.newCondition();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14180(C11771 c11771) {
        ReentrantLock reentrantLock = this.f17748;
        reentrantLock.lock();
        try {
            this.f17747.mo12121("Setting << {} >> to `{}`", this.f17744, c11771);
            this.f17749 = c11771;
            this.f17745.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14181(C21317 c21317) {
        ReentrantLock reentrantLock = this.f17748;
        reentrantLock.lock();
        try {
            this.f17746 = this.f17743.mo12998(c21317);
            this.f17745.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m14179(long j, TimeUnit timeUnit) throws Throwable {
        Object objM14183 = m14183(j, timeUnit);
        if (objM14183 != null) {
            return objM14183;
        }
        throw this.f17743.mo12998(new TimeoutException("Timeout expired"));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m14183(long j, TimeUnit timeUnit) {
        String str = this.f17744;
        InterfaceC4314 interfaceC4314 = this.f17747;
        ReentrantLock reentrantLock = this.f17748;
        reentrantLock.lock();
        try {
            try {
                Throwable th = this.f17746;
                if (th != null) {
                    throw th;
                }
                C11771 c11771 = this.f17749;
                if (c11771 != null) {
                    reentrantLock.unlock();
                    return c11771;
                }
                interfaceC4314.mo12126(str, "Awaiting << {} >>");
                Condition condition = this.f17745;
                if (j == 0) {
                    while (this.f17749 == null && this.f17746 == null) {
                        condition.await();
                    }
                } else if (!condition.await(j, timeUnit)) {
                    reentrantLock.unlock();
                    return null;
                }
                Throwable th2 = this.f17746;
                if (th2 != null) {
                    interfaceC4314.mo12128("<< {} >> woke to: {}", str, th2);
                    throw this.f17746;
                }
                C11771 c11772 = this.f17749;
                reentrantLock.unlock();
                return c11772;
            } catch (InterruptedException e) {
                throw this.f17743.mo12998(e);
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14182() {
        ReentrantLock reentrantLock = this.f17748;
        reentrantLock.lock();
        try {
            return this.f17746 == null && this.f17749 != null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String toString() {
        return this.f17744;
    }
}
