package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܶܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15269 extends AbstractC5274 {
    public final AbstractC5752 j;
    public final IntFunction k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f77965l;
    public long m;
    public boolean n;
    public volatile boolean o;

    @Override // l.AbstractC5274
    public final void f() {
        this.i = true;
        if (this.f77965l && this.o) {
            d(AbstractC22686.P(this.j.m0()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    @Override // l.AbstractC17269, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C15269 c15269;
        C15269 c152610;
        Object objL;
        AbstractC17269 abstractC17269 = this.d;
        if (abstractC17269 != null) {
            this.n = ((C15269) abstractC17269).n | ((C15269) this.e).n;
            if (this.f77965l && this.i) {
                this.m = 0L;
                objL = AbstractC22686.P(this.j.m0());
            } else if (this.f77965l) {
                C15269 c152611 = (C15269) this.d;
                if (c152611.n) {
                    this.m = c152611.m;
                    objL = (InterfaceC8616) c152611.i();
                } else {
                    c15269 = (C15269) this.d;
                    long j = c15269.m;
                    c152610 = (C15269) this.e;
                    this.m = j + c152610.m;
                    if (c15269.m == 0) {
                        objL = (InterfaceC8616) c152610.i();
                    } else if (c152610.m == 0) {
                        objL = (InterfaceC8616) c15269.i();
                    } else {
                        objL = AbstractC22686.L(this.j.m0(), (InterfaceC8616) ((C15269) this.d).i(), (InterfaceC8616) ((C15269) this.e).i());
                    }
                }
            } else {
                c15269 = (C15269) this.d;
                long j2 = c15269.m;
                c152610 = (C15269) this.e;
                this.m = j2 + c152610.m;
                if (c15269.m == 0) {
                    objL = (InterfaceC8616) c152610.i();
                } else if (c152610.m == 0) {
                    objL = (InterfaceC8616) c15269.i();
                } else {
                    objL = AbstractC22686.L(this.j.m0(), (InterfaceC8616) ((C15269) this.d).i(), (InterfaceC8616) ((C15269) this.e).i());
                }
            }
            d(objL);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }

    public C15269(AbstractC5752 abstractC5752, AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, IntFunction intFunction) {
        super(abstractC22686, interfaceC20693);
        this.j = abstractC5752;
        this.k = intFunction;
        this.f77965l = EnumC2970.ORDERED.s(((AbstractC5752) abstractC22686).m);
    }

    public C15269(C15269 c15269, InterfaceC20693 interfaceC20693) {
        super(c15269, interfaceC20693);
        this.j = c15269.j;
        this.k = c15269.k;
        this.f77965l = c15269.f77965l;
    }

    @Override // l.AbstractC17269
    public final AbstractC17269 c(InterfaceC20693 interfaceC20693) {
        return new C15269(this, interfaceC20693);
    }

    @Override // l.AbstractC5274
    public final Object h() {
        return AbstractC22686.P(this.j.m0());
    }

    @Override // l.AbstractC17269
    public final Object a() {
        InterfaceC23280 interfaceC23280C0 = this.a.c0(-1L, this.k);
        InterfaceC19171 interfaceC19171Q0 = this.j.q0(((AbstractC5752) this.a).m, interfaceC23280C0);
        AbstractC22686 abstractC22686 = this.a;
        boolean zN = abstractC22686.N(this.b, abstractC22686.g0(interfaceC19171Q0));
        this.n = zN;
        if (zN) {
            g();
        }
        InterfaceC8616 interfaceC8616Build = interfaceC23280C0.build();
        this.m = interfaceC8616Build.count();
        return interfaceC8616Build;
    }
}
