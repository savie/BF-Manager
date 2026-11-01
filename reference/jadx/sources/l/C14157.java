package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14157 extends AbstractC14884 implements InterfaceC18576 {
    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17870.a(this, consumer);
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

    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17870.b(this, consumer);
    }

    @Override // l.AbstractC14884, l.InterfaceC7535, l.InterfaceC10110, l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC10110 trySplit() {
        return null;
    }

    @Override // l.AbstractC14884, l.InterfaceC7535, l.InterfaceC10110, l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC18576 trySplit() {
        return null;
    }

    @Override // l.InterfaceC18576
    public final boolean tryAdvance(IntConsumer intConsumer) {
        C13638.requireNonNull(intConsumer);
        return false;
    }

    @Override // l.InterfaceC18576
    public final void forEachRemaining(IntConsumer intConsumer) {
        C13638.requireNonNull(intConsumer);
    }
}
