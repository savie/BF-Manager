package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۙܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4986 extends AbstractC20692 {
    public final AbstractC15470 j;
    public final IntFunction k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f82075l;
    public final long m;
    public long n;
    public volatile boolean o;

    @Override // l.AbstractC20692
    public final void f() {
        this.i = true;
        if (this.o) {
            d(AbstractC13956.P(this.j.m0()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    @Override // l.AbstractC19902, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C4986 c4986;
        InterfaceC13409 interfaceC13409L;
        InterfaceC13409 interfaceC13409J;
        long jMin;
        AbstractC19902 abstractC19902 = this.d;
        if (abstractC19902 != null) {
            this.n = ((C4986) abstractC19902).n + ((C4986) this.e).n;
            if (this.i) {
                this.n = 0L;
            } else {
                if (this.n != 0) {
                    if (((C4986) this.d).n == 0) {
                        interfaceC13409L = (InterfaceC13409) ((C4986) this.e).i();
                    } else {
                        interfaceC13409L = AbstractC13956.L(this.j.m0(), (InterfaceC13409) ((C4986) this.d).i(), (InterfaceC13409) ((C4986) this.e).i());
                    }
                }
                interfaceC13409J = interfaceC13409L;
                if (b()) {
                    if (this.m >= 0) {
                        jMin = Math.min(interfaceC13409J.count(), this.f82075l + this.m);
                    } else {
                        jMin = this.n;
                    }
                    interfaceC13409J = interfaceC13409J.j(this.f82075l, jMin, this.k);
                }
                d(interfaceC13409J);
                this.o = true;
            }
            interfaceC13409L = AbstractC13956.P(this.j.m0());
            interfaceC13409J = interfaceC13409L;
            if (b()) {
                if (this.m >= 0) {
                    jMin = Math.min(interfaceC13409J.count(), this.f82075l + this.m);
                } else {
                    jMin = this.n;
                }
                interfaceC13409J = interfaceC13409J.j(this.f82075l, jMin, this.k);
            }
            d(interfaceC13409J);
            this.o = true;
        }
        if (this.m >= 0 && !b()) {
            long j = this.f82075l + this.m;
            long j2 = this.o ? this.n : j(j);
            if (j2 >= j) {
                g();
            } else {
                C4986 c4987 = (C4986) ((AbstractC19902) getCompleter());
                Object obj = this;
                while (true) {
                    if (c4987 == null) {
                        if (j2 >= j) {
                            break;
                        }
                    } else {
                        if (obj == c4987.e && (c4986 = (C4986) c4987.d) != null) {
                            long j3 = c4986.j(j) + j2;
                            if (j3 >= j) {
                                break;
                            } else {
                                j2 = j3;
                            }
                        }
                        obj = c4987;
                        c4987 = (C4986) ((AbstractC19902) c4987.getCompleter());
                    }
                }
                g();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public C4986(AbstractC15470 abstractC15470, AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, IntFunction intFunction, long j, long j2) {
        super(abstractC13956, interfaceC8409);
        this.j = abstractC15470;
        this.k = intFunction;
        this.f82075l = j;
        this.m = j2;
    }

    public C4986(C4986 c4986, InterfaceC8409 interfaceC8409) {
        super(c4986, interfaceC8409);
        this.j = c4986.j;
        this.k = c4986.k;
        this.f82075l = c4986.f82075l;
        this.m = c4986.m;
    }

    @Override // l.AbstractC19902
    public final AbstractC19902 c(InterfaceC8409 interfaceC8409) {
        return new C4986(this, interfaceC8409);
    }

    @Override // l.AbstractC20692
    public final Object h() {
        return AbstractC13956.P(this.j.m0());
    }

    @Override // l.AbstractC19902
    public final Object a() {
        if (b()) {
            EnumC21614 enumC21614 = EnumC21614.SIZED;
            AbstractC15470 abstractC15470 = this.j;
            int i = abstractC15470.j;
            int i2 = enumC21614.e;
            InterfaceC4262 interfaceC4262C0 = this.j.c0((i & i2) == i2 ? abstractC15470.R(this.b) : -1L, this.k);
            InterfaceC15143 interfaceC15143Q0 = this.j.q0(((AbstractC15470) this.a).m, interfaceC4262C0);
            AbstractC13956 abstractC13956 = this.a;
            abstractC13956.N(this.b, abstractC13956.g0(interfaceC15143Q0));
            return interfaceC4262C0.build();
        }
        InterfaceC4262 interfaceC4262C1 = this.j.c0(-1L, this.k);
        if (this.f82075l == 0) {
            InterfaceC15143 interfaceC15143Q1 = this.j.q0(((AbstractC15470) this.a).m, interfaceC4262C1);
            AbstractC13956 abstractC13957 = this.a;
            abstractC13957.N(this.b, abstractC13957.g0(interfaceC15143Q1));
        } else {
            this.a.f0(this.b, interfaceC4262C1);
        }
        InterfaceC13409 interfaceC13409Build = interfaceC4262C1.build();
        this.n = interfaceC13409Build.count();
        this.o = true;
        this.b = null;
        return interfaceC13409Build;
    }

    public final long j(long j) {
        if (this.o) {
            return this.n;
        }
        C4986 c4986 = (C4986) this.d;
        C4986 c4987 = (C4986) this.e;
        if (c4986 == null || c4987 == null) {
            return this.n;
        }
        long j2 = c4986.j(j);
        return j2 >= j ? j2 : c4987.j(j) + j2;
    }
}
