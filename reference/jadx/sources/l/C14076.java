package l;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.۬᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9CL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14076 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ReentrantLock f44570 = new ReentrantLock();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashMap f44571 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7365 m34243(String str) {
        ReentrantLock reentrantLock = this.f44570;
        reentrantLock.lock();
        try {
            return (C7365) this.f44571.get(str);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34244(C7365 c7365) {
        ReentrantLock reentrantLock = this.f44570;
        reentrantLock.lock();
        try {
            this.f44571.put(c7365.m20224(), c7365);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34245(String str) {
        ReentrantLock reentrantLock = this.f44570;
        reentrantLock.lock();
        try {
            this.f44571.remove(str);
        } finally {
            reentrantLock.unlock();
        }
    }
}
