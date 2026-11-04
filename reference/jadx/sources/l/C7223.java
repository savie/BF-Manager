package l;

import java.util.function.Function;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7223 extends AbstractC9591 {
    public boolean b;
    public final C13453 c;
    public final /* synthetic */ C13651 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7223(C13651 c13651, InterfaceC15143 interfaceC15143) {
        super(interfaceC15143);
        this.d = c13651;
        InterfaceC15143 interfaceC15144 = this.a;
        C17359.requireNonNull(interfaceC15144);
        this.c = new C13453(interfaceC15144, 1);
    }

    @Override // l.AbstractC9591, l.InterfaceC15143
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        InterfaceC17686 interfaceC17686 = (InterfaceC17686) ((Function) this.d.t).apply(obj);
        if (interfaceC17686 != null) {
            try {
                boolean z = this.b;
                C13453 c13453 = this.c;
                if (!z) {
                    interfaceC17686.sequential().forEach(c13453);
                } else {
                    InterfaceC7664 interfaceC7664Spliterator = interfaceC17686.sequential().spliterator();
                    while (!this.a.f() && interfaceC7664Spliterator.tryAdvance((IntConsumer) c13453)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC17686.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC17686 != null) {
            interfaceC17686.close();
        }
    }

    @Override // l.AbstractC9591, l.InterfaceC15143
    public final boolean f() {
        this.b = true;
        return this.a.f();
    }
}
