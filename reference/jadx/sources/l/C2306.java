package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes2.dex */
public final class C2306 extends AbstractC15008 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C6540 f8222;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7952 f8223;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2306(C7952 c7952) {
        super(c7952);
        this.f8223 = c7952;
    }

    @Override // l.AbstractC15008
    /* JADX INFO: renamed from: ۙ */
    public final void mo3571(int i, Object obj) {
        C6540 c6540 = new C6540(this.f8223, i);
        this.f8222 = c6540;
        ((Consumer) obj).accept(c6540);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C6540 c6540 = new C6540(this.f8223, m35989());
        this.f8222 = c6540;
        return c6540;
    }

    @Override // l.AbstractC15008, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f8222.f22015 = -1;
    }
}
