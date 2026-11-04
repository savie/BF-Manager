package l;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2443 implements Spliterator {
    public final /* synthetic */ InterfaceC8409 a;

    public /* synthetic */ C2443(InterfaceC8409 interfaceC8409) {
        this.a = interfaceC8409;
    }

    public static /* synthetic */ Spliterator convert(InterfaceC8409 interfaceC8409) {
        if (interfaceC8409 == null) {
            return null;
        }
        if (interfaceC8409 instanceof C19553) {
            return ((C19553) interfaceC8409).a;
        }
        return interfaceC8409 instanceof InterfaceC9154 ? C10602.a((InterfaceC9154) interfaceC8409) : new C2443(interfaceC8409);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8409 interfaceC8409 = this.a;
        if (obj instanceof C2443) {
            obj = ((C2443) obj).a;
        }
        return interfaceC8409.equals(obj);
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
