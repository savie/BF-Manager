package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֫ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAPH */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1622 implements InterfaceC11790 {
    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C13907.m33739(this, consumer);
    }

    @Override // l.InterfaceC10110
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C17870.$default$forEachRemaining(this, intConsumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C13907.m33740(this, consumer);
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
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC11790, l.InterfaceC20693
    public final InterfaceC16481 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC10110
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((IntConsumer) obj);
    }
}
