package l;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۙۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4436 extends AbstractC5274 {
    public final C11251 j;

    public C4436(C11251 c11251, AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        super(abstractC5752, interfaceC20693);
        this.j = c11251;
    }

    public C4436(C4436 c4436, InterfaceC20693 interfaceC20693) {
        super(c4436, interfaceC20693);
        this.j = c4436.j;
    }

    @Override // l.AbstractC17269
    public final AbstractC17269 c(InterfaceC20693 interfaceC20693) {
        return new C4436(this, interfaceC20693);
    }

    @Override // l.AbstractC17269
    public final Object a() {
        AbstractC22686 abstractC22686 = this.a;
        AbstractC21287 abstractC21287 = (AbstractC21287) ((Supplier) this.j.c).get();
        abstractC22686.f0(this.b, abstractC21287);
        boolean z = abstractC21287.b;
        if (z == ((EnumC0120) this.j.b).b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // l.AbstractC5274
    public final Object h() {
        return Boolean.valueOf(!((EnumC0120) this.j.b).b);
    }
}
