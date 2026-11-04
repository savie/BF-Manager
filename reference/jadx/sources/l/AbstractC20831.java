package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.᩵᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAXM */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20831 extends AbstractC20085 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1951 f66703;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22088 f66704;

    @Override // l.AbstractC20085
    /* JADX INFO: renamed from: ۙ */
    public final void mo46212(Object obj, Object obj2) {
        C6661 c6661 = (C6661) obj;
        boolean z = obj2 == null;
        AbstractC22088 abstractC22088 = this.f66704;
        InterfaceC21146 interfaceC21146 = z ? abstractC22088 : this.f66703;
        if (interfaceC21146 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C6661.f22198;
            while (!atomicReferenceFieldUpdater.compareAndSet(c6661, this, interfaceC21146)) {
                if (atomicReferenceFieldUpdater.get(c6661) != this) {
                    return;
                }
            }
            if (z) {
                C1951 c1951 = this.f66703;
                C15243.m36586(c1951);
                abstractC22088.m18592((C6661) c1951);
            }
        }
    }

    public AbstractC20831(AbstractC22088 abstractC22088) {
        this.f66704 = abstractC22088;
    }
}
