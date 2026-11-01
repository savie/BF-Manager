package l;

import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۛۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5980 implements InterfaceC3647 {
    public final int a;
    public final Object b;
    public final Predicate c;
    public final Supplier d;

    public C5980(boolean z, EnumC22761 enumC22761, Object obj, Predicate predicate, Supplier supplier) {
        this.a = (z ? 0 : EnumC2970.r) | EnumC2970.u;
        this.b = obj;
        this.c = predicate;
        this.d = supplier;
    }

    @Override // l.InterfaceC3647
    public final int j() {
        return this.a;
    }

    @Override // l.InterfaceC3647
    public final Object b(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        InterfaceC7176 interfaceC7176 = (InterfaceC7176) this.d.get();
        abstractC5752.f0(interfaceC20693, interfaceC7176);
        Object obj = interfaceC7176.get();
        return obj != null ? obj : this.b;
    }

    @Override // l.InterfaceC3647
    public final Object e(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693) {
        AbstractC5752 abstractC5752 = (AbstractC5752) abstractC22686;
        return new C12178(this, EnumC2970.ORDERED.s(abstractC5752.m), abstractC5752, interfaceC20693).invoke();
    }
}
