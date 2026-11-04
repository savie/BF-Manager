package l;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: renamed from: l.᩶ܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C21438 extends AbstractC19902 {
    public final AbstractC13956 h;

    @Override // l.AbstractC19902, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC19902 abstractC19902 = this.d;
        if (abstractC19902 != null) {
            InterfaceC18873 interfaceC18873 = (InterfaceC18873) ((C21438) abstractC19902).f;
            interfaceC18873.i((InterfaceC18873) ((C21438) this.e).f);
            this.f = interfaceC18873;
        }
        super.onCompletion(countedCompleter);
    }

    public C21438(AbstractC13956 abstractC13956, AbstractC13956 abstractC13957, InterfaceC8409 interfaceC8409) {
        super(abstractC13957, interfaceC8409);
        this.h = abstractC13956;
    }

    public C21438(C21438 c21438, InterfaceC8409 interfaceC8409) {
        super(c21438, interfaceC8409);
        this.h = c21438.h;
    }

    @Override // l.AbstractC19902
    public final AbstractC19902 c(InterfaceC8409 interfaceC8409) {
        return new C21438(this, interfaceC8409);
    }

    @Override // l.AbstractC19902
    public final Object a() {
        AbstractC13956 abstractC13956 = this.a;
        InterfaceC18873 interfaceC18873E0 = this.h.e0();
        abstractC13956.f0(this.b, interfaceC18873E0);
        return interfaceC18873E0;
    }
}
