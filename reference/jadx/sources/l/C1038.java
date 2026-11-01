package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.֨ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1038 extends AbstractC22206 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f4835 = AtomicReferenceFieldUpdater.newUpdater(C15151.class, Thread.class, "ܰ");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f4838 = AtomicReferenceFieldUpdater.newUpdater(C15151.class, C15151.class, "ۙ");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f4837 = AtomicReferenceFieldUpdater.newUpdater(AbstractC21500.class, C15151.class, "֡");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f4836 = AtomicReferenceFieldUpdater.newUpdater(AbstractC21500.class, C13740.class, "ܺ");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f4839 = AtomicReferenceFieldUpdater.newUpdater(AbstractC21500.class, Object.class, "᩶");

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo3892(AbstractC21500 abstractC21500, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f4839;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC21500, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC21500) == obj);
        return false;
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo3893(AbstractC21500 abstractC21500, C13740 c13740, C13740 c13741) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f4836;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC21500, c13740, c13741)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC21500) == c13740);
        return false;
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo3894(AbstractC21500 abstractC21500, C15151 c15151, C15151 c15152) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f4837;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC21500, c15151, c15152)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC21500) == c15151);
        return false;
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15151 mo3889(AbstractC21500 abstractC21500) {
        return (C15151) f4837.getAndSet(abstractC21500, C15151.f49492);
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3890(C15151 c15151, Thread thread) {
        f4835.lazySet(c15151, thread);
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3891(C15151 c15151, C15151 c15152) {
        f4838.lazySet(c15151, c15152);
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13740 mo3888(AbstractC21500 abstractC21500, C13740 c13740) {
        return (C13740) f4836.getAndSet(abstractC21500, c13740);
    }
}
