package l;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.᩶ۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21111 extends AbstractC5864 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC15470 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21111(AbstractC15470 abstractC15470, InterfaceC15143 interfaceC15143, int i) {
        super(interfaceC15143);
        this.b = i;
        this.c = abstractC15470;
    }

    @Override // l.AbstractC5864, l.InterfaceC15143
    public void c(long j) {
        switch (this.b) {
            case 5:
                this.a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }

    @Override // l.InterfaceC12334, l.InterfaceC15143
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(((IntFunction) ((C24841) this.c).t).apply(i));
                break;
            case 1:
                ((IntConsumer) ((C13651) this.c).t).accept(i);
                this.a.accept(i);
                break;
            case 2:
                this.a.accept(((IntUnaryOperator) ((C13651) this.c).t).applyAsInt(i));
                break;
            case 3:
                this.a.accept(((IntToLongFunction) ((C14922) this.c).t).applyAsLong(i));
                break;
            case 4:
                this.a.accept(((IntToDoubleFunction) ((C14397) this.c).t).applyAsDouble(i));
                break;
            default:
                if (((IntPredicate) ((C13651) this.c).t).test(i)) {
                    this.a.accept(i);
                }
                break;
        }
    }
}
