package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۟ۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1ANI */
/* JADX INFO: loaded from: classes4.dex */
public final class C7649 extends AbstractC0937 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f25215 = new AtomicReference(null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20863() {
        while (true) {
            AtomicReference atomicReference = this.f25215;
            Object obj = atomicReference.get();
            if (obj == null || obj == C0191.f1293) {
                return;
            }
            if (obj == C0191.f1292) {
                C7406 c7406 = C0191.f1293;
                while (!atomicReference.compareAndSet(obj, c7406)) {
                    if (atomicReference.get() != obj) {
                    }
                }
                return;
            } else {
                C7406 c7407 = C0191.f1292;
                do {
                    if (atomicReference.compareAndSet(obj, c7407)) {
                        ((C24919) obj).mo8188(C11471.f36082);
                        return;
                    }
                } while (atomicReference.get() == obj);
            }
        }
    }

    @Override // l.AbstractC0937
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3739(Object obj) {
        AtomicReference atomicReference = this.f25215;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(C0191.f1292);
        return true;
    }

    @Override // l.AbstractC0937
    /* JADX INFO: renamed from: ᩷ */
    public final void mo3740(Object obj) {
        this.f25215.set(null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m20864() {
        Object andSet = this.f25215.getAndSet(C0191.f1292);
        C15243.m36586(andSet);
        return andSet == C0191.f1293;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m20862(InterfaceC4825 interfaceC4825) {
        C24919 c24919 = new C24919(C13808.m33718(interfaceC4825), 1);
        c24919.m55514();
        C7406 c7406 = C0191.f1292;
        while (true) {
            AtomicReference atomicReference = this.f25215;
            if (atomicReference.compareAndSet(c7406, c24919)) {
                break;
            }
            if (atomicReference.get() != c7406) {
                c24919.mo8188(C11471.f36082);
                break;
            }
        }
        Object objM55515 = c24919.m55515();
        return objM55515 == EnumC16757.COROUTINE_SUSPENDED ? objM55515 : C11471.f36082;
    }
}
