package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֨ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes3.dex */
public final class C1237 extends AbstractC17114 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f4487;

    public C1237(AtomicReference atomicReference) {
        this.f4487 = atomicReference;
    }

    @Override // l.AbstractC17114
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4472(Object obj) {
        AbstractC17114 abstractC17114 = (AbstractC17114) this.f4487.get();
        if (abstractC17114 == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC17114.mo4472(obj);
    }

    @Override // l.AbstractC17114
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4471() {
        AbstractC17114 abstractC17114 = (AbstractC17114) this.f4487.getAndSet(null);
        if (abstractC17114 != null) {
            abstractC17114.mo4471();
        }
    }
}
