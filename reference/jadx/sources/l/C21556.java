package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21556 extends AbstractC0389 {
    public final Consumer b;

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // l.InterfaceC3647
    public final Object b(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        abstractC5752.f0(interfaceC20693, this);
        return null;
    }

    @Override // l.InterfaceC3647
    public final /* bridge */ /* synthetic */ Object e(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693) {
        a(abstractC22686, interfaceC20693);
        return null;
    }

    public C21556(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.b.n(obj);
    }
}
