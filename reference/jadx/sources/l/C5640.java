package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۚ᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5640 extends AbstractC13742 implements InterfaceC18576 {
    public final /* synthetic */ C8463 g;

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17870.a(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17870.b(this, consumer);
    }

    @Override // l.AbstractC13742
    public final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // l.AbstractC13742
    public final InterfaceC10110 b(Object obj, int i, int i2) {
        return C19988.spliterator((int[]) obj, i, i2 + i, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5640(C8463 c8463, int i, int i2, int i3, int i4) {
        super(c8463, i, i2, i3, i4);
        this.g = c8463;
    }

    @Override // l.AbstractC13742
    public final InterfaceC10110 c(int i, int i2, int i3, int i4) {
        return new C5640(this.g, i, i2, i3, i4);
    }
}
