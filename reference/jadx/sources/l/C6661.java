package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ۛ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAXM */
/* JADX INFO: loaded from: classes3.dex */
public class C6661 {
    public volatile /* synthetic */ Object _next$volatile = this;
    public volatile /* synthetic */ Object _prev$volatile = this;
    public volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22198 = AtomicReferenceFieldUpdater.newUpdater(C6661.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22200 = AtomicReferenceFieldUpdater.newUpdater(C6661.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22199 = AtomicReferenceFieldUpdater.newUpdater(C6661.class, Object.class, "_removedRef$volatile");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean mo18598() {
        return m18601() instanceof C19339;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m18601() {
        while (true) {
            Object obj = f22198.get(this);
            if (!(obj instanceof AbstractC8152)) {
                return obj;
            }
            ((AbstractC8152) obj).mo22059(this);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6661 m18600() {
        C6661 c6661;
        Object objM18601 = m18601();
        C19339 c19339 = objM18601 instanceof C19339 ? (C19339) objM18601 : null;
        if (c19339 != null && (c6661 = c19339.f62458) != null) {
            return c6661;
        }
        C15243.m36587(objM18601, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C6661) objM18601;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6661 m18599() {
        C6661 c6661M18594 = m18594();
        if (c6661M18594 != null) {
            return c6661M18594;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22200;
        Object obj = atomicReferenceFieldUpdater.get(this);
        while (true) {
            C6661 c6661 = (C6661) obj;
            if (!c6661.mo18598()) {
                return c6661;
            }
            obj = atomicReferenceFieldUpdater.get(c6661);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18596(C1951 c1951) {
        f22200.set(c1951, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22198;
        atomicReferenceFieldUpdater.set(c1951, this);
        while (m18601() == this) {
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, this, c1951)) {
                    c1951.m18592(this);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == this);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m18595(AbstractC22088 abstractC22088, C1951 c1951, C19850 c19850) {
        f22200.set(abstractC22088, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22198;
        atomicReferenceFieldUpdater.set(abstractC22088, c1951);
        c19850.f66703 = c1951;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c1951, c19850)) {
            if (atomicReferenceFieldUpdater.get(this) != c1951) {
                return 0;
            }
        }
        return c19850.mo22059(this) == null ? 1 : 2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m18597() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            Object objM18601 = m18601();
            if (objM18601 instanceof C19339) {
                return;
            }
            if (objM18601 == this) {
                return;
            }
            C15243.m36587(objM18601, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            C6661 c6661 = (C6661) objM18601;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f22199;
            C19339 c19339 = (C19339) atomicReferenceFieldUpdater2.get(c6661);
            if (c19339 == null) {
                c19339 = new C19339(c6661);
                atomicReferenceFieldUpdater2.set(c6661, c19339);
            }
            do {
                atomicReferenceFieldUpdater = f22198;
                if (atomicReferenceFieldUpdater.compareAndSet(this, objM18601, c19339)) {
                    c6661.m18594();
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == objM18601);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18592(C6661 c6661) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22200;
            C6661 c6662 = (C6661) atomicReferenceFieldUpdater.get(c6661);
            if (m18601() != c6661) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c6661, c6662, this)) {
                    if (mo18598()) {
                        c6661.m18594();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c6661) == c6662);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final C6661 m18594() {
        C6661 c6661;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f22200;
            C6661 c6662 = (C6661) atomicReferenceFieldUpdater2.get(this);
            c6661 = c6662;
            while (true) {
                C6661 c6663 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f22198;
                    obj = atomicReferenceFieldUpdater.get(c6661);
                    if (obj == this) {
                        if (c6662 != c6661) {
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, c6662, c6661)) {
                                if (atomicReferenceFieldUpdater2.get(this) != c6662) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (mo18598()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof AbstractC8152) {
                        ((AbstractC8152) obj).mo22059(c6661);
                        break;
                    }
                    if (!(obj instanceof C19339)) {
                        C15243.m36587(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        c6663 = c6661;
                        c6661 = (C6661) obj;
                    } else {
                        if (c6663 != null) {
                            break;
                        }
                        c6661 = (C6661) atomicReferenceFieldUpdater2.get(c6661);
                    }
                }
                C6661 c6664 = ((C19339) obj).f62458;
                while (!atomicReferenceFieldUpdater.compareAndSet(c6663, c6661, c6664)) {
                    if (atomicReferenceFieldUpdater.get(c6663) != c6661) {
                        break;
                    }
                }
                c6661 = c6663;
            }
        }
        return c6661;
    }

    public String toString() {
        return new C12626(this) + '@' + C21892.m49586(this);
    }
}
