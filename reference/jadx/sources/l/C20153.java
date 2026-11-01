package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.᩶ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09KJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20153 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ReentrantReadWriteLock f65467 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f65469 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashMap f65468 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45579(C21294 c21294) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f65467;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f65469.put(Long.valueOf(c21294.m47744().m20822()), c21294);
            this.f65468.put(c21294.m47744().m20819(), c21294);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45576() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f65467;
        reentrantReadWriteLock.readLock().lock();
        try {
            return new ArrayList(this.f65469.values());
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21294 m45580(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f65467;
        reentrantReadWriteLock.readLock().lock();
        try {
            return (C21294) this.f65469.get(Long.valueOf(j));
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21294 m45577(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f65467;
        reentrantReadWriteLock.readLock().lock();
        try {
            return (C21294) this.f65468.get(str);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45578(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f65467;
        reentrantReadWriteLock.writeLock().lock();
        try {
            C21294 c21294 = (C21294) this.f65469.remove(Long.valueOf(j));
            if (c21294 != null) {
                this.f65468.remove(c21294.m47744().m20819());
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
