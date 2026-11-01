package l;

import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۛ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5752 extends AbstractC22686 implements InterfaceC6124 {
    public final AbstractC5752 h;
    public final AbstractC5752 i;
    public final int j;
    public final AbstractC5752 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f77961l;
    public int m;
    public InterfaceC20693 n;
    public boolean o;
    public final boolean p;
    public Runnable q;
    public boolean r;

    public abstract InterfaceC8616 k0(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693, boolean z, IntFunction intFunction);

    public abstract boolean l0(InterfaceC20693 interfaceC20693, InterfaceC19171 interfaceC19171);

    public abstract EnumC22761 m0();

    public abstract boolean p0();

    public abstract InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171);

    public abstract InterfaceC20693 t0(AbstractC5752 abstractC5752, Supplier supplier, boolean z);

    public AbstractC5752(AbstractC5752 abstractC5752, int i) {
        if (abstractC5752.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC5752.o = true;
        abstractC5752.k = this;
        this.i = abstractC5752;
        this.j = EnumC2970.h & i;
        this.m = EnumC2970.l(i, abstractC5752.m);
        AbstractC5752 abstractC5753 = abstractC5752.h;
        this.h = abstractC5753;
        if (p0()) {
            abstractC5753.p = true;
        }
        this.f77961l = abstractC5752.f77961l + 1;
    }

    public AbstractC5752(InterfaceC20693 interfaceC20693, int i, boolean z) {
        this.i = null;
        this.n = interfaceC20693;
        this.h = this;
        int i2 = EnumC2970.g & i;
        this.j = i2;
        this.m = (~(i2 << 1)) & EnumC2970.f77959l;
        this.f77961l = 0;
        this.r = z;
    }

    public final Object i0(InterfaceC3647 interfaceC3647) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        if (this.h.r) {
            return interfaceC3647.e(this, r0(interfaceC3647.j()));
        }
        return interfaceC3647.b(this, r0(interfaceC3647.j()));
    }

    public final InterfaceC8616 j0(IntFunction intFunction) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        if (this.h.r && this.i != null && p0()) {
            this.f77961l = 0;
            AbstractC5752 abstractC5752 = this.i;
            return n0(abstractC5752, abstractC5752.r0(0), intFunction);
        }
        return Q(r0(0), true, intFunction);
    }

    public final InterfaceC20693 s0() {
        AbstractC5752 abstractC5752 = this.h;
        if (this != abstractC5752) {
            throw new IllegalStateException();
        }
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        InterfaceC20693 interfaceC20693 = abstractC5752.n;
        if (interfaceC20693 != null) {
            abstractC5752.n = null;
            return interfaceC20693;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    public final InterfaceC6124 sequential() {
        this.h.r = false;
        return this;
    }

    public final InterfaceC6124 parallel() {
        this.h.r = true;
        return this;
    }

    @Override // l.InterfaceC6124, java.lang.AutoCloseable
    public final void close() {
        this.o = true;
        this.n = null;
        AbstractC5752 abstractC5752 = this.h;
        Runnable runnable = abstractC5752.q;
        if (runnable != null) {
            abstractC5752.q = null;
            runnable.run();
        }
    }

    @Override // l.InterfaceC6124
    public final InterfaceC6124 onClose(Runnable runnable) {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        C13638.requireNonNull(runnable);
        AbstractC5752 abstractC5752 = this.h;
        Runnable runnable2 = abstractC5752.q;
        if (runnable2 != null) {
            runnable = new RunnableC15975(runnable2, runnable);
        }
        abstractC5752.q = runnable;
        return this;
    }

    public InterfaceC20693 spliterator() {
        if (this.o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.o = true;
        AbstractC5752 abstractC5752 = this.h;
        if (this == abstractC5752) {
            InterfaceC20693 interfaceC20693 = abstractC5752.n;
            if (interfaceC20693 != null) {
                abstractC5752.n = null;
                return interfaceC20693;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return t0(this, new C19158(0, this), abstractC5752.r);
    }

    @Override // l.AbstractC22686
    public final InterfaceC8616 Q(InterfaceC20693 interfaceC20693, boolean z, IntFunction intFunction) {
        if (this.h.r) {
            return k0(this, interfaceC20693, z, intFunction);
        }
        InterfaceC23280 interfaceC23280C0 = c0(R(interfaceC20693), intFunction);
        f0(interfaceC20693, interfaceC23280C0);
        return interfaceC23280C0.build();
    }

    @Override // l.InterfaceC6124
    public final boolean isParallel() {
        return this.h.r;
    }

    public final InterfaceC20693 r0(int i) {
        int i2;
        int i3;
        AbstractC5752 abstractC5752 = this.h;
        InterfaceC20693 interfaceC20693O0 = abstractC5752.n;
        if (interfaceC20693O0 != null) {
            abstractC5752.n = null;
            if (abstractC5752.r && abstractC5752.p) {
                AbstractC5752 abstractC5753 = abstractC5752.k;
                int i4 = 1;
                while (abstractC5752 != this) {
                    int i5 = abstractC5753.j;
                    if (abstractC5753.p0()) {
                        if (EnumC2970.SHORT_CIRCUIT.s(i5)) {
                            i5 &= ~EnumC2970.u;
                        }
                        interfaceC20693O0 = abstractC5753.o0(abstractC5752, interfaceC20693O0);
                        if (interfaceC20693O0.hasCharacteristics(64)) {
                            i2 = (~EnumC2970.t) & i5;
                            i3 = EnumC2970.s;
                        } else {
                            i2 = (~EnumC2970.s) & i5;
                            i3 = EnumC2970.t;
                        }
                        i5 = i3 | i2;
                        i4 = 0;
                    }
                    abstractC5753.f77961l = i4;
                    abstractC5753.m = EnumC2970.l(i5, abstractC5752.m);
                    i4++;
                    AbstractC5752 abstractC5754 = abstractC5753;
                    abstractC5753 = abstractC5753.k;
                    abstractC5752 = abstractC5754;
                }
            }
            if (i != 0) {
                this.m = EnumC2970.l(i, this.m);
            }
            return interfaceC20693O0;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // l.AbstractC22686
    public final long R(InterfaceC20693 interfaceC20693) {
        if (EnumC2970.SIZED.s(this.m)) {
            return interfaceC20693.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // l.AbstractC22686
    public final InterfaceC19171 f0(InterfaceC20693 interfaceC20693, InterfaceC19171 interfaceC19171) {
        M(interfaceC20693, g0((InterfaceC19171) C13638.requireNonNull(interfaceC19171)));
        return interfaceC19171;
    }

    @Override // l.AbstractC22686
    public final void M(InterfaceC20693 interfaceC20693, InterfaceC19171 interfaceC19171) {
        C13638.requireNonNull(interfaceC19171);
        if (!EnumC2970.SHORT_CIRCUIT.s(this.m)) {
            interfaceC19171.c(interfaceC20693.getExactSizeIfKnown());
            interfaceC20693.forEachRemaining(interfaceC19171);
            interfaceC19171.end();
            return;
        }
        N(interfaceC20693, interfaceC19171);
    }

    @Override // l.AbstractC22686
    public final boolean N(InterfaceC20693 interfaceC20693, InterfaceC19171 interfaceC19171) {
        AbstractC5752 abstractC5752 = this;
        while (abstractC5752.f77961l > 0) {
            abstractC5752 = abstractC5752.i;
        }
        interfaceC19171.c(interfaceC20693.getExactSizeIfKnown());
        boolean zL0 = abstractC5752.l0(interfaceC20693, interfaceC19171);
        interfaceC19171.end();
        return zL0;
    }

    @Override // l.AbstractC22686
    public final InterfaceC19171 g0(InterfaceC19171 interfaceC19171) {
        C13638.requireNonNull(interfaceC19171);
        for (AbstractC5752 abstractC5752 = this; abstractC5752.f77961l > 0; abstractC5752 = abstractC5752.i) {
            interfaceC19171 = abstractC5752.q0(abstractC5752.i.m, interfaceC19171);
        }
        return interfaceC19171;
    }

    @Override // l.AbstractC22686
    public final InterfaceC20693 h0(InterfaceC20693 interfaceC20693) {
        return this.f77961l == 0 ? interfaceC20693 : t0(this, new C19158(1, interfaceC20693), this.h.r);
    }

    public InterfaceC8616 n0(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public InterfaceC20693 o0(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        return n0(abstractC5752, interfaceC20693, new C22935(13)).spliterator();
    }
}
