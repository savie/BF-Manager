package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩵ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19254 extends AbstractC13742 implements InterfaceC7535 {
    public final /* synthetic */ C5848 g;

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC14884.b(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC14884.g(this, consumer);
    }

    @Override // l.AbstractC13742
    public final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // l.AbstractC13742
    public final InterfaceC10110 b(Object obj, int i, int i2) {
        double[] dArr = (double[]) obj;
        int i3 = i2 + i;
        C19988.a(((double[]) C13638.requireNonNull(dArr)).length, i, i3);
        return new C23661(dArr, i, i3, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19254(C5848 c5848, int i, int i2, int i3, int i4) {
        super(c5848, i, i2, i3, i4);
        this.g = c5848;
    }

    @Override // l.AbstractC13742
    public final InterfaceC10110 c(int i, int i2, int i3, int i4) {
        return new C19254(this.g, i, i2, i3, i4);
    }
}
