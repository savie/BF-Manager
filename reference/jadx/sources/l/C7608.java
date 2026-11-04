package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.۟ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69H1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7608 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ReentrantReadWriteLock f25124 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HashMap f25123 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f25122 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2387 m20808(Long l2) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f25124;
        reentrantReadWriteLock.readLock().lock();
        try {
            return (C2387) this.f25123.get(l2);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2387 m20811(Long l2) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f25124;
        reentrantReadWriteLock.writeLock().lock();
        try {
            C2387 c2387 = (C2387) this.f25123.remove(l2);
            if (c2387 == null) {
                throw new C12082("Unable to find outstanding request for messageId " + l2);
            }
            this.f25122.remove(c2387.m8124());
            reentrantReadWriteLock.writeLock().unlock();
            return c2387;
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20809(C2387 c2387) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f25124;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f25123.put(Long.valueOf(c2387.m8120()), c2387);
            this.f25122.put(c2387.m8124(), c2387);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20810(C9469 c9469) {
        HashMap map = this.f25123;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f25124;
        reentrantReadWriteLock.writeLock().lock();
        try {
            Iterator it = new HashSet(map.keySet()).iterator();
            while (it.hasNext()) {
                C2387 c2387 = (C2387) map.remove((Long) it.next());
                this.f25122.remove(c2387.m8124());
                c2387.m8123().m13571(c9469);
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }
}
