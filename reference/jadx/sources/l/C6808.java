package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ۜܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69H1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6808 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ReentrantReadWriteLock f22959 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashMap f22958 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f22957 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18803 m18403(Long l2) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f22959;
        reentrantReadWriteLock.readLock().lock();
        try {
            return (C18803) this.f22958.get(l2);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18803 m18406(Long l2) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f22959;
        reentrantReadWriteLock.writeLock().lock();
        try {
            C18803 c18803 = (C18803) this.f22958.remove(l2);
            if (c18803 == null) {
                throw new C13865("Unable to find outstanding request for messageId " + l2);
            }
            this.f22957.remove(c18803.m43370());
            reentrantReadWriteLock.writeLock().unlock();
            return c18803;
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18404(C18803 c18803) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f22959;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f22958.put(Long.valueOf(c18803.m43369()), c18803);
            this.f22957.put(c18803.m43370(), c18803);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18405(C21317 c21317) {
        HashMap map = this.f22958;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f22959;
        reentrantReadWriteLock.writeLock().lock();
        try {
            Iterator it = new HashSet(map.keySet()).iterator();
            while (it.hasNext()) {
                C18803 c18803 = (C18803) map.remove((Long) it.next());
                this.f22957.remove(c18803.m43370());
                c18803.m43368().m14181(c21317);
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }
}
