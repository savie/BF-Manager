package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܳܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: BB0B */
/* JADX INFO: loaded from: classes4.dex */
public final class C14638 extends ArrayList {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f47869 = new ReentrantLock();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f47870 = new AtomicInteger();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m35141() {
        this.f47869.lock();
        this.f47870.incrementAndGet();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m35142() {
        this.f47870.decrementAndGet();
        this.f47869.unlock();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m35143() {
        return this.f47870.get() > 0;
    }
}
