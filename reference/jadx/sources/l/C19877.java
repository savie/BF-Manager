package l;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.᩶ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19877 extends AbstractC10330 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC5752 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19877(AbstractC5752 abstractC5752, InterfaceC19171 interfaceC19171, int i) {
        super(interfaceC19171);
        this.b = i;
        this.c = abstractC5752;
    }

    @Override // l.AbstractC10330, l.InterfaceC19171
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

    @Override // l.InterfaceC10974, l.InterfaceC19171
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(((IntFunction) ((C22699) this.c).t).apply(i));
                break;
            case 1:
                ((IntConsumer) ((C2942) this.c).t).accept(i);
                this.a.accept(i);
                break;
            case 2:
                this.a.accept(((IntUnaryOperator) ((C2942) this.c).t).applyAsInt(i));
                break;
            case 3:
                this.a.accept(((IntToLongFunction) ((C15727) this.c).t).applyAsLong(i));
                break;
            case 4:
                this.a.accept(((IntToDoubleFunction) ((C15644) this.c).t).applyAsDouble(i));
                break;
            default:
                if (((IntPredicate) ((C2942) this.c).t).test(i)) {
                    this.a.accept(i);
                }
                break;
        }
    }
}
