package l;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: l.ۡۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8803 extends AbstractC23736 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC5752 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8803(AbstractC5752 abstractC5752, InterfaceC19171 interfaceC19171, int i) {
        super(interfaceC19171);
        this.b = i;
        this.c = abstractC5752;
    }

    @Override // l.AbstractC23736, l.InterfaceC19171
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

    @Override // l.InterfaceC21993, l.InterfaceC19171
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept(((LongFunction) ((C22699) this.c).t).apply(j));
                return;
            case 1:
                this.a.accept(((LongUnaryOperator) ((C15727) this.c).t).applyAsLong(j));
                return;
            case 2:
                ((C9294) this.c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                ((C1614) this.c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                if (((LongPredicate) ((C15727) this.c).t).test(j)) {
                    this.a.accept(j);
                    return;
                }
                return;
            default:
                ((LongConsumer) ((C15727) this.c).t).accept(j);
                this.a.accept(j);
                return;
        }
    }
}
