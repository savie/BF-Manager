package l;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ᩳ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19288 extends AbstractC23523 implements InterfaceC2792 {
    @Override // l.InterfaceC13409
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC13956.A(this, consumer);
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ InterfaceC13409 j(long j, long j2, IntFunction intFunction) {
        return AbstractC13956.D(this, j, j2);
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC13956.x(this, (Integer[]) objArr, i);
    }

    @Override // l.InterfaceC9459
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C2748(this);
    }

    @Override // l.InterfaceC13409
    public final InterfaceC9154 spliterator() {
        return new C2748(this);
    }
}
