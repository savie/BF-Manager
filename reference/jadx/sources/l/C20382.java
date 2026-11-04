package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20382 implements InterfaceC15906, Serializable, Cloneable {
    public static final long serialVersionUID = 8379247926738230492L;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 16448;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return 0L;
    }

    @Override // l.InterfaceC8409
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    @Deprecated
    public final boolean tryAdvance(Consumer consumer) {
        return false;
    }

    @Override // l.InterfaceC8409
    public final /* bridge */ /* synthetic */ InterfaceC8409 trySplit() {
        return null;
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final /* bridge */ /* synthetic */ InterfaceC9154 trySplit() {
        return null;
    }

    @Override // l.InterfaceC9154
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // l.InterfaceC9154
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return false;
    }

    public final Object clone() {
        return C24112.f77947;
    }

    private Object readResolve() {
        return C24112.f77947;
    }

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
