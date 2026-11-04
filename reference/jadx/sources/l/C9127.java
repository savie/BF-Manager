package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9127 extends AbstractC22113 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C13602 f29623;

    public C9127(C15399 c15399) {
        super(c15399);
        this.f29623 = new C13602(c15399);
    }

    @Override // l.AbstractC22113
    /* JADX INFO: renamed from: ۙ */
    public final void mo8158(int i, Object obj) {
        C13602 c13602 = this.f29623;
        c13602.f43199 = i;
        ((Consumer) obj).accept(c13602);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM50066 = m50066();
        C13602 c13602 = this.f29623;
        c13602.f43199 = iM50066;
        return c13602;
    }
}
