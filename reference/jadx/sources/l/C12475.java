package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۫ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12475 implements InterfaceC19282 {
    public final /* synthetic */ Spliterator.OfLong a;

    public /* synthetic */ C12475(Spliterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ InterfaceC19282 a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C7757 ? ((C7757) ofLong).a : new C12475(ofLong);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.a;
        if (obj instanceof C12475) {
            obj = ((C12475) obj).a;
        }
        return ofLong.equals(obj);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC10110
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // l.InterfaceC19282, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // l.InterfaceC19282
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.a.forEachRemaining(longConsumer);
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

    @Override // l.InterfaceC19282, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // l.InterfaceC19282
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.a.tryAdvance(longConsumer);
    }

    @Override // l.InterfaceC10110, l.InterfaceC20693
    public final /* synthetic */ InterfaceC10110 trySplit() {
        return C16224.a(this.a.trySplit());
    }

    @Override // l.InterfaceC19282, l.InterfaceC10110, l.InterfaceC20693
    public final /* synthetic */ InterfaceC19282 trySplit() {
        return a(this.a.trySplit());
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ InterfaceC20693 trySplit() {
        return C12696.a(this.a.trySplit());
    }
}
