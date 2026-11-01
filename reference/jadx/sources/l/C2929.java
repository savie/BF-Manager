package l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.ۗ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2929 extends AbstractC17269 {
    public final AbstractC22686 h;

    @Override // l.AbstractC17269, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC17269 abstractC17269 = this.d;
        if (abstractC17269 != null) {
            InterfaceC2319 interfaceC2319 = (InterfaceC2319) ((C2929) abstractC17269).f;
            interfaceC2319.i((InterfaceC2319) ((C2929) this.e).f);
            this.f = interfaceC2319;
        }
        super.onCompletion(countedCompleter);
    }

    public C2929(AbstractC22686 abstractC22686, AbstractC22686 abstractC22687, InterfaceC20693 interfaceC20693) {
        super(abstractC22687, interfaceC20693);
        this.h = abstractC22686;
    }

    public C2929(C2929 c2929, InterfaceC20693 interfaceC20693) {
        super(c2929, interfaceC20693);
        this.h = c2929.h;
    }

    @Override // l.AbstractC17269
    public final AbstractC17269 c(InterfaceC20693 interfaceC20693) {
        return new C2929(this, interfaceC20693);
    }

    @Override // l.AbstractC17269
    public final Object a() {
        AbstractC22686 abstractC22686 = this.a;
        InterfaceC2319 interfaceC2319E0 = this.h.e0();
        abstractC22686.f0(this.b, interfaceC2319E0);
        return interfaceC2319E0;
    }
}
