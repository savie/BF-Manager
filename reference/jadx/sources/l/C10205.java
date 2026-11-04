package l;

import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۢܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10205 implements InterfaceC8605 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public C10205(boolean z, EnumC14154 enumC14154, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : EnumC21614.r) | EnumC21614.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // l.InterfaceC8605
    public final int j() {
        return this.a;
    }

    @Override // l.InterfaceC8605
    public final Object b(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        InterfaceC1720 interfaceC1720 = (InterfaceC1720) this.d.get();
        abstractC15470.f0(interfaceC8409, interfaceC1720);
        Object obj = interfaceC1720.get();
        return obj != null ? obj : this.b;
    }

    @Override // l.InterfaceC8605
    public final Object e(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409) {
        AbstractC15470 abstractC15470 = (AbstractC15470) abstractC13956;
        return new C7598(this, EnumC21614.ORDERED.p(abstractC15470.m), abstractC15470, interfaceC8409).invoke();
    }
}
