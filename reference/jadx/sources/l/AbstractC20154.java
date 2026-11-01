package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAP5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20154 implements InterfaceC11501 {
    @Override // l.InterfaceC10110
    public /* synthetic */ void forEachRemaining(Object obj) {
        C8699.$default$forEachRemaining(this, obj);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C13618.m33299(this, consumer);
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
        return C13618.m33300(this, consumer);
    }

    @Override // l.InterfaceC10110, l.InterfaceC20693
    public /* bridge */ /* synthetic */ InterfaceC20693 trySplit() {
        return trySplit();
    }

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
