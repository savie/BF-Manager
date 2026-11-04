package l;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: l.ۨܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12443 extends AbstractC6610 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC15470 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12443(AbstractC15470 abstractC15470, InterfaceC15143 interfaceC15143, int i) {
        super(interfaceC15143);
        this.b = i;
        this.c = abstractC15470;
    }

    @Override // l.AbstractC6610, l.InterfaceC15143
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

    @Override // l.InterfaceC1148, l.InterfaceC15143
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept(((LongFunction) ((C24841) this.c).t).apply(j));
                return;
            case 1:
                this.a.accept(((LongUnaryOperator) ((C14922) this.c).t).applyAsLong(j));
                return;
            case 2:
                ((C6940) this.c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                ((C8956) this.c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                if (((LongPredicate) ((C14922) this.c).t).test(j)) {
                    this.a.accept(j);
                    return;
                }
                return;
            default:
                ((LongConsumer) ((C14922) this.c).t).accept(j);
                this.a.accept(j);
                return;
        }
    }
}
