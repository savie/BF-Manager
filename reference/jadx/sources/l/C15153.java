package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܶۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15153 extends AbstractC5274 {
    public final AbstractC5752 j;
    public final IntFunction k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f77964l;
    public final long m;
    public long n;
    public volatile boolean o;

    @Override // l.AbstractC5274
    public final void f() {
        this.i = true;
        if (this.o) {
            d(AbstractC22686.P(this.j.m0()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    @Override // l.AbstractC17269, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C15153 c15153;
        InterfaceC8616 interfaceC8616L;
        InterfaceC8616 interfaceC8616J;
        long jMin;
        AbstractC17269 abstractC17269 = this.d;
        if (abstractC17269 != null) {
            this.n = ((C15153) abstractC17269).n + ((C15153) this.e).n;
            if (this.i) {
                this.n = 0L;
            } else {
                if (this.n != 0) {
                    if (((C15153) this.d).n == 0) {
                        interfaceC8616L = (InterfaceC8616) ((C15153) this.e).i();
                    } else {
                        interfaceC8616L = AbstractC22686.L(this.j.m0(), (InterfaceC8616) ((C15153) this.d).i(), (InterfaceC8616) ((C15153) this.e).i());
                    }
                }
                interfaceC8616J = interfaceC8616L;
                if (b()) {
                    if (this.m >= 0) {
                        jMin = Math.min(interfaceC8616J.count(), this.f77964l + this.m);
                    } else {
                        jMin = this.n;
                    }
                    interfaceC8616J = interfaceC8616J.j(this.f77964l, jMin, this.k);
                }
                d(interfaceC8616J);
                this.o = true;
            }
            interfaceC8616L = AbstractC22686.P(this.j.m0());
            interfaceC8616J = interfaceC8616L;
            if (b()) {
                if (this.m >= 0) {
                    jMin = Math.min(interfaceC8616J.count(), this.f77964l + this.m);
                } else {
                    jMin = this.n;
                }
                interfaceC8616J = interfaceC8616J.j(this.f77964l, jMin, this.k);
            }
            d(interfaceC8616J);
            this.o = true;
        }
        if (this.m >= 0 && !b()) {
            long j = this.f77964l + this.m;
            long j2 = this.o ? this.n : j(j);
            if (j2 >= j) {
                g();
            } else {
                C15153 c15154 = (C15153) ((AbstractC17269) getCompleter());
                Object obj = this;
                while (true) {
                    if (c15154 == null) {
                        if (j2 >= j) {
                            break;
                        }
                    } else {
                        if (obj == c15154.e && (c15153 = (C15153) c15154.d) != null) {
                            long j3 = c15153.j(j) + j2;
                            if (j3 >= j) {
                                break;
                            } else {
                                j2 = j3;
                            }
                        }
                        obj = c15154;
                        c15154 = (C15153) ((AbstractC17269) c15154.getCompleter());
                    }
                }
                g();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public C15153(AbstractC5752 abstractC5752, AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, IntFunction intFunction, long j, long j2) {
        super(abstractC22686, interfaceC20693);
        this.j = abstractC5752;
        this.k = intFunction;
        this.f77964l = j;
        this.m = j2;
    }

    public C15153(C15153 c15153, InterfaceC20693 interfaceC20693) {
        super(c15153, interfaceC20693);
        this.j = c15153.j;
        this.k = c15153.k;
        this.f77964l = c15153.f77964l;
        this.m = c15153.m;
    }

    @Override // l.AbstractC17269
    public final AbstractC17269 c(InterfaceC20693 interfaceC20693) {
        return new C15153(this, interfaceC20693);
    }

    @Override // l.AbstractC5274
    public final Object h() {
        return AbstractC22686.P(this.j.m0());
    }

    @Override // l.AbstractC17269
    public final Object a() {
        if (b()) {
            EnumC2970 enumC2970 = EnumC2970.SIZED;
            AbstractC5752 abstractC5752 = this.j;
            int i = abstractC5752.j;
            int i2 = enumC2970.e;
            InterfaceC23280 interfaceC23280C0 = this.j.c0((i & i2) == i2 ? abstractC5752.R(this.b) : -1L, this.k);
            InterfaceC19171 interfaceC19171Q0 = this.j.q0(((AbstractC5752) this.a).m, interfaceC23280C0);
            AbstractC22686 abstractC22686 = this.a;
            abstractC22686.N(this.b, abstractC22686.g0(interfaceC19171Q0));
            return interfaceC23280C0.build();
        }
        InterfaceC23280 interfaceC23280C1 = this.j.c0(-1L, this.k);
        if (this.f77964l == 0) {
            InterfaceC19171 interfaceC19171Q1 = this.j.q0(((AbstractC5752) this.a).m, interfaceC23280C1);
            AbstractC22686 abstractC22687 = this.a;
            abstractC22687.N(this.b, abstractC22687.g0(interfaceC19171Q1));
        } else {
            this.a.f0(this.b, interfaceC23280C1);
        }
        InterfaceC8616 interfaceC8616Build = interfaceC23280C1.build();
        this.n = interfaceC8616Build.count();
        this.o = true;
        this.b = null;
        return interfaceC8616Build;
    }

    public final long j(long j) {
        if (this.o) {
            return this.n;
        }
        C15153 c15153 = (C15153) this.d;
        C15153 c15154 = (C15153) this.e;
        if (c15153 == null || c15154 == null) {
            return this.n;
        }
        long j2 = c15153.j(j);
        return j2 >= j ? j2 : c15154.j(j) + j2;
    }
}
