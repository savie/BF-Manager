package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۬ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13201 implements InterfaceC11790, Serializable, Cloneable {
    public static final long serialVersionUID = 8379247926738230492L;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16448;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return 0L;
    }

    @Override // l.InterfaceC18576, l.InterfaceC20693
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // l.InterfaceC18576
    public final void forEachRemaining(IntConsumer intConsumer) {
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
    @Deprecated
    public final boolean tryAdvance(Consumer consumer) {
        return false;
    }

    @Override // l.InterfaceC18576
    public final boolean tryAdvance(IntConsumer intConsumer) {
        return false;
    }

    @Override // l.InterfaceC10110, l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC10110 trySplit() {
        return null;
    }

    @Override // l.InterfaceC18576, l.InterfaceC10110, l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC18576 trySplit() {
        return null;
    }

    @Override // l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC20693 trySplit() {
        return null;
    }

    @Override // l.InterfaceC20693
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC10110
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // l.InterfaceC10110
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return false;
    }

    public final Object clone() {
        return C21667.f70272;
    }

    private Object readResolve() {
        return C21667.f70272;
    }

    @Override // l.InterfaceC11790, l.InterfaceC20693
    public final InterfaceC16481 getComparator() {
        throw new IllegalStateException();
    }
}
