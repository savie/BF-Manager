package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩻᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes.dex */
public final class C23981 extends AbstractC6462 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f77736;

    public C23981(AtomicReference atomicReference) {
        this.f77736 = atomicReference;
    }

    @Override // l.AbstractC6462
    /* JADX INFO: renamed from: ۙ */
    public final void mo17659(Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) this.f77736.get();
        if (abstractC6462 == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC6462.mo17659(obj);
    }

    @Override // l.AbstractC6462
    /* JADX INFO: renamed from: ۙ */
    public final void mo17658() {
        AbstractC6462 abstractC6462 = (AbstractC6462) this.f77736.getAndSet(null);
        if (abstractC6462 != null) {
            abstractC6462.mo17658();
        }
    }
}
