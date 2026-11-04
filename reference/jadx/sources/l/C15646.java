package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܳ᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15646 extends AbstractC6610 {
    public boolean b;
    public final C3758 c;
    public final /* synthetic */ C14922 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15646(C14922 c14922, InterfaceC15143 interfaceC15143) {
        super(interfaceC15143);
        this.d = c14922;
        InterfaceC15143 interfaceC15144 = this.a;
        C17359.requireNonNull(interfaceC15144);
        this.c = new C3758(interfaceC15144, 1);
    }

    @Override // l.AbstractC6610, l.InterfaceC15143
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // l.InterfaceC1148, l.InterfaceC15143
    public final void accept(long j) {
        InterfaceC16194 interfaceC16194 = (InterfaceC16194) ((C3249) this.d.t).apply(j);
        if (interfaceC16194 != null) {
            try {
                boolean z = this.b;
                C3758 c3758 = this.c;
                if (!z) {
                    interfaceC16194.sequential().forEach(c3758);
                } else {
                    InterfaceC9900 interfaceC9900Spliterator = interfaceC16194.sequential().spliterator();
                    while (!this.a.f() && interfaceC9900Spliterator.tryAdvance((LongConsumer) c3758)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC16194.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC16194 != null) {
            interfaceC16194.close();
        }
    }

    @Override // l.AbstractC6610, l.InterfaceC15143
    public final boolean f() {
        this.b = true;
        return this.a.f();
    }
}
