package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֫᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: KAPH */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2262 implements InterfaceC15949 {
    @Override // l.InterfaceC7664, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17441.m40942(this, consumer);
    }

    @Override // l.InterfaceC9154
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C0206.$default$forEachRemaining(this, intConsumer);
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17441.m40943(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* bridge */ /* synthetic */ InterfaceC8409 trySplit() {
        return trySplit();
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public /* bridge */ /* synthetic */ InterfaceC9154 trySplit() {
        return trySplit();
    }

    @Override // l.InterfaceC8409
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC15949, l.InterfaceC8409
    public final InterfaceC4544 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC9154
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((IntConsumer) obj);
    }
}
