package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ᩴ᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99J1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20044 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ReentrantLock f64390 = new ReentrantLock();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashMap f64391 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46101(Long l2, C10852 c10852) {
        ReentrantLock reentrantLock = this.f64390;
        reentrantLock.lock();
        try {
            this.f64391.put(l2, c10852);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10852 m46100(Long l2) {
        ReentrantLock reentrantLock = this.f64390;
        reentrantLock.lock();
        try {
            return (C10852) this.f64391.get(l2);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46102(Long l2) {
        ReentrantLock reentrantLock = this.f64390;
        reentrantLock.lock();
        try {
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m46099() {
        ReentrantLock reentrantLock = this.f64390;
        reentrantLock.lock();
        try {
            return new ArrayList(this.f64391.values());
        } finally {
            reentrantLock.unlock();
        }
    }
}
