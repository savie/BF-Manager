package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۛ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6737 extends AbstractC0770 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C21653 f22453;

    public C6737(C1516 c1516) {
        super(c1516);
        this.f22453 = new C21653(c1516);
    }

    @Override // l.AbstractC0770
    /* JADX INFO: renamed from: ۙ */
    public final void mo3146(int i, Object obj) {
        C21653 c21653 = this.f22453;
        c21653.f69122 = i;
        ((Consumer) obj).accept(c21653);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM3145 = m3145();
        C21653 c21653 = this.f22453;
        c21653.f69122 = iM3145;
        return c21653;
    }
}
