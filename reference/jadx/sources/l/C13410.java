package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13410 extends AbstractC18348 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C15527 f44370;

    public C13410(C9177 c9177) {
        super(c9177);
        this.f44370 = new C15527(c9177);
    }

    @Override // l.AbstractC18348
    /* JADX INFO: renamed from: ۙ */
    public final void mo11891(int i, Object obj) {
        C15527 c15527 = this.f44370;
        c15527.f50537 = i;
        ((Consumer) obj).accept(c15527);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM42607 = m42607();
        C15527 c15527 = this.f44370;
        c15527.f50537 = iM42607;
        return c15527;
    }
}
