package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۢۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9550 extends AbstractC14884 implements InterfaceC7535 {
    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC14884.b(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ Comparator getComparator() {
        return C21398.$default$getComparator(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC14884.g(this, consumer);
    }

    @Override // l.AbstractC14884, l.InterfaceC7535, l.InterfaceC10110, l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC7535 trySplit() {
        return null;
    }

    @Override // l.AbstractC14884, l.InterfaceC7535, l.InterfaceC10110, l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC10110 trySplit() {
        return null;
    }

    @Override // l.InterfaceC7535
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        C13638.requireNonNull(doubleConsumer);
        return false;
    }

    @Override // l.InterfaceC7535
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        C13638.requireNonNull(doubleConsumer);
    }
}
