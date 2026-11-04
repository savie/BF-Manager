package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۤܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10995 extends AbstractC0555 implements InterfaceC9900 {
    public final /* synthetic */ C16216 g;

    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C18851.a(this, consumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C18851.b(this, consumer);
    }

    @Override // l.AbstractC0555
    public final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // l.AbstractC0555
    public final InterfaceC9154 b(Object obj, int i, int i2) {
        long[] jArr = (long[]) obj;
        int i3 = i2 + i;
        C13629.a(((long[]) C17359.requireNonNull(jArr)).length, i, i3);
        return new C24642(jArr, i, i3, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10995(C16216 c16216, int i, int i2, int i3, int i4) {
        super(c16216, i, i2, i3, i4);
        this.g = c16216;
    }

    @Override // l.AbstractC0555
    public final InterfaceC9154 c(int i, int i2, int i3, int i4) {
        return new C10995(this.g, i, i2, i3, i4);
    }
}
