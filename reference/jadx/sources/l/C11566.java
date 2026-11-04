package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۧۧۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11566 extends AbstractC2946 implements InterfaceC3012 {
    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2946.b(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ Comparator getComparator() {
        return C18105.$default$getComparator(this);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2946.g(this, consumer);
    }

    @Override // l.AbstractC2946, l.InterfaceC9154, l.InterfaceC8409
    public final /* bridge */ /* synthetic */ InterfaceC3012 trySplit() {
        return null;
    }

    @Override // l.AbstractC2946, l.InterfaceC9154, l.InterfaceC8409
    public final /* bridge */ /* synthetic */ InterfaceC9154 trySplit() {
        return null;
    }

    @Override // l.InterfaceC3012
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        C17359.requireNonNull(doubleConsumer);
        return false;
    }

    @Override // l.InterfaceC3012
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        C17359.requireNonNull(doubleConsumer);
    }
}
