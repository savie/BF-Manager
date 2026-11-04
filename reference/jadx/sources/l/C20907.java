package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20907 extends AbstractC0770 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1516 f66915;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C21653 f66916;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20907(C1516 c1516) {
        super(c1516);
        this.f66915 = c1516;
    }

    @Override // l.AbstractC0770
    /* JADX INFO: renamed from: ۙ */
    public final void mo3146(int i, Object obj) {
        C21653 c21653 = new C21653(this.f66915, i);
        this.f66916 = c21653;
        ((Consumer) obj).accept(c21653);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C21653 c21653 = new C21653(this.f66915, m3145());
        this.f66916 = c21653;
        return c21653;
    }

    @Override // l.AbstractC0770, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f66916.f69122 = -1;
    }
}
