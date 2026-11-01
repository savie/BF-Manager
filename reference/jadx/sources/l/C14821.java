package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C14821 extends AbstractC5026 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C11377 f48443;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3614 f48444;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14821(C3614 c3614) {
        super(c3614);
        this.f48444 = c3614;
    }

    @Override // l.AbstractC5026
    /* JADX INFO: renamed from: ۙ */
    public final void mo3343(int i, Object obj) {
        C11377 c11377 = new C11377(this.f48444, i);
        this.f48443 = c11377;
        ((Consumer) obj).accept(c11377);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C11377 c11377 = new C11377(this.f48444, m13969());
        this.f48443 = c11377;
        return c11377;
    }

    @Override // l.AbstractC5026, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f48443.f38366 = -1;
    }
}
