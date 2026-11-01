package l;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܿܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17385 extends AbstractC12385 implements InterfaceC7163 {
    @Override // l.InterfaceC8616
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC22686.z(this, consumer);
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ InterfaceC8616 j(long j, long j2, IntFunction intFunction) {
        return AbstractC22686.C(this, j, j2);
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC22686.w(this, (Double[]) objArr, i);
    }

    @Override // l.InterfaceC0853
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final InterfaceC10110 spliterator() {
        return new C14448(this);
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final InterfaceC20693 spliterator() {
        return new C14448(this);
    }
}
