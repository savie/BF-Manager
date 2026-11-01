package l;

import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: renamed from: l.۠ܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C8213 extends AbstractC17269 {
    public final AbstractC22686 h;
    public final LongFunction i;
    public final BinaryOperator j;

    @Override // l.AbstractC17269, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC17269 abstractC17269 = this.d;
        if (abstractC17269 != null) {
            this.f = (InterfaceC8616) this.j.apply((InterfaceC8616) ((C8213) abstractC17269).f, (InterfaceC8616) ((C8213) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public C8213(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC22686, interfaceC20693);
        this.h = abstractC22686;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    public C8213(C8213 c8213, InterfaceC20693 interfaceC20693) {
        super(c8213, interfaceC20693);
        this.h = c8213.h;
        this.i = c8213.i;
        this.j = c8213.j;
    }

    @Override // l.AbstractC17269
    public AbstractC17269 c(InterfaceC20693 interfaceC20693) {
        return new C8213(this, interfaceC20693);
    }

    @Override // l.AbstractC17269
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final InterfaceC8616 a() {
        InterfaceC23280 interfaceC23280 = (InterfaceC23280) this.i.apply(this.h.R(this.b));
        this.h.f0(this.b, interfaceC23280);
        return interfaceC23280.build();
    }
}
