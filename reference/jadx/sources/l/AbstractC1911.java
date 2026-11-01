package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.֫ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAP7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1911 implements InterfaceC10462 {
    @Override // l.InterfaceC19282, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C9051.m23382(this, consumer);
    }

    @Override // l.InterfaceC10110
    public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C7993.$default$forEachRemaining(this, longConsumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC19282, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C9051.m23383(this, consumer);
    }

    @Override // l.InterfaceC10110, l.InterfaceC20693
    public /* bridge */ /* synthetic */ InterfaceC10110 trySplit() {
        return trySplit();
    }

    @Override // l.InterfaceC20693
    public /* bridge */ /* synthetic */ InterfaceC20693 trySplit() {
        return trySplit();
    }

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC10110
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((LongConsumer) obj);
    }
}
