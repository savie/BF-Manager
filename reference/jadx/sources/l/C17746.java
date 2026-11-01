package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ᩳ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17746 extends AbstractC13742 implements InterfaceC19282 {
    public final /* synthetic */ C16336 g;

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C7993.a(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C7993.b(this, consumer);
    }

    @Override // l.AbstractC13742
    public final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // l.AbstractC13742
    public final InterfaceC10110 b(Object obj, int i, int i2) {
        long[] jArr = (long[]) obj;
        int i3 = i2 + i;
        C19988.a(((long[]) C13638.requireNonNull(jArr)).length, i, i3);
        return new C4006(jArr, i, i3, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17746(C16336 c16336, int i, int i2, int i3, int i4) {
        super(c16336, i, i2, i3, i4);
        this.g = c16336;
    }

    @Override // l.AbstractC13742
    public final InterfaceC10110 c(int i, int i2, int i3, int i4) {
        return new C17746(this.g, i, i2, i3, i4);
    }
}
