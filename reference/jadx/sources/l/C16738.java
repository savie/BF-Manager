package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes5.dex */
public final class C16738 extends AbstractC20468 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4060 f54040;

    @Override // l.AbstractC20468
    /* JADX INFO: renamed from: ۙ */
    public final void mo6300(int i, Object obj) {
        ((Consumer) obj).accept(this.f54040.f13849[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16738(C4060 c4060) {
        super(c4060);
        this.f54040 = c4060;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f54040.f13849[m46974()];
    }
}
