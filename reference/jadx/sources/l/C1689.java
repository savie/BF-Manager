package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: W9N5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1689 extends AbstractC5923 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f6695;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f6696;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f6697;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f6698;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicReferenceFieldUpdater f6699;

    @Override // l.AbstractC5923
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo5608(AbstractC14016 abstractC14016, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6699;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC14016, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC14016) == obj);
        return false;
    }

    @Override // l.AbstractC5923
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo5609(AbstractC14016 abstractC14016, C4842 c4842, C4842 c4843) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6697;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC14016, c4842, c4843)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC14016) == c4842);
        return false;
    }

    @Override // l.AbstractC5923
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo5610(AbstractC14016 abstractC14016, C14391 c14391, C14391 c14392) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6696;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC14016, c14391, c14392)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC14016) == c14391);
        return false;
    }

    public C1689(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f6695 = atomicReferenceFieldUpdater;
        this.f6698 = atomicReferenceFieldUpdater2;
        this.f6697 = atomicReferenceFieldUpdater3;
        this.f6696 = atomicReferenceFieldUpdater4;
        this.f6699 = atomicReferenceFieldUpdater5;
    }

    @Override // l.AbstractC5923
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5606(C4842 c4842, Thread thread) {
        this.f6695.lazySet(c4842, thread);
    }

    @Override // l.AbstractC5923
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5607(C4842 c4842, C4842 c4843) {
        this.f6698.lazySet(c4842, c4843);
    }
}
