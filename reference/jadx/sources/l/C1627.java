package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1627 extends AbstractC20272 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3864 f5641;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C23256 f5642;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1627(C3864 c3864) {
        super(c3864);
        this.f5641 = c3864;
    }

    @Override // l.AbstractC20272
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5772(int i, Object obj) {
        C23256 c23256 = new C23256(this.f5641, i);
        this.f5642 = c23256;
        ((Consumer) obj).accept(c23256);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C23256 c23256 = new C23256(this.f5641, m46538());
        this.f5642 = c23256;
        return c23256;
    }

    @Override // l.AbstractC20272, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f5642.f75362 = -1;
    }
}
