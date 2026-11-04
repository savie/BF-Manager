package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W9N5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20032 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f64342;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f64343;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f64344;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f64345;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f64346;

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15475(AbstractC2133 abstractC2133, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f64345;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2133, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2133) == obj);
        return false;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15476(AbstractC2133 abstractC2133, C5862 c5862, C5862 c5863) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f64344;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2133, c5862, c5863)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2133) == c5862);
        return false;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15477(AbstractC2133 abstractC2133, C23016 c23016, C23016 c23017) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f64342;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2133, c23016, c23017)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2133) == c23016);
        return false;
    }

    public C20032(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f64346 = atomicReferenceFieldUpdater;
        this.f64343 = atomicReferenceFieldUpdater2;
        this.f64344 = atomicReferenceFieldUpdater3;
        this.f64342 = atomicReferenceFieldUpdater4;
        this.f64345 = atomicReferenceFieldUpdater5;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ۙ */
    public final void mo15473(C5862 c5862, Thread thread) {
        this.f64346.lazySet(c5862, thread);
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ۙ */
    public final void mo15474(C5862 c5862, C5862 c5863) {
        this.f64343.lazySet(c5862, c5863);
    }
}
