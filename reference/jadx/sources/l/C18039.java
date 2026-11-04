package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܿۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18039 extends AbstractC19902 {
    public final AbstractC15470 h;
    public final IntFunction i;
    public final boolean j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f82080l;

    @Override // l.AbstractC19902, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC13409 interfaceC13409L;
        AbstractC19902 abstractC19902 = this.d;
        if (abstractC19902 != null) {
            if (this.j) {
                C18039 c18039 = (C18039) abstractC19902;
                long j = c18039.f82080l;
                this.f82080l = j;
                if (j == c18039.k) {
                    this.f82080l = j + ((C18039) this.e).f82080l;
                }
            }
            C18039 c180310 = (C18039) abstractC19902;
            long j2 = c180310.k;
            C18039 c180311 = (C18039) this.e;
            this.k = j2 + c180311.k;
            if (c180310.k == 0) {
                interfaceC13409L = (InterfaceC13409) c180311.f;
            } else {
                interfaceC13409L = c180311.k == 0 ? (InterfaceC13409) c180310.f : AbstractC13956.L(this.h.m0(), (InterfaceC13409) ((C18039) this.d).f, (InterfaceC13409) ((C18039) this.e).f);
            }
            InterfaceC13409 interfaceC13409J = interfaceC13409L;
            if (b() && this.j) {
                interfaceC13409J = interfaceC13409J.j(this.f82080l, interfaceC13409J.count(), this.i);
            }
            this.f = interfaceC13409J;
        }
        super.onCompletion(countedCompleter);
    }

    public C18039(AbstractC15470 abstractC15470, AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, IntFunction intFunction) {
        super(abstractC13956, interfaceC8409);
        this.h = abstractC15470;
        this.i = intFunction;
        this.j = EnumC21614.ORDERED.p(((AbstractC15470) abstractC13956).m);
    }

    public C18039(C18039 c18039, InterfaceC8409 interfaceC8409) {
        super(c18039, interfaceC8409);
        this.h = c18039.h;
        this.i = c18039.i;
        this.j = c18039.j;
    }

    @Override // l.AbstractC19902
    public final AbstractC19902 c(InterfaceC8409 interfaceC8409) {
        return new C18039(this, interfaceC8409);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // l.AbstractC19902
    public final Object a() {
        long jR;
        boolean zB = b();
        if (zB || !this.j) {
            jR = -1;
        } else {
            EnumC21614 enumC21614 = EnumC21614.SIZED;
            AbstractC15470 abstractC15470 = this.h;
            int i = abstractC15470.j;
            int i2 = enumC21614.e;
            if ((i & i2) == i2) {
                jR = abstractC15470.R(this.b);
            } else {
                jR = -1;
            }
        }
        InterfaceC4262 interfaceC4262C0 = this.a.c0(jR, this.i);
        InterfaceC17293 interfaceC17293D = ((InterfaceC21769) this.h).d(interfaceC4262C0, this.j && !zB);
        this.a.f0(this.b, interfaceC17293D);
        InterfaceC13409 interfaceC13409Build = interfaceC4262C0.build();
        this.k = interfaceC13409Build.count();
        this.f82080l = interfaceC17293D.h();
        return interfaceC13409Build;
    }
}
