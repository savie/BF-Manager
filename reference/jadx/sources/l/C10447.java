package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢ᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10447 extends AbstractC0555 implements InterfaceC7664 {
    public final /* synthetic */ C7991 g;

    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0206.a(this, consumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0206.b(this, consumer);
    }

    @Override // l.AbstractC0555
    public final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // l.AbstractC0555
    public final InterfaceC9154 b(Object obj, int i, int i2) {
        return C13629.spliterator((int[]) obj, i, i2 + i, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10447(C7991 c7991, int i, int i2, int i3, int i4) {
        super(c7991, i, i2, i3, i4);
        this.g = c7991;
    }

    @Override // l.AbstractC0555
    public final InterfaceC9154 c(int i, int i2, int i3, int i4) {
        return new C10447(this.g, i, i2, i3, i4);
    }
}
