package l;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩵ܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20692 extends AbstractC19902 {
    public final AtomicReference h;
    public volatile boolean i;

    public abstract Object h();

    public AbstractC20692(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409) {
        super(abstractC13956, interfaceC8409);
        this.h = new AtomicReference(null);
    }

    public AbstractC20692(AbstractC20692 abstractC20692, InterfaceC8409 interfaceC8409) {
        super(abstractC20692, interfaceC8409);
        this.h = abstractC20692.h;
    }

    @Override // l.AbstractC19902, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objH;
        InterfaceC8409 interfaceC8409TrySplit;
        InterfaceC8409 interfaceC8409 = this.b;
        long jEstimateSize = interfaceC8409.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = AbstractC19902.e(jEstimateSize);
            this.c = jE;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC20692 abstractC20692 = this;
        while (true) {
            objH = atomicReference.get();
            if (objH != null) {
                break;
            }
            boolean z2 = abstractC20692.i;
            if (!z2) {
                CountedCompleter<?> completer = abstractC20692.getCompleter();
                while (true) {
                    AbstractC20692 abstractC20693 = (AbstractC20692) ((AbstractC19902) completer);
                    if (z2 || abstractC20693 == null) {
                        break;
                    }
                    z2 = abstractC20693.i;
                    completer = abstractC20693.getCompleter();
                }
            }
            if (z2) {
                objH = abstractC20692.h();
                break;
            }
            if (jEstimateSize <= jE || (interfaceC8409TrySplit = interfaceC8409.trySplit()) == null) {
                objH = abstractC20692.a();
                break;
            }
            AbstractC20692 abstractC20694 = (AbstractC20692) abstractC20692.c(interfaceC8409TrySplit);
            abstractC20692.d = abstractC20694;
            AbstractC20692 abstractC20695 = (AbstractC20692) abstractC20692.c(interfaceC8409);
            abstractC20692.e = abstractC20695;
            abstractC20692.setPendingCount(1);
            if (z) {
                interfaceC8409 = interfaceC8409TrySplit;
                abstractC20692 = abstractC20694;
                abstractC20694 = abstractC20695;
            } else {
                abstractC20692 = abstractC20695;
            }
            z = !z;
            abstractC20694.fork();
            jEstimateSize = interfaceC8409.estimateSize();
        }
        abstractC20692.d(objH);
        abstractC20692.tryComplete();
    }

    @Override // l.AbstractC19902
    public final void d(Object obj) {
        if (!b()) {
            this.f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // l.AbstractC19902, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return i();
    }

    public final Object i() {
        if (b()) {
            Object obj = this.h.get();
            return obj == null ? h() : obj;
        }
        return this.f;
    }

    public void f() {
        this.i = true;
    }

    public final void g() {
        AbstractC20692 abstractC20692 = this;
        for (AbstractC20692 abstractC20693 = (AbstractC20692) ((AbstractC19902) getCompleter()); abstractC20693 != null; abstractC20693 = (AbstractC20692) ((AbstractC19902) abstractC20693.getCompleter())) {
            if (abstractC20693.d == abstractC20692) {
                AbstractC20692 abstractC20694 = (AbstractC20692) abstractC20693.e;
                if (!abstractC20694.i) {
                    abstractC20694.f();
                }
            }
            abstractC20692 = abstractC20693;
        }
    }
}
