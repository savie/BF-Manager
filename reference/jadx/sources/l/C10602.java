package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10602 implements Spliterator.OfPrimitive {
    public final /* synthetic */ InterfaceC9154 a;

    public /* synthetic */ C10602(InterfaceC9154 interfaceC9154) {
        this.a = interfaceC9154;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(InterfaceC9154 interfaceC9154) {
        if (interfaceC9154 == null) {
            return null;
        }
        if (interfaceC9154 instanceof C4637) {
            return ((C4637) interfaceC9154).a;
        }
        if (interfaceC9154 instanceof InterfaceC3012) {
            return C1521.a((InterfaceC3012) interfaceC9154);
        }
        if (interfaceC9154 instanceof InterfaceC7664) {
            return C5008.a((InterfaceC7664) interfaceC9154);
        }
        return interfaceC9154 instanceof InterfaceC9900 ? C7465.a((InterfaceC9900) interfaceC9154) : new C10602(interfaceC9154);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC9154 interfaceC9154 = this.a;
        if (obj instanceof C10602) {
            obj = ((C10602) obj).a;
        }
        return interfaceC9154.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C2443.convert(this.a.trySplit());
    }
}
