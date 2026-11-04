package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ᩴۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09KJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19803 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ReentrantReadWriteLock f63672 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashMap f63674 = new HashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HashMap f63673 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45577(C1158 c1158) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f63672;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f63674.put(Long.valueOf(c1158.m4267().m23241()), c1158);
            this.f63673.put(c1158.m4267().m23242(), c1158);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45574() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f63672;
        reentrantReadWriteLock.readLock().lock();
        try {
            return new ArrayList(this.f63674.values());
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1158 m45578(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f63672;
        reentrantReadWriteLock.readLock().lock();
        try {
            return (C1158) this.f63674.get(Long.valueOf(j));
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1158 m45575(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f63672;
        reentrantReadWriteLock.readLock().lock();
        try {
            return (C1158) this.f63673.get(str);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45576(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f63672;
        reentrantReadWriteLock.writeLock().lock();
        try {
            C1158 c1158 = (C1158) this.f63674.remove(Long.valueOf(j));
            if (c1158 != null) {
                this.f63673.remove(c1158.m4267().m23242());
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
