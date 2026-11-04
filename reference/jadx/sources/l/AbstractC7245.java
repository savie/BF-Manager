package l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۜܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7245 implements InterfaceC13409 {
    @Override // l.InterfaceC13409
    public final long count() {
        return 0L;
    }

    public final void e(int i, Object obj) {
    }

    public final void g(Object obj) {
    }

    @Override // l.InterfaceC13409
    public /* synthetic */ InterfaceC13409 j(long j, long j2, IntFunction intFunction) {
        return AbstractC13956.F(this, j, j2, intFunction);
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // l.InterfaceC13409
    public InterfaceC13409 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC13409
    public final Object[] m(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }
}
