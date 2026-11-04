package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: renamed from: l.ᩴ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C20034 extends AbstractC19902 {
    public final AbstractC13956 h;
    public final LongFunction i;
    public final BinaryOperator j;

    @Override // l.AbstractC19902, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC19902 abstractC19902 = this.d;
        if (abstractC19902 != null) {
            this.f = (InterfaceC13409) this.j.apply((InterfaceC13409) ((C20034) abstractC19902).f, (InterfaceC13409) ((C20034) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public C20034(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC13956, interfaceC8409);
        this.h = abstractC13956;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    public C20034(C20034 c20034, InterfaceC8409 interfaceC8409) {
        super(c20034, interfaceC8409);
        this.h = c20034.h;
        this.i = c20034.i;
        this.j = c20034.j;
    }

    @Override // l.AbstractC19902
    public AbstractC19902 c(InterfaceC8409 interfaceC8409) {
        return new C20034(this, interfaceC8409);
    }

    @Override // l.AbstractC19902
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final InterfaceC13409 a() {
        InterfaceC4262 interfaceC4262 = (InterfaceC4262) this.i.apply(this.h.R(this.b));
        this.h.f0(this.b, interfaceC4262);
        return interfaceC4262.build();
    }
}
