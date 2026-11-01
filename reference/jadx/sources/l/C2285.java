package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2285 extends AbstractC14987 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C6519 f8156;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7931 f8157;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2285(C7931 c7931) {
        super(c7931);
        this.f8157 = c7931;
    }

    @Override // l.AbstractC14987
    /* JADX INFO: renamed from: ۙ */
    public final void mo3497(int i, Object obj) {
        C6519 c6519 = new C6519(this.f8157, i);
        this.f8156 = c6519;
        ((Consumer) obj).accept(c6519);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C6519 c6519 = new C6519(this.f8157, m35965());
        this.f8156 = c6519;
        return c6519;
    }

    @Override // l.AbstractC14987, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f8156.f21968 = -1;
    }
}
