package l;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۡۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9CL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8864 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ReentrantLock f30409 = new ReentrantLock();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f30410 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19447 m23003(String str) {
        ReentrantLock reentrantLock = this.f30409;
        reentrantLock.lock();
        try {
            return (C19447) this.f30410.get(str);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23004(C19447 c19447) {
        ReentrantLock reentrantLock = this.f30409;
        reentrantLock.lock();
        try {
            this.f30410.put(c19447.m44499(), c19447);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23005(String str) {
        ReentrantLock reentrantLock = this.f30409;
        reentrantLock.lock();
        try {
            this.f30410.remove(str);
        } finally {
            reentrantLock.unlock();
        }
    }
}
