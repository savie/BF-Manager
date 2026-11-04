package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ᩴ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: MAWV */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20085 extends AbstractC8152 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f64553 = AtomicReferenceFieldUpdater.newUpdater(AbstractC20085.class, Object.class, "_consensus$volatile");
    public volatile /* synthetic */ Object _consensus$volatile = C23069.f74837;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo46212(Object obj, Object obj2);

    /* JADX INFO: renamed from: ᩷ */
    public abstract C7406 mo45710(Object obj);

    @Override // l.AbstractC8152
    /* JADX INFO: renamed from: ۙ */
    public final Object mo22059(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f64553;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        C7406 c7406 = C23069.f74837;
        if (obj2 == c7406) {
            C7406 c7406Mo45710 = mo45710(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == c7406) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c7406, c7406Mo45710)) {
                    if (atomicReferenceFieldUpdater.get(this) != c7406) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = c7406Mo45710;
            }
        }
        mo46212(obj, obj2);
        return obj2;
    }
}
