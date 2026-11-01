package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۠ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8241 implements InterfaceC7535 {
    public final /* synthetic */ Spliterator.OfDouble a;

    public /* synthetic */ C8241(Spliterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ InterfaceC7535 a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C8947 ? ((C8947) ofDouble).a : new C8241(ofDouble);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.a;
        if (obj instanceof C8241) {
            obj = ((C8241) obj).a;
        }
        return ofDouble.equals(obj);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC10110
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // l.InterfaceC7535
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.a.forEachRemaining(doubleConsumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC10110
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // l.InterfaceC7535
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.a.tryAdvance(doubleConsumer);
    }

    @Override // l.InterfaceC7535, l.InterfaceC10110, l.InterfaceC20693
    public final /* synthetic */ InterfaceC7535 trySplit() {
        return a(this.a.trySplit());
    }

    @Override // l.InterfaceC10110, l.InterfaceC20693
    public final /* synthetic */ InterfaceC10110 trySplit() {
        return C16224.a(this.a.trySplit());
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ InterfaceC20693 trySplit() {
        return C12696.a(this.a.trySplit());
    }
}
