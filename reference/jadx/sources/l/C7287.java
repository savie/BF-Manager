package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7287 implements Spliterator {
    public final /* synthetic */ InterfaceC20693 a;

    public /* synthetic */ C7287(InterfaceC20693 interfaceC20693) {
        this.a = interfaceC20693;
    }

    public static /* synthetic */ Spliterator convert(InterfaceC20693 interfaceC20693) {
        if (interfaceC20693 == null) {
            return null;
        }
        if (interfaceC20693 instanceof C12696) {
            return ((C12696) interfaceC20693).a;
        }
        return interfaceC20693 instanceof InterfaceC10110 ? C0700.a((InterfaceC10110) interfaceC20693) : new C7287(interfaceC20693);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC20693 interfaceC20693 = this.a;
        if (obj instanceof C7287) {
            obj = ((C7287) obj).a;
        }
        return interfaceC20693.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
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

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return convert(this.a.trySplit());
    }
}
