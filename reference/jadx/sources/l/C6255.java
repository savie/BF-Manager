package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6255 implements InterfaceC15949, Serializable, Cloneable {
    public static final long serialVersionUID = 8379247926738230492L;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 16448;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return 0L;
    }

    @Override // l.InterfaceC7664, l.InterfaceC8409
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // l.InterfaceC7664
    public final void forEachRemaining(IntConsumer intConsumer) {
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC7664
    @Deprecated
    public final boolean tryAdvance(Consumer consumer) {
        return false;
    }

    @Override // l.InterfaceC7664
    public final boolean tryAdvance(IntConsumer intConsumer) {
        return false;
    }

    @Override // l.InterfaceC7664, l.InterfaceC9154, l.InterfaceC8409
    public final /* bridge */ /* synthetic */ InterfaceC7664 trySplit() {
        return null;
    }

    @Override // l.InterfaceC8409
    public final /* bridge */ /* synthetic */ InterfaceC8409 trySplit() {
        return null;
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final /* bridge */ /* synthetic */ InterfaceC9154 trySplit() {
        return null;
    }

    @Override // l.InterfaceC8409
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC9154
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // l.InterfaceC9154
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return false;
    }

    public final Object clone() {
        return C18187.f59429;
    }

    private Object readResolve() {
        return C18187.f59429;
    }

    @Override // l.InterfaceC15949, l.InterfaceC8409
    public final InterfaceC4544 getComparator() {
        throw new IllegalStateException();
    }
}
