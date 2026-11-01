package l;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.֡ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0203 extends AbstractC6457 implements InterfaceC13036 {
    @Override // l.InterfaceC8616
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC22686.A(this, consumer);
    }

    @Override // l.AbstractC6457, l.InterfaceC8616
    public final /* synthetic */ InterfaceC8616 j(long j, long j2, IntFunction intFunction) {
        return AbstractC22686.D(this, j, j2);
    }

    @Override // l.AbstractC6457, l.InterfaceC8616, l.InterfaceC0853
    public final /* bridge */ /* synthetic */ InterfaceC8616 a(int i) {
        a(i);
        throw null;
    }

    @Override // l.AbstractC6457, l.InterfaceC8616, l.InterfaceC0853
    public final InterfaceC0853 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC22686.x(this, (Integer[]) objArr, i);
    }

    @Override // l.InterfaceC0853
    public final /* bridge */ /* synthetic */ Object b() {
        return AbstractC22686.e;
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final /* bridge */ /* synthetic */ InterfaceC10110 spliterator() {
        return C19988.b;
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final /* bridge */ /* synthetic */ InterfaceC20693 spliterator() {
        return C19988.b;
    }
}
