package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩶ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99J1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20215 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ReentrantLock f65593 = new ReentrantLock();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f65594 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45674(Long l2, C20858 c20858) {
        ReentrantLock reentrantLock = this.f65593;
        reentrantLock.lock();
        try {
            this.f65594.put(l2, c20858);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20858 m45673(Long l2) {
        ReentrantLock reentrantLock = this.f65593;
        reentrantLock.lock();
        try {
            return (C20858) this.f65594.get(l2);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45675(Long l2) {
        ReentrantLock reentrantLock = this.f65593;
        reentrantLock.lock();
        try {
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45672() {
        ReentrantLock reentrantLock = this.f65593;
        reentrantLock.lock();
        try {
            return new ArrayList(this.f65594.values());
        } finally {
            reentrantLock.unlock();
        }
    }
}
