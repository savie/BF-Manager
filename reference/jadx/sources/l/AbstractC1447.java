package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.֨᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: TAXM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1447 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C5681 f5917;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4269 f5918;

    @Override // l.AbstractC9542
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5037(Object obj, Object obj2) {
        C4269 c4269 = (C4269) obj;
        boolean z = obj2 == null;
        C4269 c42610 = this.f5918;
        C4269 c42611 = z ? c42610 : this.f5917;
        if (c42611 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4269.f15404;
            while (!atomicReferenceFieldUpdater.compareAndSet(c4269, this, c42611)) {
                if (atomicReferenceFieldUpdater.get(c4269) != this) {
                    return;
                }
            }
            if (z) {
                C5681 c5681 = this.f5917;
                C13465.m32962(c5681);
                c42610.m12062(c5681);
            }
        }
    }

    public AbstractC1447(C4269 c4269) {
        this.f5918 = c4269;
    }
}
