package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۧ᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11917 extends AbstractC9591 {
    public boolean b;
    public final C5317 c;
    public final /* synthetic */ C14397 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11917(C14397 c14397, InterfaceC15143 interfaceC15143) {
        super(interfaceC15143);
        this.d = c14397;
        InterfaceC15143 interfaceC15144 = this.a;
        C17359.requireNonNull(interfaceC15144);
        this.c = new C5317(interfaceC15144, 1);
    }

    @Override // l.AbstractC9591, l.InterfaceC15143
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        InterfaceC20648 interfaceC20648 = (InterfaceC20648) ((C15801) this.d.t).apply(obj);
        if (interfaceC20648 != null) {
            try {
                boolean z = this.b;
                C5317 c5317 = this.c;
                if (!z) {
                    interfaceC20648.sequential().forEach(c5317);
                } else {
                    InterfaceC3012 interfaceC3012Spliterator = interfaceC20648.sequential().spliterator();
                    while (!this.a.f() && interfaceC3012Spliterator.tryAdvance((DoubleConsumer) c5317)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC20648.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC20648 != null) {
            interfaceC20648.close();
        }
    }

    @Override // l.AbstractC9591, l.InterfaceC15143
    public final boolean f() {
        this.b = true;
        return this.a.f();
    }
}
