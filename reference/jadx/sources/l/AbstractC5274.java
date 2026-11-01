package l;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۚۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5274 extends AbstractC17269 {
    public final AtomicReference h;
    public volatile boolean i;

    public abstract Object h();

    public AbstractC5274(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693) {
        super(abstractC22686, interfaceC20693);
        this.h = new AtomicReference(null);
    }

    public AbstractC5274(AbstractC5274 abstractC5274, InterfaceC20693 interfaceC20693) {
        super(abstractC5274, interfaceC20693);
        this.h = abstractC5274.h;
    }

    @Override // l.AbstractC17269, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objH;
        InterfaceC20693 interfaceC20693TrySplit;
        InterfaceC20693 interfaceC20693 = this.b;
        long jEstimateSize = interfaceC20693.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = AbstractC17269.e(jEstimateSize);
            this.c = jE;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC5274 abstractC5274 = this;
        while (true) {
            objH = atomicReference.get();
            if (objH != null) {
                break;
            }
            boolean z2 = abstractC5274.i;
            if (!z2) {
                CountedCompleter<?> completer = abstractC5274.getCompleter();
                while (true) {
                    AbstractC5274 abstractC5275 = (AbstractC5274) ((AbstractC17269) completer);
                    if (z2 || abstractC5275 == null) {
                        break;
                    }
                    z2 = abstractC5275.i;
                    completer = abstractC5275.getCompleter();
                }
            }
            if (z2) {
                objH = abstractC5274.h();
                break;
            }
            if (jEstimateSize <= jE || (interfaceC20693TrySplit = interfaceC20693.trySplit()) == null) {
                objH = abstractC5274.a();
                break;
            }
            AbstractC5274 abstractC5276 = (AbstractC5274) abstractC5274.c(interfaceC20693TrySplit);
            abstractC5274.d = abstractC5276;
            AbstractC5274 abstractC5277 = (AbstractC5274) abstractC5274.c(interfaceC20693);
            abstractC5274.e = abstractC5277;
            abstractC5274.setPendingCount(1);
            if (z) {
                interfaceC20693 = interfaceC20693TrySplit;
                abstractC5274 = abstractC5276;
                abstractC5276 = abstractC5277;
            } else {
                abstractC5274 = abstractC5277;
            }
            z = !z;
            abstractC5276.fork();
            jEstimateSize = interfaceC20693.estimateSize();
        }
        abstractC5274.d(objH);
        abstractC5274.tryComplete();
    }

    @Override // l.AbstractC17269
    public final void d(Object obj) {
        if (!b()) {
            this.f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // l.AbstractC17269, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
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
        AbstractC5274 abstractC5274 = this;
        for (AbstractC5274 abstractC5275 = (AbstractC5274) ((AbstractC17269) getCompleter()); abstractC5275 != null; abstractC5275 = (AbstractC5274) ((AbstractC17269) abstractC5275.getCompleter())) {
            if (abstractC5275.d == abstractC5274) {
                AbstractC5274 abstractC5276 = (AbstractC5274) abstractC5275.e;
                if (!abstractC5276.i) {
                    abstractC5276.f();
                }
            }
            abstractC5274 = abstractC5275;
        }
    }
}
