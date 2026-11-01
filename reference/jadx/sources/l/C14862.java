package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܳ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14862 extends AbstractC14884 implements InterfaceC19282 {
    @Override // l.InterfaceC19282, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C7993.a(this, consumer);
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

    @Override // l.InterfaceC19282, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C7993.b(this, consumer);
    }

    @Override // l.AbstractC14884, l.InterfaceC7535, l.InterfaceC10110, l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC10110 trySplit() {
        return null;
    }

    @Override // l.AbstractC14884, l.InterfaceC7535, l.InterfaceC10110, l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC19282 trySplit() {
        return null;
    }

    @Override // l.InterfaceC19282
    public final boolean tryAdvance(LongConsumer longConsumer) {
        C13638.requireNonNull(longConsumer);
        return false;
    }

    @Override // l.InterfaceC19282
    public final void forEachRemaining(LongConsumer longConsumer) {
        C13638.requireNonNull(longConsumer);
    }
}
