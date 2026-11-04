package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.֫ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: IAP7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2108 implements InterfaceC9301 {
    @Override // l.InterfaceC9900, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1099.m4100(this, consumer);
    }

    @Override // l.InterfaceC9154
    public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C18851.$default$forEachRemaining(this, longConsumer);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC9900, l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C1099.m4101(this, consumer);
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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC9154
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((LongConsumer) obj);
    }
}
