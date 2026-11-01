package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAPP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10213 implements InterfaceC11687 {
    @Override // l.InterfaceC10110
    public /* synthetic */ void forEachRemaining(Object obj) {
        C8699.$default$forEachRemaining(this, obj);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C13804.m33553(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C13804.m33554(this, consumer);
    }

    @Override // l.InterfaceC10110, l.InterfaceC20693
    public /* bridge */ /* synthetic */ InterfaceC20693 trySplit() {
        return trySplit();
    }

    @Override // l.InterfaceC20693
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC11687, l.InterfaceC20693
    public final InterfaceC4692 getComparator() {
        throw new IllegalStateException();
    }
}
