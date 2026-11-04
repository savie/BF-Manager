package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜ᩻ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7487 implements InterfaceC7664 {
    public final /* synthetic */ Spliterator.OfInt a;

    public /* synthetic */ C7487(Spliterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ InterfaceC7664 a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C5008 ? ((C5008) ofInt).a : new C7487(ofInt);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.a;
        if (obj instanceof C7487) {
            obj = ((C7487) obj).a;
        }
        return ofInt.equals(obj);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC9154
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // l.InterfaceC7664, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // l.InterfaceC7664
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.a.forEachRemaining(intConsumer);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC9154
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.a.tryAdvance(intConsumer);
    }

    @Override // l.InterfaceC7664, l.InterfaceC9154, l.InterfaceC8409
    public final /* synthetic */ InterfaceC7664 trySplit() {
        return a(this.a.trySplit());
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ InterfaceC8409 trySplit() {
        return C19553.a(this.a.trySplit());
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final /* synthetic */ InterfaceC9154 trySplit() {
        return C4637.a(this.a.trySplit());
    }
}
