package l;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ᩴۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18734 extends AbstractC12385 implements InterfaceC23620 {
    @Override // l.InterfaceC8616
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC22686.B(this, consumer);
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ InterfaceC8616 j(long j, long j2, IntFunction intFunction) {
        return AbstractC22686.E(this, j, j2);
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC22686.y(this, (Long[]) objArr, i);
    }

    @Override // l.InterfaceC0853
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final InterfaceC10110 spliterator() {
        return new C10027(this);
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final InterfaceC20693 spliterator() {
        return new C10027(this);
    }
}
