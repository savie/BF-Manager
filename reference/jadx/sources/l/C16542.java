package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16542 extends AbstractC20272 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3864 f53545;

    @Override // l.AbstractC20272
    /* JADX INFO: renamed from: ۙ */
    public final void mo5772(int i, Object obj) {
        ((Consumer) obj).accept(this.f53545.f13181[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16542(C3864 c3864) {
        super(c3864);
        this.f53545 = c3864;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f53545.f13181[m46538()];
    }
}
