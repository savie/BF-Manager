package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0700 implements Spliterator.OfPrimitive {
    public final /* synthetic */ InterfaceC10110 a;

    public /* synthetic */ C0700(InterfaceC10110 interfaceC10110) {
        this.a = interfaceC10110;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(InterfaceC10110 interfaceC10110) {
        if (interfaceC10110 == null) {
            return null;
        }
        if (interfaceC10110 instanceof C16224) {
            return ((C16224) interfaceC10110).a;
        }
        if (interfaceC10110 instanceof InterfaceC7535) {
            return C8947.a((InterfaceC7535) interfaceC10110);
        }
        if (interfaceC10110 instanceof InterfaceC18576) {
            return C0479.a((InterfaceC18576) interfaceC10110);
        }
        return interfaceC10110 instanceof InterfaceC19282 ? C7757.a((InterfaceC19282) interfaceC10110) : new C0700(interfaceC10110);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10110 interfaceC10110 = this.a;
        if (obj instanceof C0700) {
            obj = ((C0700) obj).a;
        }
        return interfaceC10110.equals(obj);
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
        return C7287.convert(this.a.trySplit());
    }
}
