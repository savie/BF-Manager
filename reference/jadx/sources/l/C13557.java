package l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ܰۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J9I9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13557 extends AbstractFutureC3159 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4383 f44728;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22023 f44729;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f44730 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f44727 = new ReentrantReadWriteLock();

    public C13557(C22023 c22023, InterfaceC4383 interfaceC4383) {
        this.f44729 = c22023;
        this.f44728 = interfaceC4383;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        AtomicBoolean atomicBoolean = this.f44730;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f44727;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!isDone() && !atomicBoolean.getAndSet(true)) {
                this.f44728.cancel();
                reentrantReadWriteLock.writeLock().unlock();
                return true;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return false;
        } catch (Throwable th) {
            try {
                atomicBoolean.set(false);
                throw ((C13865) C13865.f45706.mo12998(th));
            } catch (Throwable th2) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f44727;
        reentrantReadWriteLock.readLock().lock();
        try {
            return this.f44730.get();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f44727;
        reentrantReadWriteLock.readLock().lock();
        try {
            return this.f44730.get() || this.f44729.isDone();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f44729.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f44729.get(j, timeUnit);
    }
}
