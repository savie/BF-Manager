package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1499 extends AbstractC23676 implements InterfaceC3012 {
    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2946.b(this, consumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2946.g(this, consumer);
    }

    @Override // l.AbstractC10951
    public final InterfaceC8409 a(InterfaceC8409 interfaceC8409, long j, long j2, long j3, long j4) {
        return new C1499((InterfaceC3012) interfaceC8409, j, j2, j3, j4);
    }

    @Override // l.AbstractC23676
    public final Object b() {
        return new C8736(1);
    }
}
