package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩹ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22021 extends AbstractC23736 {
    public boolean b;
    public final C5418 c;
    public final /* synthetic */ C15727 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22021(C15727 c15727, InterfaceC19171 interfaceC19171) {
        super(interfaceC19171);
        this.d = c15727;
        InterfaceC19171 interfaceC19172 = this.a;
        C13638.requireNonNull(interfaceC19172);
        this.c = new C5418(interfaceC19172, 1);
    }

    @Override // l.AbstractC23736, l.InterfaceC19171
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // l.InterfaceC21993, l.InterfaceC19171
    public final void accept(long j) {
        InterfaceC18796 interfaceC18796 = (InterfaceC18796) ((C5295) this.d.t).apply(j);
        if (interfaceC18796 != null) {
            try {
                boolean z = this.b;
                C5418 c5418 = this.c;
                if (!z) {
                    interfaceC18796.sequential().forEach(c5418);
                } else {
                    InterfaceC19282 interfaceC19282Spliterator = interfaceC18796.sequential().spliterator();
                    while (!this.a.f() && interfaceC19282Spliterator.tryAdvance((LongConsumer) c5418)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC18796.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC18796 != null) {
            interfaceC18796.close();
        }
    }

    @Override // l.AbstractC23736, l.InterfaceC19171
    public final boolean f() {
        this.b = true;
        return this.a.f();
    }
}
