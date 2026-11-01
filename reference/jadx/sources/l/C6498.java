package l;

import java.util.function.Function;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6498 extends AbstractC1094 {
    public boolean b;
    public final C24034 c;
    public final /* synthetic */ C2942 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6498(C2942 c2942, InterfaceC19171 interfaceC19171) {
        super(interfaceC19171);
        this.d = c2942;
        InterfaceC19171 interfaceC19172 = this.a;
        C13638.requireNonNull(interfaceC19172);
        this.c = new C24034(interfaceC19172, 1);
    }

    @Override // l.AbstractC1094, l.InterfaceC19171
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        InterfaceC13514 interfaceC13514 = (InterfaceC13514) ((Function) this.d.t).apply(obj);
        if (interfaceC13514 != null) {
            try {
                boolean z = this.b;
                C24034 c24034 = this.c;
                if (!z) {
                    interfaceC13514.sequential().forEach(c24034);
                } else {
                    InterfaceC18576 interfaceC18576Spliterator = interfaceC13514.sequential().spliterator();
                    while (!this.a.f() && interfaceC18576Spliterator.tryAdvance((IntConsumer) c24034)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC13514.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC13514 != null) {
            interfaceC13514.close();
        }
    }

    @Override // l.AbstractC1094, l.InterfaceC19171
    public final boolean f() {
        this.b = true;
        return this.a.f();
    }
}
