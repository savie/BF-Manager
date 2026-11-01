package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22582 extends AbstractC18348 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15527 f73606;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9177 f73607;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22582(C9177 c9177) {
        super(c9177);
        this.f73607 = c9177;
    }

    @Override // l.AbstractC18348
    /* JADX INFO: renamed from: ۙ */
    public final void mo11891(int i, Object obj) {
        C15527 c15527 = new C15527(this.f73607, i);
        this.f73606 = c15527;
        ((Consumer) obj).accept(c15527);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C15527 c15527 = new C15527(this.f73607, m42607());
        this.f73606 = c15527;
        return c15527;
    }

    @Override // l.AbstractC18348, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f73606.f50537 = -1;
    }
}
