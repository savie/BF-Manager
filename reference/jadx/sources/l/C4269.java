package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ۘ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: TAXM */
/* JADX INFO: loaded from: classes2.dex */
public class C4269 {
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    public volatile /* synthetic */ Object _removedRef = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15404 = AtomicReferenceFieldUpdater.newUpdater(C4269.class, Object.class, "_next");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15405 = AtomicReferenceFieldUpdater.newUpdater(C4269.class, Object.class, "_prev");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15403 = AtomicReferenceFieldUpdater.newUpdater(C4269.class, Object.class, "_removedRef");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean mo12072() {
        return m12065() instanceof C19793;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C4269 m12071() {
        C4269 c4269;
        Object objM12065 = m12065();
        C19793 c19793 = objM12065 instanceof C19793 ? (C19793) objM12065 : null;
        return (c19793 == null || (c4269 = c19793.f63561) == null) ? (C4269) objM12065 : c4269;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C4269 m12066() {
        C4269 c4269M12064 = m12064();
        if (c4269M12064 != null) {
            return c4269M12064;
        }
        Object obj = this._prev;
        while (true) {
            C4269 c4269 = (C4269) obj;
            if (!c4269.mo12072()) {
                return c4269;
            }
            obj = c4269._prev;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12068(C0928 c0928) {
        f15405.lazySet(c0928, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15404;
        atomicReferenceFieldUpdater.lazySet(c0928, this);
        while (m12065() == this) {
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, this, c0928)) {
                    c0928.m12062(this);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12069(C4269 c4269, C5681 c5681) {
        f15405.lazySet(c4269, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15404;
        atomicReferenceFieldUpdater.lazySet(c4269, c5681);
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c5681, c4269)) {
            if (atomicReferenceFieldUpdater.get(this) != c5681) {
                return false;
            }
        }
        c4269.m12062(c5681);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12067(C4269 c4269, C5681 c5681, AbstractC1447 abstractC1447) {
        f15405.lazySet(c4269, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15404;
        atomicReferenceFieldUpdater.lazySet(c4269, c5681);
        abstractC1447.f5917 = c5681;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c5681, abstractC1447)) {
            if (atomicReferenceFieldUpdater.get(this) != c5681) {
                return 0;
            }
        }
        return abstractC1447.mo22233(this) == null ? 1 : 2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4269 m12073() {
        while (true) {
            Object objM12065 = m12065();
            if (objM12065 instanceof C19793) {
                return ((C19793) objM12065).f63561;
            }
            if (objM12065 == this) {
                return (C4269) objM12065;
            }
            C4269 c4269 = (C4269) objM12065;
            C19793 c19793 = (C19793) c4269._removedRef;
            if (c19793 == null) {
                c19793 = new C19793(c4269);
                f15403.lazySet(c4269, c19793);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15404;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, objM12065, c19793)) {
                    c4269.m12064();
                    return null;
                }
            } while (atomicReferenceFieldUpdater.get(this) == objM12065);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m12070() {
        ((C19793) m12065()).f63561.m12074();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m12074() {
        C4269 c4269 = this;
        while (true) {
            Object objM12065 = c4269.m12065();
            if (objM12065 instanceof C19793) {
                c4269 = ((C19793) objM12065).f63561;
            } else {
                c4269.m12064();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private final C4269 m12064() {
        C4269 c4269;
        Object obj;
        loop0: while (true) {
            C4269 c42610 = (C4269) this._prev;
            c4269 = c42610;
            while (true) {
                C4269 c42611 = null;
                while (true) {
                    obj = c4269._next;
                    if (obj == this) {
                        if (c42610 != c4269) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15405;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, c42610, c4269)) {
                                if (atomicReferenceFieldUpdater.get(this) != c42610) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (mo12072()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof AbstractC8504) {
                        ((AbstractC8504) obj).mo22233(c4269);
                        break;
                    }
                    if (!(obj instanceof C19793)) {
                        c42611 = c4269;
                        c4269 = (C4269) obj;
                    } else {
                        if (c42611 != null) {
                            break;
                        }
                        c4269 = (C4269) c4269._prev;
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15404;
                C4269 c42612 = ((C19793) obj).f63561;
                while (!atomicReferenceFieldUpdater2.compareAndSet(c42611, c4269, c42612)) {
                    if (atomicReferenceFieldUpdater2.get(c42611) != c4269) {
                        break;
                    }
                }
                c4269 = c42611;
            }
        }
        return c4269;
    }

    public String toString() {
        return new C13443(this) + '@' + C13961.m33816(this);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Object m12065() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC8504)) {
                return obj;
            }
            ((AbstractC8504) obj).mo22233(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12062(C4269 c4269) {
        while (true) {
            C4269 c42610 = (C4269) c4269._prev;
            if (m12065() != c4269) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15405;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c4269, c42610, this)) {
                    if (mo12072()) {
                        c4269.m12064();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c4269) == c42610);
        }
    }
}
