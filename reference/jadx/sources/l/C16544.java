package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes5.dex */
public final class C16544 implements InterfaceC7371, Serializable, Cloneable {
    public static final long serialVersionUID = 8379247926738230492L;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16448;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return 0L;
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ Comparator getComparator() {
        return C21398.$default$getComparator(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        return false;
    }

    @Override // l.InterfaceC20693
    public final /* bridge */ /* synthetic */ InterfaceC20693 trySplit() {
        return null;
    }

    public final Object clone() {
        return C10900.f37083;
    }

    private Object readResolve() {
        return C10900.f37083;
    }
}
