package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17555 extends AbstractC18301 {
    public final Consumer b;

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // l.InterfaceC8605
    public final Object b(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        abstractC15470.f0(interfaceC8409, this);
        return null;
    }

    @Override // l.InterfaceC8605
    public final /* bridge */ /* synthetic */ Object e(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409) {
        a(abstractC13956, interfaceC8409);
        return null;
    }

    public C17555(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.b.n(obj);
    }
}
