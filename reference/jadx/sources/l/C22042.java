package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes.dex */
public final class C22042 extends AbstractC14987 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C6519 f71441;

    public C22042(C7931 c7931) {
        super(c7931);
        this.f71441 = new C6519(c7931);
    }

    @Override // l.AbstractC14987
    /* JADX INFO: renamed from: ۙ */
    public final void mo3497(int i, Object obj) {
        C6519 c6519 = this.f71441;
        c6519.f21968 = i;
        ((Consumer) obj).accept(c6519);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM35965 = m35965();
        C6519 c6519 = this.f71441;
        c6519.f21968 = iM35965;
        return c6519;
    }
}
