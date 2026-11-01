package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13555 extends AbstractC0148 implements InterfaceC18576, IntConsumer {
    public int f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17870.a(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17870.b(this, consumer);
    }

    @Override // l.AbstractC19939
    public final InterfaceC20693 b(InterfaceC20693 interfaceC20693) {
        return new C13555((InterfaceC18576) interfaceC20693, this);
    }

    @Override // l.AbstractC0148
    public final void g(Object obj) {
        ((IntConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f = i;
    }

    @Override // l.AbstractC0148
    public final AbstractC1862 j(int i) {
        return new C6801(i);
    }
}
