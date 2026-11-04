package l;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۟ۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7598 extends AbstractC20692 {
    public final C10205 j;
    public final boolean k;

    public C7598(C10205 c10205, boolean z, AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        super(abstractC15470, interfaceC8409);
        this.k = z;
        this.j = c10205;
    }

    public C7598(C7598 c7598, InterfaceC8409 interfaceC8409) {
        super(c7598, interfaceC8409);
        this.k = c7598.k;
        this.j = c7598.j;
    }

    @Override // l.AbstractC19902
    public final AbstractC19902 c(InterfaceC8409 interfaceC8409) {
        return new C7598(this, interfaceC8409);
    }

    @Override // l.AbstractC20692
    public final Object h() {
        return this.j.b;
    }

    @Override // l.AbstractC19902
    public final Object a() {
        AbstractC13956 abstractC13956 = this.a;
        InterfaceC1720 interfaceC1720 = (InterfaceC1720) this.j.d.get();
        abstractC13956.f0(this.b, interfaceC1720);
        Object obj = interfaceC1720.get();
        if (this.k) {
            if (obj != null) {
                AbstractC19902 abstractC19902 = this;
                while (abstractC19902 != null) {
                    AbstractC19902 abstractC19903 = (AbstractC19902) abstractC19902.getCompleter();
                    if (abstractC19903 != null && abstractC19903.d != abstractC19902) {
                        g();
                        return obj;
                    }
                    abstractC19902 = abstractC19903;
                }
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // l.AbstractC19902, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            C7598 c7598 = (C7598) this.d;
            C7598 c7599 = null;
            while (c7598 != c7599) {
                Object objI = c7598.i();
                if (objI != null && this.j.c.test(objI)) {
                    d(objI);
                    AbstractC19902 abstractC19902 = this;
                    while (abstractC19902 != null) {
                        AbstractC19902 abstractC19903 = (AbstractC19902) abstractC19902.getCompleter();
                        if (abstractC19903 != null && abstractC19903.d != abstractC19902) {
                            g();
                            break;
                        }
                        abstractC19902 = abstractC19903;
                    }
                    AtomicReference atomicReference = this.h;
                    while (!atomicReference.compareAndSet(null, objI) && atomicReference.get() == null) {
                    }
                    break;
                }
                c7599 = c7598;
                c7598 = (C7598) this.e;
            }
        }
        super.onCompletion(countedCompleter);
    }
}
