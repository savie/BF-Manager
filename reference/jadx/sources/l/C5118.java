package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۙ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5118 extends AbstractC20692 {
    public final AbstractC15470 j;
    public final IntFunction k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f82077l;
    public long m;
    public boolean n;
    public volatile boolean o;

    @Override // l.AbstractC20692
    public final void f() {
        this.i = true;
        if (this.f82077l && this.o) {
            d(AbstractC13956.P(this.j.m0()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    @Override // l.AbstractC19902, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C5118 c5118;
        C5118 c5119;
        Object objL;
        AbstractC19902 abstractC19902 = this.d;
        if (abstractC19902 != null) {
            this.n = ((C5118) abstractC19902).n | ((C5118) this.e).n;
            if (this.f82077l && this.i) {
                this.m = 0L;
                objL = AbstractC13956.P(this.j.m0());
            } else if (this.f82077l) {
                C5118 c51110 = (C5118) this.d;
                if (c51110.n) {
                    this.m = c51110.m;
                    objL = (InterfaceC13409) c51110.i();
                } else {
                    c5118 = (C5118) this.d;
                    long j = c5118.m;
                    c5119 = (C5118) this.e;
                    this.m = j + c5119.m;
                    if (c5118.m == 0) {
                        objL = (InterfaceC13409) c5119.i();
                    } else if (c5119.m == 0) {
                        objL = (InterfaceC13409) c5118.i();
                    } else {
                        objL = AbstractC13956.L(this.j.m0(), (InterfaceC13409) ((C5118) this.d).i(), (InterfaceC13409) ((C5118) this.e).i());
                    }
                }
            } else {
                c5118 = (C5118) this.d;
                long j2 = c5118.m;
                c5119 = (C5118) this.e;
                this.m = j2 + c5119.m;
                if (c5118.m == 0) {
                    objL = (InterfaceC13409) c5119.i();
                } else if (c5119.m == 0) {
                    objL = (InterfaceC13409) c5118.i();
                } else {
                    objL = AbstractC13956.L(this.j.m0(), (InterfaceC13409) ((C5118) this.d).i(), (InterfaceC13409) ((C5118) this.e).i());
                }
            }
            d(objL);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }

    public C5118(AbstractC15470 abstractC15470, AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, IntFunction intFunction) {
        super(abstractC13956, interfaceC8409);
        this.j = abstractC15470;
        this.k = intFunction;
        this.f82077l = EnumC21614.ORDERED.p(((AbstractC15470) abstractC13956).m);
    }

    public C5118(C5118 c5118, InterfaceC8409 interfaceC8409) {
        super(c5118, interfaceC8409);
        this.j = c5118.j;
        this.k = c5118.k;
        this.f82077l = c5118.f82077l;
    }

    @Override // l.AbstractC19902
    public final AbstractC19902 c(InterfaceC8409 interfaceC8409) {
        return new C5118(this, interfaceC8409);
    }

    @Override // l.AbstractC20692
    public final Object h() {
        return AbstractC13956.P(this.j.m0());
    }

    @Override // l.AbstractC19902
    public final Object a() {
        InterfaceC4262 interfaceC4262C0 = this.a.c0(-1L, this.k);
        InterfaceC15143 interfaceC15143Q0 = this.j.q0(((AbstractC15470) this.a).m, interfaceC4262C0);
        AbstractC13956 abstractC13956 = this.a;
        boolean zN = abstractC13956.N(this.b, abstractC13956.g0(interfaceC15143Q0));
        this.n = zN;
        if (zN) {
            g();
        }
        InterfaceC13409 interfaceC13409Build = interfaceC4262C0.build();
        this.m = interfaceC13409Build.count();
        return interfaceC13409Build;
    }
}
