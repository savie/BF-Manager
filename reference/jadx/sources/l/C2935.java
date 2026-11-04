package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۖ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BB0B */
/* JADX INFO: loaded from: classes2.dex */
public final class C2935 extends ArrayList {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f9601 = new ReentrantLock();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f9602 = new AtomicInteger();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m9583() {
        this.f9601.lock();
        this.f9602.incrementAndGet();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m9584() {
        this.f9602.decrementAndGet();
        this.f9601.unlock();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m9585() {
        return this.f9602.get() > 0;
    }
}
