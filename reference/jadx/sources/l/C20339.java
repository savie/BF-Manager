package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩶ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20339 implements InterfaceC10462, Serializable, Cloneable {
    public static final long serialVersionUID = 8379247926738230492L;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16448;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return 0L;
    }

    @Override // l.InterfaceC19282, l.InterfaceC20693
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // l.InterfaceC19282
    public final void forEachRemaining(LongConsumer longConsumer) {
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
    @Deprecated
    public final boolean tryAdvance(Consumer consumer) {
        return false;
    }

    @Override // l.InterfaceC19282
    public final boolean tryAdvance(LongConsumer longConsumer) {
        return false;
    }

    @Override // l.InterfaceC10110, l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC10110 trySplit() {
        return null;
    }

    @Override // l.InterfaceC19282, l.InterfaceC10110, l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC19282 trySplit() {
        return null;
    }

    @Override // l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC20693 trySplit() {
        return null;
    }

    @Override // l.InterfaceC10110
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // l.InterfaceC10110
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return false;
    }

    public final Object clone() {
        return C12578.f42048;
    }

    private Object readResolve() {
        return C12578.f42048;
    }

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
