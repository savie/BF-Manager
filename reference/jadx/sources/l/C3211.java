package l;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: l.ۗۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3211 extends AbstractC13152 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC5752 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3211(AbstractC5752 abstractC5752, InterfaceC19171 interfaceC19171, int i) {
        super(interfaceC19171);
        this.b = i;
        this.c = abstractC5752;
    }

    @Override // l.AbstractC13152, l.InterfaceC19171
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

    @Override // l.InterfaceC8857, l.InterfaceC19171
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                this.a.accept(((DoubleFunction) ((C22699) this.c).t).apply(d));
                return;
            case 1:
                this.a.accept(((DoubleUnaryOperator) ((C15644) this.c).t).applyAsDouble(d));
                return;
            case 2:
                ((C9294) this.c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 3:
                ((C6553) this.c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            case 4:
                if (((DoublePredicate) ((C15644) this.c).t).test(d)) {
                    this.a.accept(d);
                    return;
                }
                return;
            default:
                ((DoubleConsumer) ((C15644) this.c).t).accept(d);
                this.a.accept(d);
                return;
        }
    }
}
