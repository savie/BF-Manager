package l;

import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܳܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15470 extends AbstractC13956 implements InterfaceC19924 {
    public final AbstractC15470 h;
    public final AbstractC15470 i;
    public final int j;
    public final AbstractC15470 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f82078l;
    public int m;
    public InterfaceC8409 n;
    public boolean o;
    public final boolean p;
    public Runnable q;
    public boolean r;

    public abstract InterfaceC13409 k0(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409, boolean z, IntFunction intFunction);

    public abstract boolean l0(InterfaceC8409 interfaceC8409, InterfaceC15143 interfaceC15143);

    public abstract EnumC14154 m0();

    public abstract boolean p0();

    public abstract InterfaceC15143 q0(int i, InterfaceC15143 interfaceC15143);

    public abstract InterfaceC8409 t0(AbstractC15470 abstractC15470, Supplier supplier, boolean z);

    public AbstractC15470(InterfaceC8409 interfaceC8409, int i, boolean z) {
        this.i = null;
        this.n = interfaceC8409;
        this.h = this;
        int i2 = EnumC21614.g & i;
        this.j = i2;
        this.m = (~(i2 << 1)) & EnumC21614.f82082l;
        this.f82078l = 0;
        this.r = z;
    }

    public AbstractC15470(AbstractC15470 abstractC15470, int i) {
        if (abstractC15470.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC15470.o = true;
        abstractC15470.k = this;
        this.i = abstractC15470;
        this.j = EnumC21614.h & i;
        this.m = EnumC21614.i(i, abstractC15470.m);
        AbstractC15470 abstractC15471 = abstractC15470.h;
        this.h = abstractC15471;
        if (p0()) {
            abstractC15471.p = true;
        }
        this.f82078l = abstractC15470.f82078l + 1;
    }

    public final Object i0(InterfaceC8605 interfaceC8605) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        if (this.h.r) {
            return interfaceC8605.e(this, r0(interfaceC8605.j()));
        }
        return interfaceC8605.b(this, r0(interfaceC8605.j()));
    }

    public final InterfaceC13409 j0(IntFunction intFunction) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        if (this.h.r && this.i != null && p0()) {
            this.f82078l = 0;
            AbstractC15470 abstractC15470 = this.i;
            return n0(abstractC15470, abstractC15470.r0(0), intFunction);
        }
        return Q(r0(0), true, intFunction);
    }

    public final InterfaceC8409 s0() {
        AbstractC15470 abstractC15470 = this.h;
        if (this != abstractC15470) {
            throw new IllegalStateException();
        }
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        InterfaceC8409 interfaceC8409 = abstractC15470.n;
        if (interfaceC8409 != null) {
            abstractC15470.n = null;
            return interfaceC8409;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    public final InterfaceC19924 sequential() {
        this.h.r = false;
        return this;
    }

    public final InterfaceC19924 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // l.InterfaceC19924, java.lang.AutoCloseable
    public final void close() {
        this.o = true;
        this.n = null;
        AbstractC15470 abstractC15470 = this.h;
        Runnable runnable = abstractC15470.q;
        if (runnable != null) {
            abstractC15470.q = null;
            runnable.run();
        }
    }

    @Override // l.InterfaceC19924
    public final InterfaceC19924 onClose(Runnable runnable) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        C17359.requireNonNull(runnable);
        AbstractC15470 abstractC15470 = this.h;
        Runnable runnable2 = abstractC15470.q;
        if (runnable2 != null) {
            runnable = new RunnableC25256(runnable2, runnable);
        }
        abstractC15470.q = runnable;
        return this;
    }

    public InterfaceC8409 spliterator() {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        AbstractC15470 abstractC15470 = this.h;
        if (this == abstractC15470) {
            InterfaceC8409 interfaceC8409 = abstractC15470.n;
            if (interfaceC8409 != null) {
                abstractC15470.n = null;
                return interfaceC8409;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return t0(this, new C1279(0, this), abstractC15470.r);
    }

    @Override // l.AbstractC13956
    public final InterfaceC13409 Q(InterfaceC8409 interfaceC8409, boolean z, IntFunction intFunction) {
        if (this.h.r) {
            return k0(this, interfaceC8409, z, intFunction);
        }
        InterfaceC4262 interfaceC4262C0 = c0(R(interfaceC8409), intFunction);
        f0(interfaceC8409, interfaceC4262C0);
        return interfaceC4262C0.build();
    }

    @Override // l.InterfaceC19924
    public final boolean isParallel() {
        return this.h.r;
    }

    public final InterfaceC8409 r0(int i) {
        int i2;
        int i3;
        AbstractC15470 abstractC15470 = this.h;
        InterfaceC8409 interfaceC8409O0 = abstractC15470.n;
        if (interfaceC8409O0 != null) {
            abstractC15470.n = null;
            if (abstractC15470.r && abstractC15470.p) {
                AbstractC15470 abstractC15471 = abstractC15470.k;
                int i4 = 1;
                while (abstractC15470 != this) {
                    int i5 = abstractC15471.j;
                    if (abstractC15471.p0()) {
                        if (EnumC21614.SHORT_CIRCUIT.p(i5)) {
                            i5 &= ~EnumC21614.u;
                        }
                        interfaceC8409O0 = abstractC15471.o0(abstractC15470, interfaceC8409O0);
                        if (interfaceC8409O0.hasCharacteristics(64)) {
                            i2 = (~EnumC21614.t) & i5;
                            i3 = EnumC21614.s;
                        } else {
                            i2 = (~EnumC21614.s) & i5;
                            i3 = EnumC21614.t;
                        }
                        i5 = i3 | i2;
                        i4 = 0;
                    }
                    abstractC15471.f82078l = i4;
                    abstractC15471.m = EnumC21614.i(i5, abstractC15470.m);
                    i4++;
                    AbstractC15470 abstractC15472 = abstractC15471;
                    abstractC15471 = abstractC15471.k;
                    abstractC15470 = abstractC15472;
                }
            }
            if (i != 0) {
                this.m = EnumC21614.i(i, this.m);
            }
            return interfaceC8409O0;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // l.AbstractC13956
    public final long R(InterfaceC8409 interfaceC8409) {
        if (EnumC21614.SIZED.p(this.m)) {
            return interfaceC8409.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // l.AbstractC13956
    public final InterfaceC15143 f0(InterfaceC8409 interfaceC8409, InterfaceC15143 interfaceC15143) {
        M(interfaceC8409, g0((InterfaceC15143) C17359.requireNonNull(interfaceC15143)));
        return interfaceC15143;
    }

    @Override // l.AbstractC13956
    public final void M(InterfaceC8409 interfaceC8409, InterfaceC15143 interfaceC15143) {
        C17359.requireNonNull(interfaceC15143);
        if (!EnumC21614.SHORT_CIRCUIT.p(this.m)) {
            interfaceC15143.c(interfaceC8409.getExactSizeIfKnown());
            interfaceC8409.forEachRemaining(interfaceC15143);
            interfaceC15143.end();
            return;
        }
        N(interfaceC8409, interfaceC15143);
    }

    @Override // l.AbstractC13956
    public final boolean N(InterfaceC8409 interfaceC8409, InterfaceC15143 interfaceC15143) {
        AbstractC15470 abstractC15470 = this;
        while (abstractC15470.f82078l > 0) {
            abstractC15470 = abstractC15470.i;
        }
        interfaceC15143.c(interfaceC8409.getExactSizeIfKnown());
        boolean zL0 = abstractC15470.l0(interfaceC8409, interfaceC15143);
        interfaceC15143.end();
        return zL0;
    }

    @Override // l.AbstractC13956
    public final InterfaceC15143 g0(InterfaceC15143 interfaceC15143) {
        C17359.requireNonNull(interfaceC15143);
        for (AbstractC15470 abstractC15470 = this; abstractC15470.f82078l > 0; abstractC15470 = abstractC15470.i) {
            interfaceC15143 = abstractC15470.q0(abstractC15470.i.m, interfaceC15143);
        }
        return interfaceC15143;
    }

    @Override // l.AbstractC13956
    public final InterfaceC8409 h0(InterfaceC8409 interfaceC8409) {
        return this.f82078l == 0 ? interfaceC8409 : t0(this, new C1279(1, interfaceC8409), this.h.r);
    }

    public InterfaceC13409 n0(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public InterfaceC8409 o0(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        return n0(abstractC15470, interfaceC8409, new C14435(13)).spliterator();
    }
}
