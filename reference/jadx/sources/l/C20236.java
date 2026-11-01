package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20236 implements InterfaceC20693 {
    public final InterfaceC20693 a;

    public C20236(InterfaceC20693 interfaceC20693) {
        this.a = interfaceC20693;
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        C13638.requireNonNull(consumer);
        return this.a.tryAdvance(new C4879(consumer, 2));
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        C13638.requireNonNull(consumer);
        this.a.forEachRemaining(new C4879(consumer, 2));
    }

    @Override // l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        InterfaceC20693 interfaceC20693TrySplit = this.a.trySplit();
        if (interfaceC20693TrySplit == null) {
            return null;
        }
        return new C20236(interfaceC20693TrySplit);
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // l.InterfaceC20693
    public final long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.a.characteristics();
    }

    @Override // l.InterfaceC20693
    public final boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        return this.a.getComparator();
    }
}
