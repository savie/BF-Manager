package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3425 extends AbstractC22167 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C2410 f12639;

    public C3425(C6644 c6644) {
        super(c6644);
        this.f12639 = new C2410(c6644);
    }

    @Override // l.AbstractC22167
    /* JADX INFO: renamed from: ۙ */
    public final void mo6482(int i, Object obj) {
        C2410 c2410 = this.f12639;
        c2410.f9686 = i;
        ((Consumer) obj).accept(c2410);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM49177 = m49177();
        C2410 c2410 = this.f12639;
        c2410.f9686 = iM49177;
        return c2410;
    }
}
