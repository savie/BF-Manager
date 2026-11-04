package l;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۗ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3626 extends AbstractC23523 implements InterfaceC2047 {
    @Override // l.InterfaceC13409
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC13956.z(this, consumer);
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ InterfaceC13409 j(long j, long j2, IntFunction intFunction) {
        return AbstractC13956.C(this, j, j2);
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC13956.w(this, (Double[]) objArr, i);
    }

    @Override // l.InterfaceC9459
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return new C24378(this);
    }

    @Override // l.InterfaceC13409
    public final InterfaceC9154 spliterator() {
        return new C24378(this);
    }
}
