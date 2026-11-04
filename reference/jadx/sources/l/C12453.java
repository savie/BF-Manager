package l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ۨܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9I9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12453 extends AbstractFutureC3504 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14690 f40019;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20658 f40020;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f40022 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f40021 = new ReentrantReadWriteLock();

    public C12453(C14690 c14690, InterfaceC20658 interfaceC20658) {
        this.f40019 = c14690;
        this.f40020 = interfaceC20658;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        AtomicBoolean atomicBoolean = this.f40022;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f40021;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!isDone() && !atomicBoolean.getAndSet(true)) {
                this.f40020.cancel();
                reentrantReadWriteLock.writeLock().unlock();
                return true;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return false;
        } catch (Throwable th) {
            try {
                atomicBoolean.set(false);
                throw ((C12082) C12082.f38900.mo4586(th));
            } catch (Throwable th2) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f40021;
        reentrantReadWriteLock.readLock().lock();
        try {
            return this.f40022.get();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f40021;
        reentrantReadWriteLock.readLock().lock();
        try {
            return this.f40022.get() || this.f40019.isDone();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f40019.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f40019.get(j, timeUnit);
    }
}
