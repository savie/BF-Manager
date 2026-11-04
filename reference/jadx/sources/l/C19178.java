package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19178 extends AbstractC23676 implements InterfaceC7664 {
    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0206.a(this, consumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0206.b(this, consumer);
    }

    @Override // l.AbstractC10951
    public final InterfaceC8409 a(InterfaceC8409 interfaceC8409, long j, long j2, long j3, long j4) {
        return new C19178((InterfaceC7664) interfaceC8409, j, j2, j3, j4);
    }

    @Override // l.AbstractC23676
    public final Object b() {
        return new C24422(1);
    }
}
