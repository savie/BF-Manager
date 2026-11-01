package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16224 implements InterfaceC10110 {
    public final /* synthetic */ Spliterator.OfPrimitive a;

    public /* synthetic */ C16224(Spliterator.OfPrimitive ofPrimitive) {
        this.a = ofPrimitive;
    }

    public static /* synthetic */ InterfaceC10110 a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        if (ofPrimitive instanceof C0700) {
            return ((C0700) ofPrimitive).a;
        }
        if (ofPrimitive instanceof Spliterator.OfDouble) {
            return C8241.a((Spliterator.OfDouble) ofPrimitive);
        }
        if (ofPrimitive instanceof Spliterator.OfInt) {
            return C16003.a((Spliterator.OfInt) ofPrimitive);
        }
        return ofPrimitive instanceof Spliterator.OfLong ? C12475.a((Spliterator.OfLong) ofPrimitive) : new C16224(ofPrimitive);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfPrimitive ofPrimitive = this.a;
        if (obj instanceof C16224) {
            obj = ((C16224) obj).a;
        }
        return ofPrimitive.equals(obj);
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
        this.a.forEachRemaining(consumer);
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
        return this.a.tryAdvance(consumer);
    }

    @Override // l.InterfaceC10110, l.InterfaceC20693
    public final /* synthetic */ InterfaceC10110 trySplit() {
        return a(this.a.trySplit());
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ InterfaceC20693 trySplit() {
        return C12696.a(this.a.trySplit());
    }
}
