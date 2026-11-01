package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩷ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20610 extends AbstractC1094 {
    public boolean b;
    public final C14344 c;
    public final /* synthetic */ C15644 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20610(C15644 c15644, InterfaceC19171 interfaceC19171) {
        super(interfaceC19171);
        this.d = c15644;
        InterfaceC19171 interfaceC19172 = this.a;
        C13638.requireNonNull(interfaceC19172);
        this.c = new C14344(interfaceC19172, 1);
    }

    @Override // l.AbstractC1094, l.InterfaceC19171
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        InterfaceC19386 interfaceC19386 = (InterfaceC19386) ((C5295) this.d.t).apply(obj);
        if (interfaceC19386 != null) {
            try {
                boolean z = this.b;
                C14344 c14344 = this.c;
                if (!z) {
                    interfaceC19386.sequential().forEach(c14344);
                } else {
                    InterfaceC7535 interfaceC7535Spliterator = interfaceC19386.sequential().spliterator();
                    while (!this.a.f() && interfaceC7535Spliterator.tryAdvance((DoubleConsumer) c14344)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC19386.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC19386 != null) {
            interfaceC19386.close();
        }
    }

    @Override // l.AbstractC1094, l.InterfaceC19171
    public final boolean f() {
        this.b = true;
        return this.a.f();
    }
}
