package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܺܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16003 implements InterfaceC18576 {
    public final /* synthetic */ Spliterator.OfInt a;

    public /* synthetic */ C16003(Spliterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ InterfaceC18576 a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C0479 ? ((C0479) ofInt).a : new C16003(ofInt);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.a;
        if (obj instanceof C16003) {
            obj = ((C16003) obj).a;
        }
        return ofInt.equals(obj);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC10110
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // l.InterfaceC18576
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.a.forEachRemaining(intConsumer);
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

    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // l.InterfaceC18576
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.a.tryAdvance(intConsumer);
    }

    @Override // l.InterfaceC10110, l.InterfaceC20693
    public final /* synthetic */ InterfaceC10110 trySplit() {
        return C16224.a(this.a.trySplit());
    }

    @Override // l.InterfaceC18576, l.InterfaceC10110, l.InterfaceC20693
    public final /* synthetic */ InterfaceC18576 trySplit() {
        return a(this.a.trySplit());
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ InterfaceC20693 trySplit() {
        return C12696.a(this.a.trySplit());
    }
}
