package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C9882 extends AbstractC5026 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C11377 f33729;

    public C9882(C3614 c3614) {
        super(c3614);
        this.f33729 = new C11377(c3614);
    }

    @Override // l.AbstractC5026
    /* JADX INFO: renamed from: ۙ */
    public final void mo3343(int i, Object obj) {
        C11377 c11377 = this.f33729;
        c11377.f38366 = i;
        ((Consumer) obj).accept(c11377);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM13969 = m13969();
        C11377 c11377 = this.f33729;
        c11377.f38366 = iM13969;
        return c11377;
    }
}
