package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩸ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes.dex */
public final class C22942 extends AbstractC11007 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f74545 = AtomicReferenceFieldUpdater.newUpdater(C5788.class, Thread.class, "᩷");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f74542 = AtomicReferenceFieldUpdater.newUpdater(C5788.class, C5788.class, "ۙ");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f74543 = AtomicReferenceFieldUpdater.newUpdater(AbstractC2059.class, C5788.class, "ܿ");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f74541 = AtomicReferenceFieldUpdater.newUpdater(AbstractC2059.class, C7257.class, "ܰ");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f74544 = AtomicReferenceFieldUpdater.newUpdater(AbstractC2059.class, Object.class, "᩶");

    @Override // l.AbstractC11007
    /* JADX INFO: renamed from: ۙ */
    public final void mo27856(C5788 c5788, Thread thread) {
        f74545.lazySet(c5788, thread);
    }

    @Override // l.AbstractC11007
    /* JADX INFO: renamed from: ۙ */
    public final void mo27857(C5788 c5788, C5788 c5789) {
        f74542.lazySet(c5788, c5789);
    }

    @Override // l.AbstractC11007
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo27859(AbstractC2059 abstractC2059, C5788 c5788, C5788 c5789) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f74543;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC2059, c5788, c5789)) {
            if (atomicReferenceFieldUpdater.get(abstractC2059) != c5788) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC11007
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo27860(AbstractC2059 abstractC2059, C7257 c7257, C7257 c7258) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f74541;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC2059, c7257, c7258)) {
            if (atomicReferenceFieldUpdater.get(abstractC2059) != c7257) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC11007
    /* JADX INFO: renamed from: ۙ */
    public final C7257 mo27855(AbstractC2059 abstractC2059, C7257 c7257) {
        return (C7257) f74541.getAndSet(abstractC2059, c7257);
    }

    @Override // l.AbstractC11007
    /* JADX INFO: renamed from: ۙ */
    public final C5788 mo27854(AbstractC2059 abstractC2059, C5788 c5788) {
        return (C5788) f74543.getAndSet(abstractC2059, c5788);
    }

    @Override // l.AbstractC11007
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo27858(AbstractC2059 abstractC2059, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f74544;
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC2059, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(abstractC2059) != obj) {
                return false;
            }
        }
        return true;
    }
}
