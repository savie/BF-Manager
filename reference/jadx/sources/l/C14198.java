package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬᩻ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14198 implements InterfaceC8409 {
    public final InterfaceC8409 a;

    public C14198(InterfaceC8409 interfaceC8409) {
        this.a = interfaceC8409;
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        C17359.requireNonNull(consumer);
        return this.a.tryAdvance(new C16765(consumer, 2));
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        C17359.requireNonNull(consumer);
        this.a.forEachRemaining(new C16765(consumer, 2));
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        InterfaceC8409 interfaceC8409TrySplit = this.a.trySplit();
        if (interfaceC8409TrySplit == null) {
            return null;
        }
        return new C14198(interfaceC8409TrySplit);
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC8409
    public final long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.a.characteristics();
    }

    @Override // l.InterfaceC8409
    public final boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        return this.a.getComparator();
    }
}
