package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ܶܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K29L */
/* JADX INFO: loaded from: classes4.dex */
public final class C15289 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49818 = AtomicReferenceFieldUpdater.newUpdater(C15289.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f49819 = AtomicIntegerFieldUpdater.newUpdater(C15289.class, "producerIndex");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f49820 = AtomicIntegerFieldUpdater.newUpdater(C15289.class, "consumerIndex");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f49821 = AtomicIntegerFieldUpdater.newUpdater(C15289.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceArray f49822 = new AtomicReferenceArray(128);
    public volatile /* synthetic */ Object lastScheduledTask = null;
    public volatile /* synthetic */ int producerIndex = 0;
    public volatile /* synthetic */ int consumerIndex = 0;
    public volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36601() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractRunnableC22344 m36606() {
        AbstractRunnableC22344 abstractRunnableC22344 = (AbstractRunnableC22344) f49818.getAndSet(this, null);
        return abstractRunnableC22344 == null ? m36600() : abstractRunnableC22344;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractRunnableC22344 m36603(AbstractRunnableC22344 abstractRunnableC22344) {
        AbstractRunnableC22344 abstractRunnableC22345 = (AbstractRunnableC22344) f49818.getAndSet(this, abstractRunnableC22344);
        if (abstractRunnableC22345 == null) {
            return null;
        }
        if (abstractRunnableC22345.f72949.mo4307() == 1) {
            f49821.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return abstractRunnableC22345;
        }
        int i = this.producerIndex & 127;
        while (this.f49822.get(i) != null) {
            Thread.yield();
        }
        this.f49822.lazySet(i, abstractRunnableC22345);
        f49819.incrementAndGet(this);
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m36605(C15289 c15289) {
        AbstractRunnableC22344 abstractRunnableC22344M36600 = c15289.m36600();
        if (abstractRunnableC22344M36600 != null) {
            m36603(abstractRunnableC22344M36600);
            return -1L;
        }
        return m36599(c15289, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m36602(C15289 c15289) {
        int i = c15289.producerIndex;
        AtomicReferenceArray atomicReferenceArray = c15289.f49822;
        for (int i2 = c15289.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (c15289.blockingTasksInBuffer == 0) {
                break;
            }
            AbstractRunnableC22344 abstractRunnableC22344 = (AbstractRunnableC22344) atomicReferenceArray.get(i3);
            if (abstractRunnableC22344 != null && abstractRunnableC22344.f72949.mo4307() == 1) {
                do {
                    if (atomicReferenceArray.compareAndSet(i3, abstractRunnableC22344, null)) {
                        f49821.decrementAndGet(c15289);
                        m36603(abstractRunnableC22344);
                        return -1L;
                    }
                } while (atomicReferenceArray.get(i3) == abstractRunnableC22344);
            }
        }
        return m36599(c15289, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36604(C11761 c11761) {
        AbstractRunnableC22344 abstractRunnableC22344 = (AbstractRunnableC22344) f49818.getAndSet(this, null);
        if (abstractRunnableC22344 != null) {
            c11761.m18963(abstractRunnableC22344);
        }
        while (true) {
            AbstractRunnableC22344 abstractRunnableC22344M36600 = m36600();
            if (abstractRunnableC22344M36600 == null) {
                return;
            } else {
                c11761.m18963(abstractRunnableC22344M36600);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final long m36599(C15289 c15289, boolean z) {
        while (true) {
            AbstractRunnableC22344 abstractRunnableC22344 = (AbstractRunnableC22344) c15289.lastScheduledTask;
            if (abstractRunnableC22344 == null) {
                return -2L;
            }
            if (z && abstractRunnableC22344.f72949.mo4307() != 1) {
                return -2L;
            }
            C6821.f22985.getClass();
            long jNanoTime = System.nanoTime() - abstractRunnableC22344.f72948;
            long j = C6821.f22991;
            if (jNanoTime < j) {
                return j - jNanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49818;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c15289, abstractRunnableC22344, null)) {
                    m36603(abstractRunnableC22344);
                    return -1L;
                }
            } while (atomicReferenceFieldUpdater.get(c15289) == abstractRunnableC22344);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private final AbstractRunnableC22344 m36600() {
        AbstractRunnableC22344 abstractRunnableC22344;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f49820.compareAndSet(this, i, i + 1) && (abstractRunnableC22344 = (AbstractRunnableC22344) this.f49822.getAndSet(i2, null)) != null) {
                if (abstractRunnableC22344.f72949.mo4307() == 1) {
                    f49821.decrementAndGet(this);
                }
                return abstractRunnableC22344;
            }
        }
    }
}
