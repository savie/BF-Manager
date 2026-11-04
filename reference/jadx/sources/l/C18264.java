package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ܿۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K29L */
/* JADX INFO: loaded from: classes4.dex */
public final class C18264 {
    public volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    public volatile /* synthetic */ int consumerIndex$volatile;
    public volatile /* synthetic */ Object lastScheduledTask$volatile;
    public volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceArray f59598 = new AtomicReferenceArray(128);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f59597 = AtomicReferenceFieldUpdater.newUpdater(C18264.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f59595 = AtomicIntegerFieldUpdater.newUpdater(C18264.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f59594 = AtomicIntegerFieldUpdater.newUpdater(C18264.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f59596 = AtomicIntegerFieldUpdater.newUpdater(C18264.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m42410() {
        Object obj = f59597.get(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f59594;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f59595;
        return obj != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractRunnableC12297 m42415() {
        AbstractRunnableC12297 abstractRunnableC12297 = (AbstractRunnableC12297) f59597.getAndSet(this, null);
        return abstractRunnableC12297 == null ? m42409() : abstractRunnableC12297;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractRunnableC12297 m42412(AbstractRunnableC12297 abstractRunnableC12297) {
        AbstractRunnableC12297 abstractRunnableC12298 = (AbstractRunnableC12297) f59597.getAndSet(this, abstractRunnableC12297);
        if (abstractRunnableC12298 == null) {
            return null;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f59595;
        if (atomicIntegerFieldUpdater.get(this) - f59594.get(this) == 127) {
            return abstractRunnableC12298;
        }
        if (abstractRunnableC12298.f39532.mo18057() == 1) {
            f59596.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f59598;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, abstractRunnableC12298);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m42411(int i, C24941 c24941) {
        AbstractRunnableC12297 abstractRunnableC12297M42408;
        if (i != 3) {
            int i2 = f59594.get(this);
            int i3 = f59595.get(this);
            boolean z = i == 1;
            while (true) {
                if (i2 != i3 && (!z || f59596.get(this) != 0)) {
                    int i4 = i2 + 1;
                    abstractRunnableC12297M42408 = m42408(i2, z);
                    if (abstractRunnableC12297M42408 != null) {
                        break;
                    }
                    i2 = i4;
                } else {
                    abstractRunnableC12297M42408 = null;
                    break;
                }
            }
        } else {
            abstractRunnableC12297M42408 = m42409();
        }
        if (abstractRunnableC12297M42408 != null) {
            c24941.f80717 = abstractRunnableC12297M42408;
            return -1L;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59597;
            AbstractRunnableC12297 abstractRunnableC12297 = (AbstractRunnableC12297) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC12297 == null) {
                return -2L;
            }
            if (((abstractRunnableC12297.f39532.mo18057() == 1 ? 1 : 2) & i) == 0) {
                return -2L;
            }
            C14534.f45723.getClass();
            long jNanoTime = System.nanoTime() - abstractRunnableC12297.f39531;
            long j = C14534.f45725;
            if (jNanoTime < j) {
                return j - jNanoTime;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, abstractRunnableC12297, null)) {
                    c24941.f80717 = abstractRunnableC12297;
                    return -1L;
                }
            } while (atomicReferenceFieldUpdater.get(this) == abstractRunnableC12297);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractRunnableC12297 m42414() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59597;
            AbstractRunnableC12297 abstractRunnableC12297 = (AbstractRunnableC12297) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC12297 == null || abstractRunnableC12297.f39532.mo18057() != 1) {
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractRunnableC12297, null)) {
                if (atomicReferenceFieldUpdater.get(this) != abstractRunnableC12297) {
                }
            }
            return abstractRunnableC12297;
        }
        int i = f59594.get(this);
        int i2 = f59595.get(this);
        while (i != i2 && f59596.get(this) != 0) {
            i2--;
            AbstractRunnableC12297 abstractRunnableC12297M42408 = m42408(i2, true);
            if (abstractRunnableC12297M42408 != null) {
                return abstractRunnableC12297M42408;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final AbstractRunnableC12297 m42408(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f59598;
        AbstractRunnableC12297 abstractRunnableC12297 = (AbstractRunnableC12297) atomicReferenceArray.get(i2);
        if (abstractRunnableC12297 != null) {
            if ((abstractRunnableC12297.f39532.mo18057() == 1) == z) {
                while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC12297, null)) {
                    if (atomicReferenceArray.get(i2) != abstractRunnableC12297) {
                    }
                }
                if (z) {
                    f59596.decrementAndGet(this);
                }
                return abstractRunnableC12297;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42413(C23486 c23486) {
        AbstractRunnableC12297 abstractRunnableC12297 = (AbstractRunnableC12297) f59597.getAndSet(this, null);
        if (abstractRunnableC12297 != null) {
            c23486.m54851(abstractRunnableC12297);
        }
        while (true) {
            AbstractRunnableC12297 abstractRunnableC12297M42409 = m42409();
            if (abstractRunnableC12297M42409 == null) {
                return;
            } else {
                c23486.m54851(abstractRunnableC12297M42409);
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private final AbstractRunnableC12297 m42409() {
        AbstractRunnableC12297 abstractRunnableC12297;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f59594;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f59595.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC12297 = (AbstractRunnableC12297) this.f59598.getAndSet(i2, null)) != null) {
                if (abstractRunnableC12297.f39532.mo18057() == 1) {
                    f59596.decrementAndGet(this);
                }
                return abstractRunnableC12297;
            }
        }
    }
}
