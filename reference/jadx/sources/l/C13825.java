package l;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: l.۬ۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13825 extends AbstractC2377 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC15470 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13825(AbstractC15470 abstractC15470, InterfaceC15143 interfaceC15143, int i) {
        super(interfaceC15143);
        this.b = i;
        this.c = abstractC15470;
    }

    @Override // l.AbstractC2377, l.InterfaceC15143
    public void c(long j) {
        switch (this.b) {
            case 4:
                this.a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // l.InterfaceC13080, java.util.function.DoubleConsumer
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                this.a.accept(((DoubleFunction) ((C24841) this.c).t).apply(d));
                return;
            case 1:
                this.a.accept(((DoubleUnaryOperator) ((C14397) this.c).t).applyAsDouble(d));
                return;
            case 2:
                ((C6940) this.c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 3:
                ((C11939) this.c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            case 4:
                if (((DoublePredicate) ((C14397) this.c).t).test(d)) {
                    this.a.accept(d);
                    return;
                }
                return;
            default:
                ((DoubleConsumer) ((C14397) this.c).t).accept(d);
                this.a.accept(d);
                return;
        }
    }
}
