package l;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܿۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18127 extends AbstractC20692 {
    public final C15602 j;

    public C18127(C15602 c15602, AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        super(abstractC15470, interfaceC8409);
        this.j = c15602;
    }

    public C18127(C18127 c18127, InterfaceC8409 interfaceC8409) {
        super(c18127, interfaceC8409);
        this.j = c18127.j;
    }

    @Override // l.AbstractC19902
    public final AbstractC19902 c(InterfaceC8409 interfaceC8409) {
        return new C18127(this, interfaceC8409);
    }

    @Override // l.AbstractC19902
    public final Object a() {
        AbstractC13956 abstractC13956 = this.a;
        AbstractC21857 abstractC21857 = (AbstractC21857) ((Supplier) this.j.c).get();
        abstractC13956.f0(this.b, abstractC21857);
        boolean z = abstractC21857.b;
        if (z == ((EnumC17381) this.j.b).b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // l.AbstractC20692
    public final Object h() {
        return Boolean.valueOf(!((EnumC17381) this.j.b).b);
    }
}
