package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2748 extends AbstractC6698 implements InterfaceC7664 {
    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0206.a(this, consumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0206.b(this, consumer);
    }
}
