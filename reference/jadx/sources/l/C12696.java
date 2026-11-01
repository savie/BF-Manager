package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12696 implements InterfaceC20693 {
    public final /* synthetic */ Spliterator a;

    public /* synthetic */ C12696(Spliterator spliterator) {
        this.a = spliterator;
    }

    public static /* synthetic */ InterfaceC20693 a(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        if (spliterator instanceof C7287) {
            return ((C7287) spliterator).a;
        }
        return spliterator instanceof Spliterator.OfPrimitive ? C16224.a((Spliterator.OfPrimitive) spliterator) : new C12696(spliterator);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator spliterator = this.a;
        if (obj instanceof C12696) {
            obj = ((C12696) obj).a;
        }
        return spliterator.equals(obj);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
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

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ InterfaceC20693 trySplit() {
        return a(this.a.trySplit());
    }
}
