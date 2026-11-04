package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes5.dex */
public final class C20819 extends AbstractC21565 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C4411 f66662;

    public C20819(C19327 c19327) {
        super(c19327);
        this.f66662 = new C4411(c19327);
    }

    @Override // l.AbstractC21565
    /* JADX INFO: renamed from: ۙ */
    public final void mo2970(int i, Object obj) {
        C4411 c4411 = this.f66662;
        c4411.f15841 = i;
        ((Consumer) obj).accept(c4411);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM49040 = m49040();
        C4411 c4411 = this.f66662;
        c4411.f15841 = iM49040;
        return c4411;
    }
}
