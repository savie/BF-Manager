package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2014 extends AbstractC22167 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2410 f7527;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6644 f7528;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2014(C6644 c6644) {
        super(c6644);
        this.f7528 = c6644;
    }

    @Override // l.AbstractC22167
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6482(int i, Object obj) {
        C2410 c2410 = new C2410(this.f7528, i);
        this.f7527 = c2410;
        ((Consumer) obj).accept(c2410);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2410 c2410 = new C2410(this.f7528, m49177());
        this.f7527 = c2410;
        return c2410;
    }

    @Override // l.AbstractC22167, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f7527.f9686 = -1;
    }
}
