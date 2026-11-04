package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HAP5 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14083 implements InterfaceC15906 {
    @Override // l.InterfaceC9154
    public /* synthetic */ void forEachRemaining(Object obj) {
        C0952.$default$forEachRemaining(this, obj);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17398.m40861(this, consumer);
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
        return C17398.m40862(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* bridge */ /* synthetic */ InterfaceC8409 trySplit() {
        return trySplit();
    }

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
