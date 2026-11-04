package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.۫᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: B964 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13372 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42619 = AtomicReferenceFieldUpdater.newUpdater(AbstractC13372.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42620 = AtomicReferenceFieldUpdater.newUpdater(AbstractC13372.class, Object.class, "_prev$volatile");
    public volatile /* synthetic */ Object _next$volatile;
    public volatile /* synthetic */ Object _prev$volatile;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32959(AbstractC9642 abstractC9642) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f42619;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, abstractC9642)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return false;
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract boolean mo25155();

    public AbstractC13372(C10631 c10631) {
        this._prev$volatile = c10631;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m32958(AbstractC13372 abstractC13372) {
        abstractC13372.getClass();
        return f42619.get(abstractC13372);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC13372 m32960() {
        Object obj = f42619.get(this);
        if (obj == C2931.f9595) {
            return null;
        }
        return (AbstractC13372) obj;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m32961() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractC13372 abstractC13372M32960;
        if (m32960() == null) {
            return;
        }
        while (true) {
            AbstractC13372 abstractC13372M32964 = m32964();
            while (true) {
                atomicReferenceFieldUpdater = f42620;
                if (abstractC13372M32964 == null || !abstractC13372M32964.mo25155()) {
                    break;
                } else {
                    abstractC13372M32964 = (AbstractC13372) atomicReferenceFieldUpdater.get(abstractC13372M32964);
                }
            }
            AbstractC13372 abstractC13372M32961 = m32960();
            C15243.m36586(abstractC13372M32961);
            while (abstractC13372M32961.mo25155() && (abstractC13372M32960 = abstractC13372M32961.m32960()) != null) {
                abstractC13372M32961 = abstractC13372M32960;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC13372M32961);
                AbstractC13372 abstractC13372 = ((AbstractC13372) obj) == null ? null : abstractC13372M32964;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC13372M32961, obj, abstractC13372)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(abstractC13372M32961) != obj) {
                    }
                }
            }
            if (abstractC13372M32964 != null) {
                f42619.set(abstractC13372M32964, abstractC13372M32961);
            }
            if (!abstractC13372M32961.mo25155() || abstractC13372M32961.m32960() == null) {
                if (abstractC13372M32964 == null || !abstractC13372M32964.mo25155()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC13372 m32964() {
        return (AbstractC13372) f42620.get(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32963() {
        f42620.set(this, null);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m32962() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C7406 c7406 = C2931.f9595;
        do {
            atomicReferenceFieldUpdater = f42619;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c7406)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return false;
    }
}
