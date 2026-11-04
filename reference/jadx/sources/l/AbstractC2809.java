package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: TAPP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2809 implements InterfaceC16321 {
    @Override // l.InterfaceC9154
    public /* synthetic */ void forEachRemaining(Object obj) {
        C0952.$default$forEachRemaining(this, obj);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17813.m41657(this, consumer);
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17813.m41658(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* bridge */ /* synthetic */ InterfaceC8409 trySplit() {
        return trySplit();
    }

    @Override // l.InterfaceC8409
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC16321, l.InterfaceC8409
    public final InterfaceC16564 getComparator() {
        throw new IllegalStateException();
    }
}
